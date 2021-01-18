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
    // Zadanie 2--------------------------------------------------------------------------------------------


        char[] n1 = {'A','d','a','m'};
        char[] n2 = {'J','a','n'};
        char[] n3 = {'O','l','e','k'};

        char[] sn1 = {'A','d','a','m','s','k','i'};
        char[] sn2 = {'J','a','n','k','o','w','s','k','i'};
        char[] sn3 = {'O','l','e','k','s','y'};

        char[] e1 = {'A','d','a','m','s','k','i','@','w','p','.','p','l'};
        char[] e2 = {'J','a','n','k','o','w','s','k','i','@','w','p','.','p','l'};
        char[] e3 = {'O','l','e','k','s','y','@','w','p','.','p','l'};


    Student s1 = new Student(n1, sn1);
    Student s2 = new Student(n2, sn2,24,e2,156475);
    Student s3 = new Student(n3, sn3,18,e3,547894);


        s1.displayShort();
        s2.displayLong();
        s3.displayLong();
    }
}
