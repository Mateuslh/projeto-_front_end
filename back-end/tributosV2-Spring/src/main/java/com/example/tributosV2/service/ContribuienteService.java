package com.example.tributosV2.service;

import com.example.tributosV2.exception.NotFoundException;
import com.example.tributosV2.model.Contribuinte.Contribuinte;
import com.example.tributosV2.model.Debito.Debito;
import com.example.tributosV2.repository.ContribuienteRepository;
import com.example.tributosV2.repository.DebitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContribuienteService extends AbstractCadastralService<Contribuinte, ContribuienteRepository> {

    @Autowired
    protected DebitoRepository debitoRepository;
    @Autowired
    private ContribuienteRepository contribuienteRepository;

    public List<Debito> getDebitos(Long contribuinteId) throws NotFoundException {
        return debitoRepository.findDebitoByContribuinteId(contribuinteId);
    }

    public Long countContribuiente() {
        return contribuienteRepository.count();
    }
}
