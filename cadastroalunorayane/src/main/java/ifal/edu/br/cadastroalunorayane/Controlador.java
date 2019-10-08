package ifal.edu.br.cadastroalunorayane;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controlador{

    @RequestMapping
    public ModelAndView index(){
        return new ModelAndView("Formulario.html");
    }
}