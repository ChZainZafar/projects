public class Student {
    String name;
    private String phoneNo;
    int age;

    public void setPhoneNo(String pn) {
        phoneNo = "Phone no: " + pn;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    Student(String n, String p, int a) {
        name = n;
        phoneNo = p;
        age = a - 3;
    }

    Student() {

    }
}
