package com.clearminds.ccgo.interfaces;

import com.clearminds.ccgo.model.Persona;

public class ServicioPersonaBDD implements ServicioPersona {

	public boolean insertar(Persona persona) {
		System.out.println("Insertando persona en la base de datos");
		System.out.println(persona);
		return true;
	}
	
	public boolean actualizar(Persona persona) {
		System.out.println("Actualizando persona en la base de datos");
		System.out.println(persona);
		return true;
	}
	
	public boolean eliminar(Persona persona) {
		System.out.println("Eliminando persona en la base de datos");
		System.out.println(persona);
		return true;
	}
}
