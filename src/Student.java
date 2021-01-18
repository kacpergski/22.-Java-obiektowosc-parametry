public class Student {

    char [] name;
    char [] surname;
    int age;
    char [] email;
    int indexNumber;

     Student (char[] name, char[] surname, int age, char []email, int indexNumber){
         this.name = name;
         this.surname = surname;
         this.age = age;
         this.email = email;
         this.indexNumber = indexNumber;
   }
     Student (char[] name, char[] surname) {
        this.name = name;
        this.surname = surname;

     }
         void displayShort() {
             System.out.println();
             System.out.print("Name: ");
             for (char n : name) {
                 System.out.print(n);

             }
             System.out.println();
             System.out.print("Surname: ");
             for (char sn : surname) {
                 System.out.print(sn);
             }
             System.out.println();
             System.out.println();
         }
    void displayLong() {


        System.out.print("Name: ");
        for (char n : name) {
            System.out.print(n);

        }
        System.out.println();
        System.out.print("Surname: ");
        for (char sn : surname) {
            System.out.print(sn);
        }

        System.out.println();
        System.out.print("Email: " );
        for (char e: email){
            System.out.print(e);
        }
        System.out.println();
        System.out.println("Age: "+ age);

        System.out.println("Index: "+ indexNumber);
        System.out.println();

    }


}
