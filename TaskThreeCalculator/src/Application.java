import java.util.Scanner;
public class Application {
    float num1;
    float num2;
    float result;
    char operator;
    public static void main(String[] args) {
        Application calculator=new Application();
            Scanner in = new Scanner(System.in);
            System.out.println("Input number, operator, number.");
            while (in.hasNext()){
                String s = in.next();
                if("quit".equals(s)){
                    System.exit(0);
                }
                calculator.num1 = calculator.getNum1(s);
                calculator.num2 = calculator.getNum2(s);
                calculator.operator= calculator.getOperator(s);
                switch (calculator.operator){
                    case '+':
                        calculator.calcAddition();
                        calculator.printResult();
                        break;
                    case '-':
                        calculator.calcSubtraction();
                        calculator.printResult();
                        break;
                    case '*':
                        calculator.calcMultiplication();
                        calculator.printResult();
                        break;
                    case '/':
                        calculator.calcDivision();
                        calculator.printResult();
                        break;
                    default:
                        System.out.println("Operator is absent or incorrect.");
                        break;
                }
            }
    }
    private float getNum1(String example){
        try {
            String result = "";
            for (char c : example.toCharArray()) {
                if (c == '+' || c == '-' || c == '*' || c == '/') {
                    break;
                }
                result = result + c;
            }
            float i = Float.parseFloat(result);
            return i;
        }catch (Exception e){
            System.out.println("First number is absent or not digital.");
        }
        return 0;
    }

    private float getNum2(String example){
        try {
            boolean wasOperator = false;
            String result = "";
            for (char c : example.toCharArray()) {
                if(wasOperator){
                    result = result + c;
                }
                if (c == '+' || c == '-' || c == '*' || c == '/') {
                    wasOperator = true;
                }
            }
            float i = Float.parseFloat(result);
            return i;
        }catch (Exception e){
            System.out.println("Second number is absent or not digital.");
        }
        return 0;
    }
    private char getOperator(String example){
        char result = 0;
        for (char c : example.toCharArray()) {
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                result = c;
            }
        }
        return result;
    }
    private void calcAddition() {
        result = num1 + num2;
    }
    private void calcSubtraction() {
        result = num1 - num2;
    }
    private void calcMultiplication() {
        result = num1 * num2;
    }
    private void calcDivision() {
        if (num2==0) {
            System.out.print("Division by 0 can not be fulfilled.");
        }
        result=num1/num2;
    }
    private void printResult() {
        System.out.println(result);
    }
}