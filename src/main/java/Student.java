package oopsconcept;

//package oopsconcept;
class Student{
    private int id;
    private String name;
    private int age;
    public Student(){
        System.out.println("student class initiated");
        this.id += 1;
        this.age = 0;
        this.name = null;
    }
    public Student(int id,int age, String name){
        this.id = id;
        this.age = age;
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

