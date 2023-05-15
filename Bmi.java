import java.util.Scanner;
public class Bmi{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Mass In Kilograms");
        double inputMass = input.nextDouble();
        System.out.println("Please Enter Your Height In Meters");
        double inputHeight=input.nextDouble();
        double bmi = (inputMass) / Math.pow(inputHeight , 2);
    }
}