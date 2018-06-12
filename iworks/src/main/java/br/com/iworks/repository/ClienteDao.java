package br.com.iworks.repository;

import br.com.iworks.model.Cliente;
import java.util.List;
import java.util.Optional;

public interface ClienteDao {

    public List<Cliente> findAllClientes ();

    public void deleteEvent (String idCliente);

    public Optional<Cliente> findClienteById(String clienteId);

    public void saveOrUpdateEvent (Cliente event);

}