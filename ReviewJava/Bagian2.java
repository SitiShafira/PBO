package ReviewJava;

class GameCharacter {
    private String name;
    private int lifePoint = 100;
    private int attackHitPoint;
    private int attackKickPoint;

    public GameCharacter (String name, int attackHitPoint, int attackKickPoint){
        this.name = name;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }

    public void setLifePoint(int lifePoint){
        this.lifePoint = lifePoint;
    }

    public int getLifePoint() {
        return lifePoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void hit(GameCharacter character) {
        character.setLifePoint(character.getLifePoint() - this.attackHitPoint);
    }

    public void kick(GameCharacter character){
        character.setLifePoint(character.getLifePoint()-this.attackKickPoint);
    }

    public void compare(GameCharacter character){
        int hasil = Integer.compare(this.lifePoint, character.getLifePoint());
        if (hasil > 0) {
            System.out.println("Kemenangan dimiliki oleh "+this.name);
        }else if (hasil < 0) {
            System.out.println("Kemenangan dimiliki oleh "+character.getName());
        }else {
            System.out.println("Seri");
        }
    }
}

public class Bagian2 {
    public static void main(String[] args) {

        //objek
        GameCharacter character1 = new GameCharacter("Raiden", 10, 20);
        GameCharacter character2 = new GameCharacter("Sub-Zero", 5, 25);

        //Perlawanan
        character1.kick(character2);
        character2.kick(character1);

        //Pukulan Sub-Zero kepada Raiden sebanyak 3x
        for (int j=0; j<3; j++){
            character2.hit(character1);
        }

        //Tendangan Raiden kepada Sub-Zero sebanyak 4x
        for (int j=0; j<4; j++){
            character1.kick(character2);
        }

        //hasil lifepoint
        System.out.println(character1.getLifePoint());
        System.out.println(character2.getLifePoint());

        //Penentuan kemenangan
        character1.compare(character2);
    }
}
