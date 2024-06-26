package studentgradetracker;

// Class representing a student
class Student {
    private String name;              // Student's name
    private List<Grade> grades;       // List of grades for the student

    // Constructor to initialize student name and grades list
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Method to add a grade to the student's grades list
    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    // Getter method for grades list
    public List<Grade> getGrades() {
        return grades;
    }

    // Method to calculate the average score of the student
    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double total = 0.0;  // Initialize total score
        for (Grade grade : grades) {
            total += grade.getScore();  // Sum up all scores
        }
        return total / grades.size();  // Calculate average
    }

    // Method to calculate the letter grade based on average score
    public char calculateLetterGrade(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Method to calculate the GPA based on average score
    public double calculateGPA(double average) {
        if (average >= 90) {
            return 4.0;
        } else if (average >= 80) {
            return 3.0;
        } else if (average >= 70) {
            return 2.0;
        } else if (average >= 60) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    // Override toString method to display student's overall grade information
    @Override
    public String toString() {
        double average = calculateAverage();  // Calculate average score
        char letterGrade = calculateLetterGrade(average);  // Determine letter grade
        double gpa = calculateGPA(average);  // Determine GPA
        return "Student: " + name + "\nAverage Score: " + average + "\nLetter Grade: " + letterGrade + "\nGPA: " + gpa;
    }
}
