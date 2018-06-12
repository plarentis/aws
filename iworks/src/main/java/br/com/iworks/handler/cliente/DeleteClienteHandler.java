package br.com.iworks.handler.cliente;

import br.com.iworks.model.Cliente;
import br.com.iworks.repository.DynamoDBEventDao;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * @author gustavo
 * @version $Revision: $<br/>
 * $Id: $
 * @since 11/06/18 09:45
 */
public class DeleteClienteHandler implements RequestHandler<Cliente, Cliente> {

    private static final DynamoDBEventDao eventDao = DynamoDBEventDao.instance();


    @Override
    public Cliente handleRequest (Cliente clienteRequest, Context context) {
        eventDao.deleteEvent(clienteRequest.getId());
        return null;
    }

}
