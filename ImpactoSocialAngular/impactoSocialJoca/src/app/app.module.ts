import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MenuComponent } from './menu/menu.component';
import { RodapeComponent } from './rodape/rodape.component';
import { CarroselComponent } from './carrosel/carrosel.component';
import { JumExplicacaoComponent } from './jum-explicacao/jum-explicacao.component';
import { CardVideoComponent } from './card-video/card-video.component';
import { JumInstituiComponent } from './jum-institui/jum-institui.component';
import { CardInstituiComponent } from './card-institui/card-institui.component';

@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    RodapeComponent,
    CarroselComponent,
    JumExplicacaoComponent,
    CardVideoComponent,
    JumInstituiComponent,
    CardInstituiComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
