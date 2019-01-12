package a_effective_java;

import java.util.ArrayList;
import java.util.List;

public class FanXing01 {
	
	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		//java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
		unsafeAdd(strings, new Integer(42));
		//编译不通过
		//unsafeAdd2(strings, new Integer(42));
		unsafeAdd3(strings, new Integer(42));
		System.out.println(strings.get(0));
	}
	
	public static void unsafeAdd(List list, Object obj) {
		list.add(obj);
	}
	public static void unsafeAdd2(List<Object> list, Object obj) {
		list.add(obj);
	}
	public static void unsafeAdd3(List<?> list, Object obj) {
		//The method add(capture#1-of ?) in the type List<capture#1-of ?> is not applicable for the arguments (Object)
//		list.add(obj);
		list.get(0);
	}

}
