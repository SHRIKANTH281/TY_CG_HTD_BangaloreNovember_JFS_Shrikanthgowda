
public class Student {
int studId;
String StudName;
public Student(int studId, String studName) {
	super();
	this.studId = studId;
	StudName = studName;
}
@Override
public String toString() {
	return "Student [studId=" + studId + ", StudName=" + StudName + "]";
}

}
