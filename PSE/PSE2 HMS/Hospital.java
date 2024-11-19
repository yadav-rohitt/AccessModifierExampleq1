public class Hospital {
    private Doctor[] doctors;
    private Patient[] patients;
    private int doctorCount;
    private int patientCount;

    public Hospital() {
        doctors = new Doctor[10];
        patients = new Patient[10];
        doctorCount = 0;
        patientCount = 0;
    }

    public void addDoctor(Doctor doc) {
        if (doctorCount < doctors.length) {
            doctors[doctorCount++] = doc;
        } else {
            System.out.println("Cannot add more doctors.");
        }
    }

    public void addPatient(Patient pat) {
        if (patientCount < patients.length) {
            patients[patientCount++] = pat;
        } else {
            System.out.println("Cannot add more patients.");
        }
    }


    public void displayAllDoctors() {
        for (int i = 0; i < doctorCount; i++) {
            System.out.println("Doctor " + (i + 1) + ":");
            doctors[i].displayInfo();
            System.out.println();
        }
    }

    public void displayAllPatients() {
        for (int i = 0; i < patientCount; i++) {
            System.out.println("Patient " + (i + 1) + ":");
            patients[i].displayInfo();
            System.out.println();
        }
    }
}
