package com.controller;

import org.springframework.web.bind.annotation.*;

import com.cliente.Cliente;


@RestController
@RequestMapping("/api")
public class ClienteController {

	@PostMapping("/consulta")
	public Cliente getClienteByDocumento(@RequestBody String tipoDocumento, @RequestBody String numeroDocumento) {
		if ("cc".equals(tipoDocumento) && "23445322".equals(numeroDocumento)) {
			Cliente clienteMockeado = new Cliente();
			clienteMockeado.setTipoDocumento(tipoDocumento);
			clienteMockeado.setNumeroDocumento(numeroDocumento);
			clienteMockeado.setPrimerNombre("Juan");
			clienteMockeado.setSegundoNombre("Pablo");
			clienteMockeado.setPrimerApellido("González");
			clienteMockeado.setSegundoApellido("López");
			clienteMockeado.setTelefono("555-1234");
			clienteMockeado.setDireccion("Calle Falsa 123");
			clienteMockeado.setCiudadResidencia("Ciudad Mock");

			return clienteMockeado;
		} else {
			return null;
		}
	}

	@GetMapping("/{tipoDocumento}/{numeroDocumento}")
	public Cliente getClienteDocumento(@PathVariable String tipoDocumento, @PathVariable String numeroDocumento) {
		
		if ("Cedula".equals(tipoDocumento) && "23445322".equals(numeroDocumento)) {
			Cliente clienteMockeado = new Cliente();
			clienteMockeado.setTipoDocumento(tipoDocumento);
			clienteMockeado.setNumeroDocumento(numeroDocumento);
			clienteMockeado.setPrimerNombre("Juan");
			clienteMockeado.setSegundoNombre("Pablo");
			clienteMockeado.setPrimerApellido("González");
			clienteMockeado.setSegundoApellido("López");
			clienteMockeado.setTelefono("555-1234");
			clienteMockeado.setDireccion("Calle Falsa 123");
			clienteMockeado.setCiudadResidencia("Ciudad Mock");
			System.out.print(clienteMockeado);
			return clienteMockeado;
			

		}else {
			return null;
		}
	}

}
