package com.ifg.rayhmotorsport.model;

import com.ifg.rayhmotorsport.utils.TipoDeVeiculo;
import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.awt.*;


public class Veiculo {

    @Id
    @Column(name = "placa")
    private String placa;

    @NotBlank
    private Integer ano;

    @NotBlank
    private Color cor;

    @NotBlank
    private float preco;

    @Nullable
    private String descricao;

    @NotBlank
    private TipoDeVeiculo tipo;

    @NotBlank
    private Integer potencia;

    public Veiculo() {
    }

    public Veiculo(String placa, Integer ano, Color cor, float preco, @Nullable String descricao, TipoDeVeiculo tipo, Integer potencia) {
        this.placa = placa;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
        this.descricao = descricao;
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
