package com.clearminds.ccgo.interfaces;

import com.clearminds.ccgo.model.Persona;

public interface ServicioPersona {
	
	public boolean insertar(Persona persona);
	
	public boolean actualizar(Persona persona);
	
	public boolean eliminar(Persona persona);
	
}
