public class Main {
    public static void main(String[] args) {
    
        Student student1 = new Student(); // Default constructor
        Student student2 = new Student(101, "Alice Johnson", 20); // Parameterized constructor
        
        // Set values for student1 using setters
        student1.setId(100);
        student1.setName("John Smith");
        student1.setAge(21);
        
        // Display student information
        System.out.println("Student 1 Information:");
        student1.displayInfo();
        
        System.out.println("\nStudent 2 Information:");
        student2.displayInfo();
        
        // Create another student and modify values
        Student student3 = new Student(102, "Bob Brown", 19);
        System.out.println("\nOriginal Student 3 Information:");
        student3.displayInfo();
        
        // Modify using setters
        student3.setAge(20);
        student3.setName("Robert Brown");
        
        System.out.println("\nUpdated Student 3 Information:");
        student3.displayInfo();
        
        // Access individual fields using getters
        System.out.println("\nAccessing individual fields:");
        System.out.println("Student 2's name: " + student2.getName());
        System.out.println("Student 1's age: " + student1.getAge());
    }
}
