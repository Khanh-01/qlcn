public class Person {
    public String fullName;  // Họ tên
    private int age;          // Tuổi
    private String hometown;  // Quê quán
    public String teacherID; // Mã số giáo viên

    public Person(String fullName, int age, String hometown, String teacherID) {
        this.fullName = fullName;
        this.age = age;
        this.hometown = hometown;
        this.teacherID = teacherID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }


    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }
}

