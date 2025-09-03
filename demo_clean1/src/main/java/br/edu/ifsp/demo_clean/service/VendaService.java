package br.edu.ifsp.demo_clean.service;

import br.edu.ifsp.demo_clean.model.Venda;
import br.edu.ifsp.demo_clean.repository.VendaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendaService {

    private final VendaRepository vendaRepository;

    public VendaService(VendaRepository vendaRepository) {
        this.vendaRepository = vendaRepository;
    }

    public Venda salvar(Venda venda) {
        return vendaRepository.save(venda);
    }

    public List<Venda> listarTodos() {
        return vendaRepository.findAll();
    }
}
