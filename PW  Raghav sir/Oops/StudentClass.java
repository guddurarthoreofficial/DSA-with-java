public class StudentClass {

    //creatin new data type 
    public static class Student {
        String name;
        int rollnumber;
        double percent;
    }

    public static void main(String[] args) {
        // creating object 
        Student s1 = new Student();

        s1.name = "Guddu Kumar";
        s1.rollnumber = 11222776;
        s1.percent = 45.5d;
        System.out.println(s1.name);



        // object  = real life Entity 
        Student s2 = new Student();
        s2.name = "Shivam Kumar";
        s2.rollnumber = 1122249;
        s2.percent = 97.5d;
        System.out.println(s2.name);
    }
}