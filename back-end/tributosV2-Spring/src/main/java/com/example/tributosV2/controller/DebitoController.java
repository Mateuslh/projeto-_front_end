package com.example.tributosV2.controller;

import com.example.tributosV2.model.Debito.Debito;
import com.example.tributosV2.service.DebitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/debito")
public class DebitoController extends AbstractCadastralController<Debito, DebitoService> {
    @Autowired
    public DebitoController(DebitoService service) {
        super(service, Debito.class);
    }
}
