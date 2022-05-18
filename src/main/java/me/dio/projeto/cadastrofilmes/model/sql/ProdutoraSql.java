package me.dio.projeto.cadastrofilmes.model.sql;


import me.dio.projeto.cadastrofilmes.model.Produtora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoraSql extends JpaRepository<Produtora, Integer> {}
