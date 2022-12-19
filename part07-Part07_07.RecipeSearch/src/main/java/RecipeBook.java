/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;
/**
 *
 * @author Ste-PC
 */
public class RecipeBook {
    private ArrayList<Recipe> recipeBook;
    
    public RecipeBook(){
        this.recipeBook = new ArrayList<>();
    }
    
    public void add(Recipe recipe){
        recipeBook.add(recipe);
    }
    
    public void populateRecipeBook(String file){
        try(Scanner scannerFileInput = new Scanner(Paths.get(file))){
            while (scannerFileInput.hasNextLine()){
                String name = scannerFileInput.nextLine();
                int cookingTime = Integer.valueOf(scannerFileInput.nextLine());
                ArrayList<String> ingredients = new ArrayList<String>();
                
                while (scannerFileInput.hasNextLine()){
                    String nextIngredient = scannerFileInput.nextLine();
                    if(nextIngredient.isEmpty()){
                        break;
                    }
                    ingredients.add(nextIngredient);
                }
                this.recipeBook.add(new Recipe(name, cookingTime, ingredients));
            }
        } catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}