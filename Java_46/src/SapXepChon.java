public class SapXepChon implements SapXepInterface {

	@Override
	public void sapXepTang(double[] arr) {
		int n = arr.length;// n là số lượng phần tử
		int i, j, min_idx;
		// Di chuyển danh giới của mảng đã sắp xếp và chưa sắp xếp
		for (i = 0; i < n - 1; i++) {
			// Tìm phần tử nhỏ nhất của mảng chưa sắp xếp
			min_idx = i;
			for (j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;
			// Đổi chỗ phần tử nhỏ nhất với phần từ đầu tiên
			double temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	@Override
	public void sapXepGiam(double[] arr) {
		int n = arr.length;// n là số lượng phần tử
		int i, j, min_idx;
		// Di chuyển danh giới của mảng đã sắp xếp và chưa sắp xếp
		for (i = 0; i < n - 1; i++) {
			// Tìm phần tử nhỏ nhất của mảng chưa sắp xếp
			min_idx = i;
			for (j = i + 1; j < n; j++)
				if (arr[j] > arr[min_idx])// sắp xếp giảm thay bằng dấu >
					min_idx = j;
			// Đổi chỗ phần tử nhỏ nhất với phần từ đầu tiên
			double temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

}
