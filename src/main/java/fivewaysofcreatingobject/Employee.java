package fivewaysofcreatingobject;

public class Employee {
String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Employee(){}
public Employee(int age){}

@Override
	public String toString() {
		return this.name;
	}

}
