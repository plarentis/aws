package br.com.iworks.handler.cliente;

import br.com.iworks.model.Cliente;
import br.com.iworks.repository.DynamoDBEventDao;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import java.util.UUID;

/**
 * @author gustavo
 * @version $Revision: $<br/>
 * $Id: $
 * @since 02/06/18 14:50
 */
public class PostClienteHandler implements RequestHandler<Cliente, String> {

    private static final DynamoDBEventDao eventDao = DynamoDBEventDao.instance();


    @Override
    public String handleRequest (Cliente clienteRequest, Context context) {
        clienteRequest.setId(UUID.randomUUID().toString());
        eventDao.saveOrUpdateEvent(clienteRequest);
        return clienteRequest.getId();
    }

}
