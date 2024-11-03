/**
 * Main
 */
public class Main {

    /**
     * モンスターポーカー 1. モンスターカードをユーザとCPUがランダムに5枚引く モンスターカードは5種類存在し，役によって攻撃力が変わる 2回まで指定したカードを交換できる
     *
     * 2. AP，DPを役に応じて計算し，バトル．DPを超えたAPの場合，差分はプレーヤーあるいはCPUへのダメージとなる 3. プレーヤーあるいはCPUのHPが0になったら終わり．
     *
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        MonsterPoker mp = new MonsterPoker();
        mp.run();
    }
}
