package br.com.viniciuscavalheiro.loja.controller;

import br.com.viniciuscavalheiro.loja.controller.dto.CompraDTO;
import br.com.viniciuscavalheiro.loja.controller.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compra")
public class CompraController {

    private final CompraService compraService;

    public CompraController(CompraService compraService) {
        this.compraService = compraService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void realizaCompra(@RequestBody CompraDTO compra) {
        compraService.relizaCompra(compra);
    }
}
