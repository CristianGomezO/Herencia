package com.clearminds.ccgo.model;

import com.clearminds.ccgo.interfaces.ServicioPersona;
import com.clearminds.ccgo.interfaces.ServicioPersonaBDD;

public class PersonaManager {
	private ServicioPersona serv;
	
	public PersonaManager(){
		serv = new ServicioPersonaBDD();
	}
	
	public void insertarPersona(Persona persona){
		serv.insertar(persona);
	}
}
