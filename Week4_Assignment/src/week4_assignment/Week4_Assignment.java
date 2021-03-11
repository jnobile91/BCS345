/* ----- TASK -----
Create a class to represent a student.
The student should have a field for the name
and you should be able to set and read the name.
Add a field for id and allow setting and reading.
Call this class from the main driver (with main method)
by creating a student object.
*/

package week4_assignment;

public class Week4_Assignment {

    public static void main(String[] args) {
        Student s1 = new Student();
        
        System.out.println(s1.getName());
        System.out.println(s1.getId());
        
        s1.setName("Joe");
        s1.setId(1234);
        
        System.out.println(s1.getName());
        System.out.println(s1.getId());
    }
    
}
