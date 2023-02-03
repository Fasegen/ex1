abstract class human {
    
    private String sex;
    private int age;
    private String name;
    protected String status = "";



    public  human(String sex, int age, String name) {
        this.sex = sex;
        this.age = age;
        this.name = name;
    }

    public human(){

    }
    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


@Override
    public String toString() {
        return "Человек{" +
                "Пол ='" + sex + '\'' +
                ", Возраст =" + age +
                ", Имя ='" + name + '\'' +
                '}';
    }
}