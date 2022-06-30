//HASH MAP
//HASHMAP IS THE DATA STRUCTURE WHICH STORES THE DATA IN THE FORM 
//OF KEY AND VALUE PAIRS

import java.util.*;

public class Program
{
    public static void main(String[] args) {
        //************************
        //|| creating a hashmap ||
        //------------------------
        HashMap<String,String> myhashmap=new HashMap<String,String>();
        System.out.println("\nHASHMAP AFTER CREATION\n");
        System.out.println(myhashmap);
        //******************
        //|||1.isEmpty() ||||
        //------------------
        Boolean result=myhashmap.isEmpty();
        System.out.println("\nIS MYHASHMAP IS EMPTY???\n:::"+result);
        //*******************
        //||| 2.put() |||||||
        //-------------------
        //put method is used to add elements to the HASHMAP
        myhashmap.put("ac","ACER");
        myhashmap.put("ai","AIRTEL");
        myhashmap.put("ap","APPLE");
        myhashmap.put("as","ASUS");
        System.out.println("\nHASHMAP AFTER ADDING ELEMENTS USIN PUT() METHOD\n");
        System.out.println(myhashmap);
        //*******************
        //||| 3.putAll() |||
        //------------------
        //putAll method copies the elements from one map to another map
        HashMap<String,String> putallmap=new HashMap<String,String>();
        System.out.println("\nPUTALLMAP AFTER CREATION\n"+putallmap);
        putallmap.putAll(myhashmap);
        System.out.println("\nELEMENTS IN PUTALL MAP\n"+putallmap);
        //********************
        //||| 4.putIfAbsent|||
        //--------------------
        //this method adds the keyvalue pairs if not exists
        myhashmap.putIfAbsent("ac","ACER");
        myhashmap.putIfAbsent("bo","BOEING");
        myhashmap.putIfAbsent("ai","AIRTEL");
        myhashmap.putIfAbsent("rr","ROLLSROYCE");
        System.out.println("\nMYHASHMAP AFTER PUTIFABSENT\n"+myhashmap);

        //******************
        //||| 5.clear() ||||
        //------------------
        //clear all the keyvalue pairs in hashmap
        HashMap<String,String> clearhashmap=new HashMap<String,String>();
        clearhashmap.put("te","TEEGARDEN`S STAR B");
        clearhashmap.put("to","TOI 700 D");
        clearhashmap.put("kt","K2-72e");
        clearhashmap.put("tr","TRAPPIST-1D");
        clearhashmap.put("ke","KEPLER-1649C");
        clearhashmap.put("pr","PROXIMA CENTAURI B");
        System.out.println("\nMY CLEARHASHMAP BEFORE CLEAR\n"+clearhashmap);
        clearhashmap.clear();
        System.out.println("\nMY CLEARHASHMAP AFTER CLEAR\n"+clearhashmap);
        
        //****************
        //||| 6.clone() ||
        //----------------
        //clone method returns the copy the clonning hashmap
        //HashMap<String,String> clonehashmap=new HashMap<String,String>();
        System.out.println("\nCLONNED HASHMAP\n"+myhashmap.clone());

        //*******************
        //||| 7.compute() |||
        //-------------------
        //compute method do required action the given key
        System.out.println("\nHASHMAP BEFORE COMPUTE\n"+myhashmap);
        System.out.println("\nHASHMAP AFTER COMPUTE\n");
        myhashmap.compute("rr",(key,value)->value.toLowerCase());
        myhashmap.compute("as",(key,value)->value.toLowerCase());
        myhashmap.compute("bo",(key,values)->values.toLowerCase());
        System.out.println(myhashmap);

        //*************************
        //|||8.computeIfAbsent() |||
        //--------------------------
        System.out.println("\nBEFORE COMPUTE IF ABSENT\n");
        myhashmap.computeIfAbsent("so",(key)->"SONY");
        myhashmap.computeIfAbsent("go",(key)->"GOLANG");
        System.out.println("\nAFTER COMPUTE IF ABSENT\n"+myhashmap);

        //*************************
        //||| 9.computeIfPresent |||
        //-------------------------
        System.out.println("\nBEFORE COMPUTEIFPRESENT\n");
        myhashmap.computeIfPresent("ai",(key,value)->value.toLowerCase());
        myhashmap.computeIfPresent("ap",(key,myvalue)->myvalue.toLowerCase());
        System.out.println("\nAFTER COMPUTEIFPRESENT\n"+myhashmap);
        //**********************
        //||| 10.containsKey() |
        //----------------------
        //returns true if key was present 
        System.out.println("\nCONTAINSKEY METHOD\n");
       
        Boolean rr=myhashmap.containsKey("rr");
        Boolean ac=myhashmap.containsKey("ac");
        Boolean ss=myhashmap.containsKey("ss");
        System.out.println("\nDOES MY MAP CONTAINS KEY rr\n::::"+rr);
        System.out.println("\nDOES MY MAP CONTAINS KEY ac\n::::"+ac);
        System.out.println("\nDOES MY MAP CONTAINS KEY ac\n::::"+ss);
        
        //**************************
        //||| 11.containsValue() |||
        //--------------------------
        //returns the true if value was present
        System.out.println("\nCONTAINSVALUE METHOD\n");
        Boolean rollsroyce=myhashmap.containsValue("rollsroyce");
        Boolean acer=myhashmap.containsValue("ACER");
        Boolean samsung=myhashmap.containsValue("SAMSUNG");
        System.out.println("\nDOES MY MAP CONTAINS KEY rollsroyce\n::::"+rollsroyce);
        System.out.println("\nDOES MY MAP CONTAINS KEY ACER\n::::"+acer);
        System.out.println("\nDOES MY MAP CONTAINS KEY samsung\n::::"+samsung);
        //***********************
        //||| 12.entrySet()   |||
        //-----------------------
        //entry set method returns the hasmap elements as those are 
        System.out.println("\nENTRY SET METHOD\n");
        System.out.println("\nENTRY SET OUTPTUT:\n::::"+myhashmap.entrySet());

        //******************
        //||| 13.forEach() |||
        //------------------
        //applies the given operation on every element
        System.out.println("\nOUTPUT OF THE FOREACH METHOD\n");
        myhashmap.forEach((key,values)->{
          System.out.println("LENGTH OF "+values+" IS:"+values.length());
        });

        //******************
        //||| 14.get()    |||
        //-------------------
        //give the key and get the value
        //returns the null if not present
        System.out.println("\nGET METHOD\n");
        String rolls=myhashmap.get("rr");
        String acc=myhashmap.get("ac");
        String woc=myhashmap.get("woc");
        System.out.println("\nVALUE STORED IN THE KEY rr\n:::"+rolls); 
        System.out.println("\nVALUE STORED IN THE KEY ac\n:::"+acc);
        System.out.println("\nVALUE STORED IN THE KEY WOC\n:::"+woc);
        
        //*********************
        //| 15.getOrDefault() |
        //---------------------
        //returns the value if present or given default value
        System.out.println("\nGETORDEFAULT METHOD\n");
        String rollsrr=myhashmap.getOrDefault("rr","VALUE NOT FOUND PLEASE SPECIFY VALID VALUE");
        System.out.println("VALUE STORED IN RR:"+rollsrr);
        String noexist=myhashmap.getOrDefault("noexist","VALUE NOT FOUND PLEASE SPECIFY VALID VALUE");
        System.out.println("VALUE STORED IN noexist:"+noexist);
        //*****************
        //||| 16.keySet() |
        //----------------
        //returns the keys in the hashmap 
        System.out.println("\nKEYSET METHOD\n");
        System.out.println("\nKEYS PRESENT HASHMAP\n:::"+myhashmap.keySet());
        //******************
        //||| 17.merge() |||
        //------------------
        //mergemethod adds the defined key and value to the hashmap
        HashMap<String,String> myvivo=new HashMap<String,String>();
        myvivo.put("vv","VIVO");
        myvivo.forEach((key,value)->myhashmap.merge(key,value,(newkey,newval)->newkey.equalsIgnoreCase(newval)?newkey:newkey+","+newval));
        System.out.println("MERGED ARRAY\n:::"+myhashmap);
        
        //*********************
        //|| 18.remove() ||||||
        //---------------------
        //specify the key to remove the element
        System.out.println("\nREMOVING METHOD\n");
        System.out.println("REMOVING THE ELEMENT WITH KEY ac"+myhashmap.remove("ac"));
        System.out.println("MAP AFTER REMOVING AC\n"+myhashmap);
        System.out.println("\nREMOVING KEY AND VALUE \n");
        myhashmap.remove("as","asus");
        System.out.println("HASHMAP \n"+myhashmap);
        //***********************
        //|| 19.replace() |||||||
        //=======================
        System.out.println("\nREPLACE METHOD OUTPUT\n");
        myhashmap.replace("rr","RANGEROVER");
        System.out.println("AFTER REPLACE\n"+myhashmap);
        //**********************
        //||| 20.values |||||||
        //=====================
        System.out.println("\nKEYS\n"+myhashmap.keySet());
        System.out.println("\nVALUES\n"+myhashmap.values());
        
    }
}
