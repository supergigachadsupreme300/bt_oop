public class Excute {
    public static void main(String args[]) {
        System.out.println(Student.getCollege());
        Student a = new Student();
        a.xuat();
        Student.setCollege("CNTP");
        System.out.println(Student.getCollege());
        Student b = new Student();
        System.out.println(Student.getCollege());
    }
}