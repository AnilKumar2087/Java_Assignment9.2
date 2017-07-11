package hashset_assignment9_2;

import java.util.HashSet;

public class HashSet_demo {

	public static void main(String[] args) 
	{
		
			// TODO Auto-generated method stub
			 HashSet<String> set1 = new HashSet<String>();
		        //add elements to HashSet
		        set1.add("first");
		        set1.add("second");
		        set1.add("third");
		        System.out.println("set 1 values");
		        System.out.println(set1);
		        HashSet<String> set2 = new HashSet<String>();
		        set2.add("s1");
		        set2.add("s2");
		        System.out.println("set 2 values");
		        System.out.println(set2);
		        //copying set1 to set2
		        set2.addAll(set1);
		        System.out.println("HashSet content after adding another collection:");
		        System.out.println(set2);

	}

}
