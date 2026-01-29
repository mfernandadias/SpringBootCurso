package br.com.erudio.Missoes;


import br.com.erudio.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;


@Entity
@Table (name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeDaMissao;
    private String dificuldadeMissao;
    private NinjaModel ninja;

    @OneToMany
    private List<NinjaModel> ninjas;


}
