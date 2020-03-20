package com.waitfor.bootstudy.lambda;

import org.junit.Test;

public class WaitforInterfaceTest {

	@Test
	public void testLambda(){
		wait(new WaitforInterface(){

			@Override
			public void test() {
				// TODO Auto-generated method stub
				System.out.println("jdk8之前的方式");
			}
			
		});
		
		wait(() ->System.out.println("jdk8之后的lambda方式"));
		
	}
	
	private void wait(WaitforInterface waitforInterface){
		waitforInterface.test();
	}
}
