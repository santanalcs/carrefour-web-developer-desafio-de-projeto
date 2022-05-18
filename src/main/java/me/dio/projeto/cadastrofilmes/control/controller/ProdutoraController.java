package me.dio.projeto.cadastrofilmes.control.controller;

import me.dio.projeto.cadastrofilmes.control.service.ProdutoraImplService;
import me.dio.projeto.cadastrofilmes.form.DiretorForm;
import me.dio.projeto.cadastrofilmes.form.ProdutoraForm;
import me.dio.projeto.cadastrofilmes.model.Diretor;
import me.dio.projeto.cadastrofilmes.model.Produtora;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/produtora")
public class ProdutoraController {

    @Autowired
    private ProdutoraImplService service;

    @GetMapping
    public List<Produtora> getAll(){ return service.getAll();}

    @PostMapping
    public Produtora create(@Valid @RequestBody ProdutoraForm form) {
        return service.create(form);
    }

    @PutMapping("/atualizar/{id}")
    public Produtora update(@PathVariable Integer id, @RequestBody ProdutoraForm form) { return service.update(id, form); }

    @DeleteMapping("/excluir/{id}")
    public Produtora delete (@PathVariable Integer id) { return service.delete(id); }
}
