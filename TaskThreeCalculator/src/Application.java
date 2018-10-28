import java.util.Scanner;
public class Application {
    int num1;
    int num2;
    int result;

    public static void main(String[] args) {
        Application calculator=new Application();
        //try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input numbers");
            while (in.hasNext()){
                String s = in.next();
                if("quit".equals(s)){
                    System.exit(0);
                }
                calculator.num1 = calculator.getNum1(s);
                calculator.num2 = calculator.getNum2(s);
                char op = calculator.getOperator(s);
                switch (op){
                    case '+':
                        calculator.calcAddition();
                        break;
                    case '-':
                        calculator.calcSubtraction();
                        break;
                    default:
                        System.out.println("Operator is incorrect");
                        break;
                }
                System.out.println(calculator.result);
                /*calculator.num1 = in.nextInt();
                System.out.println("Input operator.");
                calculator.operator = in.next();
                if(calculator.operator.equals("+") || calculator.operator.equals("-")) {
                    System.out.println("Input second number.");
                    calculator.num2 = in.nextInt();
                    if (calculator.operator.equals("+")) {
                        calculator.calcAddition();
                    }
                    System.out.println(calculator.result);
                    if (calculator.operator.equals("-")) {
                        calculator.calcSubtraction();
                    }
                    System.out.println(calculator.result);
                }else{
                    System.out.println("Неверный оператор");
                }*/
            }
        //}catch (Exception e){
            //System.out.println("Only numbers should be input");
        //}
    }


    private int getNum1(String example){
        try {
            String result = "";
            for (char c : example.toCharArray()) {
                if (c == '+' || c == '-') {
                    break;
                }
                result = result + c;
            }
            int i = Integer.parseInt(result);
            return i;
        }catch (Exception e){
            System.out.println("Only numbers should be input");
        }
        return 0;
    }

    private int getNum2(String example){
        try {
            boolean wasOperator = false;
            String result = "";
            for (char c : example.toCharArray()) {
                if(wasOperator){
                    result = result + c;
                }
                if (c == '+' || c == '-') {
                    wasOperator = true;
                }

            }
            int i = Integer.parseInt(result);
            return i;
        }catch (Exception e){
            System.out.println("Only numbers should be input");
        }
        return 0;
    }

    private char getOperator(String example){
        char result = 0;
        for (char c : example.toCharArray()) {
            if (c == '+' || c == '-') {
                result = c;
            }
        }
        return result;
    }


    private void calcAddition() {
        result = num1 + num2;
    }

    void calcSubtraction() {
        result = num1 - num2;
    }
}