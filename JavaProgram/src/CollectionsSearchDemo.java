import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSearchDemo 
{

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList<>();
		al.add("A");
		al.add("S");
		al.add("S");
		al.add("V");
		al.add("Y");
		al.add("R");
		System.out.println("Before Sorting="+al);
		Collections.sort(al,new MyComparator1());
		System.out.println("after sorting="+al);
		System.out.println(Collections.binarySearch(al,"M"));
		System.out.println(Collections.binarySearch(al,"Q"));

	}

}
