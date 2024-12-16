package org.example;

import jakarta.xml.ws.Endpoint;
import service.BanqueService;

public class ServerJws {
    public static void main(String[] args) {
        String url1 = "http://0.0.0.0:6655/";
        String url = "http://localhost:6655/";
        Endpoint.publish(url1, new BanqueService());
        System.out.println("---------------JWS published : "+ url1 + " ---------------");
    }
}