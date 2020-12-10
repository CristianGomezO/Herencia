package com.clearminds.ccgo.interfaces;

import com.clearminds.ccgo.exceptions.InstanceException;
import com.clearminds.ccgo.model.Persona;

public class PersonaManager {
	private ServicioPersona serv;

	public PersonaManager() throws InstanceException{
		try {
			Class claseBDD = Class.forName("com.clearminds.ccgo.interfaces.ServicioPersonaBDD");
			
			serv=(ServicioPersona)claseBDD.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		}
	}

	public void insertarPersona(Persona persona) {
		serv.insertar(persona);
	}

	public void actualizarPersona(Persona persona) {
		serv.actualizar(persona);
	}

	public void eliminarPersona(Persona persona) {
		serv.eliminar(persona);
	}

}
