package com.iworks.justiceleague.repository;

import java.io.InputStream;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.PropertiesCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

public class DynamoDBManager {

    private static volatile DynamoDBManager instance;

    private static DynamoDBMapper mapper;

    private DynamoDBManager () {

        AmazonDynamoDBClient client = new AmazonDynamoDBClient(getCredentials());
        client.setRegion(Region.getRegion(Regions.US_EAST_1));
        mapper = new DynamoDBMapper(client);
    }

    public static DynamoDBManager instance () {

        if (instance == null) {
            synchronized (DynamoDBManager.class) {
                if (instance == null)
                    instance = new DynamoDBManager();
            }
        }

        return instance;
    }

    public static DynamoDBMapper mapper () {

        DynamoDBManager manager = instance();
        return manager.mapper;
    }

    private static AWSCredentials getCredentials () {
        AWSCredentials awsCredentials = null;
        try {
            InputStream inputStream = DynamoDBManager.class.getResourceAsStream("AwsCredentials.properties");
            awsCredentials = new PropertiesCredentials(inputStream);
        } catch (Exception e) {
            System.out.println("Erro ao realizar login AWS");
        }

        return awsCredentials;
    }

}