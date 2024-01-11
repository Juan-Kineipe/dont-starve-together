package com.example.dontstarvetogetherapi.controller;

import com.example.dontstarvetogetherapi.domain.Survivor;
import com.example.dontstarvetogetherapi.service.SurvivorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/survivors")
public class SurvivorController {

    @Autowired
    private SurvivorService survivorService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Survivor> getAllSurvivors() {
        return survivorService.getAllSurvivors();
    }

    @RequestMapping(value="/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Survivor getSurvivorByName(@PathVariable(value = "name") String name) {
        return survivorService.getSurvivorByName(name);
    }

}
