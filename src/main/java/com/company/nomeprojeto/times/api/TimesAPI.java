package com.company.nomeprojeto.times.api;

import com.company.nomeprojeto.times.dto.TimeDTO;
import com.company.nomeprojeto.times.facade.TimesFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller REST que gerencia as operações CRUD de times.
 * Expõe endpoints HTTP para manipulação de times.
 */
@RestController
@RequestMapping(value = "/times", produces = MediaType.APPLICATION_JSON_VALUE)
public class TimesAPI {
    @Autowired
    private TimesFacade timesFacade;

    /**
     * Cria uma nova time
     * @param timeDTO Dados da time a ser criada
     * @return time criada com ID gerado
     */
    @PostMapping
    @ResponseBody
    public TimeDTO criar(@RequestBody TimeDTO timeDTO) {
        return timesFacade.criar(timeDTO);
    }

    @PutMapping("/{timeId}")
    @ResponseBody
    public TimeDTO atualizar(@PathVariable("timeId") Long timeId,
                             @RequestBody TimeDTO timeDTO) {
        return timesFacade.atualizar(timeDTO, timeId);
    }

    @GetMapping
    @ResponseBody
    public List<TimeDTO> getAll() {
        return timesFacade.getAll();
    }

    @DeleteMapping("/{timeId}")
    @ResponseBody
    public String deletar(@PathVariable("timeId") Long timeId) {
        return timesFacade.delete(timeId);
    }
}
