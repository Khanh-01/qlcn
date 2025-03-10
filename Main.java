import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TeacherManager teacherManager = new TeacherManager();
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Thêm");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách");
            System.out.println("4. Xem chi tiết");
            System.out.println("5. Tìm kiếm giáo viên theo từ khóa");
            System.out.println("6. Thống kê lương cao nhất/thấp nhất");
            System.out.println("7. Thoát");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    String fullName = scanner.nextLine();
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    String hometown = scanner.nextLine();
                    String teacherID = scanner.nextLine();
                    double basicSalary = scanner.nextDouble();
                    double bonus = scanner.nextDouble();
                    double penalty = scanner.nextDouble();
                    Teacher teacher = new Teacher(fullName, age, hometown, teacherID, basicSalary, bonus, penalty);
                    teacherManager.addTeacher(teacher);
                    System.out.println(teacher.getFullName());
                    break;

                case 2:
                    String removeID = scanner.nextLine();
                    teacherManager.removeTeacher(removeID);
                    System.out.println(removeID);
                    break;

                case 3:
                    teacherManager.displayTeacherList();
                    break;

                case 4:
                    String detailID = scanner.nextLine();
                    teacherManager.displayTeacherDetails(detailID);
                    break;

                case 5:
                    String keyword = scanner.nextLine();
                    teacherManager.searchTeacherByKeyword(keyword);
                    break;

                case 6:
                    teacherManager.displayHighestAndLowestSalary();
                    break;

                case 7:
                    System.out.println("Thoát");
                    return;
            }
        }
    }
}
