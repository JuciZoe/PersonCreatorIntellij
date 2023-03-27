//Blueprint of the Person object
public class Person {
    private String name;
    private int age;
    private double weight;
    private int height;


    public Person (String name, int age, double weight, int height){ //constructor
    setName(name);
    setAge(age);
    setWeight(weight);
    setHeight(height);
    }

    public void setName (String name){ // setter method for name, no static keyword, always void
        this.name = name;
    }
    public String getName (){ // always return a value but doesn't pass any parameter
        return name;
    }
    public void setAge (int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setWeight (double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }
    public void setHeight (int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
    // behavioural method
    public void growOlder() {
        setAge(getAge() + 1); // increase age by 1
        setHeight(getHeight() - 1); // decrease height by 1
        setWeight(getWeight() - 0.5); // decrease weight by 0.5
    }
    }
