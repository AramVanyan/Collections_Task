public class LinkedListOfStudents {
    private Student currentStudent;
    private Student headOfStudents;
    private int size = 0;


    public void push(Student s) {
        if (size == 0) {
            headOfStudents = s;
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
        if (size == 0) {
            headOfStudents = s;
            size++;
            return true;
        }
        currentStudent = headOfStudents;
        while (currentStudent.getNextStudent() != null) {
            currentStudent = currentStudent.getNextStudent();
        }
        currentStudent.setNextStudent(s);
        currentStudent.getNextStudent().setPreviousStudent(currentStudent);
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
        currentStudent = headOfStudents;
        while (currentStudent.getNextStudent() != null) {
            currentStudent = currentStudent.getNextStudent();
        }
        tempStudent = currentStudent;
        currentStudent.getPreviousStudent().setNextStudent(null);
        currentStudent.setPreviousStudent(null);
        size--;
        return tempStudent;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        currentStudent = headOfStudents;
        StringBuilder output = new StringBuilder();


        while (currentStudent != null) {
            output.append(currentStudent.getLastName()).append(" ").append(currentStudent.getFirstName())
                                                       .append(" ").append(currentStudent.getAge()).append("\n");
            currentStudent =  currentStudent.getNextStudent();
        }
        currentStudent = headOfStudents;
        return output.toString();
    }
}
