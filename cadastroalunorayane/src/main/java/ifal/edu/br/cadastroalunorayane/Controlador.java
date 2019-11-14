package ifal.edu.br.cadastroalunorayane;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controlador{

    @RequestMapping("/")
    public ModelAndView form(){
        return new ModelAndView("Formulario.html");
    }
    @RequestMapping("/index")
    public ModelAndView index(){
        return new ModelAndView("index.html");
    }

    @RequestMapping("/dados")
    public ModelAndView dados(String nome, String email, String senha, String modulo, String preferencia){
        ModelAndView retorno = new ModelAndView("tabela.html");
        retorno.addObject("nome", nome);
        retorno.addObject("email", email);
        retorno.addObject("senha", senha);
        retorno.addObject("modulo", modulo);
        retorno.addObject("preferencia", preferencia);

        return retorno;
    }
}