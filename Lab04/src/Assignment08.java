class Person {
    private String firstName;
    private String lastName;
    private String gender;

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getGender() { return gender; }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setGender(String gender) { this.gender = gender; }

    @Override
    public String toString() {
        return "Person: " + firstName + " " + lastName +
                ", Gender: " + gender;
    }

    public boolean equals(Person p) {
        return firstName.equals(p.firstName) &&
                lastName.equals(p.lastName) &&
                gender.equals(p.gender);
    }
}

class Teacher extends Person {
    private String department;
    private String courses;

    public Teacher(String firstName, String lastName, String gender,
                   String department, String courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() { return department; }
    public String getCourses() { return courses; }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Department: " + department +
                ", Courses: " + courses;
    }

    public boolean equals(Teacher t) {
        return super.equals(t) &&
                department.equals(t.department) &&
                courses.equals(t.courses);
    }
}

class Student extends Person {
    private Integer studentId;

    public Student(String firstName, String lastName,
                   String gender, Integer studentId) {
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }

    public Integer getStudentId() { return studentId; }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Student ID: " + studentId;
    }

    public boolean equals(Student s) {
        return super.equals(s) &&
                studentId.equals(s.studentId);
    }
}

class PhdStudent extends Student {
    private String department;
    private String courses;

    public PhdStudent(String firstName, String lastName,
                      String gender, Integer studentId,
                      String department, String courses) {
        super(firstName, lastName, gender, studentId);
        this.department = department;
        this.courses = courses;
    }

    public String getCourses() { return courses; }
    public String getDepartment() { return department; }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Department: " + department +
                ", Courses: " + courses;
    }

    public boolean equals(PhdStudent pStud) {
        return super.equals(pStud) &&
                department.equals(pStud.department) &&
                courses.equals(pStud.courses);
    }
}

public class Assignment08 {
    public static void main(String[] args) {

        Person p1 = new Person("Ali", "Hasanov", "Male");
        Person p2 = new Person("Ali", "Hasanov", "Male");

        Teacher t1 = new Teacher("Hesen", "Naghiyev",
                "Male", "Computer Science", "IT");
        Teacher t2 = new Teacher("Hesen", "Naghiyev",
                "Male", "Computer Science", "IT");

        Student s1 = new Student("Rashad", "Asadli","Male", 23451);
        Student s2 = new Student("Rashad", "Asadli","Male", 23451);

        PhdStudent phd1 = new PhdStudent("Rauf", "Asadli",
                "Male", 5001, "idk", "blah blah");
        PhdStudent phd2 = new PhdStudent("Rauf", "Asadli",
                "Male", 5001, "idk", "blah blah");

        System.out.println(p1);
        System.out.println(p1.equals(p2));

        System.out.println(t1);
        System.out.println(t1.equals(t2));

        System.out.println(s1);
        System.out.println(s1.equals(s2));

        System.out.println(phd1);
        System.out.println(phd1.equals(phd2));
    }
}