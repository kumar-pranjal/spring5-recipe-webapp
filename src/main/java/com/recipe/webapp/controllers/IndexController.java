package com.recipe.webapp.controllers;

import com.recipe.webapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public  class IndexController {

   private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping("/")
    public String getIndexPage(Model model){

        log.info("Inside the IndexController");

        model.addAttribute("recipes" , recipeService.getRecipes());

        return "index";
    }

}
