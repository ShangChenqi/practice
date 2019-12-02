package niukeOffer;

/**
 * 题目描述：翻转单词顺序列
 */
public class Practice44 {
    public String ReverseSentence(String str) {
        StringBuffer result = new StringBuffer();
        //str.trim().equals("")不写会出错
        if (str == null || str.trim().equals("")) {
            return str;
        }
        String[] splitBySpace = str.split("\\s");
        if(splitBySpace.length == 0){
            return str;
        }
        for(int i = splitBySpace.length - 1; i >= 0; i--){
            for(int j = 0; j < splitBySpace[i].length(); j++){
                result.append(splitBySpace[i].charAt(j));
            }
            if(i != 0){
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Practice44().ReverseSentence(""));
    }
}
