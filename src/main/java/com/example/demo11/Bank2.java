package com.example.demo11;


public class Bank2 extends BankTest{
	
	
	//�`��(�T�w���ܪ���):�ܼƦW�٥��j�g�A���P�^��r�����Ω��u�걵
	public final int MAX_NUMBER = 10;
	
	//�@�몺�ݩ��ܼơA�Τp�m�p���覡�R�W
	private String branchTitle;

	public Bank2() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public Bank2(String branchTitle) {
		super();
		this.branchTitle = branchTitle;
	}



	public String getBranchTitle() {
		return branchTitle;
	}
	
	

}