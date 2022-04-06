public class Test4 {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        java.util.Scanner s=new java.util.Scanner(System.in);
        while(true){
            System.out.println("Welcome to our simple calculator");
            System.out.print("Please enter your first number:");
            int inputNum1= s.nextInt();
            System.out.print("Please enter the operation:");
            String inputOp=s.next();
            System.out.print("Please enter your second number:");
            int inputNum2=s.nextInt();
            c.showResult(inputNum1,inputNum2,inputOp);
        }


    }
}

class Calculator{
    public void showResult(int num1,int num2,String operator){
        int result=0;
        switch (operator){
            case "+":
                result=num1+num2;
                break;
            case "-":
                result=num1-num2;
                break;
            case "*":
                result=num1*num2;
                break;
            case "/":
                result=num1/num2;
                break;
            case "%":
                result=num1%num2;
                break;
        }
        System.out.println(num1+operator+num2+"="+result);
    }
}