package com.stack;

public class InfixToPostFixConversion {

	private StackImplUsingArray stack;

	public InfixToPostFixConversion(int capacity) {
		stack = new StackImplUsingArray(capacity);
	}

	public String infixToPostFix(char arr[]) {
		StringBuilder sb = new StringBuilder();
		// int top = -1;
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if (isOperand(ch)) {
				sb.append(ch);
			} else if (ch == '(') {
				stack.push(ch);
			} else if (ch == ')') {
				while (!stack.isEmpty() && stack.peek() != '(')
					stack.push(ch);
				if (!stack.isEmpty() && stack.peek() != '(')
					return null; // invalid expression
				else
					stack.pop();
			} else { // an operator is encountered
				while (!stack.isEmpty() && precedence(ch) <= precedence((char) stack.peek()))
					sb.append((char) stack.pop());
				stack.push(ch);
			}
		}
		return sb.toString();
	}

	private boolean isOperand(char ch) {
		return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
	}

	private int precedence(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 1;
		case '^':
			return 3;
		default:
			break;
		}
		return -1;
	}

	public static void main(String[] args) {
		String str = "a+b*(c^d-e)^(f+g*h)-i";
		char arr[] = str.toCharArray();
		InfixToPostFixConversion conversion = new InfixToPostFixConversion(arr.length);
		System.out.println(conversion.infixToPostFix(arr));
	}

}
