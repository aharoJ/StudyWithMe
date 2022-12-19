package io.aharo.betterreads.connection;

import java.io.File;

import org.springframework.boot.context.properties.ConfigurationProperties;


/*
 * instead of trying to connect to a local connection, now we have set a path to connect to our clouse cassandra instances 
 */
@ConfigurationProperties(prefix = "datastax.astra")
public class DataStaxAstraProperties 
{
    private File secureConnectBundle;

    public File getSecureConnectBundle() {
        return secureConnectBundle;
    }

    public void setSecureConnectBundle(File secureConnectBundle) {
        this.secureConnectBundle = secureConnectBundle;
    }

    
    
    
}
