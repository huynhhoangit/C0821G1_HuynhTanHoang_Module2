package ss11_dsa_stack_queue.bai_tap.to_chuc_du_lieu_hop_ly_demerging_su_dung_queue;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Person implements Comparable<Person> {
    private String name;
    private String gender;
    private String NgaySinh;

    public Person() {
    }

    public Person (String name, String gender, String ngaysinh) {
        this.name = name;
        this.gender = gender;
        this.NgaySinh = ngaysinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.NgaySinh = ngaySinh;
    }

    @Override
    public String toString () {
        return " name = " + getName() + ", gender = " + getGender() + ", Ngày Sinh = " + getNgaySinh() + "\n";
    }

    @Override
    public int compareTo(Person o) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return (simpleDateFormat.parse(this.getNgaySinh())).compareTo(simpleDateFormat.parse(o.getNgaySinh()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
