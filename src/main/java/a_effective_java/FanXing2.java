package a_effective_java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Stack;

public class FanXing2<E> {
	
	public static void main(String[] args) {
		FanXing2<Number> fan = new FanXing2<>();
		List<Integer> integers = new ArrayList<>();
		integers.add(1);
		integers.add(3);
		integers.add(2);
		//The method pushAll(Collection<Number>) in the type FanXing2<Number> is not applicable for the arguments (List<Integer>)
		//fan.pushAll(integers);
		//fan.pushAll2(integers);
		
		List<Object> Objects = new ArrayList<>();
		Objects.add(1);
		Objects.add("3");
		Objects.add("你好");
		fan.pushAll3(Objects);
	}
	
	public void pushAll(Collection<E> src) {
		Stack<E> stack = new Stack<>();
		for (E e : src) {
			stack.push(e);
		}
		System.out.println(stack);
	}
	
	public void pushAll2(Collection<? extends E> src) {
		Stack<E> stack = new Stack<>();
		for (E e : src) {
			stack.push(e);
		}
		System.out.println(stack);
	}
	
	public void pushAll3(Collection<? super E> src) {
		Stack<Object> stack = new Stack<>();
		for (Object e : src) {
			stack.push(e);
		}
		System.out.println(stack);
	}

	
	
}
