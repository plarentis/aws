package br.com.iworks.repository;

import br.com.iworks.model.Cliente;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import java.util.List;
import java.util.Optional;

public class DynamoDBEventDao implements ClienteDao {

    private static final DynamoDBMapper mapper = DynamoDBManager.mapper();

    private static volatile DynamoDBEventDao instance;

    private DynamoDBEventDao () {
    }

    public static DynamoDBEventDao instance () {

        if (instance == null) {
            synchronized (DynamoDBEventDao.class) {
                if (instance == null)
                    instance = new DynamoDBEventDao();
            }
        }
        return instance;
    }

    public List<Cliente> findAllClientes () {

        return mapper.scan(Cliente.class, new DynamoDBScanExpression());
    }

    public void deleteEvent (String idCliente) {

        Optional<Cliente> oEvent = findClienteById(idCliente);
        if (oEvent.isPresent()) {
            mapper.delete(oEvent.get());
        } else {
            throw new IllegalArgumentException("Delete failed for nonexistent event");
        }
    }

    public Optional<Cliente> findClienteById (String clienteId) {
        Cliente event = mapper.load(Cliente.class, clienteId);
        return Optional.ofNullable(event);
    }

    public void saveOrUpdateEvent (Cliente event) {
        mapper.save(event);
    }

}

