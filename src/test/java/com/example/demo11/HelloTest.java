package com.example.demo11;

import org.junit.jupiter.api.Test;
import org.springframework.boot.origin.SystemEnvironmentOrigin;
import org.springframework.boot.test.context.SpringBootTest;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootTest

public class HelloTest {
	
	@Test
	public void helloTest() {
		System.out.println(this.helloMaker(1));
		System.out.println(this.helloMaker2("hello","bye"));
	}

	 public int helloMaker(int X) {
		    int y=X+7;
	    	return y+7;
	    }
	 public String helloMaker2(String ...inString) {
	    	return inString[1]+"worlb";
	    }
	 String c="a";
	 String d="a";
	 String e=new String("a");
	 

	}
    public void Lec2Test() {
    int a;
    int b=1111;
    
    }
}
    
