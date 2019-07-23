package com.flydean.language;

import com.flydean.beans.Inventor;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

/**
 * @author wayne
 * @version AssignApp,  2019-07-23 06:15
 */
public class AssignApp {

    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

        EvaluationContext context = SimpleEvaluationContext.forReadWriteDataBinding().build();

        Inventor inventor = new Inventor();

        parser.parseExpression("name").setValue(context, inventor, "Aleksandar Seovic");

// alternatively
        String aleks = parser.parseExpression(
                "name = 'Aleksandar Seovic'").getValue(context, inventor, String.class);

        System.out.println(aleks);

    }
}
