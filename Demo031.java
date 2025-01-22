import java.util.*;

class HashSetDemo1 {
	void HSetMethod() {
		HashSet<Object> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer, a string and a double: ");
        int a = sc.nextInt();
        String b = sc.next();
        double c = sc.nextDouble();
		hashSet.add(a);
		hashSet.add(b);
		hashSet.add(c);
		System.out.println(hashSet);		

		for(Object x: hashSet) {
			System.out.println(x);
		}
	}
}


public class Demo031 {
	public static void main(String[] args) {
		HashSetDemo1 obj = new HashSetDemo1();
		obj.HSetMethod();
	}
}