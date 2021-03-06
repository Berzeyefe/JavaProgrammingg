package day41_Exceptions;

public class Animal {

    private String name;
    private final String breed;
    private final char gender;
    private final String color;
    private String size ;
    private int age;

    public Animal(String name, String breed, char gender, String color, String size, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        this.size = size;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }
    public int getAge() {
        return age;

        //.........setters..........
    }
    public void setName(String name) {
        this.name = name;

    }
    public void setSize(String size) {
        this.size = size;

    }
    public void setAge(int age) {
        this.age = age;


        //.........setters..........
    }

             public void eat(){
            System.out.println(name+"is eating");//Since it does not make it final, it stands for, this implementation is different for all the animals
                                                 // that is to say, they can have different implementation by overriding.
        }

       public final void drink(){
           System.out.println(name+"is drinking water");// when I make it final, it means that this implementation becomes unchangeable for all the animals
                                                        //thus, this implementation is going to be same for all the animals.
       }

    }

