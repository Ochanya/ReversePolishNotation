package com.company;



public class ReversePolishCalc {

  private int top = 0;
  private String[] tokens;
  private String[] stack;

  public double calculate(String input) {
    tokens = input.split(",");

    // Allocate a stack which will be bigger than just the numbers but that's ok
    stack = new String[tokens.length];

    for(int i = 0; i < tokens.length; i++) {
      String token = tokens[i];
      if ("+".equals(token)) {
        double num2= pop();
        double num1 = pop();
        push(num2 + num1 );
      } else if ("-".equals(token)) {
        double num2 = pop();
        double num1 = pop();
        push(num1 - num2);
      } else if ("*".equals(token)) {
        double num2 = pop();
        double num1 = pop();
        push(num1 * num2);
      } else if ("/".equals(token)) {
        double num2 = pop();
        double num1 = pop();
        push(num1 / num2);
      } else {
        push(token);
      }
    }
    return pop();
  }

  private void push(String number) {
    stack[top] = number;
    top++;
  }

  private void push(double number) {
    stack[top] = Double.toString(number);
    top++;
  }

  private double pop() {
    return Double.parseDouble(stack[--top]);
  }
}