public class Doctor extends Person {
    private String specialization;
    private static int doctorCount = 0;


    public Doctor(String name, int age, String gender, String specialization) {
        super(name, age, gender);
        this.specialization = specialization;
        doctorCount++;
    }


    public static int getDoctorCount() {
        return doctorCount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + this.specialization);
    }
}
