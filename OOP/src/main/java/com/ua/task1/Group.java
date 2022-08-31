package com.ua.task1;

public class Group {

    private Student[] students;

    public Group(){

    }

    public Group(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void showContractStudents(){
        System.out.println("List of contract students:");
        for (Student s: students) {
            if(s.getClass().equals(ContractStudent.class)){
                System.out.println("- " + s.getName() + " " + s.getAge() + " " + ((ContractStudent) s).getCost());
            }
        }
    }

    public Group initiateGroup(){
        //Create a students
        Student student = new Student("Student1", 23);
        Student student1 = new Student("Student2", 23);
        Student student2 = new Student("Student3", 23);
        Student student3 = new Student("Student4", 23);
        Student student4 = new Student("Student5", 23);
        //Create a contract students
        ContractStudent contractStudent = new ContractStudent("ContractStudent1", 23, 2343.3);
        ContractStudent contractStudent1 = new ContractStudent("ContractStudent2", 24, 3343.3);
        ContractStudent contractStudent2 = new ContractStudent("ContractStudent3", 25, 4343.3);
        ContractStudent contractStudent3 = new ContractStudent("ContractStudent4", 26, 5343.3);
        ContractStudent contractStudent4 = new ContractStudent("ContractStudent5", 27, 6343.3);
        //Create array of student
        students = new Student[]{student, student1, student2, student3, student4, contractStudent, contractStudent1,
                contractStudent2, contractStudent3, contractStudent4};
        //Create Group example and initialize
        Group group = new Group(students);
        return group;
    }
}
