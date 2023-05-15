import java.util.Scanner;
public class Bmi{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Mass In Kilograms");
        double inputMass = input.nextDouble();
        System.out.println("Please Enter Your Height In Meters");
        double inputHeight=input.nextDouble();
        double bmi = (inputMass) / Math.pow(inputHeight , 2);
        if(bmi <= 18.5){
            System.out.println("BMI "+": "+bmi+" Thinness ):");
        }else if (bmi <= 25 && bmi >= 20){
            System.out.println("BMI "+": "+bmi+" Normal :)");
        }else if (bmi >= 25 && bmi <= 30){
            System.out.println("BMI "+": "+bmi+" Overweight /:");
        }else if (bmi >= 30){
            System.out.println("BMI "+": "+bmi+" Obese |:");
        }
    }
}