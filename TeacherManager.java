import java.util.ArrayList;
public class TeacherManager {
    private ArrayList<Teacher> teacherList = new ArrayList<>();
    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    public void removeTeacher(String teacherID) { // xóa giáo viên
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).teacherID.equals(teacherID)) {
                teacherList.remove(i);
                break;
            }
        }
    }

    public void displayTeacherList() { // hiển thị danh sách giáo viên
        for (Teacher teacher : teacherList) {
            System.out.println(teacher.teacherID + " " + teacher.fullName);
        }
    }

    public void displayTeacherDetails(String teacherID) { // hiển thị chi tiết giáo viên
        for (Teacher teacher : teacherList) {
            if (teacher.teacherID.equals(teacherID)) {
                System.out.println(teacher.getTeacherID() + " " + teacher.getFullName() + " " + teacher.getAge() + " " + teacher.getHometown() + " " + teacher.getBasicSalary() + " " + teacher.getBonus() + " " + teacher.getPenalty() + " " + teacher.getActualSalary());
                return;
            }
        }
    }
    public void searchTeacherByKeyword(String keyword) { // tìm kiếm giáo viên theo từ khóa
        for (Teacher teacher : teacherList) {
            if (teacher.fullName.contains(keyword) || teacher.teacherID.contains(keyword)) {
                System.out.println(teacher.getTeacherID() + " " + teacher.getFullName());
            }
        }
    }

    public void displayHighestAndLowestSalary() { // hiển thị lương cao nhất và thấp nhất
        if (teacherList.isEmpty()) {
            System.out.println("INVALID");
            return;
        }

        Teacher highestSalaryTeacher = teacherList.get(0); // lương cao nhất
        Teacher lowestSalaryTeacher = teacherList.get(0); // lương thấp nhất

        for (Teacher teacher : teacherList) {
            if (teacher.getActualSalary() > highestSalaryTeacher.getActualSalary()) {
                highestSalaryTeacher = teacher;
            }
            if (teacher.getActualSalary() < lowestSalaryTeacher.getActualSalary()) {
                lowestSalaryTeacher = teacher;
            }
        }

        System.out.println(highestSalaryTeacher.getFullName() + " " + highestSalaryTeacher.getActualSalary());
        System.out.println(lowestSalaryTeacher.getFullName() + " " + lowestSalaryTeacher.getActualSalary());
    }
}
