/**
 * 
 */
package ejemploWeb2.aplicacion.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ejemploWeb2.aplicacion.dal.Alumno;
import ejemploWeb2.aplicacion.dal.AlumnoRepository;
import ejemploWeb2.aplicacion.dal.Portatil;
import ejemploWeb2.aplicacion.dal.PortatilRepository;

/**
 * @author Pablo López
 *
 */
@Service
public class Servicios {

	@Autowired
	private AlumnoRepository aluRepo;
	@Autowired
	private PortatilRepository porRepo;

	
	
	// INSERTAR MATRICULA
	@Transactional
	public void insertarUnaMatricula(Alumno alumno) {
		aluRepo.save(alumno);
	}

	// BUSCAR ALUMNOS
	public List<Alumno> buscarTodos() {
		return (List<Alumno>) aluRepo.findAll();
	}

	// INSERTAR ODENADOR
	@Transactional
	public void insertarUnOrdenador(Portatil portatil) {
		porRepo.save(portatil);
	}

	// BUSCAR PORTATILES
	public List<Portatil> buscarOrdenadores() {
		return (List<Portatil>) porRepo.findAll();
	}

}
