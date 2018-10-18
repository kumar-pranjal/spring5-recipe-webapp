package com.recipe.webapp.services;

import com.recipe.webapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
