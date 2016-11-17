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
			if (answer.equals("Y") || answer.equals("y"))
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
		System.out.println("请选择难度(输入\"q\"以退出)");
		while (true) {
			System.out.print("[1~5(1为最简单，5为最难)]>>>");
			String diff = sc_diff.nextLine();
			// 判断
			// 输入1
			if (diff.equals("1"))
				return 1;
			// 输入2
			if (diff.equals("2"))
				return 2;
			// 输入3
			if (diff.equals("3"))
				return 3;
			// 输入4
			if (diff.equals("4"))
				return 4;
			// 输入5
			if (diff.equals("5"))
				return 5;
			// 输入Q（退出）
			if (diff.equals("Q") || diff.equals("q")) {
				System.out.println("您选择了退出。");
				System.exit(0);
			}
		}

	}
}
