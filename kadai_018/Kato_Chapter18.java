package kadai_018; // パッケージ指定

public abstract class Kato_Chapter18 { // 親クラス（抽象クラス）

    public String familyName; // 姓（名字）
    public String givenName;  // 名（名前）
    public String address;    // 住所

    public void commonIntroduce() { // 共通の自己紹介を出力するメソッド
        System.out.println("名前は" + familyName + givenName + "です"); // 名前を表示
        System.out.println("住所は" + address + "です"); // 住所を表示
    }

    public abstract void eachIntroduce(); // 個別紹介（抽象メソッド）

    public void execIntroduce() { // 紹介を実行するメソッド
        commonIntroduce(); // 共通紹介を実行
        eachIntroduce();   // 個別紹介を実行
    }
}
