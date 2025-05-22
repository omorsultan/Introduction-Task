package practice_problem_07;
import java.util.Date;

 class Student {
    private int id;
    private String name;
    private String program;

    public Student(int id, String name, String program) {
        this.id = id;
        this.name = name;
        this.program = program;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getProgram() { return program; }
}

class Instructor {
    private int id;
    private String name;
    private String department;
    private String title;

    public Instructor(int id, String name, String department, String title) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.title = title;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String getTitle() { return title; }
}

class Course {
    private int id;
    private String syllabus;
    private String title;
    private String credits;
    private String prerequisite;

    public Course(int id, String syllabus, String title, String credits, String prerequisite) {
        this.id = id;
        this.syllabus = syllabus;
        this.title = title;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }

    public int getId() { return id; }
    public String getSyllabus() { return syllabus; }
    public String getTitle() { return title; }
    public String getCredits() { return credits; }
    public String getPrerequisite() { return prerequisite; }
}

 class CourseOffering {
    private Student student;
    private Instructor instructor;
    private Course course;
    private Date time;
    private int sectionNo;
    private int roomId;
    private int year;
    private String semester;

    public CourseOffering(Student student, Instructor instructor, Course course, Date time,
                          int sectionNo, int roomId, int year, String semester) {
        this.student = student;
        this.instructor = instructor;
        this.course = course;
        this.time = time;
        this.sectionNo = sectionNo;
        this.roomId = roomId;
        this.year = year;
        this.semester = semester;
    }

    public void displayInfo() {
        System.out.println("Student: " + student.getName() + ", Program: " + student.getProgram());
        System.out.println("Instructor: " + instructor.getName() + ", Dept: " + instructor.getDepartment());
        System.out.println("Course: " + course.getTitle() + ", Credits: " + course.getCredits());
        System.out.println("Time: " + time + ", Semester: " + semester);
        System.out.println("Section: " + sectionNo + ", Room: " + roomId + ", Year: " + year);
    }
}

public class courseOffering {
    public static void main(String[] args) {
        // Create objects
        Student student = new Student(1, "Omor", "Software Engineering");
        Instructor instructor = new Instructor(10, "Dr. Hasan", "CSE", "Professor");
        Course course = new Course(100, "Data Structures Syllabus", "Data Structures", "3", "Intro to Programming");

        // Create course offering
        CourseOffering offering = new CourseOffering(
                student, instructor, course,
                new Date(), 1, 204, 2025, "SP"
        );

        // Display information
        offering.displayInfo();
    }
}
