package com.flydean.language;

import com.flydean.beans.Inventor;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

/**
 * @author wayne
 * @version ElvisApp,  2019-07-23 07:14
 */
public class ElvisApp {

    public static void main(String[] args) {

        ExpressionParser parser = new SpelExpressionParser();
        EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();

        Inventor tesla = new Inventor("Nikola Tesla", "Serbian");
        String name = parser.parseExpression("Name?:'Elvis Presley'").getValue(context, tesla, String.class);
        System.out.println(name);  // Nikola Tesla

        tesla.setName(null);
        name = parser.parseExpression("Name?:'Elvis Presley'").getValue(context, tesla, String.class);
        System.out.println(name);  // Elvis Presley
    }
}
