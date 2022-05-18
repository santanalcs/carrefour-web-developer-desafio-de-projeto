package me.dio.projeto.cadastrofilmes.control.controller;

import me.dio.projeto.cadastrofilmes.control.service.DiretorImplService;
import me.dio.projeto.cadastrofilmes.form.DiretorForm;
import me.dio.projeto.cadastrofilmes.model.Diretor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/diretor")
public class DiretorController {

    @Autowired
    private DiretorImplService service;

    @GetMapping
    public List<Diretor> getAll(){ return service.getAll();}

    @PostMapping
    public Diretor create(@Valid @RequestBody DiretorForm form) {
        return service.create(form);
    }

    @PutMapping("/atualizar/{id}")
    public Diretor update(@PathVariable Integer id, @RequestBody DiretorForm form) { return service.update(id, form); }

    @DeleteMapping("/excluir/{id}")
    public Diretor delete (@PathVariable Integer id) { return service.delete(id); }
}
