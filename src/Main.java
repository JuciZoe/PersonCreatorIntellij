
public class Main {
    public static void main(String[] args) {
        System.out.println("List of the people living in the UK 2023 :D");
        Person p1 = new Person("Ada Lovelace", 27, 60.50, 172);
        System.out.println("The first person's name is " + p1.getName() + " " + p1.getAge()
        +" " + p1.getWeight() + " " + p1.getHeight());
        // Person1 getting older
        p1.growOlder();
        System.out.println("One year later " + p1.getName() + " " + p1.getAge()
                +" " + p1.getWeight() + " " + p1.getHeight());

        System.out.println();

        Person p2 = new Person("Daniel Angell", 31, 78, 170);
        System.out.println("The second person's name is " + p2.getName() + " " + p2.getAge()
        +" " + p2.getWeight() + " " + p2.getHeight());
        //Person2 getting older
        p2.growOlder();
        System.out.println("One year later " + p2.getName() + " " + p2.getAge()
                +" " + p2.getWeight() + " " + p2.getHeight());

        System.out.println();

        Person p3 = new Person("James Peterson", 34, 73.5, 180);
        System.out.println("The third person's name is " + p3.getName() + " " + p3.getAge()
        +" " + p3.getWeight() + " " + p3.getHeight());
        //Person3 getting older
        p3.growOlder();
        System.out.println("One year later " + p3.getName() + " " + p3.getAge()
                +" " + p3.getWeight() + " " + p3.getHeight());

        System.out.println();

        Person p4 = new Person("Bob Thornley", 25, 68.2, 171);
        System.out.println("The fourth person's name is " + p4.getName() + " " + p4.getAge()
        +" " + p4.getWeight() + " " + p4.getHeight());
        //Person4 getting older
        System.out.println("One year later " + p4.getName() + " " + p4.getAge()
                +" " + p4.getWeight() + " " + p4.getHeight());
    }
}