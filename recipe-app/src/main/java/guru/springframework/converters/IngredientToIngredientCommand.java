package guru.springframework.converters;

import org.springframework.core.convert.converter.Converter;

import guru.springframework.commands.IngredientCommand;
import guru.springframework.domain.Ingredient;

public class IngredientToIngredientCommand implements Converter<Ingredient, IngredientCommand> {

	private final UnitOfMeasureToUnitOfMeasureCommand uomConverter;
	
	public IngredientToIngredientCommand(UnitOfMeasureToUnitOfMeasureCommand uomConverter) {
		this.uomConverter = uomConverter;
	}
	
	@Override
	public IngredientCommand convert(Ingredient source) {
		
		if (source == null) {
			return null;
		}
		
		final IngredientCommand ingredientCommand = new IngredientCommand();
		
		ingredientCommand.setId(source.getId());
		
		if (source.getRecipe() != null) {
			ingredientCommand.setRecipeId(source.getRecipe().getId());
		}
		
		ingredientCommand.setAmount(source.getAmount());
		ingredientCommand.setDescription(source.getDescription());
		ingredientCommand.setUom(uomConverter.convert(source.getUom()));
		return ingredientCommand;
	}
	

}
