package roychan.gill.money.currency.repository;

import roychan.gill.money.currency.entity.CurrencyEntity;

import java.util.List;

public interface CurrencyRepository {


     void addAccount(CurrencyEntity profile);
    List<CurrencyEntity> getAllData();
    boolean transfer(CurrencyEntity from, CurrencyEntity to, Long target);
}
