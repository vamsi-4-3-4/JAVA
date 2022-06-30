//SORT METHOD IN COLLECTIONS FRAMEWORK

import java.util.*;
public class Program
{
    public static void main(String[] args) {
		ArrayList<String> myarraylist=new ArrayList<String>();
        myarraylist.add("golang");
        myarraylist.add("rangerover");
        myarraylist.add("bugatti");
        myarraylist.add("java");
        myarraylist.add("apple");
        System.out.println("MY ARRAY LIST\n:::"+myarraylist);
        Collections.sort(myarraylist);
        System.out.println("MY ARRAY LIST AFTER SORTING\n:::"+myarraylist);
	}
}
