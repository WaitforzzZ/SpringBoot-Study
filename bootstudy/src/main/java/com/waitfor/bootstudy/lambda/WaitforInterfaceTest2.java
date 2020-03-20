package com.waitfor.bootstudy.lambda;

import org.junit.Test;

public class WaitforInterfaceTest2 {

	@Test
	public void testLambda(){
		wait(new WaitforInterface2(){

			@Override
			public void test(String para) {
				// TODO Auto-generated method stub
				System.out.println("jdk8之前的方式");
			}
			
		});
		
		wait((para) ->System.out.println("jdk8之后的lambda方式"+para));
		
	}
	
	private void wait(WaitforInterface2 waitforInterface2){
		waitforInterface2.test("包含参数的方式");
	}
}
