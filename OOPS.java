public class OOPS {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();
        Person p6 = new Person();
        Person p7=new Person(7, "baby");
        p7.teaching();

      

        p1.age = 55;
        p1.name = "R K BANSAL";
        p1.teaching();
        p1.subject ="MP" ;
        p2.age = 35;
        p2.name = "DR. SHYAMKIRAN KAUR ";
        p2.subject = "EC";
        p3.age = 50 ;
        p3.name = "DR. NARINDER KUMAR KULLER ";
        p3.subject ="BEC" ;
        p4.age = 45;
        p4.name = "DR. VIKRAM JEET SINGH ";
        p4.subject = "CHM";
        p5.age = 30;
        p5.name = "DR. ANIL KUMAR SHUKLA ";
        p5.subject ="MATH.." ;
        p6.age = 35;
        p6.name = "PREETI";
        p6.subject = "ENGLISH LAB";
        
        System.out.println(p1.name +"--> "+p1.subject);
        System.out.println(p2.name +"--> "+p2.subject);
        System.out.println(p3.name +"--> "+p3.subject);
        System.out.println(p4.name +"--> "+p4.subject);
        System.out.println(p5.name +"--> "+p5.subject);
        System.out.println(p6.name +"--> "+p6.subject);
        
        Students s = new Students(17,"AYUSH RATHORE");
        s.learning();
        System.out.println(Person.count);
    }
}
class Students extends Person{
    public Students(int age, String name) {
        super(age,name);
        
    }
}



class Person{
    int age;
    String name;
    String subject;
    static int count;
    public Person() {
        count++;
        System.out.println("creating an assignment.");
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    void learning(){
        System.out.println(name+"IS LEARNING ENGINEEERING ..");
    }
    void teaching() {
        System.out.println(name+" IS TEACHING ..GOOD");
    }

}