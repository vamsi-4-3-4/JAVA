//************************************************
//|||||||| SINGLE TON DESIGN PATTERN |||||||||||||
//------------------------------------------------
//GANG OF FOUR DEFINITION OF SINGLETONDESIGN PATTERN:gang of four described that class must have only one instance
//we need to provide the global access point to it
//IN THE SINGLE TON PATTERN WE SHOULD NOT CREATE MULTIPLE INSTANCES IN THE CLASS WE SHOULD ONLY USE THE EXISTING INSTANCES OF THE CLASS
//SINGLE TON PATTERN DOES NOT ALLOW US TO CREATE MULTIPLE OBJECTS
final class AtomicNumber{
    private static AtomicNumber atomicnumber;
    private AtomicNumber(){}
    public static synchronized AtomicNumber getAtomicNumber(){
        if(atomicnumber==null){
            atomicnumber=new AtomicNumber();
            System.out.println("ATOMIC NUMBER IS ALLOCATED FOR THE NEWLY DISCOVERED ELEMENT");
        }else{
            System.out.println("YOU SHOULD NOT ALLOWED TO CHANGE OR NEWLY CREATE THE ATOMIC NUMBER");
        }
        return atomicnumber;
    }
}
class Main{
    public static void main(String[] args){
        System.out.println("SINGLE TON PATTERN");
    //trying to create the new atomic number for the already allocated on below statements 
        //AtomicNumber number=new AtomicNumber();//THIS LINE SHOWS THE BELOW ERROR
        //OUTPUT:Main.java:31: error: AtomicNumber() has private access in AtomicNumber
        AtomicNumber numberone=AtomicNumber.getAtomicNumber();
        //AtomicNumber.getAtomicNumber();
        //OUTPUT OF THE ABLOVE STATEMENT 
        //SINGLE TON PATTERN 
        //TRYING TO CREATE THE NEW ATOMIC NUMBER FOR ALREADY ALLOCATED ONE
        //ATOMIC NUMBER IS ALLOCATED FOR THE NEWLY DISCOVERED ELEMENT
        //CREATING THE ANOTHER INSTANCE TO CONFIRM THAT WE ARE ACCESSING THE EXISTING PARAMETER OF THE class 
        AtomicNumber numbertwo=AtomicNumber.getAtomicNumber();
        //AtomicNumber.getAtomicNumber();
        
    }
}
