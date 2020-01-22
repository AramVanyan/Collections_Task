public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private int age;
    private Student previousStudent;
    private Student nextStudent;

    public Student getPreviousStudent() {
        return previousStudent;
    }

    public void setPreviousStudent(Student previousStudent) {
        this.previousStudent = previousStudent;
    }

    public Student getNextStudent() {
        return nextStudent;
    }

    public void setNextStudent(Student nextStudent) {
        this.nextStudent = nextStudent;
    }

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + age;
    }

    @Override
    public int compareTo(Student s) {
        return this.lastName.compareTo(s.getLastName());
    }

    @Override
    public boolean equals(Object s) {
        Student tempStudent = (Student) s;

        if (s == this) {
            return true;
        }
        if (this.firstName != tempStudent.firstName) {
            return false;
        }
        if (this.lastName != tempStudent.lastName) {
            return false;
        }
        if (this.age != tempStudent.age) {
            return false;
        }
        return true;
    }


}
