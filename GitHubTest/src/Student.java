
public class Student {
String name;
double gebJahr;
int ects;
public Student(String name, double gebJahr, int ects) {
	super();
	this.name = name;
	this.gebJahr = gebJahr;
	this.ects = ects;
}
public int getEcts() {
	return ects;
}

public double getAlter() {
	return 2019 - gebJahr;
}

}
