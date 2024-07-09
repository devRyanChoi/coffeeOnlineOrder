package org.example.coffeeonlineorder.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.Map;

@Getter
@Builder
public class CreateOrder {

    private int customerId;
    private Map<Integer, Integer> qualityByProduct; //[ "iced Americano", 3]


}
