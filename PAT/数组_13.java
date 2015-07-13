package BASE;

import java.util.Scanner;

public class 数组_13 {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int result[][] = new int[n][n];
		int upBound = 0;
		int downBound = n - 1;
		int leftBound = 0;
		int rightBound = n - 1;
		int num = 1;// 记录数字值，每插入一个，自增一次
		while (upBound <= downBound && leftBound <= rightBound) {

			for (int j = leftBound; j <= rightBound; j++) {
				result[upBound][j] = num;
				num++;
			}
			if (upBound == downBound)// 避免重复插入行
				break;
			/*
			 * 一圈的最上一行插入完毕，开始向数组插入右侧列，方向为从上至下。 此时上届指针应该下移一行，其他指针不动，行循环变量逐层下移。
			 * i代表行循环变量
			 */
			upBound++;// 上届下移一行
			for (int i = upBound; i <= downBound; i++) {
				result[i][rightBound] = num;
				num++;
			}
			if (leftBound == rightBound)// 避免重复插入列
				break;
			/*
			 * 一圈的右边界列插入完毕，开始向下边界行插入数字，方向为从右向左。 此时右边界指针左移一行，其他指针不动，列循环变量逐列向做移动。
			 * j代表列循环变量
			 */
			rightBound--;// 右届左移一行
			for (int j = rightBound; j >= leftBound; j--) {
				result[downBound][j] = num;
				num++;
			}
			/*
			 * 一圈的下边界行插入完毕，开始向左边界插入列数字，方向为从下往上。
			 * 此时下边界指针向上移动一行，其他指针不动，行循环变量逐层向上移动。 i代表行循环变量
			 */
			downBound--;// 下界上移一行
			for (int i = downBound; i >= upBound; i--) {
				result[i][leftBound] = num;
				num++;
			}
			/*
			 * 至此一圈的插入过程完成，重现continue开始进入下一圈的插入过程。 此时左边界指针需要重新调整，即需向右移动一行。
			 */
			leftBound++;// 左边界右移一行
		}

		/*
		 * 输出方阵螺旋数组
		 */
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%3d",result[i][j]);
			}
			System.out.println();
		}

	}

}