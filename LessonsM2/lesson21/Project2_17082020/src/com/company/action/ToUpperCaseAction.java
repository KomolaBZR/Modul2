package com.company.action;

import com.company.action.Action;

public class ToUpperCaseAction implements Action {
    @Override
    public String doAction(String str) {
        if(str==null){
            return null;
        }
        return str.toUpperCase();
    }
}
