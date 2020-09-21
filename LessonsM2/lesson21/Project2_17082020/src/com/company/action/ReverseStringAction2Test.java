package com.company.action;

import com.company.action.Action;
import com.company.action.ReverseStringAction2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringAction2Test {
    @Test
    public void doActionNormalStringShouldBeReversed(){
        String str="1234";
        Action action= new ReverseStringAction2();
        assertEquals("4321", action.doAction(str));
    }

    @Test
    public void doActionEmptyStringShouldBeReturnEmptyString(){
        String str="";
        Action action= new ReverseStringAction2();
        assertEquals("", action.doAction(str));
    }
    @Test
    public void doActionNullStringShouldBeReturnNull(){
        String str=null;
        Action action= new ReverseStringAction2();
        assertNull(action.doAction(str));
    }
}