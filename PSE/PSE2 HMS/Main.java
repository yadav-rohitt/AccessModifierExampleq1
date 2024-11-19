public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();


        Doctor doc1 = new Doctor("Dr. Alice", 45, "Female", "Cardiology");
        Doctor doc2 = new Doctor("Dr. Bob", 50, "Male", "Neurology");
        hospital.addDoctor(doc1);
        hospital.addDoctor(doc2);

        
        Patient pat1 = new Patient("John", 30, "Male", "Heart Disease", 1001, new double[]{5000, 1500, 2500});
        Patient pat2 = new Patient("Mary", 25, "Female", "Migraine", 1002, new double[]{2000, 800, 600});
        hospital.addPatient(pat1);
        hospital.addPatient(pat2);


        hospital.displayAllDoctors();
        hospital.displayAllPatients();


        System.out.println("Total Doctors: " + Doctor.getDoctorCount());
    }
}
