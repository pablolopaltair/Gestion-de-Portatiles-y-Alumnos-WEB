/**
 * 
 */
package ejemploWeb2.aplicacion.dto;

import ejemploWeb2.aplicacion.dal.Alumno;
import ejemploWeb2.aplicacion.dal.Portatil;

/**
 * @author Pablo: Interfaz que convierte DTO a DAO (Alumno & Portatil)
 *
 */
public interface ADAO {
	
	public Alumno AlumnosDTOaDAO (AlumnoDTO alumnoDTO);
	public Portatil PortatilDTOaDAO (PortatilDTO portatilDTO);

}
