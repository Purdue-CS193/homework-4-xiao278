import java.util.*;

enum Operation
{
    ADD, SUBTRACT, MULTIPLY, DIVIDE
}
public class Test1 {

    public static double basicCalculator(Operation operation, int num1, int num2){
        double result = 0;

     	if(operation == Operation.DIVIDE){
		result = (double)(num1) / num2;
	}else if(operation == Operation.MULTIPLY){
		result = num1 * num2;
	}else if(operation == Operation.ADD)result = num1 + num2;
	else if (operation == Operation.SUBTRACT) result = num1 - num2;


        return result;
    }

    public static void main(final String[] args) {
        System.out.println(basicCalculator(Operation.DIVIDE, 1, 2));
	System.out.println(basicCalculator(Operation.ADD, 5,3));
    }
}
