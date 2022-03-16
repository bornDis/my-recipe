package com.spring.services;

import com.spring.domain.Recipe;

import java.util.Set;


public interface RecipeService {
    Set<Recipe> getRecipes();
}
