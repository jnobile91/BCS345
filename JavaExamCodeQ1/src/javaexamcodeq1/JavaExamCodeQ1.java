/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexamcodeq1;

/**
 *
 * @author jnobi
 */
public class JavaExamCodeQ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public class ExamProblem {

    // ToDo1: the following instance members declaration violates encapsulation principles,
    // also one of the names is not compatible with Java naming convention, fix these 3 problems
    // These variables must be 'private'. Also, variables can not begin with capital letters
    private String studentName;
    private String studentAddress;

    public ExamProblem() {
        this.studentName = "";
        this.studentAddress = "";
    }

    // ToDo2: Overload the constructor with another that accepts name and address. Use the parameters to initialize 
    // instance members. 
    // Overloads constructor by calling strings 'n' and 'a' as name and address
    public ExamProblem(String n, String a) {
        this.studentName = n;
        this.studentAddress = a;
    }
    
    // ToDo3: add 4 methods as setters and getters for the previous instance members.
    // Getter method for studentName
    public String getName() {
        return studentName;
    }
    
    // Getter method for studentAddress
    public String getAddress() {
        return studentAddress;
    }
    
    // Setter method for studentName
    public void setName(String newName) {
        studentName = newName;
    }
    
    // Setter method for studentAddress
    public void setAddress(String newAddress) {
        studentAddress = newAddress;
    }
}
    
    public class Book {
        // int can not have delimeters
        protected int pages = 1500;
        
        // set methods are void, can not call references as argument
        public void setPages(int p)
        {
            // must use variable name different than initialized
            pages = p;
            System.out.println("This is a method that sets the number of pages");
        }
        
        // get methods must be of a data type (here we return in)
        public int getPages()
        {
            System.out.println("This is a method that returns the number of pages");
            return pages;
        }
    }
    
}