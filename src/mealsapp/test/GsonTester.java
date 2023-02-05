/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mealsapp.test;

/**
 *
 * @author dimitris
 */
import com.google.gson.Gson; 
import com.google.gson.GsonBuilder;  

public class GsonTester { 
   public static void main(String[] args) { 
      String jsonString = "{\"name\":\"Mahesh\", \"age\":21}"; 
      
      
      // Με χρήση Design Pattern Builder
      GsonBuilder builder = new GsonBuilder(); 
      builder.setPrettyPrinting(); 
      Gson gson = builder.create(); 
      
      
      Widget widget = gson.fromJson(jsonString, Widget.class); 
      System.out.println(widget);    
      
      jsonString = gson.toJson(widget); 
      System.out.println(jsonString);  
   } 
}


//   String jsonString = "{\"name\":\"Mahesh\", \"age\":21}"; 
//      
//      
//      // Με χρήση Design Pattern Builder
//      GsonBuilder builder = new GsonBuilder(); 
//      builder.setPrettyPrinting(); 
//      Gson gson = builder.create(); 
//      
//      
//      Student student = gson.fromJson(jsonString, Student.class); 
//      System.out.println(student);    
//      
//      jsonString = gson.toJson(student); 
//      System.out.println(jsonString);  
//   } 
//}
//
//class Student { 
//   private String name; 
//   private int age; 
//   public Student(){} 
//   
//   public String getName() { 
//      return name; 
//   }
//   
//   public void setName(String name) { 
//      this.name = name; 
//   } 
//   
//   public int getAge() { 
//      return age; 
//   }
//   
//   public void setAge(int age) { 
//      this.age = age; 
//   }
//   
//   public String toString() { 
//      return "Student [ name: "+name+", age: "+ age+ " ]"; 
//   }  
//}

