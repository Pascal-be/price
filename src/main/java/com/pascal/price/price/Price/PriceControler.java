package com.pascal.price.price.Price;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Cacheable("price")
@RestController
@RequestMapping("/price/")
public class PriceControler {
    private PriceService priceService;
    public PriceControler(PriceService priceService) {
        this.priceService = priceService;
    }

    @GetMapping("{id}")
    public int getprix	(@PathVariable Long id) {
        //return priceService.GetOnePrice(id);
        return priceService.GetOnePrice();
    }

    @GetMapping("/prix/{id}")
    public int getprix2 	(@PathVariable Long id) {
        //return priceService.GetOnePrice(id);
        return priceService.GetOnePrice();
    }
}
