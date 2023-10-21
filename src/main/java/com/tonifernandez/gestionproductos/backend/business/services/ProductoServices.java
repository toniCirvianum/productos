package com.tonifernandez.gestionproductos.backend.business.services;

import java.util.List;

import com.tonifernandez.gestionproductos.backend.business.model.Producto;
//Classe amb operacions CRUD 

public interface ProductoServices {
	
	Long create (Producto producto);	//C
	Producto read (Long id);			//R	
	
	List <Producto> getAll();
	
	
	

}
