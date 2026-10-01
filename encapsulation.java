class student {
    private String name;
    private int age;

    public void setname(String name) {
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setage(int age){
        this.age=age;
    }
    public int getage(){
        return age;
    }
    }
    public class encapsulation{
        public static void main(String[] args) {
            student s1=new student();
            s1.setname("shayaan");
            s1.setage(18);

            System.out.println(s1.getname());
            System.out.println(s1.getage());

        }
    }
    

