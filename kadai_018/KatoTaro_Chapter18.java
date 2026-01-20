package kadai_018; // パッケージ指定

public class KatoTaro_Chapter18 extends Kato_Chapter18 { // 太郎クラス

    public void setGivenName() { // 名前を設定するメソッド
        givenName = "太郎"; // 名を太郎に設定
    }

    @Override
    public void eachIntroduce() { // 個別紹介の実装
        System.out.println("私はJavaが得意です"); // 個別メッセージ
    }
}
