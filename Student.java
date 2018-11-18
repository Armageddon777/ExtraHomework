public class Student {
    String name;
    char grade;


    public Student(String nnn, char ggg) {
        name = nnn;
        System.out.println(nnn);
        grade = ggg;
        System.out.println(ggg);
    }

    String getName() {
        return name;
    }

    char getGrade () {
        return grade;
    }
}
