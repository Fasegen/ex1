import java.util.Objects;
public class Wife extends human {
    protected Husband husband;
    protected String maritalStatus = "";


    public Wife(String gender, int age, String name) {
        super(gender, age, name);
    }


    @Override
    public String toString() {
        return "Человек{" +
                " Пол ='" + getSex() + '\'' +
                ", Возраст =" + getAge() +
                ", Имя ='" + getName() + '\'' +
                '}';
    }

    public void setHusband(Husband spouse) {
        this.maritalStatus = "married";
        husband = spouse;
    }

    public void getSpouse() {
        if (Objects.equals(maritalStatus, "married")) {
            System.out.println("Mуж " + husband);
        } else System.out.println("Нет мужа");
    }

    public void getMaritalStatus() {
        if (Objects.equals(maritalStatus, "married")) {
            System.out.println("Замужем ");
        } else System.out.println("Не замужем");

    }
}