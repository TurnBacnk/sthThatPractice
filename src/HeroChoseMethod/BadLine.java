package HeroChoseMethod;

public class BadLine extends Location {


    public BadLine(String heroName, String ability, String equipment, int playNo) {
        this.heroName = heroName;
        this.ability = ability;
        this.equipment = equipment;
        this.playNo = playNo;
    }

    public void can() {
        System.out.println("Push");
    }

}
