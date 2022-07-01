//**************************
//|| ARRAY  LIST IN JAVA |||
//--------------------------
import java.util.*;

public class Program{
public static void main(String[] args){
//****************************
//|| CREATING AN ARRAY LIST ||
//----------------------------
ArrayList<String> myarraylist=new ArrayList<String>();
ArrayList<Integer> myintegerlist=new ArrayList<Integer>();
ArrayList<Boolean> myboollist=new ArrayList<Boolean>(Arrays.asList(new Boolean[2]));
ArrayList<Double> mydoublelist=new ArrayList<Double>();
//***************************************
//checking the size of the array list |||
//---------------------------------------
System.out.println("INITIAL SIZE OF THE ARRAY LISTS");

System.out.println("STRING LIST:"+myarraylist.size());
System.out.println("INTEGER LIST"+myintegerlist.size());
System.out.println("BOOLEAN LIST:"+myboollist.size());
System.out.println("DOUBLE LIST:"+mydoublelist.size());
System.out.println();

//**********************************
//||||| ADDING ELEMENTS ||||||||||||
//----------------------------------
//WE SHOULD FOLLOW THE FOLLOWING GUIDELINES TO ADD THE ELEMENTS TO THE 
//ARRAY LIST 
//add() takes the parameters that should be added to the ArrayList
//NameOfYourArrayList.add("your item");
//on the above i have created the arraylist to store the strings
//so to the add method i have to specify the my data in "your data"
//if we created the arraylist for number we should specify just the numbers
myarraylist.add("welcome to");
myarraylist.add("java");
myarraylist.add("collections");
myintegerlist.add(1);
myintegerlist.add(0);
myintegerlist.add(2);
myintegerlist.add(3);
myintegerlist.add(4);
myintegerlist.add(5);
Collections.fill(myboollist,Boolean.FALSE);
Collections.fill(myboollist,Boolean.TRUE);
mydoublelist.add(3.3333);
mydoublelist.add(9.9999);
mydoublelist.add(99.999);

//***************************************
//checking the size of the array list |||
//---------------------------------------
System.out.println("SIZE OF THE ARRAY LIST AFTER ADDING OF ELEMENTS");

System.out.println("STRING LIST:"+myarraylist.size());
System.out.println("INTEGER LIST"+myintegerlist.size());
System.out.println("BOOLEAN LIST:"+myboollist.size());
System.out.println("DOUBLE LIST:"+mydoublelist.size());

//**********************************************************
//||||||| DISPLAYING THE CONTENTS OF THE ARRAYLSITS |||||||||
//----------------------------------------------------------
System.out.println();
System.out.println("PRINTING THE CONTENTS");
System.out.println("STRING LIST:"+myarraylist);
System.out.println("INTEGER LIST:"+myintegerlist);
System.out.println("BOOLEAN LIST:"+myboollist);
System.out.println("DOUBLE LIST:"+mydoublelist);

//*******************************************
//||||||| removing the elements |||||||||||||
//-------------------------------------------
//********************************
//UNCOMMENT TO REMOVE THE ELEMENTS
//-------------------------------- 
//we can specify the index or the value diretly to the remove method
//REMOVES THE ITEM AT SPECIFIED VALUE
//myarraylist.remove(0);
//REMOVES THE SPECIFIED ITEM
//myaaraylist.remove("java");
//it removes the element at the index 0 

System.out.println();
System.out.println("PRINTING THE CONTENTS");
System.out.println("STRING LIST:"+myarraylist);
System.out.println("INTEGER LIST:"+myintegerlist);
System.out.println("BOOLEAN LIST:"+myboollist);
System.out.println("DOUBLE LIST:"+mydoublelist);
System.out.println();

//*********************************
//||||| TRAVERSING THE LIST ||||||||
//----------------------------------
System.out.println("TRAVERSING THE LIST");
System.out.println();
for(String item:myarraylist){
    System.out.print(item+" ");
}
System.out.println();
//traversing the list by for loop
//if we want to traverse the elements of arraylist using for loop 
//we need to use the get() function
for(int i=0;i<myintegerlist.size();i++){
 System.out.print(myintegerlist.get(i)+" ");   
}

System.out.println();
int i=0;
while(i<myboollist.size()){
    System.out.print(myboollist.get(i)+" ");
    i++;
}
System.out.println();
for(Boolean item:myboollist){
    System.out.print(item+" ");
}
System.out.println();
//*************
//|SORTING|
//------------

System.out.println("\nSORTING OPERATION");
//sorting the array list
Collections.sort(myintegerlist);
System.out.println("SORTED LIST:"+myintegerlist);
//*********************************
//||||||| sorting reverse order ||||
//----------------------------------
System.out.println("SORTING IN THE REVERSE ORDER");
Collections.sort(myintegerlist,Collections.reverseOrder());
System.out.println("SORTED LIST:"+myintegerlist);

//*************************
//||||| toArray() |||||||||
//-------------------------

System.out.println("OUTPUT OF THE TO ARRAY FUNCTION");

Object[] toarrays=myarraylist.toArray();
System.out.println(toarrays);
for(int u=0;u<toarrays.length;u++){
    System.out.print(toarrays[u]+" ");
}

//**********************************
//||||| toArray() ecample 2 |||||||||
//----------------------------------

System.out.println("\nOUTPUT OF THE TO ARRAY FUNCTION");
Integer[] a=new Integer[5];
Integer[] toarrayss=myintegerlist.toArray(a);
System.out.println(toarrayss);
for(int u=0;u<toarrayss.length;u++){
    System.out.print(toarrayss[u]+" ");
}

//**********************************
//|||| trimToSize() ||||||||||||||||
//**********************************
//ARRAY LIST CONTAINS THE 1.5 TIMES OF THE SPACE FOR THE NUMBER 
//ELEMENTS INSERTED
//IF ARRAY LIST WAS HAVING 4 ELEMENTS THEN  THERE WILL BE SPACE ALLOCATED FOR 
//6 ELEMENTS INTERNALLY
//IF WE DONT USE THAT SPACE IT GOES AS WASTE TO AVOID THAT WE USE THE
//TRIMTOSIZE

System.out.println("\n\nTRIM TO SIZE METHOD\n");
myarraylist.trimToSize();
System.out.println("\nSIZE AFTER TRIM TO SIZE\n");
System.out.println(myarraylist.size());
myarraylist.add("arraylist");
System.out.println(myarraylist);
System.out.println("\nSIZE AFTER ADDING ELEMENT \n");
System.out.println(myarraylist.size());

//***********************************
//||||| toArray(T[]) |||||||||||||||
//---------------------------------

//this method will return the array that was containing all the  elements
//the list
myarraylist.add("collection");
System.out.println("\n\nTOARRAY(T[]) METHOD\n");
String myarraylisttwo[]=new String[myarraylist.size()];
myarraylisttwo=myarraylist.toArray(myarraylisttwo);
System.out.println("\n\nPRINTING THE ELEMENTS OF THE LIST TWO\n");
for(String item:myarraylisttwo){
    System.out.print(item+" ");
}

//***************************************
//||||| subList(startindex,endindex) ||||
//--------------------------------------

//generates the list of elements from the specified starting index to
//the specified ending index

 ArrayList<String> myarraylistthree= new ArrayList<String>(myarraylist.subList(2, 3));
System.out.println("\n\nPRINTING THE SUBLIST\n");
System.out.println(myarraylistthree);
ArrayList<String> myarraylistfour=new ArrayList<String>(myarraylist.subList(1,4));
System.out.println("\n\nPRINTING THE SUBLIST\n");
System.out.println(myarraylistfour);


//*********************************
//|||||| splititerator ||||||||||||
//--------------------------------
//Split iterator breaks the list into small parts and these 
//small parts are processed in the parallel for our applications
//we use splititerator less in real world projects
//split iterator will work normally as the iterator
//collection class of the JAVA provides the two methods
//to use the splititerator
//1)default stream()
//2)parallelStream()
//those two methods are used to process the elements in the parallel

//Collection.java
//default Stream<E> stream() {
    //return StreamSupport.stream(spliterator(), false);
//}
 
//default Stream<E> parallelStream() {
  //  return StreamSupport.stream(spliterator(), true);
//}

//splititerator methods
//we can use splititerator provided methods to process the data in parallel
//tryAdvance():used for parallel processing we can iterate elements in different threads
//forEachRemaining():to iterate elements sequentially in a single thread
//trySplit():partition the spliterator, if possible.
//cobines the hasNext() and next() into one method
//int characteristics():
//list of characters of splititerator
//1)ORDERED
//2)DISTINCT
//3)SORTED
//4)SIZED
//5)NONNULL
//6)IMMUTABLE
//7)CONCURRENT
//8)SUBSIZED
//long estimateSize():
//retruns the number of elements pending on traversal
//which was done by forEachReemaining()
//default void forEachRemaining(Consumer action):
//does the given action on each remaining element sequentially in the current thread 
//until all elements have been processed 
//or
//until action throws an exception
//
//*******************************
//Spliterator characteristics() ||
//-------------------------------
System.out.println("\n\nSPLIT ITERATOR CHARACTERISTICS METHOD\n");
Spliterator<String> myspliterator = myarraylist.spliterator();
 
int expected = Spliterator.ORDERED | Spliterator.SIZED | Spliterator.SUBSIZED;
 
System.out.println(myspliterator.characteristics() == expected);  //true
 
if (myspliterator.hasCharacteristics(Spliterator.ORDERED)) {
    System.out.println("ORDERED");
}
 
if (myspliterator.hasCharacteristics(Spliterator.DISTINCT)) {
    System.out.println("DISTINCT");
}
 
if (myspliterator.hasCharacteristics(Spliterator.SORTED)) {
    System.out.println("SORTED");
}
 
if (myspliterator.hasCharacteristics(Spliterator.SIZED)) {
    System.out.println("SIZED");
}
 
if (myspliterator.hasCharacteristics(Spliterator.CONCURRENT)) {
    System.out.println("CONCURRENT");
}
 
if (myspliterator.hasCharacteristics(Spliterator.IMMUTABLE)) {
    System.out.println("IMMUTABLE");
}
 
if (myspliterator.hasCharacteristics(Spliterator.NONNULL)) {
    System.out.println("NONNULL");
}
 
if (myspliterator.hasCharacteristics(Spliterator.SUBSIZED)) {
    System.out.println("SUBSIZED");
}

//**************************************************
//|||| estimateSize() and getExactSizeIfKnown() |||||
//---------------------------------------------------
System.out.println("\n\ngetEstimateSize() and getExactSizeIfKnown()\n");
System.out.println(myspliterator.estimateSize());
System.out.println(myspliterator.getExactSizeIfKnown());

//****** trySplit() ******************

System.out.println("\n\nTRY SPLIT METHOD\n");
myspliterator.forEachRemaining(System.out::println);
Spliterator<String> mysplitone=myarraylist.spliterator();
System.out.println("\n\nSPLITTING ONE\n");
mysplitone.forEachRemaining(System.out::println);

//Spliterator<String> mysplittwo=mysplitone.trySplit();
//System.out.println("\n\nSPLITTING TWO\n");

//mysplittwo.forEachRemaining(System.out::println);
//throwing exception NullPointerException have to figure out

//***********************************************
//|||||| adding element at a index add method |||
//----------------------------------------------

System.out.println("\n\nBEFORE ADDING\nMY ARRAY LIST\n");
System.out.println(myarraylist);
//adding hello at index 0
myarraylist.add(0,"hello");
System.out.println("\n\nAFTER ADDING\nMY ARRAY LIST\n");
System.out.println(myarraylist);

//****************************
//|||| addAll() |||||||||||||
//--------------------------
System.out.println("\n\nBEFORE ADD ALL\nMY ARRAY LIST\n");
System.out.println(myarraylist);
//adding hello at index 0
Collections.addAll(myarraylist,"vector","collection","hashmap","collection");
System.out.println("\n\nAFTER ADDING\nMY ARRAY LIST\n");
System.out.println(myarraylist);

System.out.println("\n\nBEFORE ADD ALL METHOD 2\nMY ARRAY LIST\n");
System.out.println(myarraylist);
//adding hello at index 0
ArrayList<String> mylisttwo=new ArrayList(Arrays.asList("date","time","topic"));
myarraylist.addAll(0,mylisttwo);
System.out.println("\n\nAFTER ADDING \nMY ARRAY LIST METHOD 2\n");
System.out.println(myarraylist);

//*******************************
//||||||| clear() |||||||||||||||
//------------------------------=

//clear all the elements from the LIST

System.out.println("\n\nBEFORE CLEARING THE LIST\n");
System.out.println(myarraylist);
//uncomment to see the function of clear 
//myarraylist.clear();
System.out.println("\n\nAFTER CLEARING THE LIST\n");
System.out.println(myarraylist);

//*****************************
//|||| clone() |||||||||||||||
//---------------------------
// returns the shallow copy of the list
System.out.println("\n\nCLONNING THE ARRAY LIST \n");
ArrayList myduplicatelist=new ArrayList();
myduplicatelist=(ArrayList)myarraylist.clone();
System.out.println(myduplicatelist);


//****************************
//|||| CONTAINS() |||||||||||
//----------------------------
//RETURNS TRUE IF LIST CONTAINS THE GIVEN ELEMENT

System.out.println("\n\nCONTAINS METHOD\n");
System.out.println("DOES LIST COTAINS JAVA:"+myarraylist.contains("java"));
System.out.println("DOES LIST COTAINS RUBY:"+myarraylist.contains("ruby"));
System.out.println("DOES LIST COTAINS HELLO:"+myarraylist.contains("hello"));
System.out.println("DOES LIST COTAINS GO:"+myarraylist.contains("GO"));
System.out.println("DOES LIST COTAINS TOPIC:"+myarraylist.contains("topic"));
System.out.println("DOES LIST COTAINS JAVASCRIPT:"+myarraylist.contains("javascript"));

//*********************************
//||||||| ensureCapacity(); |||||||
//---------------------------------
//used to define the atleast size of the arraylist
myarraylist.ensureCapacity(10);

//**********************
//||||| forEach() |||||||
//----------------------
System.out.println("\n\nTRAVERSING THE ARRAY LIST BY USING OF FOREACH\n");
myarraylist.forEach(item->System.out.print(item+" "));

//*******************
//|||| indexOf() |||
//------------------
//to find the index
System.out.println("\n\nINDEX OF METHOD\n");
System.out.println("INDEX OF JAVA:"+myarraylist.indexOf("java"));
//returns -1 if not found the index
System.out.println("INDEX OF RUBY:"+myarraylist.indexOf("ruby"));
//*************
//| isEmpty() |
//-------------

//RETURNS TRUE IF LIST CONTAINS NO ELEMENT
System.out.println("\n\nISEMPTY\n");
System.out.println("IS MYARRAY LIST IS EMPTY"+myarraylist.isEmpty());

ArrayList<String> dummylist=new ArrayList();
System.out.println("IS DUMMYLIST IS EMPTY"+dummylist.isEmpty());

//*****************
//|  ITERATOR()  |
//----------------
System.out.println("\n\nPRINTING THROUGH ITERATOR\n");
//iterator to traverse the element
Iterator<String> myiterator=myarraylist.iterator();
    // Print the first item using iterator
    System.out.println(myiterator.next());
    System.out.println("\n\nPRINTING ELEMETS THROUGH WHILE LOOP\n");
while(myiterator.hasNext()){
    System.out.print(myiterator.next()+" ");
}

//**********************
//||| lastIndexOf() ||||
//----------------------
myarraylist.add("java");
System.out.println("\n\nPRINTING THE LAST INDEX\n");
System.out.println("LAST INDEX OF JAVA IS:"+myarraylist.lastIndexOf("java"));


//************************
//||| list ITERATOR()  |||
//------------------------
System.out.println("\n\nPRINTING THROUGH LIST ITERATOR\n");
//iterator to traverse the element
ListIterator<String> mylistiterator=myarraylist.listIterator(5);
    // Print the first item using iterator
    System.out.println(mylistiterator.next());

    System.out.println("\n\nPRINTING ELEMETS THROUGH WHILE LOOP\n");
        while(mylistiterator.hasNext())
        {
    String myitem=mylistiterator.next();
    System.out.println(myitem);
        }

//******************
//||| REMOVEALL ||||
//------------------

ArrayList<String> myremovinglist=new ArrayList(List.of("sololearn","freecodecamp","caltech"));
System.out.println("\n\nREMOVE ALL METHOD\n");
System.out.println("OUR LIST");
System.out.println(myremovinglist);
//removing list
//*******************************
//UNCOMMENT HERE TO REMOVE ALL
//-----------------------------
//myremovinglist.removeAll(myremovinglist);
System.out.println(myremovinglist);

//********************
//||||removeIf()||||||
//--------------------
System.out.println("\n\nBEFORE REMOVE IF\n");
System.out.println(myremovinglist);
System.out.println("\n\nAFTER REMOVE IF\n");
myremovinglist.removeIf(itemm->(itemm.length()>5 && itemm.length()<8));
System.out.println(myremovinglist);

//**************************
//||||| removeRange() ||||||
//--------------------------


System.out.println("\n\nREMOVE RANGE IS PROTECTED IN JAVA \n SO USE CLEAR METHOD TO SAVE TIME\n");
//System.out.println("\n\nBEFORE REMOVE RANGE\n");
//System.out.println(myarraylist);
//System.out.println("\n\nAFTER REMOVE REMOVE\n");
//myarraylist.removeRange(1,2);
//System.out.println(myarraylist);

//******************************
//||||| replaceAll() |||||||||||
//------------------------------

System.out.println("\n\nBEFORE REPLACE ALL\n");
System.out.println(myarraylist);
System.out.println("\n\nAFTER REPLACE ALL\n");
Collections.replaceAll(myarraylist,"java","JAVA");
System.out.println(myarraylist);
//WE CAN OBSERVE THAT TWO STRINGS "java" was replace with "JAVA"

//***************************
//||||| retainAll() |||||||||
//===========================

//COMPARE THE TWO LISTS AND RETURNT THE SIMILAR ELEMENETS

ArrayList<String> retainlist=new ArrayList(List.of("java","hello","topic","collections","ruby","go","scala","kotlin"));
System.out.println("\n\n MY ARRAY LIST\n");
System.out.println(myarraylist);
System.out.println("\n\nRETAINLIST\n");
System.out.println(retainlist);
System.out.println("AFTER APPLYING OF RETAIN ALL OPERATION");
retainlist.retainAll(myarraylist);
System.out.println("\n\n MY ARRAY LIST\n");
System.out.println(myarraylist);
System.out.println("\n\nRETAINLIST\n");
System.out.println(retainlist);
//REVERSING THE ROLES
myarraylist.retainAll(retainlist);
System.out.println("AFTER APPLYING OF RETAIN ALL OPERATION");
retainlist.retainAll(myarraylist);
System.out.println("\n\n MY ARRAY LIST\n");
System.out.println(myarraylist);
System.out.println("\n\nRETAINLIST\n");
System.out.println(retainlist);

}
    
}
