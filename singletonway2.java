//This is the second way to create the single ton design pattern
// the main problem with this type of implementation is 
//this is not a thread sefe approach it works better in the single thread environments 
//it  doesn`t works better  in multithreaded environments
class AtomicNumber{
    private static AtomicNumber atomicnumber;
    private AtomicNumber(){}
    public static AtomicNumber setNumber(){
        if(atomicnumber==null){
            atomicnumber=new AtomicNumber();
            System.out.println("TRICKY found new element in MARS");
            System.out.println("Atomic number is allocated for the no new element");
        }
        else{
            System.out.println("we have already allocated atomic number for new element");
        }
        return atomicnumber;
    }
    
} 
public class Program
{

    public static void main(String[] args) {
        
        AtomicNumber.setNumber();
        AtomicNumber.setNumber();
        AtomicNumber.setNumber();
        
    }
}
