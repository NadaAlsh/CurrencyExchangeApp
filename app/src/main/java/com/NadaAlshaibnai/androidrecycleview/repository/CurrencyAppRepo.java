package com.NadaAlshaibnai.androidrecycleview.repository;

import com.NadaAlshaibnai.androidrecycleview.data.Currency;

import java.util.ArrayList;
import java.util.Random;

public class CurrencyAppRepo {
    private static CurrencyAppRepo instance;

    private CurrencyAppRepo(){}
    public static CurrencyAppRepo getInstance(){
        if(instance == null)
            instance = new CurrencyAppRepo();
        return instance;
    }

    public ArrayList<Currency> generateDummyCurrencies(int numberOfItems){
        ArrayList<Currency> currencyList = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < numberOfItems; i++){

            String[] countryCurrencyNames = {"USD", "lira", "KWD"};

            int randomNameIndex = random.nextInt(countryCurrencyNames.length);

            String[] countryCodes = {"US Dollar", "Turkish Lira", "Kuwaiti Dinar"};
            int randomCodeIndex = random.nextInt(countryCodes.length);

            currencyList.add(new Currency(countryCurrencyNames[randomNameIndex],countryCodes[randomCodeIndex], 0.3*i));
        }
        return currencyList;

    }
    }



