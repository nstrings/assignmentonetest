public class Address{
// instance variables: set up the variables for the address info
  private String street, city, state, zip;

// parameterized constructor: declare the variables to add user data
public Address(String str, String city, String st, String zip){
    this.street = str;
    this.city = city;
    this.state = st;
    this.zip = zip;
  }

// to get the street name
public String getStreet(){
  return street;
  }

// to get the city name
public String getCity(){
  return city;
  }

// to get the state name
public String getState(){
  return state;
  }

// to get the zip code
public String getZip(){
  return zip;
  }
}