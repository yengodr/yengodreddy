package methodOverriding;

public class MclassB extends MclassA {
	public void sub() {
		int x = 1000;
		int y = 100;
		int z = x - y;
		System.out.println(z);

	}
	public static void main(String[] args) {
		MclassB obj=new MclassB();
		obj.sub();
		obj.add();
	}
}
