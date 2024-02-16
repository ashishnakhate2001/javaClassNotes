public class Address{
    //fill the code here
    String street;
    String city;
    int pincode;
    String country;
    
    Address(String s, String c,String ctt, int p){
    street = s;
    city = c;
    pincode = p;
    country = ctt;
    }
    
    void displayAddress(){
    System.out.println("Street: "+street);
    System.out.println("City: "+city);
    System.out.println("Pincode: "+pincode);
    System.out.println("Country:"+ country);
    }
    }