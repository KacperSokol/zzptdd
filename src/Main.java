public class Main {
    public static void main(String[] args) {

        GradeBook gradeBook=new GradeBook();
        Subject subject = new Subject();
        Subject subject2 = new Subject();
        subject.addGrade(1);
        subject.addGrade(2);
        subject.addGrade(3);
        subject2.addGrade(4);
        subject2.addGrade(5);
        subject2.addGrade(6);
        System.out.println(subject.average());
        gradeBook.addSubject(subject);
        gradeBook.addSubject(subject2);
        System.out.println(gradeBook.average());

    }
}