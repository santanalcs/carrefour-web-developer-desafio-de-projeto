package me.dio.projeto.cadastrofilmes.control.service;


import me.dio.projeto.cadastrofilmes.control.ProdutoraService;
import me.dio.projeto.cadastrofilmes.form.ProdutoraForm;
import me.dio.projeto.cadastrofilmes.model.Produtora;
import me.dio.projeto.cadastrofilmes.model.sql.ProdutoraSql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoraImplService implements ProdutoraService {

    @Autowired
    private ProdutoraSql produtoraSql;

    @Override
    public List<Produtora> getAll() {
        return produtoraSql.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    @Override
    public Produtora create(ProdutoraForm form) {
        Produtora produtora = new Produtora();
        produtora.setNome(form.getNomeProdutora());

        return produtoraSql.save(produtora);
    }

    @Override
    public Produtora update(Integer id, ProdutoraForm form) {
        Produtora produtora = produtoraSql.findById(id).get();
        produtora.setNome(form.getNomeProdutora());
        return produtoraSql.save(produtora);

    }

    @Override
    public Produtora delete(Integer id) {
        produtoraSql.deleteById(id);

        return null;
    }
}
