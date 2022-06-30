
import java.util.*;
public class SetOperations{
      public static void PrintSet(HashSet myset){
        System.out.println("printing the elements in the Set");
        System.out.println(myset);
    }
}

public class ArrayListOperations{
      public static void PrintSet(ArrayList mylist){
        System.out.println("printing the elements in the ArrayList");
        System.out.println(mylist);
    }
}

public class Program{

  
    public static void main(String[] args){
        SetOperations setop=new SetOperations();
        ArrayListOperations arrlop=new ArrayListOperations();
        ArrayList<String> myarrayls=new ArrayList<String>();
        HashSet<String> myset=new HashSet<String>();
        //SOTRING THE DUPLICATES IN THE SET 
        //SET DOES NOT ALLOW THE DUPLICATES
        myset.add("hello");
        myset.add("hello");
        myset.add("hello");
        myset.add("hello");
        myset.add("hello");
        myset.add("welcome");
        myset.add("to the");
        myset.add("collections");
        //STORING THE DUPLICATES IN THE ARRAYLIST
        //ARRAYLIST ALLOWS THE DUPLICATES ALSO STORE THE ELEMENTS IN THE GIVEN ORDER
        myarrayls.add("hello");
        myarrayls.add("hello");
        myarrayls.add("hello");
        myarrayls.add("hello");
        myarrayls.add("hello");
        myarrayls.add("welcome");
        myarrayls.add("to the");
        myarrayls.add("collections");
//*******************************************
//||||||| WHAT IS THE SET |||||||||||||||||||
//-------------------------------------------
//SET IS THE DATAsTRUCUTRE WHICH STORES THE ELEMENTS BY FOLLOWING THE
//TWO CODITIONS
//1)SET DATA STRUCTURE DOES NOT STORES THE ELEMENTS IN THE GIVEN ORDER
//2)SET DATA STRUCTURE DOES NOT STORE THE DUPLICATE ELEMENTS
System.out.println("\n*******************************************\n||||||| WHAT IS THE SET |||||||||||||||||||\n-------------------------------------------\nSET IS THE DATASTRUCTURE WHICH STORES THE ELEMENTS BY FOLLOWING THE\nTWO CODITIONS\n1)SET DATA STRUCTURE DOES NOT STORES THE ELEMENTS IN THE GIVEN ORDER\n2)SET DATA STRUCTURE DOES NOT STORE THE DUPLICATE ELEMENTS\n");
        System.out.println("\nPRINTING ELEMENTS STORED IN THE SET\n\n");
        setop.PrintSet(myset);
        System.out.println("\nSTORING THE ELEMENTS IN SAME FREQUENCY\nWHICH ARE STORED IN THE SET  ON THE ARRAYLIST\n\n");
        arrlop.PrintSet(myarrayls);

    }
}
