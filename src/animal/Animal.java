package animal;

public class Animal {
    // インスタンス変数
    private String name;
    private int age;

    // デフォルトコンストラクタ
    public Animal() {
    }

    // 引数ありコンストラクタ
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // setter、getter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // メソッド（自己紹介する）
    public void say() {
        System.out.println(this.name + "です。" + this.age + "歳です。");
    }

}
