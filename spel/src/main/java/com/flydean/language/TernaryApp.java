package com.flydean.language;

import com.flydean.beans.Inventor;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

/**
 * @author wayne
 * @version TernaryApp,  2019-07-23 06:56
 */
public class TernaryApp {

    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

        EvaluationContext context = SimpleEvaluationContext.forReadWriteDataBinding().build();

        Inventor inventor = new Inventor();

        parser.parseExpression("Name").setValue(context, inventor, "IEEE");
        context.setVariable("queryName", "Nikola Tesla");

        String expression = "isMember(#queryName)? #queryName + ' is a member of the ' " +
                "+ Name + ' Society' : #queryName + ' is not a member of the ' + Name + ' Society'";

        String queryResultString = parser.parseExpression(expression)
                .getValue(context,inventor, String.class);
// queryResultString = "Nikola Tesla is a member of the IEEE Society"

        System.out.println(queryResultString);
    }
}
