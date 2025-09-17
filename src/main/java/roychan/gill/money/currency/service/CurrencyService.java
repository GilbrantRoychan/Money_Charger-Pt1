package roychan.gill.money.currency.service;

import roychan.gill.money.currency.entity.CurrencyEntity;
import roychan.gill.money.currency.repository.CurrencyRepository;
import roychan.gill.money.currency.utill.FormatCurrency;

import java.util.List;

public class CurrencyService {

    private CurrencyRepository currencyRepository;

    public CurrencyService(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }

    public  void showData(){

        List<CurrencyEntity> datas = currencyRepository.getAllData();
        datas.forEach(data ->{
            System.out.println( "ID: "+data.getID());
            System.out.println("Nama: " + data.getName());
            System.out.println("Negara: "+data.getCountry());
            System.out.println("Total saldo: " + FormatCurrency.formatCurrency(data));
            System.out.println("Created_at: " + data.getCreated_at());

            System.out.println();
        });

//        TODO: membuat bagaimana Total saldo bisa di I18N

    }
}
