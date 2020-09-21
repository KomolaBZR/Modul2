package com.company.action;

import com.company.action.Action;

public class TestAction implements Action {
    @Override
    public String doAction(String str) {
        if(str==null){return null;}
        return "test";
    }
}
