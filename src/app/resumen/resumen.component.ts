import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-resumen',
  templateUrl: './resumen.component.html',
  styleUrls: ['./resumen.component.css']
})
export class ResumenComponent {
  primerNombre: string ='';
  segundoNombre: string='';
  primerApellido: string= '';
  segundoApellido: string='';
  telefono: string='';
  direccion: string='';
  ciudadResidencia: string='';
}
