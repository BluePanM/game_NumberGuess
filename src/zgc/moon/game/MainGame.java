package zgc.moon.game;

/**
 * Created by 中秋月 on 2016/11/14.
 *
 * @author 中秋月
 * @author Mid_Autumn_moon
 *
 * 游戏的主类，具体的逻辑在这里实现
 */
public class MainGame {
	public static void main(String[] args) {
		// 打印欢迎消息
		Printer.printInformation();
		// 玩游戏吗？
		if (!Inputer.playOrNot()) {
			// 不玩则退出
			System.out.println("您选择了退出。");
			System.exit(0);
		}
		// 获取难度
		int difficulty = Inputer.getDifficulty();
		// 获取随机数
		BetterNumber br = new BetterNumber();
		int randomNumber = br.getBetterNumber(difficulty);
	}
}
