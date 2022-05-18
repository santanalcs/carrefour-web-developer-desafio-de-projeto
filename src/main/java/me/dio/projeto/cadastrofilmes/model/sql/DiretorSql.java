package me.dio.projeto.cadastrofilmes.model.sql;

import me.dio.projeto.cadastrofilmes.form.DiretorForm;
import me.dio.projeto.cadastrofilmes.model.Diretor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiretorSql extends JpaRepository<Diretor, Integer> {}
