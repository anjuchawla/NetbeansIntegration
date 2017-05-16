package calculator;

/**
 * This class simulates a simple calculator that can add, subtract, multiply or
 * divide two numbers
 *
 * @author Anju Chawla
 * @version 1.0
 * @since May 16, 2017
 */
public class Calculator {

    //instance variables
    private double numberOne;
    private double numberTwo;

    
    /**
     * This constructor creates an object with initial values 
     * for the two numbers
     * @param numberOne to set the first number
     * @param numbetTwo to set the second number
     */
    public void Calculator(double numberOne, double numberTwo)
    {
        setNumberOne(numberOne);
        setNumberTwo(numberTwo);
    }
    
    /**
     * This constructor creates an object with default
     * initial value 0 for the two numbers
     * 
     */
    public void Calculator()
    {
        //setNumberOne(0);
        //setNumberTwo(0);
    }
       
    
    /**
     * This method sets/changes the first number
     *
     * @param numberOne a double to set/change first number
     */
    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }//of setNumberOne

    /**
     * This method sets/changes the second number
     *
     * @param numberTwo a double to set/change second number
     */
    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }//of setNumberTwo

    /**
     * This method sets/changes the first and second numbers
     *
     * @param numberOne a double to set/change first number
     * @param numberTwo a double to set/change second number
     * 
     */
    public void setNumbers(double numberOne,double numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }//of setNumberTwo
    
    
    /**
     * This method returns the sum of the two numbers
     *
     * @return the sum of the two numbers
     */
    public double addNumbers() {
        return getNumberOne() + getNumberTwo();
    }

    /**
     * This method returns the difference of the two numbers
     *
     * @return the difference of the two numbers
     */
    public double subtractNumbers() {
        return getNumberOne() - getNumberTwo();
    }

    /**
     * This method returns the product of the two numbers
     *
     * @return the product of the two numbers
     */
    public double multiplyNumbers() {
        return getNumberOne() * getNumberTwo();
    }

    /**
     * This method returns the quotient of the division of the two numbers
     *
     * @return the quotient of the two numbers
     */
    public double divideNumbers() {
        return getNumberOne() / getNumberTwo();
    }

    /**
     * This method returns the first number
     * @return the first number
     */
    public double getNumberOne() {
        return numberOne;
    }

    /**
     * This method returns the second  number
     * @return the second number
     */
    public double getNumberTwo() {
        return numberTwo;
    }
    
    /**
     * 
     */
    
   
}//of Calculator

