
public class Q9_Grade {
	int math;
	int science;
	int english;
	
	public Q9_Grade(int math,int science,int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	public int average() {
		return ((math+science+english)/3);
	}
}
