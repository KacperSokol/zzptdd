import java.util.ArrayList;

public class GradeBook {

    ArrayList<Subject> subjects = new ArrayList<Subject>();
    public void addSubject(Subject subject)
    {
        subjects.add(subject);
    }
    public void removeSubject(Subject subject)
    {
        subjects.remove(subject);
    }
    public float average()
    {
        float avg = 0;
        int count=0;
        for (Subject subject : subjects)
        {
            avg+=subject.average();
            count+=1;
        }
        avg=avg/count;
        return avg;
    }
}

