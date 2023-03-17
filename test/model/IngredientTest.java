package model;

import exceptions.NegativeNumberException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class IngredientTest {
    private Ingredient ing;

    //Escenario de un objeto Ingredient
    public void setupStage1(){
        ing = new Ingredient("Tomate", 245);
    }
    //Añadir peso al ingrediente correcto
    @Test
    public void recipeWeightAddedSuccesfullyTest() {
        //Arrange
        setupStage1();
        //Add
        ing.addWeight(54);
        //Assert
        assertEquals(ing.getWeight(),299);

    }
    //Añadir peso negativo al ingrediente
    @Test
    public void negativeRecipeWeightAddedTest(){
        //
        setupStage1();
        //
        boolean result = false;
        try{
            ing.addWeight(-100);
            result = true;
        }catch (NegativeNumberException ex){
            ex.printStackTrace();
        }
        //
        assertFalse(result);
    }
    //Remover peso al ingrediente correcto
    @Test
    public void recipeWeightRemovedSuccesfullyTest(){
        //
        setupStage1();
        //
        ing.removeWeight(45);
        //
        assertEquals(ing.getWeight(), 200);
    }
    //Remover peso negativo al ingrediente
    @Test
    public void negativeRecipeWeightRemoved(){
        //
        setupStage1();
        //
        boolean result = false;
        try{
            ing.removeWeight(-100);
            result = true;
        }catch (NegativeNumberException ex){
            ex.printStackTrace();
        }
        //
        assertFalse(result);
    }
}
