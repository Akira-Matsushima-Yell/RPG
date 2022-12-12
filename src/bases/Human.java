package bases;

import utils.Dice;

public abstract class Human extends Living {
	
	public Human(String name, String weapon ){
		super(name, weapon );
		
	}
		// attackメソッドのオーバーライド
	
	@Override
	public void attack (Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする	
	 
		int num = Dice.get(1, 11) * getOffensive();
		// 相手のHPをダメージ値だけ減らす
		target.setHp(target.getHp()-num);
		// 自分の攻撃力を1だけ減らす
		setOffensive(getOffensive()-1);
		//
		String profile =this.name +"が　" + this.weapon +"で攻撃!" +target.name +"に" + num + "のダメージを与えた。" ;
		profile += "しかし自分の攻撃力も1減少した。";
		System.out.println(profile);
	}

}