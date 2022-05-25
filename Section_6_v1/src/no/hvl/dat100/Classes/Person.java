package no.hvl.dat100.Classes;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    private String getFirstName(){
        return firstName;
    }
    private String getLastName() {
        return lastName;
    }

    private int getAge(){
        return age;
    }

    private void setFirstName(String firstName){
        this.firstName = firstName;
    }

    private void setLastName(String lastName){
        this.lastName = lastName;
    }

    private void setAge(int age){
/*        if(age==0 || age==100){
            this.age = age;
        }
        this.age = age;*/
        this.age = (age<0 || age>100) ? 0 : age;
    }

    public boolean isTeen(){
/*        if(age>12 || age<20){
            return true;
        }
        return false;*/
        return (age>12 && age<20); // ternary operator only in fuction but dousn`` write out the ? true : false;
    }
    public String getFullName() {
/*        if (firstName.isEmpty() && lastName.isEmpty()) return " ";
        if (firstName.isEmpty()) return lastName;
        if (lastName.isEmpty()) return firstName;
        return firstName + " " + lastName;*/
        return (firstName.isEmpty() && lastName.isEmpty()) ? "" : (firstName.isEmpty()) ?
                lastName : (lastName.isEmpty()) ? firstName : firstName + " " + lastName;
    }

}
