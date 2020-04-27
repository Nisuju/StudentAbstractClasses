package epam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public  class Group {
    private List<Student> studentList = new ArrayList<Student>();

    public Group() {
    }

    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    public void removeStudent(Student student) {
        this.studentList.remove(student);
    }

    public void showAllStudents() {
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student);
        }

    }



}
