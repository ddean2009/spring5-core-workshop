package com.flydean.language;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @author wayne
 * @version LiteralApp,  2019-07-21 17:43
 */
public class LiteralApp {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

// evals to "Hello World"
        String helloWorld = (String) parser.parseExpression("'Hello World'").getValue();

        double avogadrosNumber = (Double) parser.parseExpression("6.0221415E+23").getValue();

// evals to 2147483647
        int maxValue = (Integer) parser.parseExpression("0x7FFFFFFF").getValue();

        boolean trueValue = (Boolean) parser.parseExpression("true").getValue();

        Object nullValue = parser.parseExpression("null").getValue();
    }
}
