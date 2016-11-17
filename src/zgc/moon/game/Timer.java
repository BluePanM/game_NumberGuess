package zgc.moon.game;

/**
 * Created by 中秋月 on 2016/11/14.
 *
 * @author 中秋月
 * @author Mid_Autumn_moon
 *
 * 计时器类
 */
class Timer {
	/**
	 * 本来是打算用多线程计时（持续计时），
	 * 难度太大，故采用“记录开头”和“记录结尾”的方法
	 */

	private static int startTime;                       // 开始的时间
	private static int endTime;                         // 结束的时间

	/**
	 * 启动计时器
	 *
	 * @param id 一个计时器的ID号，防止滥用
	 */
	public void startTimer(int id) {

	}

	/**
	 *
	 * @param id 同启动计时器的ID号，用以结束计时器
	 */
	public void shutdownTimer(int id) {

	}
}
