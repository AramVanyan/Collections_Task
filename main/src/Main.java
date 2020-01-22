public class Main {
    public static void main(String[] args) {
        LinkedListOfStudents linkedListOfStudents = new LinkedListOfStudents();
        linkedListOfStudents.addLast(new Student("Vardan", "Ohanyan", 19));
        linkedListOfStudents.addLast(new Student("Tiko", "Yengibarov", 22));
        linkedListOfStudents.addLast(new Student("Marat", "Hovsepyan", 25));

        System.out.println(linkedListOfStudents.removeLast());
        System.out.println(linkedListOfStudents.removeLast());
        System.out.println(linkedListOfStudents.removeLast());
        System.out.println(linkedListOfStudents.removeLast());
        System.out.println(linkedListOfStudents.removeLast());
        System.out.println(linkedListOfStudents.removeLast());
        System.out.println(linkedListOfStudents.removeLast());

        System.out.println(linkedListOfStudents);

        linkedListOfStudents.addLast(new Student("Vardan", "Ohanyan", 19));
        linkedListOfStudents.addLast(new Student("Tiko", "Yengibarov", 22));
        linkedListOfStudents.addLast(new Student("Marat", "Hovsepyan", 25));

        System.out.println(linkedListOfStudents);

        System.out.println(linkedListOfStudents.pop());
        System.out.println(linkedListOfStudents.pop());
        System.out.println(linkedListOfStudents.pop());
        System.out.println(linkedListOfStudents.pop());
        System.out.println(linkedListOfStudents.pop());
        System.out.println(linkedListOfStudents.pop());

        System.out.println("linked list is " + linkedListOfStudents);
    }
}
