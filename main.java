public class main {
    public static void main(String[] args) {
        Husband person1 = new Husband("M", 20, "Nikolai");
        Wife person2 = new Wife("W", 21, "Kate");
        person2.setHusband(person1.setWife(person2));
        person2.getSpouse();
        person1.getSpouse();
        person2.getMaritalStatus();
        person1.getMaritalStatus();
 }
}
