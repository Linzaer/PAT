package BASE;

import java.util.Scanner;

public class ����_13 {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int result[][] = new int[n][n];
		int upBound = 0;
		int downBound = n - 1;
		int leftBound = 0;
		int rightBound = n - 1;
		int num = 1;// ��¼����ֵ��ÿ����һ��������һ��
		while (upBound <= downBound && leftBound <= rightBound) {

			for (int j = leftBound; j <= rightBound; j++) {
				result[upBound][j] = num;
				num++;
			}
			if (upBound == downBound)// �����ظ�������
				break;
			/*
			 * һȦ������һ�в�����ϣ���ʼ����������Ҳ��У�����Ϊ�������¡� ��ʱ�Ͻ�ָ��Ӧ������һ�У�����ָ�벻������ѭ������������ơ�
			 * i������ѭ������
			 */
			upBound++;// �Ͻ�����һ��
			for (int i = upBound; i <= downBound; i++) {
				result[i][rightBound] = num;
				num++;
			}
			if (leftBound == rightBound)// �����ظ�������
				break;
			/*
			 * һȦ���ұ߽��в�����ϣ���ʼ���±߽��в������֣�����Ϊ�������� ��ʱ�ұ߽�ָ������һ�У�����ָ�벻������ѭ���������������ƶ���
			 * j������ѭ������
			 */
			rightBound--;// �ҽ�����һ��
			for (int j = rightBound; j >= leftBound; j--) {
				result[downBound][j] = num;
				num++;
			}
			/*
			 * һȦ���±߽��в�����ϣ���ʼ����߽���������֣�����Ϊ�������ϡ�
			 * ��ʱ�±߽�ָ�������ƶ�һ�У�����ָ�벻������ѭ��������������ƶ��� i������ѭ������
			 */
			downBound--;// �½�����һ��
			for (int i = downBound; i >= upBound; i--) {
				result[i][leftBound] = num;
				num++;
			}
			/*
			 * ����һȦ�Ĳ��������ɣ�����continue��ʼ������һȦ�Ĳ�����̡� ��ʱ��߽�ָ����Ҫ���µ��������������ƶ�һ�С�
			 */
			leftBound++;// ��߽�����һ��
		}

		/*
		 * ���������������
		 */
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%3d",result[i][j]);
			}
			System.out.println();
		}

	}

}