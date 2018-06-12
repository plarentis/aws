package br.com.iworks.handler.cliente;

import br.com.iworks.model.Cliente;
import br.com.iworks.repository.DynamoDBEventDao;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;


public class GetClienteHandler implements RequestHandler<Cliente, Cliente> {

    private static final DynamoDBEventDao eventDao = DynamoDBEventDao.instance();

    @Override
    public Cliente handleRequest (Cliente clienteRequest, Context context) {
        return eventDao.findClienteById(clienteRequest.getId()).get();
    }

}
