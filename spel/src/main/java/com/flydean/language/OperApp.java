package com.flydean.language;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

/**
 * @author wayne
 * @version OperApp,  2019-07-21 20:12
 */
public class OperApp {

    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

        EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();

        // evaluates to true
        boolean trueValue = parser.parseExpression("2 == 2").getValue(Boolean.class);

// evaluates to false
        boolean falseValue = parser.parseExpression("2 < -5.0").getValue(Boolean.class);

// evaluates to true
        boolean trueAValue = parser.parseExpression("'black' < 'block'").getValue(Boolean.class);

// evaluates to false
         falseValue = parser.parseExpression(
                "'xyz' instanceof T(Integer)").getValue(Boolean.class);

// evaluates to true
         trueValue = parser.parseExpression(
                "'5.00' matches '^-?\\d+(\\.\\d{2})?$'").getValue(Boolean.class);

//evaluates to false
         falseValue = parser.parseExpression(
                "'5.0067' matches '^-?\\d+(\\.\\d{2})?$'").getValue(Boolean.class);


        // -- AND --

    // evaluates to false
         falseValue = parser.parseExpression("true and false").getValue(Boolean.class);

    // evaluates to true
        String expression = "isMember('Nikola Tesla') and isMember('Mihajlo Pupin')";
         trueValue = parser.parseExpression(expression).getValue(context, Boolean.class);

    // -- OR --

    // evaluates to true
         trueValue = parser.parseExpression("true or false").getValue(Boolean.class);

    // evaluates to true
         expression = "isMember('Nikola Tesla') or isMember('Albert Einstein')";
         trueValue = parser.parseExpression(expression).getValue(context, Boolean.class);

    // -- NOT --

    // evaluates to false
         falseValue = parser.parseExpression("!true").getValue(Boolean.class);

    // -- AND and NOT --
         expression = "isMember('Nikola Tesla') and !isMember('Mihajlo Pupin')";
         falseValue = parser.parseExpression(expression).getValue(context, Boolean.class);


    }
}
