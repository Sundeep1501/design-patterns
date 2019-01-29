public class Main {

    public static void main(String[] args) {
        System.out.println("Singleton Pattern");
        Application sp = Application.getInstance();

        Application sp1 = Application.getInstance();

        if (sp == sp1) {
            System.out.println("Single instance");
        } else {
            System.out.println("Multiple instances");
        }
    }

}
