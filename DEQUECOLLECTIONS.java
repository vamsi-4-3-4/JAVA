//
import java.util.*;

public class Program
{
    public static void main(String[] args) {
//Deque<String> mydeque=new Deque<String>();
//CREATING A DEQUE
		Deque<String> mydeque=new LinkedList<String>();
        Deque<String> addfirst=new LinkedList<String>();
        Deque<String> addslast=new LinkedList<String>();
        //*********************
        //||| 1.add() method ||
        //---------------------
        System.out.println("\n|||ADD METHOD|||\n");
        mydeque.add("ceres");
        mydeque.add("vesta");
        mydeque.add("Pallas");
        mydeque.add("Interamnia");
        System.out.println(mydeque);

        //**********************
        //||| 2.addFirst() |||||
        //----------------------
         System.out.println("\n|||ADD FIRST METHOD|||\n");
        //adds the given element at the beginning
        addfirst.addFirst("Europa");
        addfirst.addFirst("SLYVIA");
        addfirst.addFirst("EUNOMIA");
        addfirst.addFirst("JUNO");
        addfirst.addFirst("DORIS");
        System.out.println(addfirst);
        //*********************
        //||| 3.addLast()   |||
        //---------------------
         System.out.println("\n|||ADDLAST METHOD|||\n");
        //adds the given element at the ending of the Queue
        addslast.addLast("DAVIDA");
        addslast.addLast("FORTUNA");
        addslast.addLast("BAMBERGA");
        addslast.addLast("THISBE");
        addslast.addLast("THEMIS");
        System.out.println(addslast);
        //********************
        //||| 4.contains() |||
        //-------------------
         System.out.println("\n|||CONTAINS METHOD|||\n");
        //returns true if the deque contains the specified element
        //returns false if the deque does not contains the given element
        Boolean ceres=mydeque.contains("ceres");
        Boolean vesta=mydeque.contains("vesta");
        Boolean verna=mydeque.contains("verna");
        Boolean thisbe=addslast.contains("THISBE");
        Boolean thisbeb=addslast.contains("thisbe");
        System.out.println(ceres);
        System.out.println(vesta);
        System.out.println(verna);
        System.out.println(thisbe);
        System.out.println(thisbeb);
        //******************************
        //||| 5.descendingIterator() |||
        //------------------------------
        //prints the elements in the reverse order
         System.out.println("\n|||DESCENDING ITERATOR METHOD|||\n");
        //
        System.out.println("\nDESCENDINGITERATOR\n");
        Iterator myiterator=mydeque.descendingIterator();
        while(myiterator.hasNext()){
            System.out.println(myiterator.next());
        }

        //********************
        //||| 6.element ||||||
        //-------------------
         System.out.println("\n|||ELEMENT METHOD|||\n");
        //returns the head of the deque but it does not remove from the 
        //deque
        String element=mydeque.element();
        String elementa=addfirst.element();
        String elementb=addslast.element();
        System.out.println(element);
        System.out.println(elementa);
        System.out.println(elementb);

        //******************
        //|| 7.getFirst() ||
        //------------------
         System.out.println("\n|||GETFIRST METHOD|||\n");
        //returns the first element of the deque
        //it does not remove the element from the deque

        String getfirsta=mydeque.getFirst();
        String getfirstb=addfirst.getFirst();
        String getfirstc=addslast.getFirst();
        System.out.println(getfirsta);
        System.out.println(getfirstb);
        System.out.println(getfirstc);
        //********************
        //|| 8.getLast() ||
        //------------------
         System.out.println("\n|||GETLAST METHOD|||\n");
        //returns the last element of the Deque
        //it doesnot remove the element from the deque
        String getlasta=mydeque.getLast();
        String getlastb=addfirst.getLast();
        String getlastc=addslast.getLast();
        System.out.println(getlasta);
        System.out.println(getlastb);
        System.out.println(getlastc);

        //*********************
        //|| 9.iterator() |||||
        //---------------------
         System.out.println("\n|||ITERATOR METHOD|||\n");
        //returns the iterator that have all the elements in it
        Iterator myiteratora=mydeque.iterator();
        Iterator myiteratorb=addfirst.iterator();
        Iterator myiteratorc=addslast.iterator();
        while(myiteratora.hasNext()){
            System.out.print(myiteratora.next()+" ");
        }
        System.out.println();
        while(myiteratorb.hasNext()){
            System.out.print(myiteratorb.next()+" ");
        }
        System.out.println();
        while(myiteratorc.hasNext()){
            System.out.print(myiteratorc.next()+" ");
        }


        //*******************
        //||   10.offer()  ||
        //-------------------
         System.out.println("\n|||OFFER METHOD|||\n");
        //adds the elements at the last
        mydeque.offer("egeria");
        mydeque.offer("IRIS");
        addfirst.offer("Camilla");
        addfirst.offer("Cybele");
        addslast.offer("Bamberga");
        System.out.println("\n"+mydeque);
        System.out.println(addfirst);
        System.out.println(addslast);
        //*******************
        //||11.offerFirst() ||
        //-------------------
         System.out.println("\n|||OFFER FIRST METHOD|||\n");
        Deque<String> offerfirst=new LinkedList<String>();
        offerfirst.offerFirst("Fortuna");
        offerfirst.offerFirst("Amphitrite");
        offerfirst.offerFirst("Elektra");
        offerfirst.offerFirst("Diotima");
        offerfirst.offerFirst("Eugenia");
        System.out.println(offerfirst);

        //********************
        //|| 12.offerLast() ||
        //--------------------
         System.out.println("\n|||OFFER LAST METHOD|||\n");
        Deque<String> offerlast=new LinkedList<String>();
        offerlast.offerLast("Daphne");
        offerlast.offerLast("metis");
        offerlast.offerLast("Herculina");
        offerlast.offerLast("Nemesis");
        offerlast.offerLast("Aurora");
        offerlast.offerLast("Ursula");
        System.out.println(offerlast);

        //*****************
        //|| 13.peek() ||||
        //-----------------
         System.out.println("\n|||PEEK METHOD|||\n");
        //retunrs the headelement 
        //does not remove the elementa
        //returns the null if deque was not having head
        Deque<String> nulldeque=new LinkedList<String>();
        String peeknull=nulldeque.peek();
        String peeka=mydeque.peek();
        String peekb=addfirst.peek();
        String peekc=addslast.peek();
        String peekd=offerlast.peek();
        String peeke=offerfirst.peek();
        System.out.println(peeknull);
        System.out.println(peeka);
        System.out.println(peekb);
        System.out.println(peekc);
        System.out.println(peekd);
        System.out.println(peeke);

        //********************
        //|| 14.peekFirst() ||
        //--------------------
         System.out.println("\n|||PEEKFIRST METHOD|||\n");
        //returns the first element
        //doesnot remove the element
        //returns null if not present 
        String peekfirsta=nulldeque.peekFirst();
        String peekfirstb=mydeque.peekFirst();
        String peekfirstc=addfirst.peekFirst();
        String peekfirstd=addslast.peekFirst();
        String peekfirste=offerlast.peekFirst();
        String peekfirstf=offerfirst.peekFirst();
        System.out.println(peekfirsta);
        System.out.println(peekfirstb);
        System.out.println(peekfirstc);
        System.out.println(peekfirstd);
        System.out.println(peekfirste);
        System.out.println(peekfirstf);
        //********************
        //|| 15.peekLast()  ||
        //--------------------
         System.out.println("\n|||PEEKLAST METHOD|||\n");
        //returns the last element
        //doesnot removes the last element
        //returns null if not present
        String peeklasta=nulldeque.peekLast();
        String peeklastb=mydeque.peekLast();
        String peeklastc=addfirst.peekLast();
        String peeklastd=addslast.peekLast();
        String peeklaste=offerfirst.peekLast();
        String peeklastf=offerlast.peekLast();
        System.out.println(peeklasta);
        System.out.println(peeklastb);
        System.out.println(peeklastc);
        System.out.println(peeklastd);
        System.out.println(peeklaste);
        System.out.println(peeklastf);
        //***************
        //|| 16.poll() ||
        //---------------
         System.out.println("\n|||POLL METHOD|||\n");
        //removes and returns the element
        //returns null if element is not present
        System.out.println("\nMY DEQUE BEFORE POLLING\n");
        System.out.println(mydeque);
        String polla=mydeque.poll();
        System.out.println(polla);
        System.out.println(mydeque);
        System.out.println("polling second time:"+mydeque.poll());
        System.out.println(mydeque);
        String pollb=mydeque.poll();
        System.out.println(pollb);
        System.out.println(mydeque);
        String pollc=mydeque.poll();
        System.out.println(pollc);
        System.out.println(mydeque);
        String polld=mydeque.poll();
        System.out.println(polld);
        System.out.println(mydeque);
        String polle=mydeque.poll();
        System.out.println(polle);
        System.out.println(mydeque);
        String pollf=mydeque.poll();
        System.out.println(pollf);
        //********************
        //|| 17.pollFirst() ||
        //-------------------
         System.out.println("\n|||POLLFIRST METHOD|||\n");
        //removes and returns the first element
        //returns null if not present
        System.out.println("\nADDFIRST BEFORE POLLINGFIRST\n"+addfirst);
        String pollfirsta=addfirst.pollFirst();
        String pollfirstb=addfirst.pollFirst();
        String pollfirstc=addfirst.pollFirst();
        String pollfirstd=addfirst.pollFirst();
        System.out.println(pollfirsta);
        System.out.println(addfirst);
        System.out.println(pollfirstb);
        System.out.println(addfirst);
        System.out.println(pollfirstc);
        System.out.println(addfirst);
        System.out.println(pollfirstd);
        System.out.println(addfirst);

        //*******************
        //|| 18.pollLast() ||
        //-------------------
         System.out.println("\n|||POLLLAST METHOD|||\n");
        //return and removes the last elemet
        //return null if the deque is empty
        System.out.println("\nADDSLAST BEFORE REMOVING\n"+addslast);
        String polllasta=addslast.pollLast();
        System.out.println(polllasta);
        System.out.println(addslast);
        String polllastb=addslast.pollLast();
        System.out.println(polllastb);
        System.out.println(addslast);
        String polllastc=addslast.pollLast();
        System.out.println(polllastc);
        System.out.println(addslast);
        String polllastd=addslast.pollLast();
        System.out.println(polllastd);
        System.out.println(addslast);
        String polllaste=addslast.pollLast();
        System.out.println(polllaste);
        System.out.println(addslast);
        String polllastf=addslast.pollLast();
        System.out.println(polllastf);
        System.out.println(addslast);
        String polllastg=addslast.pollLast();
        System.out.println(polllastg);
        System.out.println(addslast);
        String polllasth=addslast.pollLast();
        System.out.println(polllasth);
        System.out.println(addslast);
        //***********
        //|| 19.pop ||
        //-----------
         System.out.println("\n|||POP METHOD|||\n");
        Deque<String> popqueue=new ArrayDeque<String>();
        popqueue.add("DAVIA");
        popqueue.add("bamberga");
        popqueue.add("fortuna");
        popqueue.add("thisbe");
        String popa=popqueue.pop();
        String popb=popqueue.pop();
        String popc=popqueue.pop();
        //String popd=popqueue.pop();
        //String pope=popqueue.pop();
        System.out.println("\n"+popqueue);
        System.out.println(popa);
          System.out.println(popqueue);
        System.out.println(popb);
          System.out.println(popqueue);
        System.out.println(popc);
          System.out.println(popqueue);
        //System.out.println(popd);
          System.out.println(popqueue);
        //System.out.println(pope);


        //****************
        //|| 20.push()  ||
        //---------------
         System.out.println("\n|||PUSH METHOD|||\n");
        Deque<String> pushdeque=new ArrayDeque<String>();
        System.out.println(pushdeque);
        pushdeque.push("Ursula");
        System.out.println(pushdeque);
        pushdeque.push("Alauda");
        System.out.println(pushdeque);
        pushdeque.push("Hermione");
        System.out.println(pushdeque);
        pushdeque.push("Aletheia");
        System.out.println(pushdeque);
        pushdeque.push("palma");
        System.out.println(pushdeque);
        pushdeque.push("Lachesis");
        System.out.println(pushdeque);
        //********************
        //|| 21.remove() |||||
        //--------------------
         System.out.println("\n|||REMOVE METHOD|||\n");
        Deque<String> removequeue=new ArrayDeque<String>();
        removequeue.add("vesta");
        removequeue.add("ceres");
        removequeue.add("pallas");
        removequeue.add("juno");
        removequeue.add("europa");
        removequeue.add("IRIS");
        removequeue.add("hebe");
        System.out.println(removequeue);
        String removea=removequeue.remove();
        System.out.println(removea);
        System.out.println(removequeue);
        String removeb=removequeue.remove();
        System.out.println(removeb);
        System.out.println(removequeue);
        String removec=removequeue.remove();
        System.out.println(removec);
        System.out.println(removequeue);
        String removed=removequeue.remove();
        System.out.println(removed);
        System.out.println(removequeue);
        String removee=removequeue.remove();
        System.out.println(removee);
        System.out.println(removequeue);
        String removef=removequeue.remove();
        System.out.println(removef);
        System.out.println(removequeue);
        //REMOVE SEPCIFIC ITEM 
        Deque<String> removespecific=new ArrayDeque<String>();
        removespecific.add("SCRUM");
        removespecific.add("KANBAN");
        removespecific.add("JENKINS");
        removespecific.add("DOCKER");
        removespecific.add("PUPPET");
        removespecific.add("APACHE MAVEN");
        removespecific.add("GRADLE");
        removespecific.add("circleci");
        removespecific.add("TEAMCITY");
        removespecific.add("KUBERNETES");
        System.out.println(removespecific);
        removespecific.remove("KANBAN");
        System.out.println(removespecific);
        removespecific.remove("SCRUM");
        System.out.println(removespecific);
        removespecific.remove("JENKINS");
        System.out.println(removespecific);
        removespecific.remove("DOCKER");
        System.out.println(removespecific);
        removespecific.remove("APACHE MAVEN");
        System.out.println(removespecific);
        removespecific.remove("PUPPET");
        System.out.println(removespecific);
        removespecific.remove("circleci");
        System.out.println(removespecific);
        removespecific.remove("GRADLE");
        System.out.println(removespecific);
        removespecific.remove("TEAMCITY");
        System.out.println(removespecific);
        
        //**********************
        //|| 22.removeFirst() ||
        //----------------------
         System.out.println("\n|||REMOVE FIRST METHOD|||\n");

        Deque<String> removefirste=new ArrayDeque<String>();
        removefirste.add("APACHE HADOOP");
        removefirste.add("APACHE HBASE");
        removefirste.add("APACHE KAFKA");
        removefirste.add("APACHE HIVE");
        removefirste.add("APACHE LOG4J");
        removefirste.add("APACHE MINA");
        removefirste.add("APACHE PIG");
        removefirste.add("APACHE MESOS");
        removefirste.add("APACHE OODT");
        removefirste.add("APACHE OOZIE");
        removefirste.add("APACHE OPENNLP");
        removefirste.add("APACHE PDFBOX");
        removefirste.add("APACHE PIVOT");
        System.out.println(removefirste);
        removefirste.removeFirst();
        System.out.println(removefirste);
        String removefirsta=removefirste.removeFirst();
        System.out.println(removefirsta);
        System.out.println(removefirste);

        String removefirstb=removefirste.removeFirst();
        String removefirstc=removefirste.removeFirst();
        String removefirstd=removefirste.removeFirst();
        String removefirstf=removefirste.removeFirst();
        String removefirstg=removefirste.removeFirst();
        String removefirsth=removefirste.removeFirst();
        String removefirsti=removefirste.removeFirst();
        String removefirstj=removefirste.removeFirst();
        String removefirstk=removefirste.removeFirst();
        String removefirstl=removefirste.removeFirst();
        String removefirstm=removefirste.removeFirst();

        System.out.println(removefirstb);
        System.out.println(removefirste);
         System.out.println(removefirstc);
        System.out.println(removefirste);
         System.out.println(removefirstd);
        System.out.println(removefirste);
         System.out.println(removefirstf);
        System.out.println(removefirste);
         System.out.println(removefirstg);
        System.out.println(removefirste);
         System.out.println(removefirsth);
        System.out.println(removefirste);
         System.out.println(removefirsti);
        System.out.println(removefirste);
          System.out.println(removefirstj);
        System.out.println(removefirste);
          System.out.println(removefirstk);
        System.out.println(removefirste);
          System.out.println(removefirstl);
        System.out.println(removefirste);
          System.out.println(removefirstm);
        System.out.println(removefirste);


        //*****************************
        // 23.removeFirstOccurrence() ||
        //-----------------------------
         System.out.println("\n|||REMOVE FIRST OCCURRENCE METHOD|||\n");
        Deque<String> removefirstocc=new ArrayDeque<String>();
        removefirstocc.add("APACHE SPARK");
        removefirstocc.add("APACHE WICKET");
        removefirstocc.add("APACHE SPARK");
        removefirstocc.add("HADOOP");
        removefirstocc.add("APACHE SPARK");
        System.out.println(removefirstocc);
        removefirstocc.removeFirstOccurrence("APACHE SPARK");
        System.out.println(removefirstocc);
        //*********************
        //|| 24.removeLast() ||
        //---------------------
         System.out.println("\n|||REMOVE LAST METHOD|||\n");
        Deque<String> removelasta=new ArrayDeque<String>();
        removelasta.add("GOOGLE GSON");
        removelasta.add("GUAVA");
        removelasta.add("GUICE");
        removelasta.add("APACHE TOMCAT");
        removelasta.add("TIKA");
        System.out.println(removelasta);
        String removelastb=removelasta.removeLast();
        System.out.println(removelastb);
        System.out.println(removelasta);
        String removelastc=removelasta.removeLast();
        System.out.println(removelastc);
        System.out.println(removelasta);
        String removelastd=removelasta.removeLast();
        System.out.println(removelastd);
        System.out.println(removelasta);
        //******************************
        //|| 25.removeLastOccurrence() ||
        //-------------------------------
         System.out.println("\n|||REMOVE LAST OCCURRENCE METHOD|||\n");
        Deque<String> removelastocc=new ArrayDeque<String>();
        removelastocc.add("kafka");
        removelastocc.add("hadoop");
        removelastocc.add("kafka");
        removelastocc.add("hadoop");
        removelastocc.add("kafka");
        removelastocc.removeLastOccurrence("kafka");
        System.out.println(removelastocc);
        removelastocc.removeLastOccurrence("hadoop");
        System.out.println(removelastocc);

        //****************
        //||  26.size() ||
        //----------------

        System.out.println("\n|||SIZE METHOD|||\n");

        Deque<String> sized=new ArrayDeque<String>();
        sized.add("APACHE NUTCH");
        sized.add("APACHE AVALON");
        sized.add("APACHE ACTIVE MQ");
        sized.add("APACHE AVRO");
        sized.add("APACHE AXIS");
        sized.add("APACHE CAMEL");
        sized.add("APACHE CLICK");
        sized.add("APACHE COMMONS");
        sized.add("APACHE CXF");
        sized.add("APACHE EMPIRE DB");
        sized.add("APACHE FELIX");
        sized.add("APACHE FLUME");
        sized.add("APACHE GERONIMO");
        sized.add("APACHE GIRAPH");
        sized.add("APACHE HADOOP");
        sized.add("APACHE HBASE");
        sized.add("APACHE HIVE");
        sized.add("APACHE JACKRABBIT");
        sized.add("APACHE JENA");
        sized.add("APACHE KAFKA");
        sized.add("APACHE LOG4J");
        sized.add("APACHE LUCENE");
        sized.add("APACHE MAHOUT");
        sized.add("APACHR MESOS");
        int sizedsize=sized.size();
        System.out.println("\nsize is:"+sizedsize);

     
	}

}

