package com.gl.lab3.problem1;

public class Main {

	public static void main(String[] args) {
		
		String bracketExpressionString ="([[{}])]";
		String bracketExpressionString2="([[{}]]))";
		
		boolean result;
		
		BalancingBrackets balanceBracket=new BalancingBrackets();
		
		result=balanceBracket.isStringBalancedBrackets(bracketExpressionString);
		
		if(result)
			System.out.println("This String is balanced");
		else
			System.out.println("This String is not balanced");
		result=balanceBracket.isStringBalancedBrackets(bracketExpressionString2);
		if(result)
			System.out.println("This String is balanced");
		else
			System.out.println("This String is not balanced");

}
}
