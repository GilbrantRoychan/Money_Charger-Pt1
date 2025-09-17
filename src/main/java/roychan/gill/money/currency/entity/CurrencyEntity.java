package roychan.gill.money.currency.entity;

import roychan.gill.money.currency.utill.AutoIncrementForID;

import java.util.Date;

public class CurrencyEntity {
    private  Integer ID;
    private  String name;
    private String country;
    private  Long balance;


    // field tidak perlu di masukan di construktor
    private Date created_at;
    private Date balance_updateAt;

    public CurrencyEntity(Integer ID, String name, String country, Long balance) {
        this.ID = ID;
        this.name = name;
        this.country = country;
        this.balance = balance;
        this.created_at = new Date(System.currentTimeMillis());
    }

    public CurrencyEntity(String name, String country, Long balance) {
        this.ID = AutoIncrementForID.genereateID();
        this.name = name;
        this.country = country;
        this.balance = balance;
        this.created_at = new Date(System.currentTimeMillis());
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getBalance_updateAt() {
        return balance_updateAt;
    }

    public void setBalance_updateAt(Date balance_updateAt) {
        this.balance_updateAt = balance_updateAt;
    }


}
