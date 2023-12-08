package testday3;
/**testday3包中的类*/
public class Character {
    private String name;
    private int hp;//血量
    private int attack;
    private int survive = 1;

    public void attack(Character c){
        System.out.println(this.name + "攻击了" + c.name + "造成了" + this.attack + "伤害");
        c.attacked(this.attack);
    }

    public void attacked(int attack){//判断攻击的对象，并且扣血
        if(this.hp >= attack){
            this.hp = this.hp - attack;
            System.out.println(this.name+"受到了伤害");
        }
        else{
            this.survive = 0;
            System.out.println(this.name + "死亡，对决输");
        }
    }

    public Character(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getSurvive() {
        return survive;
    }
}
