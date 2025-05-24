package com.duoc.semana1.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.duoc.semana1.model.Comida;

@Service
public interface ComidaService {
    List<Comida> getAllComidas();
    void createComida(Comida comida);
    Comida getComidaById(String id);
    void updateComida(String id, Comida comida);
    void deleteComida(String id);
}
