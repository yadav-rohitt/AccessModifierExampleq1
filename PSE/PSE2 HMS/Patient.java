public class Patient extends Person {
    private String ailment;
    private final int patientId;
    private double[] treatmentCosts;


    public Patient(String name, int age, String gender, String ailment, int patientId, double[] treatmentCosts) {
        super(name, age, gender);
        this.ailment = ailment;
        this.patientId = patientId;
        this.treatmentCosts = treatmentCosts;
    }


    public double calculateTotalTreatmentCost() {
        double total = 0;
        for (double cost : treatmentCosts) {
            total += cost;
        }
        return total;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ailment: " + this.ailment);
        System.out.println("Patient ID: " + this.patientId);
        System.out.print("Treatment Costs: [");
        for (int i = 0; i < treatmentCosts.length; i++) {
            System.out.print(treatmentCosts[i]);
            if (i < treatmentCosts.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        System.out.println("Total Treatment Cost: " + calculateTotalTreatmentCost());
    }
}
