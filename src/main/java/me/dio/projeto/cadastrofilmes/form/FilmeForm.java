package me.dio.projeto.cadastrofilmes.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmeForm {

    @NotEmpty(message = "Preencha o campo corretamente.")
    @Size(min = 3, message = "'${validatedValue}' precisa ter no mínimo {min} caracteres.")
    private String nomeFilme;

    @NotEmpty(message = "Preencha o campo corretamente.")
    @Size(min = 3, message = "'${validatedValue}' precisa ter no mínimo {min} caracteres.")
    private String genero;

    @NotNull(message = "Preencha o campo corretamente.")
    @Positive(message = "O Id do diretor precisa ser positivo.")
    private Integer idDiretor;

    @NotNull(message = "Preencha o campo corretamente.")
    @Positive(message = "O Id da produtora precisa ser positivo.")
    private Integer idProdutora;
}
