import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo 
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
		System.out.println(al);
		Collections.sort(al);
		System.out.println("After Sorting="+al);
		
	}

}
