import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class ClienteService {
  constructor(private http: HttpClient) {}

  getUsers(data: any) {
    this.http.get('http://localhost:8090/clientes/'+data.tipoDocumento+'/'+data.numeroDocumento).subscribe((data) => {
      console.log(data);
    });
  }
}
