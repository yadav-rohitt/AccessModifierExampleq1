import java.util.Arrays;

class Student {

    private String name;
    private Integer rollNumber;
    private Double[] scores;
    private Character grade;


    public Student() {
        this.name = "Unknown";
        this.rollNumber = 0;
        this.scores = new Double[]{0.0, 0.0, 0.0};
        this.grade = 'N'; 
        System.out.println("Student created with default values.");
    }

    public Student(String name, Integer rollNumber, Double[] scores) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.scores = scores;
        this.grade = 'N'; 
        System.out.println("Student created: " + name + ", Roll Number: " + rollNumber);
    }

    public void setScores(Double[] scores) {
        if (scores.length == 3) {
            this.scores = scores;
            System.out.println("Scores set for student: (Roll Number: " + this.rollNumber + ")");
        } else {
            System.out.println("Error: Exactly 3 scores are required.");
        }
    }
    public double calculateAverageScore() {
        return Arrays.stream(this.scores).mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    public void assignGrade() {
        double average = calculateAverageScore();
        if (average > 85) {
            this.grade = 'A';
        } else if (average >= 70) {
            this.grade = 'B';
        } else if (average >= 50) {
            this.grade = 'C';
        } else {
            this.grade = 'D';
        }
        System.out.println("Grade assigned for " + this.name + ": " + this.grade);
    }

    public String displayStudentInfo() {
        return "Student: " + this.name + "\nRoll Number: " + this.rollNumber +
               "\nScores: " + Arrays.toString(this.scores) +
               "\nAverage Score: " + String.format("%.2f", calculateAverageScore()) +
               "\nGrade: " + this.grade;
    }


    public String displayStudentInfo(boolean minimal) {
        return "Student: " + this.name + "\nGrade: " + this.grade;
    }
}
