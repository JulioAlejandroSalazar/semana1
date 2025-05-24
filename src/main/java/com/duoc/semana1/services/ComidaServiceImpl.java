package com.duoc.semana1.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.duoc.semana1.model.Comida;
import com.duoc.semana1.repository.ComidaRepository;

@Service
public class ComidaServiceImpl implements ComidaService {

    private final ComidaRepository comidaRepository = new ComidaRepository();

    @Override
    public List<Comida> getAllComidas(){
        return comidaRepository.findAll();
    }

    @Override
    public void createComida(Comida comida) {
        comidaRepository.addComida(comida);
    }

    @Override
    public Comida getComidaById(String id) {
        return comidaRepository.findComidaByID(id);
    }

    @Override
    public void updateComida(String id, Comida comida) {
        comidaRepository.updateComida(id, comida);
    }

    @Override
    public void deleteComida(String id) {
        comidaRepository.deleteComida(id);
    }
    
}
