package me.dio.projeto.cadastrofilmes.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_filmes")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_filme")
    private Integer id;

    @Column(name="nome_filme")
    private String nome;

    @ManyToOne()
    @JoinColumn(name = "id_diretor")
    private Diretor diretor;

    @ManyToOne()
    @JoinColumn(name = "id_produtora")
    private Produtora produtora;

    private String genero;
}
