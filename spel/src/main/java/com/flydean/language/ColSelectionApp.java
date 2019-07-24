package com.flydean.language;

import com.flydean.beans.Inventor;
import com.flydean.beans.Society;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

import java.util.List;
import java.util.Map;

/**
 * @author wayne
 * @version ColSelectionApp,  2019-07-23 23:00
 */
public class ColSelectionApp {

    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

        EvaluationContext context = SimpleEvaluationContext.forReadWriteDataBinding().build();

        Society society = new Society();

        List<Inventor> list = (List<Inventor>) parser.parseExpression(
                "Members.?[Nationality == 'Serbian']").getValue(context, society);


        Map newMap = (Map)parser.parseExpression("officers.?[value<27]").getValue(context, society);


    }
}
