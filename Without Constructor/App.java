public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();
        knight.sayMystrength();
        knight.sayMyagility();
        knight.sayMyintelligence();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.sayMystrength();
        mage.sayMyagility();
        mage.sayMyintelligence();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();
        thief.sayMystrength();
        thief.sayMyagility();
        thief.sayMyintelligence();

        Character healer = new Character();

        healer.strength = 0;
        healer.agility = 2;
        healer.intelligence = 10;
        healer.name = "Estes";
        healer.sayMyName();
        healer.sayMystrength();
        healer.sayMyagility();
        healer.sayMyintelligence();

    }
}
