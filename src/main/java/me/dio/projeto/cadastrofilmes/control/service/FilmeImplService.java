package me.dio.projeto.cadastrofilmes.control.service;


import me.dio.projeto.cadastrofilmes.control.FilmeService;
import me.dio.projeto.cadastrofilmes.form.FilmeForm;
import me.dio.projeto.cadastrofilmes.model.Diretor;
import me.dio.projeto.cadastrofilmes.model.Filme;
import me.dio.projeto.cadastrofilmes.model.Produtora;
import me.dio.projeto.cadastrofilmes.model.sql.FilmeSql;
import me.dio.projeto.cadastrofilmes.model.sql.DiretorSql;
import me.dio.projeto.cadastrofilmes.model.sql.ProdutoraSql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeImplService implements FilmeService {

    @Autowired
    private FilmeSql filmeSql;

    @Autowired
    DiretorSql diretorSql;

    @Autowired
    ProdutoraSql produtoraSql;

    @Override
    public Filme create (FilmeForm form) {
        Filme filme = new Filme();

            Diretor diretor = diretorSql.findById(form.getIdDiretor()).get();
            Produtora produtora = produtoraSql.findById(form.getIdProdutora()).get();
            filme.setDiretor(diretor);
            filme.setProdutora(produtora);
            filme.setNome(form.getNomeFilme());
            filme.setGenero(form.getGenero());

            return filmeSql.save(filme);
    }

    @Override
    public List<Filme> getAll() {
        return filmeSql.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    @Override
    public List<Filme> filmesPorDiretor(Integer id) {
        return filmeSql.findFilmesPorDiretor(id);
    }

    @Override
    public Filme update(Integer id, FilmeForm form) {

        Diretor diretor = diretorSql.findById(form.getIdDiretor()).get();
        Produtora produtora = produtoraSql.findById(form.getIdProdutora()).get();
        Filme filme = filmeSql.findById(id).get();
        filme.setNome(form.getNomeFilme());
        filme.setGenero(form.getGenero());
        filme.setDiretor(diretor);
        filme.setProdutora(produtora);

        return filmeSql.save(filme);
    }

    @Override
    public Filme delete(Integer id) {
        filmeSql.deleteById(id);

        return null;
    }

}
