package com.pascal.price.price.Price;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
//@compentent : inclu rstcontrller, repository, controller service.
public class PriceService {
    private Map<Long,Integer> priceMap;
    public PriceService() {
        priceMap = new HashMap();

    }

/*
    public int GetOnePrice (Long idSalle) {
        int price =0;
        if (!priceMap.containsKey(idSalle)) {
            price=priceCalculate();
            priceMap.put(idSalle,price);
        } else {
            price=priceMap.get(idSalle);
        }
    return price;

    }
*/
    //public int priceCalculate () {
    public int GetOnePrice () {
        int max =70;
        int min = 30;
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
