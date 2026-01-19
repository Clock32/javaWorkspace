package hw03;

public class LambdaPractice3 {

	
	public static void main(String[] args) {
		
		String  s = "HelloWorld";
		String[] sa = s.split("-");
		
		
		MyFunction <String,String>first = a -> a.toUpperCase() ;
		MyFunction <String,Boolean>second = a -> a.length() > 4;
		MyFunction <String,String>third = a -> a.toLowerCase() ;
		
		System.out.println(first.apply(s));
		System.out.println(second.apply(s));
		System.out.println(third.apply(s));
		
		
	}
	
	
	
	
	@FunctionalInterface
	interface MyFunction<V,B>{
		B apply(V v);
	}
	
}
