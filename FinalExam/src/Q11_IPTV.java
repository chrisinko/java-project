
public class Q11_IPTV extends Q10_ColorTV{
	public String ip;
	
	public Q11_IPTV(int size, int color) {
		super(size, color);
		// TODO Auto-generated constructor stub
	}
	public Q11_IPTV(String ip,int size,int color) {
		this.ip = ip;
		this.size = size;
		this.color = color;
	}
	@Override
	public void printProperty() {
		System.out.println(("나의 IPTV는 "+ip+" 주소의 " + size +"인치 "+color+"컬러"));
	}

}
