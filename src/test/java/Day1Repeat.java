import org.testng.annotations.Test;

public class Day1Repeat {

    @Test
    public void test001() {
        System.out.println("This will be printed!");

    }

    @Test
    public void testMethod2() {
        int myNumber = 5;
        System.out.println(myNumber);
    }

    @Test
    public void test003() {
        float f = (float) 4.5;
        System.out.println(f);
    }

    @Test
    public void test004() {
        char c = 'g';

        String s2 = "Who who who who! ";

        String s3 = "Who let the dogs out?";

        System.out.println(s2 + s3);
    }

    @Test
    public void test005() {
        int num = 4;

        String s = "I have " + num + " cookies";

        System.out.println(s);
    }

    @Test
    public void test006() {
        boolean b = 1 < 2;
        b = true;

        boolean toBe = false;
        b = toBe || !toBe;

    }

    @Test
    public void test007() {
        boolean elemementIsPresented = false;


        if (elemementIsPresented) {
            System.out.println("Element is presented.");
        } else {
            System.out.println("Element is NOT presented.");
        }


    }

    @Test
    public void test008() {
        int a = 4;

        if (a == 4) {
            System.out.println("Ohhh! So a is 4!");
        }

        if (a != 4) {
            System.out.println("Nope, A is definitely not 4.");
        }
    }


    @Test
    public void test010() {

    }



}
