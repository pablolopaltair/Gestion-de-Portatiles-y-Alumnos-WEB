/**
 * 
 */
package ejemploWeb2.aplicacion.dto;

import java.util.Calendar;


import ejemploWeb2.aplicacion.dal.Portatil;

/**
 * @author Pablo: Interfaz que convierte DAO a DTO (Alumno & Portatil)
 *
 */
public interface ADTO {

	public AlumnoDTO AlumnosDAOaDTO (Calendar md_date, String nombre, String telefono, Portatil portatil);
	
	
	public PortatilDTO PortatilDAOaDTO (Calendar md_date, String marca, String modelo);
}
