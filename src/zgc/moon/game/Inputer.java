package zgc.moon.game;

import java.util.Scanner;

/**
 * Created by 中秋月 on 2016/11/16.
 *
 * @author 中秋月
 * @author Mid_Autumn_moon
 *
 * Inputer类用来实现数据读入
 */
class Inputer {
	/**
	 * 让玩家选择是否玩游戏
	 * <b>默认</b>返回false
	 */
	static boolean playOrNot() {
		Scanner sc_play = new Scanner(System.in);
		System.out.println("玩游戏吗(输入\"q\"以退出)");
		// 输入，防止错误数据
		while (true) {
			System.out.print("[Y/n/q]>>>");
			String answer = sc_play.nextLine();
			// 玩游戏
			if (answer.equals("Y") || answer.equals("Y"))
				return true;
			// 不玩游戏
			if (answer.equals("N") || answer.equals("n"))
				return false;
			// 退出
			if (answer.equals("Q") || answer.equals("q"))
				return false;
			// 无输入
			if (answer.equals(""))
				return true;
		}

		// return false;
	}
	/**
	 * 选择难度
	 * 默认返回1（即难度为最简单）
	 */
	static int getDifficulty() {
		Scanner sc_diff = new Scanner(System.in);
		System.out.println("请选择难度(输入\"q\"以退出)\n[1~3（1为最简单，3为最难）]>>>");
		while (true) {
			String diff = sc_diff.nextLine();
		}

	}
}
