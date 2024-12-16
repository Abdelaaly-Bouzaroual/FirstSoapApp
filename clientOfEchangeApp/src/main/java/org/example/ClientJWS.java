package org.example;

import proxy.BanqueService;
import proxy.BanqueService_Service;

public class ClientJWS {
    public static void main(String[] args) {

        BanqueService stub = new BanqueService_Service().getBanqueServicePort();
        System.out.println("------------------ convertire le montan 10 ------");
        System.out.println(" convertire le montan 10 ------ " + stub.convert(10) + " -------");

        System.out.println("------------------ show all comptes ------------------");
        stub.getComptes().stream()
                .map(compte -> new Object[]{compte.getCode(), compte.getMontan(), compte.getDate()})
                .forEach(array -> System.out.println(java.util.Arrays.toString(array)));
    }
}