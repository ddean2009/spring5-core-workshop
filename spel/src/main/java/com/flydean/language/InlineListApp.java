package com.flydean.language;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

import java.util.List;

/**
 * @author wayne
 * @version InlineListApp,  2019-07-21 18:18
 */
public class InlineListApp {

    public static void main(String[] args) {

        ExpressionParser parser = new SpelExpressionParser();

        EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();

        // evaluates to a Java list containing the four numbers
        List numbers = (List) parser.parseExpression("{1,2,3,4}").getValue(context);

        System.out.println(numbers);

        List listOfLists = (List) parser.parseExpression("{{'a','b'},{'x','y'}}").getValue(context);

        System.out.println(listOfLists);
    }


}
