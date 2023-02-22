/**
 * 
 */
package ejemploWeb2.web.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Pablo López
 * Clase controlador del menú
 */
@Controller
public class ControladorMenu {

    @RequestMapping(value="/gestion-portatiles")
    public String showForm(Model modelo) {
        return "menu_gestion";
    }
    
    
   
}