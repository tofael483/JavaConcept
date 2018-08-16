package packpak;

public class Car {
//Variables	
int CarID;
String CarModel;
String CarMake;
int ColorCode;
char CarClass;

//Constructor 1
public Car () {
	System.out.println("\nThis person dosen't own a car\n");
}
//Constructor 2
public Car (int CarID, String CarModel, String CarMake, int ColorCode, char CarClass) {
	System.out.println(CarID+"  "+CarModel+"  "+CarMake+"  "+ColorCode+"  "+CarClass);
}
//Constructor 3
public Car (String CarModel, String CarMake, int ColorCode) {
	System.out.println(CarModel+"  "+CarMake+"  "+ColorCode+"  No CarID found");
}
//Constructor 4
public Car (int CarID, String CarModel, String CarMake) {
	System.out.println("CarNo: "+CarID+"  "+"CarName: "+CarMake+" , "+CarModel);
}
//Method 1 (Void/No Return)
public void displayCarModel(String CarModel) {
	System.out.println("The Model of this car is: "+CarModel);
}
//Method 2 (Return)
public int GenerateSerialNo(int CarId, int ColorCode) {
	int result = CarId + ColorCode;
	return result;
}
//Method 3 (Void/No Return)
public void CarMilage() {
	System.out.println("This is a new car");
}
//Method 4 (Void/No Return)
public void CarMake(String CarMake) {
	System.out.println("We are the largest car provider in the world: "+CarMake);	
}
}
