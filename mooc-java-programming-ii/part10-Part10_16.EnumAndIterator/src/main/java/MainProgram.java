
public class MainProgram {

    public static void main(String[] args) {
        // test your classes here

       Employees t = new Employees();
        Person h = new Person("Arto", Education.PHD);
        Person s = new Person("Dennis", Education.BA);
        t.add(h);
        t.add(s);
        t.print(Education.BA);
    }
}
