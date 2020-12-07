package 刷题;

/**
 * 给定一个int数组AB，要求编写一个函数，不使用任何临时变量直接交换第零个
 * 元素和第一个元素的值。并返回交换后的数组。
 * [1,2]
 * 返回：[2,1]
 */
public class KK {
    public int[] exchangeAB(int[] AB) {
        // write code here
        AB[0]^=AB[1];
        AB[1]^=AB[0];
        AB[0]^=AB[1];
        return AB;
    }
}
