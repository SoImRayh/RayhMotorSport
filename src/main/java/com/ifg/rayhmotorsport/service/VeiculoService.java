package com.ifg.rayhmotorsport.service;

import com.ifg.rayhmotorsport.model.Veiculo;

public interface VeiculoService {
    PagedResponse<Veiculo> getAllVeiculos(int page, int size){
    }

}
