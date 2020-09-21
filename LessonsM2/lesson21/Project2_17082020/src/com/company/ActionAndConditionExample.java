package com.company;

import com.company.action.Action;
import com.company.condition.Condition;

public class ActionAndConditionExample implements Condition, Action {
    @Override
    public String doAction(String str) {
        if(str==null){
            return null;
        }
        return str+"!";
    }

    @Override
    public boolean test(String str) {
        return str!=null;
    }
}
