package tw.com.lccnet.J110;

import java.util.Arrays;

import org.junit.Test;

public class ArrayList {

	//一維陣列
	int[] a = { 1, 51, 61, 18, 96, 31, 68, 53, 14 };
	//二維陣列
	int[][] b = {{1,5,2},{5,6,8}};

	@Test
	public void Show() {
		// 選擇排序法
		sort_1();

		System.out.println(Arrays.toString(a));
	}

	@Test
	public void Show2() {
		// 泡沫排序法
		sort_2();

		System.out.println(Arrays.toString(a));
	}
	
	@Test
	public void Show3(){
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j]);
			}
			System.out.println("======"+i+"=======");
		}
	}

	/**
	 * 選擇排序法
	 */
	public void sort_1() {
		
		for (int i = 0; i < a.length - 1; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {

					int tmp = a[i];

					a[i] = a[j];

					a[j] = tmp;
				}
			}
		}

	}

	/**
	 * 泡沫排序法
	 */
	public void sort_2() {
		
		for (int i = 0; i < a.length - 1; i++) {

			for (int j = 0; j < a.length - i - 1; j++) {

				if (a[j] > a[j + 1]) {

					int tmp = a[j];

					a[j] = a[j + 1];

					a[j + 1] = tmp;
				}
			}
		}
	}
}
