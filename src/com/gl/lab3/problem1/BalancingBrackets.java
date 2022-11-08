package com.gl.lab3.problem1;

import java.util.Stack;

public class BalancingBrackets {

	/*any one method of the below 2 methods will work*/
	
	public boolean checkingbalancedbrackets(String bracketExpressionString) {
		if(bracketExpressionString.contains(" ")) {
			bracketExpressionString.replace(" ", "");
		}
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < bracketExpressionString.length(); i++) {
				
				char character= bracketExpressionString.charAt(i);
				
				if(character == '(' || character== '{' || character=='[' )
				{
					stack.push(character);
					continue;
				}
				
				if(stack.isEmpty())
					return false;
				
				char c;
				
				switch(character) {
				
				case ')':
					c=stack.pop();
					if(c=='}'|| c==']')
						return false;
					break;
				case '}':
					c=stack.pop();
					if(c==')'|| c==']')
						return false;
					break;
				case ']':
					c=stack.pop();
					if(c=='}'|| c==')')
						return false;
					break;
				}
				
		}
		return (stack.isEmpty());
	}

	public boolean isStringBalancedBrackets(String bracketExpressionString) {
		boolean flag=true;
		if(bracketExpressionString!=""||!bracketExpressionString.isEmpty()) {
			char[] chararr=bracketExpressionString.toCharArray();
			if(chararr.length%2!=0) {
				flag=false;
			}
			else {
				for(int i=0; i<chararr.length/2; i++) {
					char ch=chararr[i];
					switch(ch) {
					case '(' :
						if(chararr[chararr.length-1-i]!=')') 
							flag=false;
							break;
						
					case '{' :
						if(chararr[chararr.length-1-i]!='}') 
							flag=false;
							break;
						
					case '[' :
						if(chararr[chararr.length-1-i]!=']') 
							flag=false;
							break;
					default : 	
						flag=false;
						break;
						
					}
				}
			}
		}
		else {
			System.out.println("entered string is empty. enter a different string");
			flag=false;
		}
		
		return flag;
		
	}
}
