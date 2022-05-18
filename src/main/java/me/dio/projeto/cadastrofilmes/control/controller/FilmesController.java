package me.dio.projeto.cadastrofilmes.control.controller;

import me.dio.projeto.cadastrofilmes.control.service.FilmeImplService;
import me.dio.projeto.cadastrofilmes.form.FilmeForm;
import me.dio.projeto.cadastrofilmes.model.Filme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filme")
public class FilmesController {

    @Autowired
    private FilmeImplService service;

    @GetMapping("/diretor/{id}")
    public List<Filme> getFilmesPorDiretor(@PathVariable Integer id){ return service.filmesPorDiretor(id);}

    @GetMapping
    public List<Filme> getAll(){ return service.getAll();}

    @PostMapping
    public Filme create(@RequestBody FilmeForm form) { return service.create(form); }

    @PutMapping("/atualizar/{id}")
    public Filme update(@PathVariable Integer id, @RequestBody FilmeForm form) { return service.update(id, form); }

    @DeleteMapping("/excluir/{id}")
    public Filme delete (@PathVariable Integer id) { return service.delete(id); }
}
