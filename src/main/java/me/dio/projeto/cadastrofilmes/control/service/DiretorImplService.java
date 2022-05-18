package me.dio.projeto.cadastrofilmes.control.service;

import me.dio.projeto.cadastrofilmes.control.DiretorService;
import me.dio.projeto.cadastrofilmes.form.DiretorForm;
import me.dio.projeto.cadastrofilmes.model.Diretor;
import me.dio.projeto.cadastrofilmes.model.sql.DiretorSql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiretorImplService implements DiretorService {

    @Autowired
    private DiretorSql diretorSql;

    @Override
    public List<Diretor> getAll() {
        return diretorSql.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    @Override
    public Diretor create(DiretorForm form) {

        Diretor diretor = new Diretor();
        diretor.setNome(form.getNomeDiretor());

        return diretorSql.save(diretor);
    }

    @Override
    public Diretor update(Integer id, DiretorForm form) {

        Diretor diretor = diretorSql.findById(id).get();
        diretor.setNome(form.getNomeDiretor());
        return diretorSql.save(diretor);
    }

    @Override
    public Diretor delete(Integer id) {
        diretorSql.deleteById(id);

        return null;
    }

}
