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
            for(int i=0; i<recipe.size() - 1; i++){
                Ingredient ingr = recipe.get(i);
                if (ing.getName().equals(ingr.getName())){
                    if (ing.getWeight() == ingr.getWeight()){
                        System.out.println("Ingrediente repetido");
                    }
                    else{
                        recipe.get(i).addWeight(ing.getWeight());
                    }
                }
            }
        }



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
