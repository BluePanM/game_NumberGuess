package zgc.moon.game;

import java.util.Random;

/**
 * Created by 中秋月 on 2016/11/14.
 *
 * @author 中秋月
 * @author Mid_Autumn_moon
 *
 * 用以生成随机数。
 */
class RandomNumber {
	// 设置随机数
	private int makeNumber() {
		Random rand = new Random();
		int number = 100;                       // 随机数，默认100
		number = rand.nextInt();
		return number;
	}

	// 取得随机数
	int getRandomNumber() {
		return makeNumber();
	}
}
