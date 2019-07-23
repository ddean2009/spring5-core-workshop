package com.flydean.language;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

/**
 * @author wayne
 * @version TypeApp,  2019-07-23 06:23
 */
public class TypeApp {

    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

        EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();
        Class dateClass = parser.parseExpression("T(java.util.Date)").getValue(Class.class);

        Class stringClass = parser.parseExpression("T(String)").getValue(Class.class);

        boolean trueValue = parser.parseExpression(
                "T(java.math.RoundingMode).CEILING < T(java.math.RoundingMode).FLOOR")
                .getValue(Boolean.class);
    }
}
