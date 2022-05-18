package me.dio.projeto.cadastrofilmes.control;

import me.dio.projeto.cadastrofilmes.form.FilmeForm;
import me.dio.projeto.cadastrofilmes.model.Filme;

import java.util.List;

public interface FilmeService {

    /**
     * Cria o registro de um Filme e salva no banco de dados.
     * @param form objeto contém dados para criação do registro de um Filme no banco de dados.
     * @return registro criado.
    */
    Filme create(FilmeForm form);

    /**
     * Retorna todos os registros dos Filmes aramzenados no banco de dados.
     * @return Uma lista com todos os Filmes que, estão salvas no DB.
    */
    List<Filme> getAll();

    /**
     * Retorna todos os registros dos Filmes relacionados a um Diretor especíco.
     * @param id id do Diretor dos qual os filmes derão listados.
     * @return Uma lista com todos os Filmes que, estão salvas no DB.
     */

    List<Filme> filmesPorDiretor(Integer id);

    /**
     * Atualiza os dados relacionados a um Filme.
     * @param id id do Filme que será atualizado.
     * @param form formulário referente aos dados necessários para atualização do Filme.
     * @return dado atualizado.
    */
    Filme update(Integer id, FilmeForm form);

    /**
     * Deleta o registro específico de um Filme.
     *
     * @param id id do Filme que será excluído.
     * @return
     */
    Filme delete(Integer id);
}
