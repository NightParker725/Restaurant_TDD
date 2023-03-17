package model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class RecipeTest {
    private Recipe rec1;
    private Recipe rec2;
    //Escenario de un objeto de la clase Recipe sin ingredientes
    public void setupStage1(){
        rec2 = new Recipe();
    }
    //Escenario de la clase Recipe con tres objetos de la clase ingredient
    public void setupStage2(){
        rec1 = new Recipe();
        Ingredient uno = new Ingredient("Cebolla", 315);
        Ingredient dos = new Ingredient("Ajo", 58);
        Ingredient tres = new Ingredient("Arroz", 520);
        rec1.addIngredient(uno);
        rec1.addIngredient(dos);
        rec1.addIngredient(tres);
    }
    //Añadir un ingrediente a una Recipe vacía
    @Test
    public void addIngredientSuccesfullyTest(){
        //
        setupStage1();
        //
        Ingredient ing = new Ingredient("Sal", 12);
        rec2.addIngredient(ing);
        //
        assertEquals(rec2.getSize(), 1);
    }
    //Añadir un ingrediente a una Recipe con mas ingredientes
    @Test
    public void addNewIngredientSuccesfullyTest(){
        //
        setupStage2();
        //
        Ingredient ing = new Ingredient("Pimienta", 6);
        rec1.addIngredient(ing);
        //
        assertEquals(rec1.getLast().getName(), "Pimienta");
        assertEquals(rec1.getLast().getWeight(), 6);
    }
    //Modificar atributo de un ingrediente correctamente
    @Test
    public void modifyIngredientAttributeSuccesfullyTest(){
        //
        setupStage2();
        //
        Ingredient ing = new Ingredient("Ajo", 21);
        rec1.addIngredient(ing);
        //
        assertEquals(rec1.getIngredient(1).getWeight(), 79);

    }
}
