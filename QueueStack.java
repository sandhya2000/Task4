package conduira.task;

import java.util.*;

public class QueueStack {
	

		public static void main(String args[]){
		PriorityQueue <Integer> queue=new PriorityQueue <Integer>(); 
		queue.add(1);                             
		queue.add(4);
		queue.add(7);
		queue.add(9);
		queue.add(6);
		queue.add(3);
		System.out.println("the queue elements:");
		
		Iterator<Integer> itr=queue.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(queue.remove());
        stack.push(queue.remove());
        
        Stack<Integer> stack2 = new Stack<Integer>();
		Iterator <Integer> itr2=queue.iterator();
		while(itr2.hasNext()){
		stack2.push(itr2.next());
		}

		System.out.println("Removed elements " + stack);
		System.out.println("Existing elements " + stack2);
		
		

	}


}
