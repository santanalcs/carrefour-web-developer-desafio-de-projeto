package me.dio.projeto.cadastrofilmes.control;

import me.dio.projeto.cadastrofilmes.form.DiretorForm;
import me.dio.projeto.cadastrofilmes.model.Diretor;

import java.util.List;

public interface DiretorService {

    /**
     * Retorna todos os registros dos Diretore aramzenados no banco de dados.
     * @return Uma lista com todos os Diretores que, estão salvas no DB.
     */
    List<Diretor> getAll();

    /**
     * Cria o registro de um Diretor e salva no banco de dados.
     * @param form objeto contém dados para criação do registro de um Diretor no banco de dados.
     * @return registro criado.
    */
    Diretor create(DiretorForm form);

    /**
     * Atualiza o nome do Diretor.
     * @param id id do Diretor que será atualizado.
     * @param diretorForm formulário referente aos dados necessários para atualização do Diretor.
     * @return dado atualizado.
    */
    Diretor update(Integer id, DiretorForm diretorForm);

    /**
     * Deleta o registro específico de um Diretor.
     * @param id id do Diretor que será excluído.
    */
    Diretor delete(Integer id);
}
