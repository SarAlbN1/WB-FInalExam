package com.sara.backexamenfinalweb.service;

import com.sara.backexamenfinalweb.dto.EntidadDTO;
import com.sara.backexamenfinalweb.model.Entidad;
import com.sara.backexamenfinalweb.repository.EntidadRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EntidadService {

    private final EntidadRepository entidadRepository;
    private final ModelMapper modelMapper;

    public EntidadDTO createEntidad(EntidadDTO entidadDTO) {
        Entidad entidad = modelMapper.map(entidadDTO, Entidad.class);
        return modelMapper.map(entidadRepository.save(entidad), EntidadDTO.class);
    }

    public EntidadDTO updateEntidad(Long id, EntidadDTO entidadDTO) {
        Entidad entidad = entidadRepository.findById(id).orElseThrow();
        modelMapper.map(entidadDTO, entidad);
        return modelMapper.map(entidadRepository.save(entidad), EntidadDTO.class);
    }

    public void deleteEntidad(Long id) {
        entidadRepository.deleteById(id);
    }

    public List<EntidadDTO> getAllEntidades() {
        return entidadRepository.findAll().stream()
                .map(e -> modelMapper.map(e, EntidadDTO.class))
                .collect(Collectors.toList());
    }

    public EntidadDTO getEntidadById(Long id) {
        Entidad entidad = entidadRepository.findById(id).orElseThrow();
        return modelMapper.map(entidad, EntidadDTO.class);
    }
}
