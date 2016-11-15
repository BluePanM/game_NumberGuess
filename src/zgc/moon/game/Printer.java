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
	/**
	 * <b>SUCCESS</b>代表正常的游戏成功
	 * <b>FAILED</b>代表游戏失败
	 * <b>GOD</b>代表使用上帝模式
	 */
	// 状态码
	public final static int SUCCESS = 1, FAILED = 2, GOD = 3;

	// 各种消息
	private static String helloGamer = "";                  // 游戏欢迎
	private static String success = "";                     // 游戏成功
	private static String failed = "";                      // 游戏失败
	private static String godMode = "";                     // 使用上帝模式

	// 打印游戏信息
	static void printInformation() {
		System.out.println("测试");
	}

	// 打印游戏状态
	static void printGameStatus(int needs) {
		switch (needs) {
			// 成功了
			case SUCCESS:
				System.out.println(success);
				break;
			// 失败了
			case FAILED:
				System.out.println(failed);
				break;
			// 使用上帝模式
			case GOD:
				System.out.println(godMode);
				break;
		}
	}
}
