package com.java.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StringCheckValidParentheses {

	public static void main(String[] args) {
		String str = "({})[{]}";
		System.out.println(parenthesesBalanceCheckWithMap(str));
		System.out.println("======================");
		char exp[] = { '{', '(', ')', '}', '[', ']' };
		if (areParenthesisBalanced(exp))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}

	public static boolean parenthesesBalanceCheckWithMap(String expression) {

		Map<Character, Character> openClosePair = new HashMap<>();
		openClosePair.put('(', ')');
		openClosePair.put('{', '}');
		openClosePair.put('[', ']');

		Stack<Character> stack = new Stack<>();
		for (char ch : expression.toCharArray()) {
			if (openClosePair.containsKey(ch)) {
				stack.push(ch);
			} else if (!stack.isEmpty() && openClosePair.get(stack.peek()) == ch) {
				stack.pop();
			} else {
				return false;
			}

		}
		return stack.isEmpty();
	}

	static boolean isMatchingPair(char character1, char character2) {

		if (character1 == '(' && character2 == ')')
			return true;
		else if (character1 == '{' && character2 == '}')
			return true;
		else if (character1 == '[' && character2 == ']')
			return true;
		else
			return false;
	}

	static boolean areParenthesisBalanced(char exp[]) {

		StackClass stack = new StackClass();
		for (int i = 0; i < exp.length; i++) {
			if (exp[i] == '(' || exp[i] == '{' || exp[i] == '[') {
				stack.push(exp[i]);
			}
			if (exp[i] == ')' || exp[i] == '}' || exp[i] == ']') {
				if (stack.isEmpty()) {
					return false;
				} else if (!isMatchingPair(stack.pop(), exp[i])) {
					return false;
				}
			}
		}
		if (stack.isEmpty())
			return true; /* balanced */
		else { /* not balanced */
			return false;
		}
	}

	static class StackClass {
		int top = -1;
		char[] items = new char[100];

		void push(char x) {
			if (top == 99) {
				System.out.println("Stack full");
			} else {
				items[++top] = x;
			}
		}

		char pop() {
			if (top == -1) {
				System.out.println("Underflow error!");
				return '\0';
			} else {
				char element = items[top];
				top--;
				return element;
			}
		}

		boolean isEmpty() {
			return (top == -1) ? true : false;
		}
	}
}
