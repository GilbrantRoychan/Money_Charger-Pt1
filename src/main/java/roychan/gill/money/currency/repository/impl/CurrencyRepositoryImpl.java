package roychan.gill.money.currency.repository.impl;

import roychan.gill.money.currency.entity.CurrencyEntity;
import roychan.gill.money.currency.repository.CurrencyRepository;
import roychan.gill.money.currency.utill.CurrencyConversion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CurrencyRepositoryImpl implements CurrencyRepository {

    private   List<CurrencyEntity> database = new ArrayList<>();
    private static  Integer  IDCounter = 1;

    @Override
    public void addAccount(CurrencyEntity profile) {
        database.add(profile);

    }

    @Override
    public List<CurrencyEntity> getAllData() {
        return database;
    }

    @Override
    public boolean transfer(CurrencyEntity from, CurrencyEntity to, Long target) {
        // Transaksi dengan mata Uang pengirim adalah rupiah
        if (from!=null && to!=null && from.getCountry().equals("Indonesia") && to.getCountry().equals("Inggris")) {
            var updateSaldoPengirim = from.getBalance() - target;
            var updateSaldoPenerima = to.getBalance() + CurrencyConversion.idrToUsd(target);

            // lalu lakukan update saldo / balance dan update waktu
            from.setBalance(updateSaldoPengirim);
            from.setBalance_updateAt(new Date(System.currentTimeMillis()));

            to.setBalance(updateSaldoPenerima);
            to.setBalance_updateAt(new Date(System.currentTimeMillis()));
            return true;
        } else if (from!=null && to!=null && from.getCountry().equals("Indonesia") && to.getCountry().equals("Jepang")) {
            var updateSaldoPengirim = from.getBalance() - target;
            var updateSaldoPenerima = to.getBalance() + CurrencyConversion.idrToJpy(target);

            // lalu lakukan update saldo / balance dan update waktu
            from.setBalance(updateSaldoPengirim);
            from.setBalance_updateAt(new Date(System.currentTimeMillis()));

            to.setBalance(updateSaldoPenerima);
            to.setBalance_updateAt(new Date(System.currentTimeMillis()));
            return  true;
        } else if (from != null && to != null && from.getCountry().equals("Indonesia") && to.getCountry().equals("Indonesia")) {
            var updateSaldoPengirim = from.getBalance() - target;
            var updateSaldoPenerima = to.getBalance() + target;

            // lalu lakukan update saldo / balance dan update waktu
            from.setBalance(updateSaldoPengirim);
            from.setBalance_updateAt(new Date(System.currentTimeMillis()));

            to.setBalance(updateSaldoPenerima);
            to.setBalance_updateAt(new Date(System.currentTimeMillis()));
            return  true;

            // Transaksi dengan mata Uang pengirim adalah dolars
        }else if (from != null && to != null && from.getCountry().equals("Inggris") && to.getCountry().equals("Indonesia")) {
            var updateSaldoPengirim = from.getBalance() - target;
            var updateSaldoPenerima = to.getBalance() + CurrencyConversion.usdToIdr(target);

            // lalu lakukan update saldo / balance dan update waktu
            from.setBalance(updateSaldoPengirim);
            from.setBalance_updateAt(new Date(System.currentTimeMillis()));

            to.setBalance(updateSaldoPenerima);
            to.setBalance_updateAt(new Date(System.currentTimeMillis()));
            return  true;
        }else if (from != null && to != null && from.getCountry().equals("Inggris") && to.getCountry().equals("Jepang")) {
            var updateSaldoPengirim = from.getBalance() - target;
            var updateSaldoPenerima = to.getBalance() + CurrencyConversion.usdToJpy(target);

            // lalu lakukan update saldo / balance dan update waktu
            from.setBalance(updateSaldoPengirim);
            from.setBalance_updateAt(new Date(System.currentTimeMillis()));

            to.setBalance(updateSaldoPenerima);
            to.setBalance_updateAt(new Date(System.currentTimeMillis()));
            return  true;
        }else if (from != null && to != null && from.getCountry().equals("Inggris") && to.getCountry().equals("Inggris")) {
            var updateSaldoPengirim = from.getBalance() - target;
            var updateSaldoPenerima = to.getBalance() + target;

            // lalu lakukan update saldo / balance dan update waktu
            from.setBalance(updateSaldoPengirim);
            from.setBalance_updateAt(new Date(System.currentTimeMillis()));

            to.setBalance(updateSaldoPenerima);
            to.setBalance_updateAt(new Date(System.currentTimeMillis()));
            return  true;

            // Transaksi dengan mata Uang pengirim adalah Yen
        }else if (from != null && to != null && from.getCountry().equals("Jepang") && to.getCountry().equals("Inggris")) {
            var updateSaldoPengirim = from.getBalance() - target;
            var updateSaldoPenerima = to.getBalance() + CurrencyConversion.jpyToUsd(target);

            // lalu lakukan update saldo / balance dan update waktu
            from.setBalance(updateSaldoPengirim);
            from.setBalance_updateAt(new Date(System.currentTimeMillis()));

            to.setBalance(updateSaldoPenerima);
            to.setBalance_updateAt(new Date(System.currentTimeMillis()));
            return  true;
        }else if (from != null && to != null && from.getCountry().equals("Jepang") && to.getCountry().equals("Indonesia")) {
            var updateSaldoPengirim = from.getBalance() - target;
            var updateSaldoPenerima = to.getBalance() + CurrencyConversion.jpyToIdr(target);

            // lalu lakukan update saldo / balance dan update waktu
            from.setBalance(updateSaldoPengirim);
            from.setBalance_updateAt(new Date(System.currentTimeMillis()));

            to.setBalance(updateSaldoPenerima);
            to.setBalance_updateAt(new Date(System.currentTimeMillis()));
            return  true;
        }else if (from != null && to != null && from.getCountry().equals("Jepang") && to.getCountry().equals("Jepang")) {
            var updateSaldoPengirim = from.getBalance() - target;
            var updateSaldoPenerima = to.getBalance() + target;

            // lalu lakukan update saldo / balance dan update waktu
            from.setBalance(updateSaldoPengirim);
            from.setBalance_updateAt(new Date(System.currentTimeMillis()));

            to.setBalance(updateSaldoPenerima);
            to.setBalance_updateAt(new Date(System.currentTimeMillis()));
            return  true;
        }else {
            return false;
        }

    }
}
