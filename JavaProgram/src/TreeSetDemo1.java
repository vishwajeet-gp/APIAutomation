import java.util.TreeSet;

public class TreeSetDemo1 
{

	public static void main(String[] args)
	{
		TreeSet t=new TreeSet<>(new MyComparator());
		t.add(10);
		t.add(3);
	    t.add(5);
		t.add(55);
		t.add(11);
		System.out.println(t);

	}

}
