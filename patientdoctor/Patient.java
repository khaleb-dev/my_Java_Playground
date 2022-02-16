package patientdoctor;

public class Patient {
    private String name;
    private int age;
    private Doctor doctor;

    public Patient() {
    }

    public Patient(String name, int age, Doctor doctor) {
        this.name = name;
        this.age = age;
        this.doctor = doctor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String toString() {
        return "Patient's name is " + name + ", and age is " + age + "\nAttending doctor is " + doctor.toString();
    }
    
}
