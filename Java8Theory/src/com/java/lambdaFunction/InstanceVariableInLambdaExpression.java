package com.java.lambdaFunction;


@FunctionalInterface
interface InstanceVariableInterface{
	public void click();
}

public class InstanceVariableInLambdaExpression {

	int i = 0;
	
	public void show() {
		InstanceVariableInterface iVariableInterface = () -> {
			i = 10;
			System.out.println("Changed/reassign value for instance variable "+ i);
		};
		iVariableInterface.click();
	}
	
	public static void main(String[] args) {
		InstanceVariableInLambdaExpression expression = new InstanceVariableInLambdaExpression();
		expression.show();
	}

}
