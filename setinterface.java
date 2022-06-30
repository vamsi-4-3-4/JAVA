
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
        //***************
        //||| 1.add() ||||
        //-------------
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

//****************
//||| 2.iterator() |||
//------------------
System.out.println("\nOUTPUT OF THE ITERATOR() METHOD\n");
Iterator myiterator=myset.iterator();
while(myiterator.hasNext()){
    System.out.println(myiterator.next());
}

//******************
//||| 3.size() ||||||
//-----------------
System.out.println("\nOUTPUT OF THE SIZE METHOD\n");
System.out.println("SIZE OF THE SET:"+myset.size());

//************************
//||| 4.isEmpty() ||||||||||
//------------------------
//creating new HashSet
HashSet<String> emptyset=new HashSet<String>();
System.out.println("\nAPPLYING ISEMPTY() ON EMPTYSET\n");
System.out.println("IS EMPTY SET IS EMPTY???\n:::"+emptyset.isEmpty());
System.out.println("\nAPPLYING ISEMPTY() ON MY SET\n");
System.out.println("IS MY SET IS EMPTY???\n:::"+myset.isEmpty());
//***********************
//|||| 5.contains() |||||||
//-----------------------
System.out.println("\nOUTPUT OF THE CONTAINS METHOD\n");
Boolean result=myset.contains("hello");
System.out.println("DOES MYSET CONTAINS HELLO???\n:::"+result);
Boolean resultf=myset.contains("JAVA");
System.out.println("DOES MYSET CONTAINS JAVA???\n:::"+resultf);
//*********************
//|||| 6.remove() |||||
//---------------------
HashSet<String> removeset=new HashSet<String>();
removeset.add("hello");
removeset.add("java");
removeset.add("i am");
removeset.add("golang");
System.out.println("\nPRINTING ELENENTS OF MY SET");
System.out.println(removeset);
System.out.println("\nREMOVING THE ELEMENT hello\n");

removeset.remove("hello");
System.out.println("\nAFTER REMOVING THE ELEMENT\n"+removeset);
//INDEX NOT WORKING HERE
//System.out.println("\nREMOVING THE ELEMENT AT INDEX:0\n");
//removeset.remove(0);
//removeset.remove(1);
//removeset.remove(2);
//System.out.println("\nSET AFTER REMOVING 0TH INDEX ELEMENT\n"+removeset);

//*********************
//||| 7.clear() |||||||
//---------------------
HashSet<String> clearset=new HashSet<String>();
clearset.add("hello");
clearset.add("java");
clearset.add("i am");
clearset.add("golang");
System.out.println("\nPRINTING ELENENTS OF CLEAR SET");
System.out.println(clearset);
System.out.println("\nCLEARING THE SET\n");

clearset.clear();
System.out.println("\nAFTER CLEARING THE ELEMENT\n"+clearset);

//********************
//|||| 8.clone() |||||
//--------------------

//clone method gives the shallow copy of the set 
System.out.println("\nCLONE METHOD OUTPUT\n");
HashSet<String> mysettwin=new HashSet<String>();
mysettwin=(HashSet)myset.clone();
System.out.println("\nMY SET\n"+myset);
System.out.println("\nMYSET TWIN\n"+mysettwin);



    }
}
