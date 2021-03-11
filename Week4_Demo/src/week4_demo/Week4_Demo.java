package week4_demo;

public class Week4_Demo {

    int id;

    public static void main(String[] args) {
        Utils utl = new Utils();
        System.out.println(utl.getSum(5, 12));
        System.out.println(utl.getCube(3));
    }
    
    public int getId() {
        return id;
    }
}