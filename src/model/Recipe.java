package model;
import java.util.ArrayList;
public class Recipe {
    private ArrayList<Ingredient> recipe;

    public Recipe() {
        recipe = new ArrayList<Ingredient>();
    }
    public void addIngredient(Ingredient ing){

        if (recipe.isEmpty()){
            recipe.add(ing);
        }else{
            boolean result = verifyIngredient(ing);
            if(result == true){
                System.out.println("El ingrediente ya se encuentra en la receta");
            }
            else{
                System.out.println("Ingrediente modificado.");
            }
        }



    }
    public boolean verifyIngredient(Ingredient ing){
        boolean result = false;
        for(int i=0; i<recipe.size() - 1; i++){
            Ingredient ingr = recipe.get(i);
            if (ing.getName().equals(ingr.getName())){
                if (ing.getWeight() == ingr.getWeight()){
                    result = true;
                }
                else{
                    ingr.addWeight(ing.getWeight());
                }
            }
        }
            return result;
    }
    public void removeIngredient(Ingredient ing){
        recipe.remove(ing);
    }

    public int getSize(){
        return recipe.size();
    }

    public Ingredient getLast(){
        return recipe.get(getSize()-1);
    }

    public Ingredient getIngredient(int i){
        if (recipe.isEmpty())
            return null;
        else{
            return recipe.get(i);
        }
    }
}
