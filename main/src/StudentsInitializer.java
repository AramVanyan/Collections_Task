public class StudentsInitializer {
    private ArrayListOfStudents arrayListOfStudents = new ArrayListOfStudents();
    private LinkedListOfStudents linkedListOfStudents = new LinkedListOfStudents();

    void initializeArrayListOfStudents(Student... students) {
        for (int i = 0; i < students.length; i++) {
            arrayListOfStudents.add(students[i]);
        }
    }

    void initializeLinkedListOfStudents(Student... students) {
        for (int i = 0; i < students.length; i++) {
            linkedListOfStudents.addLast(students[i]);
        }
    }

    void showAllStudents() {
        System.out.println(arrayListOfStudents);
        System.out.println(linkedListOfStudents);
    }
}
