package com.clearminds.ccgo.interfaces;

import com.clearminds.ccgo.model.Persona;

public class PersonaManager {
	private ServicioPersona serv;
	
	public PersonaManager(){
		serv = new ServicioPersonaArchivo();
	}
	
	public void insertarPersona(Persona persona){
		serv.insertar(persona);
	}
	
	public void actualizarPersona(Persona persona){
		serv.actualizar(persona);
	}
	
	public void eliminarPersona(Persona persona){
		serv.eliminar(persona);
	}
	
}
