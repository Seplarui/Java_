package tests;

/**
 *
 * @author haplo
 */
public class Test_1 {

    private static int numpajaros = 0;
    private String color;

    public void setColor(String c) {
        color = c;

    }

    public String getColor() {
        return color;

    }

    public static void main(String[] args) {
        Test_1 p1;
        String color;

        p1 = new Test_1();
        p1.setColor("amarillo");
        color=p1.getColor();
        
        System.out.println("El color es: "+color);
        
    


    }
}
