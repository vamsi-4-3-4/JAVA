//METHOD OVERLOADING 
class Network{
    void buildNetwork(){
        System.out.println("NETWORK IS NOT PLANNED");
    }
    
    //OVERLOADING THE ABOVE METHOD WITH ONE PARAMETER
    void buildNetwork(String yourcity){
        System.out.println("NETWORK IS PLANNED FOR YOUR "+yourcity+" CITY");
    }
    //OVERLOADING THE ABOVE METHOD WITH 2 PARAMETERS
    void buildNetwork(String yourcity,int yourspeed){
        System.out.println("NETWORK IS PLANNED FOR YOUR "+yourcity+" CITY WITH "+yourspeed+"MBPS DATARATE");
    }
    //OVERLOADING THE ABOVE METHOD WITH 3 PARAMETERS
    void buildNetwork(String yourcity,int yourspeed,String link){
        System.out.println(link+" NETWORK IS PLANNED FOR YOUR "+yourcity+" CITY WITH "+yourspeed+"MBPS DATARATE");
    }
    //WE CAN OVERLOAD THE FOR REQUIRED NUMBER OF TIMES 
    //HERE THE MAIN ADVANTAGE OF THE METHOD OVERLOADING IS IT REDUCES THE OVERHEAD OF WRITING THE  SAME CODE WITH LITTLE
    //MODIFICATIONS AND THE UPDATIONS FOR MANY TIMES
    //METHOD OVERLOADING IMPROVES THE REUSABILITY OF THE METHOD THAT WE IMPLEMENT
}

public class Main
{
	public static void main(String[] args) {
		//CREATING THE CLASS OBJECT AND PASSING THE PARAMETERS TO THE METHODS
		//class name is Network 
		//object name is net
		//new is the keyword in java which is used to create the required things like objects,Arrays etc etc 
//.operator is used to access the methods and the variables
		Network net=new Network();
		
		//calling the buildNetwork method with the object net 
		net.buildNetwork();
		//OUTPUT:NETWORK IS NOT PLANNED
		net.buildNetwork("CHENNAI");
		//OUTPUT:NETWORK IS PLANNED FOR YOUR CHENNAI CITY
		net.buildNetwork("CHENNAI",100);
		//OUTPUT:NETWORK IS PLANNED FOR YOUR CHENNAI CITY WITH 100MBPS
		net.buildNetwork("CHENNAI",100,"OPTICAL");
		//OUTPUT:OPTICAL NETWORK IS PLANNED FOR YOUR CHENNAI CITY WITH 100MBPS
		
	
	}
}
