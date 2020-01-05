package com.geeksforgeeks.stacksQueue;

import java.util.Stack;

public class PaenthesisChecker {

	public static void main(String[] args) {
		char exp[] = { '{', '(', ')', '}', '[', ']' };
		if (areParenthesisBalanced(exp))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}

	private static boolean areParenthesisBalanced(char[] exp) {
		Stack<Character> expressionStack = new Stack<Character>();
		for (int i = 0; i < exp.length; i++) {
			{
				if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[')
					expressionStack.push(exp[i]);
			}
			/*
			 * If exp[i] is an ending parenthesis then pop from stack and check if the
			 * popped parenthesis is a matching pair
			 */
			if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') {

				/*
				 * If we see an ending parenthesis without a pair then return false
				 */
				if (expressionStack.isEmpty()) {
					return false;
				}
				/*
				 * Pop the top element from stack, if it is not a pair parenthesis of character
				 * then there is a mismatch. This happens for expressions like {(})
				 */
				else if (!isMatchingPair(expressionStack.pop(), exp[i])) {
					return false;
				}

			}

		}
		/* If there is something left in expression  
        then there is a starting parenthesis without  
        a closing parenthesis */
      
     if (expressionStack.isEmpty()) 
       return true; /*balanced*/
     else
       {   /*not balanced*/
           return false; 
       }  
	}

	private static boolean isMatchingPair(Character character1, char character2) {
		 if (character1 == '(' && character2 == ')') 
	         return true; 
	       else if (character1 == '{' && character2 == '}') 
	         return true; 
	       else if (character1 == '[' && character2 == ']') 
	         return true; 
	       else
	         return false; 
	}
}
