package guru.springframework.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import guru.springframework.commands.RecipeCommand;
import guru.springframework.domain.Recipe;

@Component
public class RecipeCommandToRecipe implements Converter<RecipeCommand, Recipe> {

	private final CategoryCommandToCategory  categroryConverter;
	private final IngredientCommandToIngredient ingredientConverter;
    private final NotesCommandToNotes notesConverter;
	
    public RecipeCommandToRecipe(CategoryCommandToCategory  categroryConverter,
    		IngredientCommandToIngredient ingredientConverter, NotesCommandToNotes notesConverter) {
    	this.categroryConverter = categroryConverter;
    	this.ingredientConverter = ingredientConverter;
    	this.notesConverter = notesConverter;
    }
    
    
 	
	@Override
	public Recipe convert(RecipeCommand source) {
		if (source == null) {
			return null;
		}
		
		final Recipe recipe = new Recipe();
		
		recipe.setId(source.getId());
        recipe.setCookTime(source.getCookTime());
        recipe.setPrepTime(source.getPrepTime());
        recipe.setDescription(source.getDescription());
        recipe.setDifficulty(source.getDifficulty());
        recipe.setDirections(source.getDirections());
        recipe.setServings(source.getServings());
        recipe.setSource(source.getSource());
        recipe.setUrl(source.getUrl());
        recipe.setNotes(notesConverter.convert(source.getNotes()));

        if (source.getCategories() != null && source.getCategories().size() > 0) {
        	source.getCategories().forEach(category 
        			-> recipe.getCategories().add(categroryConverter.convert(category)));
        }
        
        if (source.getIngredients() != null && source.getCategories().size() > 0) {
        	source.getIngredients().forEach(ingredient
        			-> recipe.getIngredients().add(ingredientConverter.convert(ingredient)));
        }
		
		return recipe;
	}

}





















