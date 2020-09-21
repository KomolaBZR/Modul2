package com.company.condition;

import com.company.condition.Condition;

public class LengthMoreThanFourCondition implements Condition {
    @Override
    public boolean test(String str) {
        return (str!=null&&str.length()>4);
    }
}
