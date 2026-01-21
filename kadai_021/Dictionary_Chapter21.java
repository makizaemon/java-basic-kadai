package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
    // 辞書を管理するHashMap
    private HashMap<String, String> dictionary;
    
    // コンストラクタ
    public Dictionary_Chapter21() {
        // HashMapのインスタンスを作成
        dictionary = new HashMap<>();
        
        // 10個の英単語と意味を格納
        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウイ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }
    
    // 英単語の意味を調べるメソッド
    public void searchWords(String[] words) {
        // 配列の各英単語について処理
        for (String word : words) {
            // 辞書に単語が存在するか確認
            if (dictionary.containsKey(word)) {
                // 存在する場合は意味を出力
                System.out.println(word + "の意味は" + dictionary.get(word));
            } else {
                // 存在しない場合はエラーメッセージを出力
                System.out.println(word + "は辞書に存在しません");
            }
        }
    }
}
