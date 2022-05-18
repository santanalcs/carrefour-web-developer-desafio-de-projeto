package me.dio.projeto.cadastrofilmes.control;

import me.dio.projeto.cadastrofilmes.form.ProdutoraForm;
import me.dio.projeto.cadastrofilmes.model.Produtora;

import java.util.List;

public interface ProdutoraService {

    /**
     * Retorna todos os registros das Produtoras aramzenados no banco de dados.
     * @return Uma lista com todas as Produtoras que, estão salvas no DB.
     */
    List<Produtora> getAll();

    /**
     * Cria o registro de uma Produtora e salva no banco de dados.
     * @param form objeto contém dados para criação do registro de uma Produtora no banco de dados.
     * @return registro criado.
    */
    Produtora create(ProdutoraForm form);

    /**
     * Atualiza o nome da Produtora.
     * @param id id do Produtora que será atualizado.
     * @param produtoraForm formulário referente aos dados necessários para atualização da Produtora.
     * @return dado atualizado.
    */
    Produtora update(Integer id, ProdutoraForm produtoraForm);

    /**
     * Deleta o registro específico de um Diretor.
     * @param id id do Diretor que será excluído.
     */
    Produtora delete(Integer id);
}
