public class SapXepChen implements SapXepInterface {

	@Override
	public void sapXepTang(double[] arr) {
		int i, j;
		int n = arr.length;
		double key;
		for (i = 1; i < n; i++) {
			key = arr[i];
			j = i - 1;
			/*
			 * Di chuyển các phần tử có giá trị lớn hơn giá trị key về sau một vị trí ban
			 * đầu của nó
			 */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	@Override
	public void sapXepGiam(double[] arr) {
		int i, j;
		int n = arr.length;
		double key;
		for (i = 1; i < n; i++) {
			key = arr[i];
			j = i - 1;
			/*
			 * Di chuyển các phần tử có giá trị lớn hơn giá trị key về sau một vị trí ban
			 * đầu của nó
			 */
			while (j >= 0 && arr[j] < key) {// đổi dấu 
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

}
