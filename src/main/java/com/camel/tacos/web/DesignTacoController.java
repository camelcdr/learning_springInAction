package com.camel.tacos.web;

import com.camel.tacos.Ingredient;
import com.camel.tacos.Taco;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author camel
 * @date 2020/07/05 22:15
 **/
@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {

    @GetMapping
    public String showDesignForm(final Model model) {
        final List<Ingredient> ingredients =
                Arrays.asList(
                        new Ingredient("FLTO", "Flour Tortilla", Ingredient.Type.WRAP),
                        new Ingredient("COTO", "Corn Tortilla", Ingredient.Type.WRAP),
                        new Ingredient("GRBF", "Ground Beef", Ingredient.Type.PROTEIN),
                        new Ingredient("CARN", "Carnitas", Ingredient.Type.PROTEIN),
                        new Ingredient("TMTO", "Diced Tomatoes", Ingredient.Type.VEGGIES),
                        new Ingredient("LETC", "Lettuce", Ingredient.Type.VEGGIES),
                        new Ingredient("CHED", "Cheddar", Ingredient.Type.CHEESE),
                        new Ingredient("JACK", "Monterrey Jack", Ingredient.Type.CHEESE),
                        new Ingredient("SLSA", "Salsa", Ingredient.Type.SAUCE),
                        new Ingredient("SRCR", "Sour Cream", Ingredient.Type.SAUCE)
                );

        final Ingredient.Type[] types = Ingredient.Type.values();
        for (final Ingredient.Type type : types) {
            model.addAttribute(type.toString().toLowerCase(), filterByType(ingredients, type));
        }
        model.addAttribute("design", new Taco());

        return "design";
    }

    private List<Ingredient> filterByType(final List<Ingredient> ingredients, final Ingredient.Type type) {
        return ingredients.stream()
                .filter(ingredient -> ingredient.getType().equals(type))
                .collect(Collectors.toList());
    }
}

