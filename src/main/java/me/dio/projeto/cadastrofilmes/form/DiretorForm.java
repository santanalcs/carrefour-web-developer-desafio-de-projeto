package me.dio.projeto.cadastrofilmes.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiretorForm {

    @NotEmpty(message = "Preencha o campo corretamente.")
    @Size(min = 3, message = "'${validatedValue}' precisa ter no mínimo {min} caracteres.")
    private String nomeDiretor;
}
