public class Main {
    public static void main(String[] args) {
//        ArrayListOfStudents arrayListOfStudents = new ArrayListOfStudents();
//        arrayListOfStudents.add(new Student("Vardan", "Ohanyan", 19));
//        arrayListOfStudents.add(new Student("Tiko", "Yengibarov", 22));
//        arrayListOfStudents.add(new Student("Marat", "Hovsepyan", 25));
//        arrayListOfStudents.add(new Student("Artur", "Sahakyan", 27));
        Student[] students = new Student[]{
                new Student("Vardan", "Ohanyan", 19),
                new Student("Tiko", "Yengibarov", 22),
                new Student("Marat", "Hovsepyan", 25),
                new Student("Artur", "Sahakyan", 27)
        };
        Student[] students1 = new Student[]{
                new Student("Garnik", "Ghazaryan", 19),
                new Student("Karen", "Aveyan", 22),
                new Student("Eric", "Cartman", 25),
                new Student("Kyle", "Broflowski", 27)
        };
        StudentsInitializer studentsInitializer = new StudentsInitializer();
        studentsInitializer.initializeArrayListOfStudents(students);
        studentsInitializer.initializeLinkedListOfStudents(students1);
        studentsInitializer.showAllStudents();



    }
}
