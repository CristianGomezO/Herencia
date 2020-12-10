package com.clearminds.ccgo.interfaces;

import com.clearminds.ccgo.model.Persona;

public class ServicioPersonaArchivo implements ServicioPersona{
	
	public boolean insertar(Persona persona) {
		System.out.println("Insertando persona en un archivo");
		System.out.println(persona);
		return true;
	}
	
	public boolean actualizar(Persona persona) {
		System.out.println("Actualizando persona en en un archivo");
		System.out.println(persona);
		return true;
	}
	
	public boolean eliminar(Persona persona) {
		System.out.println("Eliminando persona en en un archivo");
		System.out.println(persona);
		return true;
	}
}
