public class Teacher extends Person {
    private double basicSalary;  // Lương cứng
    private double bonus;        // Lương thưởng
    private double penalty;      // Tiền phạt
    private double actualSalary; // Lương thực lĩnh
    public Teacher(String fullName, int age, String hometown, String teacherID, double basicSalary, double bonus, double penalty) {
        super(fullName, age, hometown, teacherID);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.penalty = penalty;
        this.actualSalary = basicSalary + bonus - penalty;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    public double getActualSalary() {
        return actualSalary;
    }
}

