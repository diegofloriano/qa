package br.edu.ifsp.demo_clean.service;

import org.springframework.stereotype.Service;

import br.edu.ifsp.demo_clean.model.Carro;
import br.edu.ifsp.demo_clean.model.Cliente;
import br.edu.ifsp.demo_clean.model.Venda;
import br.edu.ifsp.demo_clean.repository.CarroRepository;
import br.edu.ifsp.demo_clean.repository.ClienteRepository;
import br.edu.ifsp.demo_clean.repository.VendaRepository;

import java.util.*;

@Service
public class ServicoBaguncado {

    private CarroRepository r;
    private ClienteRepository rc;
    private VendaRepository rv;

    public ServicoBaguncado(CarroRepository x, ClienteRepository y, VendaRepository z){
        r=x; rc=y; rv=z;
    }

    //cliente
    public void addCli(Cliente c){rc.save(c);}
    public List<Cliente> tdsCli(){return rc.findAll();}

    //carro
    public void addCar(Carro c){r.save(c);}
    public List<Carro> tudoCarro(){return r.findAll();}

    //venda
    public void addV(Venda v){rv.save(v);}
    public List<Venda> vnd(){return rv.findAll();}
}
