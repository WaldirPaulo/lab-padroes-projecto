package one.digitalinovation.gof.service.impl;

import io.swagger.v3.oas.annotations.servers.Server;
import one.digitalinovation.gof.model.Cliente;
import one.digitalinovation.gof.model.ClienteRepository;
import one.digitalinovation.gof.model.Endereco;
import one.digitalinovation.gof.model.EnderecoRepository;
import one.digitalinovation.gof.service.ClienteService;
import one.digitalinovation.gof.service.ViaCep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCep viaCep;

    //TODO Singleton: Injetar os componentes do Spring com @Au
    @Override
    public Iterable<Cliente> buscarTodos() {

        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
     Optional<Cliente> cliente = clienteRepository.findById(id);

        return cliente.get();

    }


    @Override
    public void inserir(Cliente cliente) {
     salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if(clienteBd.isPresent())
            salvarClienteComCep(cliente);

    }


    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }

    private void salvarClienteComCep(Cliente cliente){
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCep.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }
}
