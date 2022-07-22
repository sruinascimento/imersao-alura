package br.com.nextprofile.linguagensapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {

    @Autowired
    private LinguagemRepository repositorio;
    
    @GetMapping(value="/linguagem-preferida")   
    public String processaLinguagemPreferida() {
        return "Oi, Java!";
    }

    @GetMapping(value="/linguagens")
    public List<Linguagem> obterLinguagens() {
        List<Linguagem> linguagens = repositorio.findAll();
        return linguagens;
    }

    @PostMapping(value="/linguagens")
    public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem) {
        Linguagem linguagemSalva = repositorio.save(linguagem);

        return linguagemSalva;
    }

    @GetMapping(value="/")
    public String processaPaginaInicial() {
        return "<h1>Imersão Alura</h1> <br> Rui - Backend";
    }


}
