package Demmo;

import java.util.Stack;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Solution {
		    public int solution(String S) {
		    	System.out.println("Updated.");
		        // write your code in Java SE 8
		        Stack<Integer> stack=new Stack<Integer>();
		        String [] ops = S.split(" ");
		        int i;
		        int temp1 = 0;
		        int temp2 = 0;
		        int sum = 0;
		        int result = 0;
		        
		        for(i=0; i < ops.length; i++){
		            if(isInteger(ops[i])){
		                stack.push(Integer.parseInt(ops[i]));
		                
		            }else{
		                switch(ops[i]){
		                    case "POP": stack.pop();
		                        break;
		                    case "DUP": stack.push(stack.peek());
		                        break;
		                    case "+": 
		                        if(stack.size() == 1){
		                            return -1;
		                        }
		                            temp1 = stack.peek();
		                            stack.pop();
		                            temp2 = stack.peek();
		                            stack.pop();
		                            sum = temp1 + temp2;
		                            stack.push(sum);
		                            break;
		                    case "-":
		                        if(stack.size() == 1){
		                            return -1;
		                        }
		                            temp1 = stack.peek();
		                            stack.pop();
		                            temp2 = stack.peek();
		                            stack.pop();
		                            sum = temp1 - temp2;
		                            stack.push(sum);
		                            break;
		                    default:
		                            System.out.print("Invalid Input");
		                            break;
		                }
		            }  
		         }
		         
		         return stack.peek();
		    }
		    
		    public boolean isInteger(String s) {
		        try { 
		            Integer.parseInt(s); 
		        } catch(NumberFormatException e) { 
		            return false; 
		        } catch(NullPointerException e) {
		            return false;
		    }
		    return true;
		    }
		}
	}

}
