import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { IngresoInformacionComponent } from './ingreso-informacion/ingreso-informacion.component';
import { ResumenComponent } from './resumen/resumen.component';

const routes: Routes = [
  { path: 'ingreso', component: IngresoInformacionComponent },
  { path: 'resumen', component: ResumenComponent },
  { path: '', redirectTo: '/ingreso', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
