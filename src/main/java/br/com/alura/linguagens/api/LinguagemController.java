package br.com.alura.linguagens.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LinguagemController {

    @Autowired
    private LinguagemRepository repositorio;

    @GetMapping(value = "/linguagens")
    public List<Linguagem> obterLinguagens() {
        List<Linguagem> linguagens = repositorio.findAll();
        return linguagens;
    }

//    @GetMapping(value = "/linguagem/{id}")
//    public List<Linguagem> linguagemById(@PathVariable int ranking) {
//        List<Linguagem> linguagens = repositorio
//        return linguagens;
//    }

    @PostMapping("/linguagem")
    public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem) {
        Linguagem linguagemSalva = repositorio.save(linguagem);
        return linguagemSalva;
    }

//    @DeleteMapping("/linguagem/{id}")
//    public Linguagem deletarLinguagem(@RequestBody Linguagem linguagem) {
//        Linguagem linguagemDelete = repositorio.delete();
//        return linguagemDelete;
//    }
}
