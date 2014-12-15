package org.nicepop.domain;

public class Meal {

	private Recipe recipe;
	
	public Meal(Recipe recipe) {
		this.setRecipe(recipe);
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}
}
