package com.chetan.calculator;

import com.chetan.operator.*;

public class Calculator
{

  
    public Calculator()
    {

    }
  
    public void solve(double num1,double num2,char expr) 
    {
        Operator operator =new Operator();
        operator.operate(num1, num2, expr);
        operator.displayResult();
    }
}