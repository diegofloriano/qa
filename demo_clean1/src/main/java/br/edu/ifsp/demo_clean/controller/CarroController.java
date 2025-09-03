package br.edu.ifsp.demo_clean.controller;

import br.edu.ifsp.demo_clean.model.Carro;
import br.edu.ifsp.demo_clean.service.CarroService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carros")
@Tag(name = "Carros", description = "Endpoints para gerenciamento de carros")
public class CarroController {

    private final CarroService carroService;

    public CarroController(CarroService carroService) {
        this.carroService = carroService;
    }

    @PostMapping("/cliente")
    @Operation(summary = "Cadastrar um carro", description = "Adiciona um novo carro no sistema")
    public ResponseEntity<Carro> criar(@RequestBody Carro carro) {
        return ResponseEntity.ok(carroService.salvar(carro));
    }

    @GetMapping
    @Operation(summary = "Listar todos os carros", description = "Retorna todos os carros cadastrados")
    public ResponseEntity<List<Carro>> listarTodos() {
        return ResponseEntity.ok(carroService.listarTodos());
    }
}
