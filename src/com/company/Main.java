package com.company;

public class Main {

    public static void main(String[] args) {

//        Scanner calculator = new Scanner(System.in);
//
//      System.out.println("please enter your name  ");
//        String userInput = calculator.nextLine();
//
//        System.out.println("it's nice to meet you " + userInput);
//
//    }


          ReversePolishCalc rpc = new ReversePolishCalc();
          ReversePolishCalc rpn = new ReversePolishCalc();



        String rpnExpression = "2.5,4.8,+";
        double expectedResult = 7.3;
        double actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);



      // Write tests for the other operators (-, *, /)

//         Uncomment this test which has many operators
        String rpnExpression2 = "5,1,2,+,4,*,+,3,-";
        double expectedResult2 = 14.0;
        double actualResult2 = rpn.calculate(rpnExpression2);
        checkResult(rpnExpression2, expectedResult2, actualResult2);
    }

    private static void checkResult(String expression, double expected, double actual) {
        if (expected == actual) {
            System.out.println("SUCCESS: " + expression + " is " + expected);
        } else {
            System.out.println("ERROR: " + expression + " expected " + expected + " actual " + actual);
        }
    }
}
