package animal;

public class Human extends Animal implements Thinkable {
    // インスタンス変数
    private String hobby;

    // デフォルトコンストラクタ
    public Human() {
    }

    // 引数ありコンストラクタ（nameとageはAnimalクラスから継承）
    public Human(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }

    // setterとgetter
    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    // Thinkableクラスのthinkメソッドをオーバーライド（型 名前 引数は親と一致させること）
    @Override
    public void think() {
        System.out.println("私は" + this.hobby + "について考えています。");
    }

}
