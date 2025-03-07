import java.util.ArrayList;
public class TeacherManager {
    ArrayList<Teacher> teacherList = new ArrayList<>();
    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }
    public void removeTeacher(String teacherID) {
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).teacherID.equals(teacherID)) {
                teacherList.remove(i);
                break;
            }
        }
    }

    public void displayTeacherList() {
        for (int i = 0; i < teacherList.size(); i++) {
            Teacher teacher = teacherList.get(i);
            System.out.println(teacher.teacherID + " " + teacher.fullName);
        }
    }
    public void displayTeacherDetails(String teacherID) {
        for (int i = 0; i < teacherList.size(); i++) {
            Teacher teacher = teacherList.get(i);
            if (teacher.teacherID.equals(teacherID)) {
                System.out.println(teacher.getTeacherID()+ " " + teacher.getFullName() + " " + teacher.getAge() + " " + teacher.getHometown() + " " + teacher.getBasicSalary() + " " + teacher.getBonus() + " " + teacher.getPenalty() + " " + teacher.getActualSalary());
                return;
            }
        }
    }
}

