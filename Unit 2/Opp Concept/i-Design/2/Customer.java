public class Customer {
    private String customerName;
    private String customerEmail;
    private String customerType;
    private String customerLocation;
    
    // fill the code
    
    public Customer(String n, String e, String t, String l){
    customerName = n;
    customerEmail = e;
    customerType = t;
    customerLocation = l;
    }
    
    public String getCustomerName() {
    return customerName;
    }
    
    public String getCustomerEmail() {
    return customerEmail;
    }
    
    public String getCustomerType() {
    return customerType;
    }
    
    public String getCustomerLocation() {
    return customerLocation;
    }
}