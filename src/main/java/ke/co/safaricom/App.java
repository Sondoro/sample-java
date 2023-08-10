package ke.co.safaricom;

public class App {

    public static int add(int x, int y){
        return x + y;
    }

    public static float add(float x, float y){
        return x + y;

    }
    public static void main(String[] args) {
        Person student = new Person();
        student.setAge(20);
        System.out.println(student.getAge());


    }
}