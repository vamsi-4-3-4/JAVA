package vamsi;
class AtomicNumber{
  //THIS IS WHAT WE CALL AS EARLY INITIALIZATION 
  private static final AtomicNumber atomicnumber=new AtomicNumber();
  private AtomicNumber(){
    System.out.println("TRICKY found new element in MARS");
    System.out.println("Atomic number was allocated to the newly found element");
  }
  public static AtomicNumber setNumber(){
    return atomicnumber;
  }
}
public class eagerinitialization {

  public static void main(String[] args) {
  AtomicNumber.setNumber();
  AtomicNumber.setNumber();
  AtomicNumber.setNumber();
   
  }
}
