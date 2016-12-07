package zgc.moon.game;

import zgc.moon.game.RandomNumber;

/**
 * Created by 中秋月 on 2016/11/14.
 *
 * @author 中秋月
 * @author Mid_Autumn_moon
 *
 * 用来生成符合“难度”的上、下范围
 */
class BetterNumber {
	private RandomNumber randomNumber = new RandomNumber();

	int getBetterNumber(int diffculty) {
		// TODO:把这里的难度修改好！
		return randomNumber.getRandomNumber();
	}
}
