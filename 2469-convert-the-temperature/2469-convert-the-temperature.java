import java.util.*;
public class Solution {
    public static double[] convertTemperature(double celsius) {

        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;

        return new double[]{kelvin, fahrenheit};
        
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        System.out.print(convertTemperature(celsius));
    }
}