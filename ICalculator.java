package Icalculator;
public interface ICalculator {
    /**
     * Adds given two numbers
     * @param x first number
     * @param y second number
     * @return the sum of the two numbers
     */
   public int add(int x, int y);
    /**
     * Divides two numbers
     * @param x first number
     * @param y second number
     * @return the division result
     */
   public float divide(int x, int y) throws RuntimeException;
}
