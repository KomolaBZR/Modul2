package com.company.action;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToUpperCaseActionTest {
    @Test
    public void doActionNormalStringShouldBeUpperCase(){
        String str="qweRTyuiIOPйё-.фыв";
        Action action= new ToUpperCaseAction();
        assertEquals("QWERTYUIIOPЙЁ-.ФЫВ", action.doAction(str));
    }

    @Test
    public void doActionEmptyStringShouldBeReturnEmptyString(){
        String str="";
        Action action= new ToUpperCaseAction();
        assertEquals("", action.doAction(str));
    }
    @Test
    public void doActionNullStringShouldBeReturnNull(){
        String str=null;
        Action action= new ToUpperCaseAction();
        assertNull(action.doAction(str));
    }

}