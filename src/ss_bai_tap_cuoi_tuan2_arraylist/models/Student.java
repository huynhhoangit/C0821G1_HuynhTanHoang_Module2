package ss_bai_tap_cuoi_tuan2_arraylist.models;

public class Student {
    private int StudentCode;   // Mã sinh viên
    private String StudentName; // Tên Sinh viên
    private String StudentAddress; // Địa chỉ Sinh viên
    private int StudentScores; // Điểm số sinh viên

    public Student() {
    }

    public Student(int studentCode, String studentName, String studentAddress, int studentScores) {
        StudentCode = studentCode;
        StudentName = studentName;
        StudentAddress = studentAddress;
        StudentScores = studentScores;
    }

    public int getStudentCode() {
        return StudentCode;
    }

    public void setStudentCode(int studentCode) {
        StudentCode = studentCode;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentAddress() {
        return StudentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        StudentAddress = studentAddress;
    }

    public int getStudentScores() {
        return StudentScores;
    }

    public void setStudentScores(int studentScores) {
        StudentScores = studentScores;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentCode=" + StudentCode +
                ", StudentName='" + StudentName + '\'' +
                ", StudentAddress='" + StudentAddress + '\'' +
                ", StudentScores=" + StudentScores +
                '}';
    }
}
