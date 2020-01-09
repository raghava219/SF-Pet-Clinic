package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

public interface IngredientService {
	
	IngredientCommand findByRecipeIdandIngradientId(Long recepeId, Long ingradientId);
	
	IngredientCommand saveIngradientCommand(IngredientCommand command);

}
