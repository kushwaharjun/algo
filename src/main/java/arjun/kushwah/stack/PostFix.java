package arjun.kushwah.stack;

import java.util.Stack;

public class PostFix {
	private static int getPrefrenceVal(char c) {
		switch(c) {
		case '+' : 
		case '-' :
			return 1;
		case '*':
		case '/':
			return 2;
		case '^' :
			return 3;
		}
		return -1;
	}
   public static String getPostFix(String exp) {
	   String result="";
	   Stack<Character> stack=new Stack<Character>();
	   for(int i=0;i<exp.length();i++) {
		   char c=exp.charAt(i);
		   if(Character.isLetterOrDigit(c)) {
			   result+=c;
		   }else if(c=='(') {
			   stack.push(c);
		   }else if(c==')') {
			   while(!stack.isEmpty() && stack.peek()!='(') {
				   result+=stack.pop();
			   }
		   }else {
			   while(!stack.isEmpty() && getPrefrenceVal(c)<=stack.peek())
				   result += stack.pop();
				   stack.push(c);
		   }
	   }
	   return result;
   }
   public static void main(String args[]) {
	   String exp="a+(b*(c^d-e)^(f+g*h)-i)"; 
	   System.out.println(getPostFix(exp));
   }

}
