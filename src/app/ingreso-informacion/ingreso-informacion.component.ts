import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ClienteService } from '../service/cliente.service';

@Component({
  selector: 'app-ingreso-informacion',
  templateUrl: './ingreso-informacion.component.html',
  styleUrls: ['./ingreso-informacion.component.css'],
})
export class IngresoInformacionComponent {
  tipoDocumento: string = '';
  numeroDocumento: string = '';
  formulario: any;
  constructor(private clienteService: ClienteService) {}
  ngOnInit(): void {
    this.formulario = new FormGroup({
      numeroDocumento: new FormControl(this.numeroDocumento, [
        Validators.required,
        Validators.minLength(8),
        Validators.maxLength(11),
      ]),
      tipoDocumento: new FormControl(this.tipoDocumento, [Validators.required]),
    });
  }

  formularioValido(): boolean {
    if (
      this.formulario.get('numeroDocumento').status == 'VALID' &&
      this.formulario.get('tipoDocumento').status == 'VALID'
    )
      return true;
    else return false;
  }
  onSubmit(): void {
    const data = {
      numeroDocumento: this.formulario.get('numeroDocumento').value,
      tipoDocumento: this.formulario.get('tipoDocumento').value
    }
    this.clienteService.getUsers(data)
  }
}
