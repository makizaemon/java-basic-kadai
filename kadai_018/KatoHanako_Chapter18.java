package kadai_018; // パッケージ指定

public class KatoHanako_Chapter18 extends Kato_Chapter18 { // 花子クラス

    public void setGivenName() { // 名前を設定するメソッド
        givenName = "花子"; // 名を花子に設定
    }

    @Override
    public void eachIntroduce() { // 個別紹介の実装
        System.out.println("趣味は読書です"); // 個別メッセージ
    }
}
