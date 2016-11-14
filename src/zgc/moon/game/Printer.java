package zgc.moon.game;

/**
 * Created by 中秋月 on 2016/11/14.
 *
 * @author 中秋月
 * @author Mid_Autumn_moon
 *
 * 各种输出在这里
 */
class Printer {
	// 状态码
	public final static int SUCCESS = 1, FAILED = 2, GOD = 3;

	// 各种消息
	private static String helloGamer = "";                  // 游戏欢迎
	private static String success = "";                     // 游戏成功
	private static String failed = "";                      // 游戏失败
	private static String godMode = "";                     // 使用上帝模式

	// 打印一些消息
	static void printGameStatus(int needs) {
		switch (needs) {
			// 成功了
			case SUCCESS:
				System.out.println();
				break;
			// 失败了
			case FAILED:
				break;
			// 使用上帝模式
			case GOD:
				break;
		}
	}
}
