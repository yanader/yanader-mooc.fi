import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
//import java.nio.file.Paths;
 
public class RecipeSearch {
 
    public static void main(String[] args) {
        ArrayList<Recipe> recipeBook = new ArrayList<Recipe>();
 
        Scanner scannerUserInput = new Scanner(System.in);
 
        System.out.println("File to read:");
        String file = scannerUserInput.nextLine();
 
        System.out.println("Commands:\nlist - lists the recipes\nstop - stops the program");
        
        recipeBook.populateRecipeBook(file);
        
        /*try (Scanner scannerFileInput = new Scanner(Paths.get(file))) {
            while (scannerFileInput.hasNextLine()) {
                String name = scannerFileInput.nextLine();
                int time = Integer.valueOf(scannerFileInput.nextLine());
                ArrayList<String> ingredients = new ArrayList<String>();
 
                while (scannerFileInput.hasNextLine()) {
                    String nextIngredient = scannerFileInput.nextLine();
                    if (nextIngredient.isEmpty()) {
                        break;
                    }
                    ingredients.add(nextIngredient);
                }
                recipeBook.add(new Recipe(name, time, ingredients));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }*/
        
        while (true){
            System.out.println("Enter command:");
            String command = scannerUserInput.nextLine();   
            
            if(command.equals("stop")){
                break;
            } else if (command.equals("list")){
                for(Recipe recipe : recipeBook){
                    System.out.println(recipe.toString());
                }
            }
        } 
    }
}