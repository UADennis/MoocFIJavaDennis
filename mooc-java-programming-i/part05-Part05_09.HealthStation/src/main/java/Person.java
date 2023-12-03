/*
 *  Do not change the behavior of this class
 */

public class Person {

    private String name;
    private int age;
    private int height;
    private int weight;
    private int weighings = 0;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void printPerson() {
        System.out.println("My name is " + this.name + " and I am " + this.age + " years old");
    }
    public int getWeighings(){
        return weighings;
    }
    public void weightCounter(){
        this.weighings += 1;
    }

    public void growOlder() {
        this.age++;
    }

    public boolean isOfLegalAge() {
        if (this.age > 17) {
            return true;
        }

        return false;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double bmi() {
        double heightInMeters = this.height / 100.0;

        return this.weight / (heightInMeters * heightInMeters);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "My name is " + this.name + " and I am " + this.age + " years old. My BMI is " + this.bmi();
    }
}
