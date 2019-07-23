package com.flydean.language;

import com.flydean.beans.Inventor;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

/**
 * @author wayne
 * @version ConstructApp,  2019-07-23 06:34
 */
public class ConstructApp {

    public static void main(String[] args) {

        ExpressionParser p = new SpelExpressionParser();

        EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();

        Inventor einstein = p.parseExpression(
                "new org.spring.samples.spel.inventor.Inventor('Albert Einstein', 'German')")
                .getValue(Inventor.class);

//create new inventor instance within add method of List
        p.parseExpression(
                "Members.add(new org.spring.samples.spel.inventor.Inventor('Albert Einstein', 'German'))").getValue(context);
    }
}
