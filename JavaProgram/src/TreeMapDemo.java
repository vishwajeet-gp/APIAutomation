import java.util.TreeMap;

public class TreeMapDemo
{

	public static void main(String[] args) 
	{
		TreeMap t=new TreeMap<>(new MyComparator3());
		t.put("Vishu","Rohini");
		t.put("Danny", "Pooja");
		t.put("Sayaji", "Bhakti");
		System.out.println(t);
	}

}