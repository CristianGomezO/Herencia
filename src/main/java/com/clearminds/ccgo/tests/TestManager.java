package com.clearminds.ccgo.tests;

import com.clearminds.ccgo.exceptions.InstanceException;
import com.clearminds.ccgo.interfaces.PersonaManager;
import com.clearminds.ccgo.interfaces.ServicioPersonaArchivo;
import com.clearminds.ccgo.model.Persona;

public class TestManager {

	public static void main(String[] args) {
		Persona persona = new Persona("Cristian", "Gómez", 19);

		try {
			PersonaManager personaManager = new PersonaManager();
			
			personaManager.insertarPersona(persona);
			personaManager.actualizarPersona(persona);
			personaManager.eliminarPersona(persona);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
