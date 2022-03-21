import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
//NE{{
import { CategoryListComponent } from './category/category-list/category-list.component';
import { AuthorListComponent } from './author/author-list/author-list.component';
import { GameListComponent } from './game/game-list/game-list.component';

import { ClientesListComponent } from './clientes/clientes-list/clientes-list.component';
import { PrestamoListComponent } from './prestamo/prestamo-list/prestamo-list.component';
//}}

const routes: Routes = [
  //NE{{
  { path: '', redirectTo: '/games', pathMatch: 'full' },
  { path: 'categories', component: CategoryListComponent },
  { path: 'authors', component: AuthorListComponent },
  { path: 'games', component: GameListComponent },

  { path: 'clientes', component: ClientesListComponent },
  { path: 'prestamo', component: PrestamoListComponent },
  //}}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
