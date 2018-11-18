public class Main {

    public static void main(String[] args) {
        Person xPerson = new Person("Martin", 5);
        String perrson = xPerson.Perrson();
        System.out.println(perrson);
        int getage = xPerson.getAge();
        System.out.println(getage);

        Sport mySport = new Sport("Football", "active");
        String strStemn = mySport.strongStatement();
        System.out.println(strStemn);
        String typee = mySport.getType();
        System.out.println(typee);

        Student myStudent = new Student("Martin", 'A');
        String name = myStudent.getName();
        System.out.println(name);
        char grade = myStudent.getGrade();
        System.out.println(grade);

        int num = 6;
        long factorial = Factorial.multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
}
