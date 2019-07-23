package com.flydean.language;

import com.flydean.beans.Inventor;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

/**
 * @author wayne
 * @version VariableApp,  2019-07-23 06:38
 */
public class VariableApp {

    public static void main(String[] args) {

        ExpressionParser parser = new SpelExpressionParser();

        Inventor tesla = new Inventor("Nikola Tesla", "Serbian");

        EvaluationContext context = SimpleEvaluationContext.forReadWriteDataBinding().build();
        context.setVariable("newName", "Mike Tesla");

        parser.parseExpression("Name = #newName").getValue(context, tesla);
        System.out.println(tesla.getName());  // "Mike Tesla"
    }
}
