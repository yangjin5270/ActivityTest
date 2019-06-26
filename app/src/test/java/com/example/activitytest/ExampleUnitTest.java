package com.example.activitytest;

import com.example.activitytest.util.MD5Util;
import com.example.activitytest.util.WjNetVerify;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void test(){
       // System.out.println(MD5Util.MD5Encode("123","utf-8"));
        WjNetVerify.setAccount("ceshi");
        WjNetVerify.setPassword("ceshi");

        System.out.println("登录剩余秒数"+WjNetVerify.login("1"));
        System.out.println("设置guid"+WjNetVerify.stateControl("xxx1","0"));
        System.out.println("设置guid"+WjNetVerify.stateControl("xxx2","0"));
        System.out.println("设置guid"+WjNetVerify.stateControl("xxx3","0"));
        System.out.println("设置guid"+WjNetVerify.stateControl("xxx4","0"));
        System.out.println("设置guid"+WjNetVerify.stateControl("xxx5","0"));
        System.out.println("xxx1 guid在线状态"+WjNetVerify.stateControl("xxx1","1"));
        System.out.println("xxx2 guid在线状态"+WjNetVerify.stateControl("xxx2","1"));
        System.out.println("xxx3 guid在线状态"+WjNetVerify.stateControl("xxx3","1"));
        System.out.println("xxx4 guid在线状态"+WjNetVerify.stateControl("xxx4","1"));
        System.out.println("xxx5 guid在线状态"+WjNetVerify.stateControl("xxx5","1"));
        /*System.out.println("guid在线状态"+WjNetVerify.stateControl("1"));
        System.out.println("xxx1 guid删除"+WjNetVerify.stateControl("xxx1","1"));
        System.out.println("xxx2 guid删除"+WjNetVerify.stateControl("xxx2","1"));
        System.out.println("xxx3 guid删除"+WjNetVerify.stateControl("xxx3","1"));
        System.out.println("xxx4 guid删除"+WjNetVerify.stateControl("xxx4","1"));
        System.out.println("xxx5 guid删除"+WjNetVerify.stateControl("xxx5","1"));*/

    }
}