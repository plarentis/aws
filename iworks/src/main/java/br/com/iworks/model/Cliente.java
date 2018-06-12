package br.com.iworks.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "client")
public class Cliente {

    // Partition key
    @DynamoDBHashKey(attributeName = "client_id")
    private String id;

    @DynamoDBAttribute(attributeName = "nome")
    private String nome;

    public Cliente (final String id, final String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Cliente () {
    }

    public String getId () {
        return id;
    }

    public String getNome () {
        return nome;
    }

    public void setId (final String id) {
        this.id = id;
    }

    public void setNome (final String nome) {
        this.nome = nome;
    }
}
