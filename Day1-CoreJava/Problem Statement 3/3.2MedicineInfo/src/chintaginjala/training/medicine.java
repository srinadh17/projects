package chintaginjala.training;

public class medicine{
public void displayLabel(){
System.out.println("Company : Qualitek Pharma");
System.out.println("Address : Hyderabad");
}
}
class Tablet extends medicine{
	 
public void displayLabel(){
System.out.println("store in a cool dry place");
}
}class Syrup extends medicine{

public void displayLabel(){
System.out.println("Consumption as directed by thephysician");
}
}
class Ointment extends medicine{
public void displayLabel(){
System.out.println("for external use only");
}
}