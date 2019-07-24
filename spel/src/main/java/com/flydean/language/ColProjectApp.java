package com.flydean.language;

import com.flydean.beans.Society;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

import java.util.List;

/**
 * @author wayne
 * @version ColProjectApp,  2019-07-23 23:07
 */
public class ColProjectApp {

    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

        EvaluationContext context = SimpleEvaluationContext.forReadWriteDataBinding().build();

        Society society = new Society();

        // returns ['Smiljan', 'Idvor' ]
        List placesOfBirth = (List)parser.parseExpression("Members.![placeOfBirth.city]").getValue(context,society);
    }
}
