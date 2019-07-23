package com.flydean;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @author wayne
 * @version SpelApp,  2019-07-21 15:04
 */
public class SpelApp {

    public static void main(String[] args) {

        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("'Hello World'");
        String message = (String) exp.getValue();
        System.out.println(message);

        exp = parser.parseExpression("'Hello World'.concat('!')");
        message = (String) exp.getValue();
        System.out.println(message);

        exp = parser.parseExpression("'Hello World'.bytes");
        byte[] bytes = (byte[]) exp.getValue();
        System.out.println(bytes);

        // invokes 'getBytes().length'
        exp = parser.parseExpression("'Hello World'.bytes.length");
        int length = (Integer) exp.getValue();

        exp = parser.parseExpression("new String('hello world').toUpperCase()");
        message = exp.getValue(String.class);

    }


}
