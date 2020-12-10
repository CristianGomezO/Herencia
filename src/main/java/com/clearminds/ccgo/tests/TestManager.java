package com.clearminds.ccgo.tests;

import com.clearminds.ccgo.interfaces.PersonaManager;
import com.clearminds.ccgo.interfaces.ServicioPersonaArchivo;
import com.clearminds.ccgo.model.Persona;

public class TestManager {

	public static void main(String[] args) {
		Persona persona = new Persona("Cristian", "Gómez" , 19);
		
		PersonaManager personaManager = new PersonaManager();
		
		personaManager.insertarPersona(persona);
		personaManager.actualizarPersona(persona);
		personaManager.eliminarPersona(persona);
		
		System.out.println();
		
		ServicioPersonaArchivo personaArchivo = new ServicioPersonaArchivo();
		personaArchivo.insertar(persona);
		personaArchivo.actualizar(persona);
		personaArchivo.eliminar(persona);
	}

}
