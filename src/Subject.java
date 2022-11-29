import java.util.ArrayList;

public class Subject {
    String name;
    ArrayList<Integer> grades = new ArrayList<Integer>();
    public void addGrade(int grade)
    {
        grades.add(grade);
    }
    public float average()
    {
        float avg = 0;
        int count=0;
        for (int grade : grades)
        {
            avg+=grade;
            count+=1;
        }
        avg=avg/count;
        return avg;
    }
}
