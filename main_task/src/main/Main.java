package main;

import custom_implementations.*;
import comparators.*;
import services.StudentsService;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        //test of custom arrayList
//
//        ArrayListOfStudents arrayListOfStudents = new ArrayListOfStudents();
//        arrayListOfStudents.add(new Student("Vardan", "Ohanyan", 19));
//        arrayListOfStudents.add(new Student("Tiko", "Yengibarov", 22));
//        arrayListOfStudents.add(new Student("Marat", "Hovsepyan", 25));
//        arrayListOfStudents.add(new Student("Artur", "Sahakyan", 27));
//
//        System.out.println(arrayListOfStudents);
//        System.out.println(arrayListOfStudents.size());
//        System.out.println();
//
//        System.out.println(arrayListOfStudents.remove(new Student("Vardan", "Ohanyan", 19)));
//        System.out.println(arrayListOfStudents.remove(new Student("Tiko", "Yengibarov", 22)));
//        System.out.println(arrayListOfStudents.remove(new Student("Marat", "Hovsepyan", 25)));
//        System.out.println(arrayListOfStudents.remove(new Student("Artur", "Sahakyan", 27)));
//        System.out.println();
//
//        System.out.println(arrayListOfStudents.remove(new Student("Vardan", "Ohanyan", 19)));
//        System.out.println(arrayListOfStudents.size());
//        System.out.println(arrayListOfStudents.get(0));
//        System.out.println();

        //test of custom LinkedList
        LinkedListOfStudents linkedListOfStudents = new LinkedListOfStudents();
        linkedListOfStudents.push(new Student("Vardan", "Ohanyan", 19));
        linkedListOfStudents.push(new Student("Tiko", "Yengibarov", 22));
        linkedListOfStudents.push(new Student("Marat", "Hovsepyan", 25));
        linkedListOfStudents.addLast(new Student("Artur", "Sahakyan", 27));
        System.out.println(linkedListOfStudents.pop());
        System.out.println(linkedListOfStudents.pop());
        System.out.println(linkedListOfStudents.pop());
        System.out.println(linkedListOfStudents.pop());
        System.out.println(linkedListOfStudents.pop());

        linkedListOfStudents.push(new Student("Vardan", "Ohanyan", 19));
        linkedListOfStudents.push(new Student("Tiko", "Yengibarov", 22));
        linkedListOfStudents.push(new Student("Marat", "Hovsepyan", 25));
        linkedListOfStudents.addLast(new Student("Artur", "Sahakyan", 27));
        System.out.println();

        System.out.println(linkedListOfStudents.removeLast());
        System.out.println(linkedListOfStudents.removeLast());
        System.out.println(linkedListOfStudents.removeLast());
        System.out.println(linkedListOfStudents.removeLast());
        System.out.println(linkedListOfStudents.removeLast());

        System.out.println(linkedListOfStudents);

        //test of custom LinkedList


        //test of comparators
//        Student[] students = new Student[]{
//                new Student("Vardan", "Ohanyan", 19),
//                new Student("Tiko", "Yengibarov", 22),
//                new Student("Marat", "Hovsepyan", 25),
//                new Student("Artur", "Sahakyan", 27),
//                new Student("Babken", "Nersisyan", 10)
//        };

//        ArrayList<Student> arrayList = new ArrayList<>();
//
//        for (int i = 0; i < students.length; i++) {
//            arrayList.add(students[i]);
//        }
//
//        System.out.println(arrayList);
//        System.out.println();
//
//        Collections.sort(arrayList,new AgeDescendingComparator());
//        System.out.println(arrayList);
//        System.out.println();
//
//        Collections.sort(arrayList,new FirstNameComparator());
//        System.out.println(arrayList);
//        System.out.println();
//        //test of comparators
//
//
//
//        //test of StudentsService
//        Student[] students1 = new Student[]{
//                new Student("Garnik", "Ghazaryan", 19),
//                new Student("Karen", "Grigoryan", 22),
//                new Student("Eric", "Varunts", 25),
//                new Student("Kyle", "Samsonyan", 27)
//        };
//
//        StudentsService studentsService = new StudentsService();
//        studentsService.initializeArrayListOfStudents(students);
//        studentsService.initializeLinkedListOfStudents(students1);
//        studentsService.showAllStudents();
        //test of StudentsService

    }
}
