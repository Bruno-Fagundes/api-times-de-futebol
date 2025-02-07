package com.company.nomeprojeto.times.facade;

import com.company.nomeprojeto.times.dto.TimeDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Camada de serviço que implementa a lógica de negócios para gestão de times.
 * Utiliza um Map para simular um repositório de dados em memória.
 */
@Service
public class TimesFacade {
    private static final Map<Long, TimeDTO> times = new HashMap<>();

    /**
     * Cria um novo time
     * @param timeDTO Dados do time a ser criado
     * @return Time criado com ID gerado
     */
    public TimeDTO criar(TimeDTO timeDTO) {
        Long proximoId = times.keySet().size() + 1L;
        timeDTO.setId(proximoId);
        times.put(proximoId, timeDTO);
        return timeDTO;
    }

    public TimeDTO atualizar(TimeDTO timeDTO, Long timeId) {
        times.put(timeId, timeDTO);
        return timeDTO;
    }

    public TimeDTO getById(Long timeId) {
        return times.get(timeId);
    }

    public List<TimeDTO> getAll() {
        return new ArrayList<>(times.values());
    }

    public String delete(Long timeId) {
        times.remove(timeId);
        return "DELETED";
    }
}
