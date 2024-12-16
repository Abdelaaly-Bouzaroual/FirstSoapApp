package service;

import java.util.Date;

public class Compte {
    private int code;
    private Double montan;
    private Date date;

    public Compte(int code, Double montan, Date date) {
        this.code = code;
        this.montan = montan;
        this.date = date;
    }
    public Compte() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Double getMontan() {
        return montan;
    }

    public void setMontan(Double montan) {
        this.montan = montan;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "code=" + code +
                ", montan=" + montan +
                ", date=" + date +
                '}';
    }
}
