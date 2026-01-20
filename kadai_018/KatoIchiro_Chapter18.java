package kadai_018; // パッケージ指定

public class KatoIchiro_Chapter18 extends Kato_Chapter18 { // 一郎クラス

    public void setGivenName() { // 名前を設定するメソッド
        givenName = "一郎"; // 名を一郎に設定
    }

    @Override
    public void eachIntroduce() { // 個別紹介の実装
        System.out.println("好きな食べ物はリンゴです"); // 個別メッセージ
    }
}
