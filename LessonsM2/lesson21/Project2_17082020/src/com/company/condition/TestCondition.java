package com.company.condition;

import com.company.condition.Condition;

public class TestCondition implements Condition {

    @Override
    public boolean test(String str) {
        return str!=null&&str.length()>2;
    }
}
