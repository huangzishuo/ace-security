package tongji.until;

import tongji.domain.oracle.TCRMPersonBObjType;

public class test {

	public static void main(String[] args) {
		TCRMPersonBObjType t = new TCRMPersonBObjType();
		System.out.println(t.getClass().getDeclaredFields()[64].getName());
		System.out.println(boolean.class);
	}
}
