/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ste-PC
 */
public class Student extends Person {
    private int studyCredits;
    
    public Student(String name, String address){
        super(name, address);
        studyCredits = 0;
    }
    
    public void study(){
        studyCredits++;
    }
    
    public int credits(){
        return this.studyCredits;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n  Study Credits " + studyCredits;
    }
}
