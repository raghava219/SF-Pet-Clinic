package guru.springframework.converters;

import org.springframework.core.convert.converter.Converter;

import guru.springframework.commands.IngredientCommand;
import guru.springframework.domain.Ingredient;
import guru.springframework.domain.Recipe;

public class IngredientCommandToIngredient implements Converter<IngredientCommand, Ingredient> {
	
	private final UnitOfMeasureCommandToUnitOfMeasure uomConverter;
	
	public IngredientCommandToIngredient(UnitOfMeasureCommandToUnitOfMeasure uomConverter) {
		this.uomConverter = uomConverter;
	}

	@Override
	public Ingredient convert(IngredientCommand source) {

		if (source == null) {
			return null;
		}
		
		final Ingredient ingredient = new Ingredient();
		ingredient.setId(source.getId());
		
		if (source.getRecipeId() != null) {
			Recipe recipe = new Recipe();
			recipe.setId(source.getRecipeId());
			ingredient.setRecipe(recipe);
			recipe.addIngredient(ingredient);
		}
		
		ingredient.setAmount(source.getAmount());
		ingredient.setDescription(source.getDescription());
		ingredient.setUom(uomConverter.convert(source.getUom()));
		return ingredient;
	}

}
