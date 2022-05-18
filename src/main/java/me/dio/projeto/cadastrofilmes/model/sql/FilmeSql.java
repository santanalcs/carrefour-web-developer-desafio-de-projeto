package me.dio.projeto.cadastrofilmes.model.sql;

import me.dio.projeto.cadastrofilmes.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmeSql extends JpaRepository<Filme, Integer> {
/*
    /**
     * @param nome nome do diretor, referência para filtrar filmes por diretor
     * @return lista de filmes dirigidos pelo nome passado como parâmetro
     */

    /**
     * @param id "id" do diretor, referência para filtrar filmes por diretor
     * @return lista de filmes dirigidos pelo "id" do diretor passado como parâmetro
     */

   /* @Query(value = "SELECT * FROM tb_filmes f " +
            "INNER JOIN tb_diretores d ON f.id_diretor = d.id_diretor " +
            "WHERE d.nome_diretor = :nome", nativeQuery = true)
    */
    @Query(value = "SELECT f.id_filme, f.nome_filme, f.genero, d.id_diretor," +
            " p.id_produtora, d.nome_diretor, p.nome_produtora" +
            " FROM tb_filmes f " +
            "INNER JOIN tb_diretores d ON f.id_diretor = d.id_diretor " +
            "INNER JOIN tb_produtoras p ON f.id_produtora = p.id_produtora " +
            "WHERE d.id_diretor = :id", nativeQuery = true)
    List<Filme> findFilmesPorDiretor(Integer id);
}
