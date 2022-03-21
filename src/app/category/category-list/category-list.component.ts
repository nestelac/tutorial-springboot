import { Component, OnInit } from '@angular/core';
//NE{{
import { MatTableDataSource } from '@angular/material/table';
import { Category } from '../model/Category';
import { MatDialog } from '@angular/material/dialog';
import { CategoryEditComponent } from '../category-edit/category-edit.component';
import { CategoryService } from '../category.service';
//}}

@Component({
  selector: 'app-category-list',
  templateUrl: './category-list.component.html',
  styleUrls: ['./category-list.component.scss']
})
export class CategoryListComponent implements OnInit {

  //NE{{
  dataSource = new MatTableDataSource<Category>();
  displayedColumns: string[] = ['id', 'name', 'action'];

  constructor(
    private categoryService: CategoryService,
    public dialog: MatDialog,
  ) { }

  ngOnInit(): void {
    this.categoryService.getCategories().subscribe(
      categories => this.dataSource.data = categories
    );
  }

  createCategory(){
    const dialogRef = this.dialog.open(CategoryEditComponent,{
      data: {}
    });
    dialogRef.afterClosed().subscribe(result => {
      this.ngOnInit();
    });
  }

  editCategory(category: Category){
    const dialogRef = this.dialog.open(CategoryEditComponent, {
      data: { category: category }
    });
  }

  deleteCategory(category: Category) {    
    const dialogRef = this.dialog.open(CategoryEditComponent, {
      data: { category: category }
    });
    dialogRef.afterClosed().subscribe(result => {
      this.ngOnInit();
    });
  }
  //}}
}