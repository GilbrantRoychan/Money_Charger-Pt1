package roychan.gill.money.currency.repository.impl;

import roychan.gill.money.currency.entity.CurrencyEntity;
import roychan.gill.money.currency.repository.CurrencyRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CurrencyRepositoryImpl implements CurrencyRepository {

    private   List<CurrencyEntity> database = new ArrayList<>();
    private static  Integer  IDCounter = 1;

    @Override
    public void addAccount(CurrencyEntity profile) {
        database.add(
                new CurrencyEntity(
                        profile.getName(),
                        profile.getCountry(),
                        profile.getBalance()
                ));



    }

    @Override
    public List<CurrencyEntity> getAllData() {
        return database;
    }

    @Override
    public boolean transfer(CurrencyEntity from, CurrencyEntity to, Long target) {
        return false;
    }
}
