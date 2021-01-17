public class main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int a,b,c;
        a = 44;
        b = 2;
        c = 5;

        System.out.println("Suma " + a + " + " + b + " + " + c + " = " + calculator.add(a,b,c) );
        System.out.println("Różnica " + a + " - " + b + " - " + c + " = " + calculator.sub(a,b,c) );
        System.out.println("Dzielenie " + a + " / " + b + " / " + c + " = " + calculator.div(a,b,c) );
        System.out.println("Mnożenie " + a + " * " + b + " * " + c + " = " + calculator.multi(a,b,c) );
    }
}
