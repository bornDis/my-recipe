package com.spring.controllers;

import com.spring.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"/getrecipes","/suki"})
    public String getThere(Model model){

        model.addAttribute("recipes",recipeService.getRecipes());

        return "recipe_index";

    }
}
