package com.company.action;

import com.company.action.Action;

public class ReverseStringAction2 implements Action {

    @Override
    public String doAction(String str) {

        if(str==null) {return null;}

        StringBuffer stringBuffer= new StringBuffer(str);
        return stringBuffer.reverse().toString();

    }
}
