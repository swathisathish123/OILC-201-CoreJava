package com.ojas.enumPrgs;

//How to create User defined Constructor in enum
enum  Department{
	ACCOUNT(12),HR(20),FINANCE(22);
	private int deptId;

	Department(int deptId) {
		this.deptId = deptId;
	}

	public int getDeptId() {
		return deptId;
	}
}
public class EnumConstructor {

	public static void main(String[] args) {
		
		System.out.println("Account DeptNo = " + Department.ACCOUNT.getDeptId());
		System.out.println("HR DeptNo = " + Department.HR.getDeptId());
		System.out.println("FINANCE DeptNo = " + Department.FINANCE.getDeptId());

	}

}
