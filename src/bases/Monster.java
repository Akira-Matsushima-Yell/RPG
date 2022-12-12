package bases;

import utils.Dice;

// モンスターを表現する抽象クラス
public abstract class Monster extends Living {

	// コンストラクタ
	public Monster(String name, String weapon) {
		// Livingクラスで定義したコンストラクタを利用する
		super(name, weapon );
	}

	// attackメソッドのオーバーライド
	@Override
	public void attack(Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		int num = Dice.get(1, 11) * getOffensive();
		// 相手のHPをダメージ値だけ減らす
		target.setHp(target.getHp() - num);
		//
		System.out.println(this.name +"が　" + this.weapon +"で攻撃!" +target.name +"に" + num + "のダメージを与えた。" );
	
		
	}
}
