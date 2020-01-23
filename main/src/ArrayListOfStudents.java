public class ArrayListOfStudents {
    private int initialCapacity;
    private int indexOfTop = -1;
    private Student[] students;

    public ArrayListOfStudents(int initialCapacityOfArray) {
        initialCapacity = initialCapacityOfArray;
        students = new Student[initialCapacity];
    }

    public ArrayListOfStudents(ArrayListOfStudents anotherArrayListOfStudents) {
        this.initialCapacity = anotherArrayListOfStudents.initialCapacity;
        students = new Student[initialCapacity];
        for (int i = 0; i < students.length; i++) {
            students[i] = anotherArrayListOfStudents.students[i];
        }
    }

    public ArrayListOfStudents() {
        initialCapacity = 10;
        students = new Student[initialCapacity];
    }


    public boolean add(Student s) {
        checkForAvailableCapacity();
        students[++indexOfTop] = s;
        return true;
    }

    private void checkForAvailableCapacity() {
        Student[] tempArrayOfStudents = null;
        if (indexOfTop == initialCapacity - 1) {
            tempArrayOfStudents = new Student[2 * initialCapacity];
            for (int i = 0; i < students.length; i++) {
                tempArrayOfStudents[i] = students[i];
            }
            students = tempArrayOfStudents;
            initialCapacity *= 2;
        }
    }


    public boolean remove(Student s) {
        int indexOfFirstOccurrence = -1;
        Student[] tempStudents = new Student[initialCapacity];
        int sizeOfTempArray = -1;

        for (int i = 0; i <= indexOfTop; i++) {
            if (students[i].equals(s)) {
                indexOfFirstOccurrence = i;
                break;
            }
        }
        if (indexOfFirstOccurrence == -1) {
            return false;
        }
        if (indexOfFirstOccurrence == 0) {
            for (int i = indexOfFirstOccurrence + 1; i <= indexOfTop; i++) {
                tempStudents[++sizeOfTempArray] = students[i];
            }
        } else if (indexOfFirstOccurrence == indexOfTop) {
            for (int i = 0; i < indexOfFirstOccurrence; i++) {
                tempStudents[++sizeOfTempArray] = students[i];
            }
        } else {
            for (int i = 0; i < indexOfFirstOccurrence; i++) {
                tempStudents[++sizeOfTempArray] = students[i];
            }
            for (int i = indexOfFirstOccurrence + 1; i <= indexOfTop; i++) {
                tempStudents[++sizeOfTempArray] = students[i];
            }
        }
        students = tempStudents;
        indexOfTop--;
        return true;
    }

    public int size() {
        return indexOfTop + 1;
    }

    public Student get(int index) {
        if (index >= 0 && index <= indexOfTop) {
            return students[index];
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i <= this.indexOfTop; i++) {
            output.append(students[i].getLastName()).append(" ").append(students[i].getFirstName())
                                                    .append(" ").append(students[i].getAge()).append("\n");
        }
        return output.toString();
    }
}
