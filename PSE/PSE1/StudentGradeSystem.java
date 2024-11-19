public class StudentGradeSystem {
    public static void main(String[] args) {
        
        Student student1 = new Student("Alice", 101, new Double[]{85.0, 90.0, 78.0});
        Student student2 = new Student("Bob", 102, new Double[]{65.0, 72.0, 60.0});
        Student student3 = new Student();
        

        student3.setScores(new Double[]{95.0, 88.0, 92.0});


        student1.assignGrade();
        student2.assignGrade();
        student3.assignGrade();

        System.out.println(student1.displayStudentInfo());
        System.out.println();
        System.out.println(student2.displayStudentInfo());
        System.out.println();
        System.out.println(student3.displayStudentInfo(true)); 
    }
}

