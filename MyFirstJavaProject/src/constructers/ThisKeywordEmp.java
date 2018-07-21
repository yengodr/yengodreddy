package constructers;

public class ThisKeywordEmp {
	String empname;
	int empid;
	String empdeg;
	String empsal;

	public ThisKeywordEmp(String empname, int empid, String empdeg,
			String empsal) {
		this.empname = empname;
		this.empid = empid;
		this.empdeg = empdeg;
		this.empsal = empsal;
	}

	public static void main(String[] args) {
		ThisKeywordEmp E = new ThisKeywordEmp("R", 1, "se", "5 lacs");
		System.out.println(E.empname);
		System.out.println(E.empid);
		System.out.println(E.empdeg);
		System.out.println(E.empsal);
		ThisKeywordEmp E2 = new ThisKeywordEmp("A", 2, "sse", "11 lacs");
		System.out.println(E2.empname);
		System.out.println(E2.empid);
		System.out.println(E2.empdeg);
		System.out.println(E2.empsal);

	}
}
