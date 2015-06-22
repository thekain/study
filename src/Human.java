/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amilo
 */
public class Human {
    String name;
    int age;
    
    public Human(){
        name = "John";
        age = 15;        
    }
    
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public boolean changeName(String myname){
        name = myname;
        if(name.equals(myname)){
            return true;
        }else{
            return false;
        }
    }
  
    
}
