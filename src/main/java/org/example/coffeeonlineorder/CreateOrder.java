package org.example.coffeeonlineorder;

import lombok.Builder;
import lombok.Getter;

import java.util.Map;

@Getter
@Builder
public class CreateOrder {
    private int customerId;
    private Map<Integer, Integer> qualityByProduct; // [ "아이스 아메리카노", 3]

}