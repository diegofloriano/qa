package br.edu.ifsp.demo_clean.controller;

import br.edu.ifsp.demo_clean.model.Venda;
import br.edu.ifsp.demo_clean.service.VendaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vendas")
@Tag(name = "Vendas", description = "Endpoints para gerenciamento de vendas")
public class VendaController {

    private final VendaService vendaService;

    public VendaController(VendaService vendaService) {
        this.vendaService = vendaService;
    }

    @PostMapping
    @Operation(summary = "Registrar uma venda", description = "Adiciona uma nova venda no sistema")
    public ResponseEntity<Venda> criar(@RequestBody Venda venda) {
        return ResponseEntity.ok(vendaService.salvar(venda));
    }

    @GetMapping
    @Operation(summary = "Listar todas as vendas", description = "Retorna todas as vendas registradas")
    public ResponseEntity<List<Venda>> listarTodas() {
        return ResponseEntity.ok(vendaService.listarTodos());
    }
}
