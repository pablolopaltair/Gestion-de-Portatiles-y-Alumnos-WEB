/**
 * 
 */
package ejemploWeb2.aplicacion.dal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Pablo
 *
 */
@Repository
public interface AlumnoRepository extends CrudRepository<Alumno,Integer> {

}
