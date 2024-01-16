package br.com.dontstarve.service;

import br.com.dontstarve.domain.Survivor;
import br.com.dontstarve.exception.NotFoundException;
import br.com.dontstarve.repository.SurvivorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class SurvivorService {

    private Logger log = Logger.getLogger(SurvivorService.class.getName());

    @Autowired
    private SurvivorRepository repository;

    public List<Survivor> getAllSurvivors() {

        log.info("Getting all survivors");

        return repository.findAll();
    }

    public Survivor getSurvivorByName(String name) {

        log.info("Getting survivor by name: " + name);

        Survivor survivor = repository.findByName(name);
        if (survivor == null) throw new NotFoundException("No results found for " + name);

        return survivor;
    }
}
