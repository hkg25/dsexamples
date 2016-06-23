package com.stack;

public class InfixToPostFixConversion {

	private StackImplUsingArray<Character> stack;

	private StackImplUsingArray<String> stack2;

	public InfixToPostFixConversion(int capacity) {
		stack = new StackImplUsingArray<>(capacity);
	}

	public String infixToPostFix(char arr[]) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if (isOperand(ch)) {
				sb.append(ch);
			} else if (ch == '(') {
				stack.push(ch);
			} else if (ch == ')') {
				while (!stack.isEmpty() && stack.peek() != '(')
					sb.append(stack.pop());
				if (!stack.isEmpty() && stack.peek() != '(')
					return null; // invalid expression
				else
					stack.pop();
			} else { // an operator is encountered
				while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek()))
					sb.append(stack.pop());
				stack.push(ch);
			}
		}

		while (!stack.isEmpty())
			sb.append(stack.pop());

		return sb.toString();
	}

	public String evaludatePostfix(char arr[]) {
		stack2 = new StackImplUsingArray<>(arr.length);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if (isOperand(ch)) {
				stack2.push("" + ch);
			} else {
				String val1 = stack2.pop();
				String val2 = stack2.pop();
				switch (ch) {
				case '+':
					stack2.push(val2 + '+' + val1);
					break;
				case '-':
					stack2.push(val2 + '-' + val1);
					break;
				case '*':
					stack2.push(val2 + '*' + val1);
					break;
				case '/':
					stack2.push(val2 + '/' + val1);
					break;
				case '^':
					stack2.push(val2 + '^' + val1);
					break;
				}
			}
		}
		sb.append(stack2.pop());
		return sb.toString();
	}

	/**
	 * Reverse a string having complexity n which is size of string
	 * 
	 * @param str
	 * @return
	 */
	public String reverse(String str) {
		StringBuilder sb = new StringBuilder();
		if (str != null && !str.isEmpty()) {
			char arr[] = str.toCharArray();
			int length = arr.length;
			stack2 = new StackImplUsingArray<>(length);
			for (int i = 0; i < length; i++) {
				stack2.push("" + arr[i]);
			}
		}

		while (!stack2.isEmpty())
			sb.append(stack2.pop());
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
			return 2;
		case '^':
			return 3;
		default:
			break;
		}
		return -1;
	}

	public static void main(String[] args) {
		String str = "a+b*(c^d-e)^(f+g*h)-i";
		System.out.println("Infix Expression is : " + str);

		InfixToPostFixConversion conversion = new InfixToPostFixConversion(str.toCharArray().length);
		String postfix = conversion.infixToPostFix(str.toCharArray());
		System.out.println("PostFix is : " + postfix);

		String actualExp = conversion.evaludatePostfix(postfix.toCharArray());
		System.out.println("Actual Exp is : " + actualExp);

		String str3 = "My Name is Harish";
		System.out.println("Reverse of string is : " + conversion.reverse(str3));

	}

}
