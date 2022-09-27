
class Student{
    String Name;
    int Age;

    public void printInfo(){
        System.out.println(this.Name);
        System.out.println(this.Age);
    }

    Student(){
        System.out.println("\nfor s1");
    }    

}

public class OOPS{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Name = "Kaushal";
        s1.Age = 20;
        s1.printInfo();

        Student s2 = new Student();
        s2.Name = "Kaushiii";
        s2.Age = 200;
        s2.printInfo();

        Student s3 = new Student();
        s3.Name = "Muskan";
        s3.Age = 12;
        s3.printInfo();

    }
}





 
// class Pen{
//     String Color;
//     String Type;

//     public void write(){
//         System.out.println("Writing.....");
//     }

//     public void printColor(){
//         System.out.println(this.Color);
//     }
// }