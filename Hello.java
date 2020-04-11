package HelloJava;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // prompt the user to enter height in inches
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237;//constant
        final double METERS_PER_INCH = 0.0254;//constant

        //Compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        //display result
        System.out.println("BMI is "+ bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overwight");
        else
            System.out.println("Obese");

        input.close();
    }
}

// package HelloJava;
// import java.util.Scanner;

// public class Hello {
//     public static void main(String[] args) {
//         System.out.println("Enter your name: \n");
//         //trying scanner variable
//         Scanner input = new Scanner(System.in);

//         String name = input.next();
//         System.out.println("Hello"+" "+name+"!");
        
//         input.close();
//         //trying the exponent function
//         System.out.println(Math.pow(2,4));
//         int i;
//         for(i = 0; i <= 4; i++){
//             System.out.println("Narcos is better than la casa de papel.");
//         }
//     }
// }