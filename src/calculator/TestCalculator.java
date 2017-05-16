package calculator;

/**
 * This class tests the Calculator class
 * @author Anju Chawla
 * @version 1.0
 * @since May 16, 2017
 */
public class TestCalculator {
    
    
    public static void main(String[] args)
    {
        Calculator cal1 = new Calculator();
        
        System.out.println("First Number: "+cal1.getNumberOne());
        System.out.println("Second Number: "+cal1.getNumberTwo());
        
        cal1.setNumberOne(2);
        cal1.setNumberTwo(3);
        
        System.out.println("First Number: "+cal1.getNumberOne());
        System.out.println("Second Number: "+cal1.getNumberTwo());
        
        System.out.println("Sum: "+ cal1.addNumbers());
        System.out.println("Difference: "+ cal1.subtractNumbers());
        System.out.println("Product:" + cal1.multiplyNumbers());
        System.out.println("Quotient:" + cal1.divideNumbers());
        
    }//of main
    
    
}//of tester
