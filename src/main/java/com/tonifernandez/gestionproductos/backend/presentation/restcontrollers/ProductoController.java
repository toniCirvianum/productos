package com.tonifernandez.gestionproductos.backend.presentation.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tonifernandez.gestionproductos.backend.business.model.Producto;
import com.tonifernandez.gestionproductos.backend.business.services.ProductoServices;

@RestController
public class ProductoController {
	
	@Autowired
	private ProductoServices productoServices;
	
	//implentacio endpoint que escolta a /productos
	@GetMapping("/productos")
	public List<Producto> getAll(){
		System.out.println("Entramos");
		//
		return productoServices.getAll();
		
	}
	
	@GetMapping("/productos/{id}")
	public Producto read(@PathVariable Long id) {
		System.out.println("Entramos a path variable " + id);
		return productoServices.read(id);
	}
	
	@GetMapping("/credits")
	public String error() {
		System.out.println("Entramos en error");
		return "Program fet per Toni";
	}
	
	
	/* Si la path variable no coincideix amb la variable es passa el nom
	 * 
	 * @GetMapping("/productos/{codi}") public Producto read(@PathVariable(name="codi") Long id) {
	 * System.out.println("Entramos a path variable " + id); return null; }
	 */


}
