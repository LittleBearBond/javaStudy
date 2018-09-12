package com.my.maven01.model;

import org.junit.*;
import org.junit.Assert.*;

public class HelloWordTest{

    @Test
    public void SayHello (){
         Assert.assertEquals("hello xj", new HelloWord().SayHello());
    }
}