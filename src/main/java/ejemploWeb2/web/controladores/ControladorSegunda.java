/**
 * 
 */
package ejemploWeb2.web.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Pablo López
 * Clase con los controladores de la Web
 */
@Controller
public class ControladorSegunda {
	
	@RequestMapping(value="/segunda")
    public String home() {
        return "segunda";
    }
	

	 
	 	   
}