
public class Q10_ColorTV extends Q10_TV{
	int size;
	int color;
	
	public Q10_ColorTV() {
		
	}
	
	public Q10_ColorTV(int size) {
		this.size=size;
	}
	public Q10_ColorTV(int size,int color) {
		this.size = size;
		this.color = color;
	}
	
	public void printProperty() {
		System.out.println((size+"인치 "+color+"컬러"));			
	}

}
