public class LinkedListTest1
{
    public static void main(String[] args)
    {
        dannyList classroom = new dannyList();

        dihNode Alex = new dihNode("Alex");
        dihNode Danny = new dihNode("Danny");
        dihNode Santi = new dihNode("Santi");

        classroom.add(Alex);
        classroom.add(Danny);
        classroom.add(Santi);
        System.out.println(classroom.toString());
        classroom.remove("Danny");
        System.out.println(classroom.toString());
        dihNode Bob = new dihNode("Bob");
        classroom.addAfter("Alex", Bob);
        System.out.println(classroom.toString());
        System.out.println(classroom.toString());
        classroom.clear();
        System.out.println(classroom.toString());
    }
}