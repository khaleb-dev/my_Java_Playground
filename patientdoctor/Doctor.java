package patientdoctor;

public class Doctor {
    private String name;

    public Doctor() {
    }

    public Doctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Doctor's name is " + name;
    }
    
}
