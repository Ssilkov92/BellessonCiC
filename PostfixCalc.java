package org.example;
//ffff
import  java.util.Scanner;
import java.util.Stack;

public class PostfixCalc {
    private  static  Scanner in = new Scanner(System.in); // инструмент считывания пользовательского ввода

    public static void main(String[] args) {
        System.out.print("Enter action: ");
        String str = in.nextLine();
        String[] strings = str.split(" ");
        Stack<Double> stack = new Stack<Double>();

        for(int i = 0; i < strings.length; i++) {
            if (isNumber(strings[i])) {
                stack.push(Double.parseDouble(strings[i]));
            } else {
                double num1 = stack.pop();
                double num2 = stack.pop();
                //double number = 0, sqrt = 0;
                //number = in.nextDouble();
                //sqrt = squareRoot(number);

                switch (strings[i]) {
                    case "+":
                        stack.push(num1 + num2);
                        break;
                    case "-":
                        stack.push(num2 - num1);
                        break;
                    case "*":
                        stack.push(num1 * num2);
                        break;
                    case "/":
                        stack.push(num2 / num1);
                        break;
                    case "%":
                        stack.push(num1 % num2);
                        break;
                    case "sqrt":
                        stack.push((num1/num2));
                        break;
                    case "abs":
                        stack.push(Math.abs(2.2));
                    default:
                }
            }


        }
        if(!stack.empty()){
            System.out.println(stack.pop());
        }else {
            System.out.println("Error");
        }

    }
    private static boolean isNumber(String string) {
        try {
            Double.parseDouble(string);

            return  true;
        }catch (NumberFormatException e){

            return false;
        }
    }}