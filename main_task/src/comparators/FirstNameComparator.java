package comparators;

import java.util.Comparator;
import main.Student;

public class FirstNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getFirstName().compareTo(s2.getFirstName());
    }
}
