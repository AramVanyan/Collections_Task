package custom_implementations;
import main.Student;

public class LinkedListOfStudents {
    private Student tailStudent;
    private Student headOfStudents;
    private int size = 0;


    public void push(Student s) {
        if (s == null) {
            return;
        }
        if (size == 0) {
            headOfStudents = s;
            tailStudent = headOfStudents;
            size++;
            return;
        }
        s.setNextStudent(headOfStudents);
        s.setPreviousStudent(null);
        headOfStudents.setPreviousStudent(s);
        headOfStudents = s;
        size++;
    }

    public Student pop() {
        Student tempStudent = headOfStudents;

        if (size == 1) {
            headOfStudents = null;
            tailStudent = null;
            size--;
            return tempStudent;
        }
        if (size == 0) {
            return null;
        }
        headOfStudents = headOfStudents.getNextStudent();
        headOfStudents.setPreviousStudent(null);
        size--;
        return tempStudent;
    }

     public boolean addLast(Student s) {
        if (s == null) {
            return false;
        }
        if (size == 0) {
            headOfStudents = s;
            tailStudent = headOfStudents;
            size++;
            return true;
        }
        tailStudent.setNextStudent(s);
        tailStudent.getNextStudent().setPreviousStudent(tailStudent);
        tailStudent = s;
        size++;
        return true;
    }

    public Student removeLast() {
        Student tempStudent = null;

        if (size == 1) {
            tempStudent = headOfStudents;
            headOfStudents = null;
            size--;
            return tempStudent;
        }
        if (size == 0) {
            return null;
        }
        tempStudent = tailStudent;
        Student previousStudent = tailStudent.getPreviousStudent();
        tailStudent.getPreviousStudent().setNextStudent(null);
        tailStudent.setPreviousStudent(null);
        tailStudent = previousStudent;
        size--;
        return tempStudent;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        Student currentStudent = headOfStudents;
        StringBuilder output = new StringBuilder();

        while (currentStudent != null) {
            output.append(currentStudent.getLastName()).append(" ").append(currentStudent.getFirstName())
                                                       .append(" ").append(currentStudent.getAge()).append("\n");
            currentStudent =  currentStudent.getNextStudent();
        }
        return output.toString();
    }
}
