import java.util.Comparator;

public class MyComparator3 implements Comparator
{

    public int compare(Object obj1, Object obj2)
    {
		String i=obj1.toString();
		String i1=obj2.toString();
		
		return i.compareTo(i1);
		//return i1.compareTo(i);
    }

}