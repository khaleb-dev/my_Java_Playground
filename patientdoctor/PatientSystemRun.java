package patientdoctor;

public class PatientSystemRun {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Dr. Prince");
        Patient patient1 = new Patient("Ben P.", 14, doctor1);

        Doctor doctor2 = new Doctor("Dr. Mike");
        Patient patient2 = new Patient("Patricia M.", 23, doctor2);

        Doctor doctor3 = new Doctor("Dr. Emeka");
        Patient patient3 = new Patient("Blessing J.", 21, doctor3);

        Doctor doctor4 = new Doctor("Dr. Great");
        Patient patient4 = new Patient("Kelvin H.", 28, doctor4);

        Doctor doctor5 = new Doctor("Dr. Christina");
        Patient patient5 = new Patient("Helmaton H.", 26, doctor5);

        System.out.println("First Patient: \n"+patient1.toString()+"\n");
        System.out.println("Second Patient: \n"+patient2.toString()+"\n");
        System.out.println("Third Patient: \n"+patient3.toString()+"\n");
        System.out.println("Fourth Patient: \n"+patient4.toString()+"\n");
        System.out.println("Fifth Patient: \n"+patient5.toString()+"\n");
    }
}
