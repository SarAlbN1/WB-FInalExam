package com.sara.backexamenfinalweb.controller;

import com.sara.backexamenfinalweb.dto.EntidadDTO;
import com.sara.backexamenfinalweb.service.EntidadService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entidades")
@RequiredArgsConstructor
@CrossOrigin("*")
public class EntidadController {

    private final EntidadService entidadService;

    @PostMapping
    public EntidadDTO create(@RequestBody EntidadDTO entidadDTO) {
        return entidadService.createEntidad(entidadDTO);
    }

    @PutMapping("/{id}")
    public EntidadDTO update(@PathVariable Long id, @RequestBody EntidadDTO entidadDTO) {
        return entidadService.updateEntidad(id, entidadDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        entidadService.deleteEntidad(id);
    }

    @GetMapping
    public List<EntidadDTO> getAll() {
        return entidadService.getAllEntidades();
    }

    @GetMapping("/{id}")
    public EntidadDTO getById(@PathVariable Long id) {
        return entidadService.getEntidadById(id);
    }
}
