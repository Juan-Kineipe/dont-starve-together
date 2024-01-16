package br.com.dontstarve.controller;

import br.com.dontstarve.domain.Survivor;
import br.com.dontstarve.service.SurvivorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/survivors")
@Tag(name = "Survivor", description = "Endpoints to get Survivor related information")
public class SurvivorController {

    @Autowired
    private SurvivorService survivorService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Finds all Survivors", description = "Finds all Survivors",
            tags = {"Survivor"}
    )
    public List<Survivor> getAllSurvivors() {
        return survivorService.getAllSurvivors();
    }

    @RequestMapping(value="/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Finds a Survivor", description = "Finds a survivor",
            tags = {"Survivor"}
    )
    public Survivor getSurvivorByName(@PathVariable(value = "name") String name) {
        return survivorService.getSurvivorByName(name);
    }

}
