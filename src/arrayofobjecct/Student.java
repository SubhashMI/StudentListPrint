/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayofobjecct;

/**
 *
 * @author subha
 */
public class Student {
    private double number;
    private  String name;
    private int sid;
    
    public Student (){
    number=991662152;
    
    name= "subhash";
    }
    
    public Student(double number,String name){
     this.number=number;
    this.name=name;
    }
    
    
    public double getNumber(){
    return this.number; 
    }
      
    public String getName(){
    return this.name; 
    }
    
    public void setNumber(double number)
    {
    this.number=number;
    }
    
    public void setName(String name)
    {
    this.name=name;
    }
    
     public String toString()
    {
        return "number = "+number+" name = "+name;
    }
    
    
    
}
