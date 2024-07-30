import java.util.Scanner;
class firstProgram{
    public static void main(String[] args)
    {
        int firstNum,secondNum,result=0;
        String operator;
        Scanner input = new Scanner(System.in);
        boolean isTrue = true;
        while(isTrue){
            System.out.println("Enter first number:");
            firstNum = input.nextInt();
            System.out.println("Enter operator:");
            operator = input.next();
            System.out.println("Enter second number:");
            secondNum = input.nextInt();
           switch(operator){
            case "+":result=firstNum+secondNum;
            break;
            case "-":result=firstNum-secondNum;
            break;
            case "*":result=firstNum*secondNum;
            break;
            case "/":result=firstNum/secondNum;
            break;
            case "%":result=firstNum%secondNum;
            break;
            default:System.out.println("Error");
            break;
           }
           System.out.println("The result is "+ result);
           System.out.println("Do you want to close the program");
           isTrue=input.nextBoolean();


        }
    }

}