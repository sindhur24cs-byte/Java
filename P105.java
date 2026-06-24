import java.util.ArrayList;

class Person {
private String name;
private int age;

public Person(String name, intage) {
this.name = name;
this.age = age;
    }

public String getName() {
return name;
    }

public int getAge() {
return age;
    }

@Override
public String toString() {
return"Person{" +
"name='" + name + '\'' +
", age=" + age +
'}';
    }
}
public class Program3 {
public static void main(String[] args) {
        ArrayList<Person>personList = new ArrayList<>();

personList.add(new Person("Alice", 30));
personList.add(new Person("Bob", 25));
personList.add(new Person("Charlie", 40));

        System.out.println("Contents of the ArrayList:");
for (Person person : personList) {
            System.out.println(person);
        }
