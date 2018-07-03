package com.iworks.justiceleague.repository;

import com.amazonaws.auth.AWSCredentials;

public class AWSCredentialsImpl implements AWSCredentials {

    private String accessKey;
    private String secretKey;

    public AWSCredentialsImpl () {
        this.accessKey = System.getenv("ACCESS_KEY");
        this.secretKey = System.getenv("SECRET_KEY");
    }

    @Override
    public String getAWSAccessKeyId () {
        return accessKey;
    }

    @Override
    public String getAWSSecretKey () {
        return secretKey;
    }
}
