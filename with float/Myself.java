public class Myself {
    //Character attributes
    int strength;
    int agility;
    int intelligence;
    String mname;
    int Mage;
    float mheight;
    boolean gender;

    public void sayMyName() {
        System.out.println("My name is: " + mname);
    }

    public void sayMyStrength() {
        System.out.println("My strength is: " + strength);
    }
    public void sayMyAgility() {
        System.out.println("My agility is: " + agility);
    }
    public void sayMyIntelligence() {
        System.out.println("My Intelligence is: " + intelligence);
    }
    public void sayMyHeight() {
        System.out.println("My height is: " + mheight);
    }
    public void sayMyAge() {
        System.out.println("My age is: " + Mage);
    }
    public void sayMyGender() {
        System.out.println("Male: " + gender);
    }
    

    //Constructor
    public Myself(int str, int agi, int intel, int age, float height, String name, Boolean mgender) {
        strength = str;
        agility = agi;
        intelligence = intel;
        mname = name;
        Mage = age;
        mheight = height;
        gender = mgender;
      
    }

}
