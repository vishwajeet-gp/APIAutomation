import java.util.Arrays;

public class ArraysDemo
{

	public static void main(String[] args)
	{
		int[] a={11,5,44,53,9};
		for(int a1:a)
		{
			System.out.println(a1);
		}
		Arrays.sort(a);
        System.out.println("Primitive array after sorting"+a);
        
        String s[]={"A","Z","V"};
        System.out.println("Object array before sorting"+s);
        for(String s1:s)
        {
        	System.out.println(s1);
        }
        Arrays.sort(s);
        System.out.println("Object array after sorting"+s);
	}

}
