

public class Main {

    int number;
    String name;

    public Main(int value, String student_name) {

        number = value;
        name = student_name;

    }

    public static void main(String[] agrs){

        Main main = new Main(12,"Konik");

        System.out.println("Number and name is :"+ main.number + " and "+main.name);

        StudentName studentName = new StudentName();

        studentName.studentInfo();
        System.out.println("name is : "+studentName.Fname);
        System.out.println("Age is : "+studentName.age);
        System.out.println("name is : "+studentName.GraduationYear);


        Person person = new Person();

        person.setName("Konik");
        person.setAge(26);

        System.out.println("fname is : "+person.getName());
        System.out.println("Age is : "+person.getAge());


    }
}