package GeeksForGeeksProblems;

import java.util.ArrayList;

public class TempConversion {
    public static void main(String[] args) {
        ArrayList<Double>temp = convertTemp(36.50);
        System.out.println(temp);
    }
    static ArrayList<Double> convertTemp(double celsius){
        ArrayList<Double> temp = new ArrayList<>();
        double kelvin = celsius + 273.15;
        temp.add(kelvin);
        double fahrenheit = celsius*1.80 + 32.00;
        temp.add(fahrenheit);

        return temp;
    }
}
