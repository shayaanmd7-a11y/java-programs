class student{
    String name;
    int age;
    void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }
}

public class object {
    public static void main(String[] args) {
        student s1=new student();
         
        s1.name="shayaan";
        s1.age=18;

        s1.display();
    }

}
    