package com.company.action;

import com.company.action.Action;
import com.company.action.ReverseStringAction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringActionTest {

    @Test
    public void doActionNormalStringShouldBeReversed(){
        String str="1234";
        Action action= new ReverseStringAction();
        assertEquals("4321", action.doAction(str));
    }

    @Test
    public void doActionEmptyStringShouldBeReturnEmptyString(){
        String str="";
        Action action= new ReverseStringAction();
        assertEquals("", action.doAction(str));
    }
    @Test
    public void doActionNullStringShouldBeReturnNull(){
        String str=null;
        Action action= new ReverseStringAction();
        assertNull(action.doAction(str));
    }
}

/*
1) input data
2) call the method
3) check if result is expected
 */

//public void doAction_goodString_reverseString() or
// public void doActionNormalStringShouldBeReversed()