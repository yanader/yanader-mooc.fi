/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Ste-PC
 */
public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int cookingTime, ArrayList<String> ingredients){
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }
    @Override
    public String toString(){
        return this.name + ", cooking time: " + cookingTime;   
    }
}