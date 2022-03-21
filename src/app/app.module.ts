import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
//NE{{
import { CoreModule } from './core/core.module';
import { CategoryModule } from './category/category.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { AuthorModule } from './author/author.module';
import { GameModule } from './game/game.module';

import { ClientesModule } from './clientes/clientes.module';
import { PrestamoModule } from './prestamo/prestamo.module';
//}}

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    //NE{{
    CoreModule,  
    CategoryModule,
    BrowserAnimationsModule,
    AuthorModule,
    GameModule,

    ClientesModule,
    PrestamoModule,
    //}}
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
