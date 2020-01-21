public class Main {
    public static void main(String[] args) {
        LinkedListOfStudents linkedListOfStudents = new LinkedListOfStudents();
        linkedListOfStudents.push(new Student("Vardan", "Ohanyan", 19));
        linkedListOfStudents.push(new Student("Tiko", "Yengibarov", 22));
        linkedListOfStudents.push(new Student("Marat", "Hovsepyan", 25));
        linkedListOfStudents.push(new Student("Gurgen", "Aramyan", 25));


        System.out.println(linkedListOfStudents);

        System.out.println(linkedListOfStudents.pop());
        System.out.println(linkedListOfStudents.pop());
        System.out.println(linkedListOfStudents.pop());
        System.out.println(linkedListOfStudents.pop());
        System.out.println(linkedListOfStudents.pop());
        System.out.println(linkedListOfStudents.pop());
        System.out.println(linkedListOfStudents.pop());
        System.out.println(linkedListOfStudents.pop());
        System.out.println(linkedListOfStudents.pop());
        System.out.println(linkedListOfStudents.pop());
        System.out.println(linkedListOfStudents.pop());
        System.out.println(linkedListOfStudents.pop());

        linkedListOfStudents.addLast(new Student("Vardan", "Ohanyan", 19));
        linkedListOfStudents.addLast(new Student("Tiko", "Yengibarov", 22));
        linkedListOfStudents.addLast(new Student("Marat", "Hovsepyan", 25));
        linkedListOfStudents.addLast(new Student("Gurgen", "Aramyan", 25));

        System.out.println(linkedListOfStudents);

    }
}
