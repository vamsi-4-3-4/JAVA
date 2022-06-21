//**********************************
//||||| JAVA CRYPTOGRAPHY ||||||||||
//----------------------------------
//JAVA CRYPTOGRAPHY ARCHITECTURE ALSO KNOWN AS JCA FRAMEWORK PROVIDES THE
//VARIOUS CRYPTOGRAPHY ALGORITHMS AND PRIMITIVES
//--------------------------------------------------------------------
//THE METHODS RELATED TO THE CRYPTOGRAPHY WAS AVILABLE ON THE 
//java.security 
//PACKAGE
//--------------------------------------------------------------------
//IN THE JAVA WE CAN HAVE THE BASIC AND IMPORTANT SECURITY NEEDS SUCH AS
//AUTHENTICATION
//ACCESS CONTROL
//PUBLIC KEY INFRASTRUCTURE
//LANGUAGE SAFETY
//SECURE COMMUNICATION
//-----------------------------------------------------------------------
//JCA PROVIDES THE FOLLOWING API
//1)DIGITAL SIGNATURES
//2)HASH FUNCTIONS
//3)VALIDATION CERTIFICATES
//4)ENCRYPTION ALGORITHMS AND ENCRYPTION PRIMITIVES
//5)CRYPTOGRAPHY KEY GENERATION FUNCTIONS
//6)KEYMANAGEMENT
//7)RANDOM NUMBER GENERATING ALGORITHMS
//ETC 
//---------------------------------------------------------------------
//JCA PROVIDES THE FOLLOWING PACKAGES 
//1)java.security
//2)java.crypto 
//3)java.crypto.spec 
//4)java.crypto.interfaces 
//-------------------------------------------------------------------------


import java.security.KeyPair;
//builds a key pair from the provides public key and private key
import java.security.KeyPairGenerator;
//KEY PAIR GENERATOR IS THE CLASS WHICH 
//GENERATES THE 
//1)PUBLIC KEYS 
//2)PRIVATE KEYS 
import java.security.Signature;
//signature class provides the digital Signature algorithm

import javax.crypto.Cipher;
//Cipher class provides the Cipher for the 
//encryption and decryption

public class Program
{
    public static void main(String[] args)throws Exception {
        //CREATE AN INSTANCE FOR SIGNATURE
        Signature mysignature=Signature.getInstance("SHA256withRSA");
        
        //getInstance()
method returns the cipher object with that cipher object we can do required encryption on the data
        
        System.out.println("MY SIGNATURE");
        System.out.print(mysignature);
        //CREATE AN INSTANCE AS GENERATOR FOR A PAIR KEY
        KeyPairGenerator keypairgen=KeyPairGenerator.getInstance("RSA");
        System.out.println("KEY PAIR GENERATOR");
        System.out.println(keypairgen);
        //SPECIFY THE SIZE
        keypairgen.initialize(2048);
      //intialize(####)intializes the KeyPairGenerator with the specified keysize
      
        System.out.println("KEY PAIR GENERATOR SIZE");
        System.out.println(keypairgen);
        //CREATE A KEY PAIR INSTANCE
        KeyPair pair=keypairgen.generateKeyPair();
        //generatesakeypair
        System.out.println(pair);
        //SPECIFY THE ALGORITHM AS INSTANCE
        
        Cipher algorithm=Cipher.getInstance("RSA/ECB/PKCS1Padding");
        
        System.out.println("ALGORITHM");
        System.out.println(algorithm);
        //CHOOSE THE MODE ENCRYPTION AND THE DECRYPTION
        algorithm.init(Cipher.ENCRYPT_MODE,pair.getPublic());
        System.out.println("ALGORITHM");
        System.out.println(algorithm);
        //CHOOSE THE TEXT WILL BE ENCRYPTED
        byte[] input="vamsi".getBytes();
        algorithm.update(input);
        System.out.println("ALGORITHM");
        System.out.println(algorithm);
        byte[] encrypted=algorithm.doFinal();
        System.out.println("ENCRYPTED TEXT");
        System.out.println(new String(encrypted,"UTF-8"));

    }
}
