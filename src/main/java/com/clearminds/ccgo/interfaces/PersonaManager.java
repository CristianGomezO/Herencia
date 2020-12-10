package com.clearminds.ccgo.interfaces;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.clearminds.ccgo.exceptions.InstanceException;
import com.clearminds.ccgo.model.Persona;

public class PersonaManager {
	private ServicioPersona serv;

	public PersonaManager() throws InstanceException {
		
		try {
			String valorPropiedad = leerProperties("clase");
			Class claseBDD = Class.forName(valorPropiedad);

			serv = (ServicioPersona) claseBDD.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		}

	}
	
	public String leerProperties(String nombre){
		Properties propiedades = new Properties();
		File f = new File("properties");
		System.out.println("ruta:" + f.getAbsoluteFile());
		String propiedadClase = "";
		
		try {
			propiedades.load(new FileInputStream(
					"src/main/java/com/clearminds/ccgo/middleware/properties"));
			propiedadClase =  propiedades.getProperty("clase");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return propiedadClase;
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
