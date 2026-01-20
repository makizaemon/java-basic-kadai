package kadai_018; // パッケージ指定

public class KatoExec_Chapter18 { // 実行クラス

    public static void main(String[] args) { // mainメソッド

        KatoTaro_Chapter18 taro = new KatoTaro_Chapter18(); // 太郎のインスタンス生成
        taro.familyName = "加藤"; // 姓を設定
        taro.address = "東京都中野区〇×です"; // 住所を設定
        taro.setGivenName(); // 名前設定
        taro.execIntroduce(); // 紹介実行

        KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18(); // 一郎のインスタンス生成
        ichiro.familyName = "加藤"; // 姓を設定
        ichiro.address = "東京都中野区〇×です"; // 住所を設定
        ichiro.setGivenName(); // 名前設定
        ichiro.execIntroduce(); // 紹介実行

        KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18(); // 花子のインスタンス生成
        hanako.familyName = "加藤"; // 姓を設定
        hanako.address = "東京都中野区〇×です"; // 住所を設定
        hanako.setGivenName(); // 名前設定
        hanako.execIntroduce(); // 紹介実行
    }
}
