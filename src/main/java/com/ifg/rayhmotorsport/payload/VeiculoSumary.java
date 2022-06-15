package com.ifg.rayhmotorsport.payload;

import com.ifg.rayhmotorsport.utils.TipoDeVeiculo;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.awt.*;

@Data
@AllArgsConstructor
public class VeiculoSumary {
    private String placa;
    private Integer ano;
    private Color cor;
    private Float preco;
    private String descricao;
    private TipoDeVeiculo tipo;
    private Integer potencia;
}
