package br.edu.ifal.cadastroaluno;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controlador{

    @RequestMapping("/")
    public ModelAndView index(){
        return new ModelAndView("index.html");
    }

    @RequestMapping("/formulario")
    public ModelAndView formulario(){
        return new ModelAndView("formulario.html");
    }

    @RequestMapping("/aluno_cadastrado")
    public ModelAndView alunoCadastrado(String nome, String email, String cpf,
                                    String sexo, String modulo, String areaDeAtuacao,
                                                                        String senha1){
            ModelAndView resposta =  new ModelAndView("formulario.html");
            //Aluno aluno = new Aluno();
            return resposta.addObject("mensagem", "O aluno " + nome + " com o email " + email + " e o cpf " + cpf + " do sexo " + sexo + " do " + modulo + " modulo " +
            " e gosta da matéria " + areaDeAtuacao + ", ele foi cadastrado com sucesso");
                                                                    
    }

}