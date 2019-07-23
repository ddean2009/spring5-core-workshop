package com.flydean.language;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

/**
 * @author wayne
 * @version MathApp,  2019-07-23 06:14
 */
public class MathApp {

    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

        EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();
        // Addition
        int two = parser.parseExpression("1 + 1").getValue(Integer.class);  // 2

        String testString = parser.parseExpression(
                "'test' + ' ' + 'string'").getValue(String.class);  // 'test string'

// Subtraction
        int four = parser.parseExpression("1 - -3").getValue(Integer.class);  // 4

        double d = parser.parseExpression("1000.00 - 1e4").getValue(Double.class);  // -9000

// Multiplication
        int six = parser.parseExpression("-2 * -3").getValue(Integer.class);  // 6

        double twentyFour = parser.parseExpression("2.0 * 3e0 * 4").getValue(Double.class);  // 24.0

// Division
        int minusTwo = parser.parseExpression("6 / -3").getValue(Integer.class);  // -2

        double one = parser.parseExpression("8.0 / 4e0 / 2").getValue(Double.class);  // 1.0

// Modulus
        int three = parser.parseExpression("7 % 4").getValue(Integer.class);  // 3

         one = parser.parseExpression("8 / 5 % 2").getValue(Integer.class);  // 1

// Operator precedence
        int minusTwentyOne = parser.parseExpression("1+2-3*8").getValue(Integer.class);  // -21
    }
}
