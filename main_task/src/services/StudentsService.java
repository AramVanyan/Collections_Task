package services;

import custom_implementations.*;
import main.Student;

public class StudentsService {
    private ArrayListOfStudents arrayListOfStudents = new ArrayListOfStudents();
    private LinkedListOfStudents linkedListOfStudents = new LinkedListOfStudents();

    public void initializeArrayListOfStudents(Student... students) {
        for (int i = 0; i < students.length; i++) {
            arrayListOfStudents.add(students[i]);
        }
    }

    public void initializeLinkedListOfStudents(Student... students) {
        for (int i = 0; i < students.length; i++) {
            linkedListOfStudents.addLast(students[i]);
        }
    }

    public void showAllStudents() {
        System.out.println(arrayListOfStudents);
        System.out.println(linkedListOfStudents);
    }
}
