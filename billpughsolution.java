package vamsi;

//this method does not use a synchronization technique 
//and the eager initialization 

class AtomicNumbers{
  private AtomicNumbers(){
    System.out.println("TRICKY FOUND NEW ELEMENT IS MARS");
    System.out.println("Atomic number allocated");
  }
  private static class Allocater{
    private static final AtomicNumbers atomicnumber=new AtomicNumbers();
    
    //we never access the setNumber() until the Allocater 
    //was called internally 
    public static AtomicNumbers setNumber(){
      return Allocater.setNumber();
    }
  }
}

public class billpughsolution {

  public static void main(String[] args) {
   AtomicNumber.setNumber();
  }
}
