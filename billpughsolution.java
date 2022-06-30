

//this method does not use a synchronization technique 
//and the eager initialization 

public class AtomicNumbers{
  private AtomicNumbers(){
    System.out.println("TRICKY FOUND NEW ELEMENT IS MARS");
    System.out.println("Atomic number allocated");
  }
  private static class Allocater{
    private static final AtomicNumbers atomicnumber=new AtomicNumbers();
    
    //we never access the setNumber() until the Allocater 
    //was called internally 
    public static AtomicNumbers setNumber(){
      return Allocater.atomicnumber;
    }

    
  }
}

public class Program {

  public static void main(String[] args) {
   
  AtomicNumbers.setNumber();
   
  }
}

