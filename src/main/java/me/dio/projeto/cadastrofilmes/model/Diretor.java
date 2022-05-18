package me.dio.projeto.cadastrofilmes.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_diretores")

public class Diretor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_diretor")
    private Integer id;

    @Column(name="nome_diretor")
    private String nome;


    @OneToMany(mappedBy = "diretor", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Diretor> diretor = new ArrayList<>();
}
