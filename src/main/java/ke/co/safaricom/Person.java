package ke.co.safaricom;

// Creating "Person" Class
class Person{

    private int age;
    private String gender;

//  Since age is private, to access its value you use 'get'
   public int getAge(){
       System.out.println("The age field has been accessed!");
        return this.age;
    }

//    To update the age we use 'set'
    public void setAge(int newAgeValue){
        if(this.age == newAgeValue){
            System.out.println("The age is the same");
        }

        if(newAgeValue < 1){
            System.out.println("Age must be greater than 1");
        }
       this.age = newAgeValue;


    }

}