class constructor{
    String name;
    int age;
    constructor(String n, int a){
        name=n;
        age=a;
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }



    public static void main(String[] args) {
        constructor s1=new constructor("shayan",18);
        s1.display();
    }
    
}
