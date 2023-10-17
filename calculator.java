import java.util.Arrays;

public class calculator {
    private static double add(double a, double b) {
        return a + b;
    }

    private static double sub(double a, double b) {
        return a - b;
    }

    private static double multi(double a, double b) {
        return a * b;
    }

    private static double div(double a, double b) {
        if (b == 0) {
            System.out.println("Denominator can't be zero ");
            return Double.NaN;
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("something is missing ..");
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        char operator = args[1].charAt(0); 
        double num2 = Double.parseDouble(args[2]);

        double result = 0.0; 
	if (operator == '+'){
		result= add(num1,num2) ;
	}
	else if (operator == '-'){
		result= sub(num1,num2);
	}
	else if (operator == '*'){
		result= multi(num1,num2);
	}
	else if (operator == '/'){
		result = div(num1,num2);
	}
	else{
		System.out.println("not a valid operator");
	}

        System.out.println("Result: " + result);
    }
}
