package obj.constructor;

public class Student {
    public String name;
    
    public Student(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("학생이름 : " + this.name);
    }

    public static void main(String[] args) {
        Student i = new Student("김민정");
        System.out.println(i.name);
        i.print();
    }
}
