import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet<>();
		t.add("10");
		t.add("3");
		t.add("5");
		t.add("rohit");
		//t.add(11);heterogeneous object are not allowed.
		System.out.println(t);

	}

}
