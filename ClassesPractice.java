
public class ClassesPractice {
    public static void main(String[] args) {

        Student s1 = new Student("n", "p", 15);

        Student s2 = new Student();
        s2.name = "Maham";
        s2.age = 13;
        s2.setPhoneNo("03008897009");

        System.out.println(s1.name + "  " + s1.age);
        System.out.println(s2.name + "  " + s2.age);
    }
}
