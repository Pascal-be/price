package com.pascal.price.price.Price;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.text.DecimalFormat;

@Data
@Builder
@AllArgsConstructor
public class PriceDto {
    int price;
}
