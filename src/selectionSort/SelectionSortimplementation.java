package selectionSort;

public class SelectionSortimplementation {
	
	public int [] SelectionSort(int []a) {
	
		for(int i=0;i<a.length;i++) {
			int min=i;
			for(int j=i;j<a.length;j++) {
				if(a[j]<a[min]) {
					int temp=a[min];
					a[min]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
}
