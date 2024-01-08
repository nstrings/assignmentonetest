public class Manufacturer{
// instance variables
private String companyName;
private Address companyAddress;

// default constructor
public Manufacturer(){
  this.companyName = "";
  this.companyAddress = null;
 }
  //second
//last
// parameterized constructor
public Manufacturer(String compName, Address address){
  this.companyName = compName;
  this.companyAddress = address;
  }

// to get the name of the manufacturer company
public String getCompanyName(){
  return companyName;
  }

// to set the name of the manufacturer company
public void setCompanyName(String companyName){
  this.companyName = companyName;
  }

// to get the Address object
public Address getCompanyAddress(){
  return companyAddress;
  }

// to set the Address object
public void setCompanyAddress(Address address){
  this.companyAddress = address;
  }
}