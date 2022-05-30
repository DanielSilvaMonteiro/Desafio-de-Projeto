package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Cliente;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService{

    // TODO singleton: Injetar os componentes do Spring com @Autowired
    // TODO Strategy: implementar os métodos definidos na interface
    // TODO Facade: Abstrair Integações com subsistemas, provendo uma interface
    @Override
    public Iterable<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {

    }

    @Override
    public void atualizar(Long id, Cliente cliente) {

    }

    @Override
    public void deletar(Long id) {

    }
}
