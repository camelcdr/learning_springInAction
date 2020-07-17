package com.camel.tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @author camel
 * @date 2020/07/05 22:03
 **/
@Data
@RequiredArgsConstructor
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
