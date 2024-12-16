package service;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "banqueService")
public class BanqueService {

    @WebMethod(operationName = "Convert")
    public double conversion(@WebParam(name = "montan") double mt){
        return mt*10.54;

    }

    @WebMethod
    public Compte getCompte(int code){
        return  new Compte(code, Math.random()*9000, new Date());
    }

    @WebMethod
    public List<Compte> getComptes(){
        return List.of(
                new Compte(5, Math.random()*9888, new Date()),
                new Compte(1, Math.random()*9888, new Date()),
                new Compte(2, Math.random()*9888, new Date()),
                new Compte(3, Math.random()*9888, new Date()),
                new Compte(4, Math.random()*9888, new Date())
        );
    }
}
