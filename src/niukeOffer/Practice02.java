package niukeOffer;

/**
 * 题目描述：请实现一个函数，将一个字符串中的每个空格替换成“%20”。 例如，当字符串为We Are
 * Happy.则经过替换之后的字符串为We%20Are%20Happy。
 *
 * @author Shang
 *
 */
public class Practice02 {

	/**
	 * StringBuffer,遍历原字符串的所有字符。 使用StringBuffer的append方法构件新的字符串。
	 * 
	 */
	public String replaceSpace(StringBuffer str) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				result.append("%20");
			} else {
				result.append(str.charAt(i));
			}
		}

		return result.toString();
	}
}
