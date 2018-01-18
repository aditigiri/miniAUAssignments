package Annotation;

@interface Student{
	String stud_name();
	int roll_no();
}



public class AnnotationClass {
	public static void main(String args[]) {
	}
	@Student(roll_no=62,stud_name="AditiGiri")
	public String toString() {
		return "Overriden toString method";
	}

}
