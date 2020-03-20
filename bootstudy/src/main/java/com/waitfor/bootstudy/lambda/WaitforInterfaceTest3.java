package com.waitfor.bootstudy.lambda;

import org.junit.Test;

public class WaitforInterfaceTest3 {

	@Test
	public void testLambda(){
		wait(new WaitforInterface3<String>(){

			@Override
			public void test(String para) {
				// TODO Auto-generated method stub
				System.out.println("jdk8之前的方式");
			}
			
		});
		//使用Lambda表达式代替匿名内部类
		wait((String para) ->System.out.println("jdk8之后的lambda方式"+para));
		
	}
	
	private void wait(WaitforInterface3<String> waitforInterface3){
		waitforInterface3.test("包含参数的方式");
	}
}
