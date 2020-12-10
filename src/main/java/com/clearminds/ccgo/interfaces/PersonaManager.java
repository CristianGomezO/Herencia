package com.clearminds.ccgo.interfaces;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.clearminds.ccgo.exceptions.InstanceException;
import com.clearminds.ccgo.model.Persona;

public class PersonaManager {
	private ServicioPersona serv;

	public PersonaManager() throws InstanceException {
		Properties propiedades = new Properties();
		File f = new File("properties");
		System.out.println("ruta:" + f.getAbsoluteFile());
		String propiedadClase = "";
		try {
			propiedades.load(new FileInputStream(
					"C:/Users/USER/Desktop/Herencia/src/main/java/com/clearminds/ccgo/middleware/properties"));
			propiedadClase =  propiedades.getProperty("clase");
			Class claseBDD = Class.forName(propiedadClase);

			serv = (ServicioPersona) claseBDD.newInstance();
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
