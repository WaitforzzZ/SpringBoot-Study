package com.waitfor.bootstudy.lambda;

import org.junit.Test;

public class WaitforInterfaceTest4 {

	@Test
	public void testLambda(){
		//使用Lambda表达式代替匿名内部类
		wait((String para) -> true);
		wait((String para) ->{
			System.out.println("jdk8之后的lambda方式"+para);
			return true;
		});
		
	}
	
	private void wait(WaitforInterface4<String> waitforInterface){
		waitforInterface.test("包含参数返回值的方式");
	}
}
