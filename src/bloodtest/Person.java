/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtest;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String priority; // Urgent, Medium, Low
    private String gpDetails;  // GP details (doctor name)
    private boolean fromHospital;

    // Constructor
    public Person(String name, int age, String priority, String gpDetails, boolean fromHospital) {
        this.name = name;
        this.age = age;
        this.priority = priority;
        this.gpDetails = gpDetails;
        this.fromHospital = fromHospital;
    }
    

    public int getPriorityValue() {
        int priorityValue = switch (priority) {
            case "Urgent" -> 3;
            case "Medium" -> 2;
            default -> 1;
        };
        if (fromHospital) priorityValue += 2; // Hospital patients get higher priority
        if (age > 65) priorityValue += 1; // Elderly patients get higher priority
        return priorityValue;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPriority() {
        return priority;
    }

    public String getGPDetails() {
        return gpDetails;
    }

    public boolean isFromHospital() {
        return fromHospital;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(other.getPriorityValue(), this.getPriorityValue()); // Descending priority
    }

    @Override
    public String toString() {
        return name + " - " + priority + " - " + (fromHospital ? "From Hospital" : "Not from Hospital");
    }
}