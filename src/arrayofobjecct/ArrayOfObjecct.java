
package arrayofobjecct;


public class ArrayOfObjecct {
   
    public static void main(String[] args) {
        
   Student[] list =new Student[3];
   Student s1 = new Student();
   s1.setName("peter");
   s1.setNumber(21);
   //testing git
   Student s2 = new Student();
   s2.setName("peter");
   s2.setNumber(21);
   
   Student s3 = new Student();
   s3.setName("peter");
   s3.setNumber(21);
   
   list[0]=s1;
    list[1]=s2;
     list[2]=s3;
     
     for(int i =0; i<list.length; i++)
     {
     System.out.println( list[i].getName()+ " "+ list[i].getNumber());
         }
   
   
   
    }
    
}
