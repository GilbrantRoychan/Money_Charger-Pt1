package roychan.gill.money.currency.utill;

import roychan.gill.money.currency.entity.CurrencyEntity;

import java.text.NumberFormat;
import java.util.Locale;


public class FormatCurrency {

    public  static String formatCurrency(CurrencyEntity profile){

        final Locale indonesia = new Locale.Builder().setRegion("ID").setLanguage("id").build();
        final  Locale inggris = new Locale.Builder().setRegion("US").setLanguage("en").build();
        final  Locale jepang = new Locale.Builder().setRegion("JP").setLanguage("ja").build();

        NumberFormat numberFormat;

        String result = switch (profile.getCountry()){
            case "Indonesia"->{
                numberFormat = NumberFormat.getCurrencyInstance(indonesia);
                yield numberFormat.format(profile.getBalance());
            }case  "Inggris"->{
                numberFormat = NumberFormat.getCurrencyInstance(inggris);
                yield numberFormat.format(profile.getBalance());
            }case  "Jepang"->{
                numberFormat = NumberFormat.getCurrencyInstance(jepang);
                yield numberFormat.format(profile.getBalance());
            }
            default -> throw new IllegalStateException("Unexpected value: " + profile.getCountry());
        };

        return  result;
    }
}
