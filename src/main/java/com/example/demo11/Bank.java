package com.example.demo11;

public class Bank {
	
    //�ᤩbranch�s���w�]��,�Ӥ��O�{���������w�]�� null;
	private String branch = "TTA����";
	
	private String user;
	
	private int balance;
	
	
	//�w�]�غc��k�A�榡:��k���s���v�� ���O�W��(){}
	//              public    Bank () ,}
	//�w�]�غc��k -->�N�O�S���Ѽƪ��غc��k
	//�����O���S���a���Ѽƪ��غc��k�ɡA�S���Ѽƪ��غc��k�N�O�w�]�غc��k�A��ٲ����g�]�i�H�ϥ�
	//�����O���إ߱a���Ѽƪ��غc��k�ɡA�S���Ѽƪ��غc��k�N���A�O�w�]�غc��k�A�S�g�N����ϥ�
	//�p�G���a���Ѽƪ��غc��k�A�N�����ͦ��@�Ӥ��a���Ѽƪ��غc��k
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	//�a���Ѽƪ��غc��k,��@���e���P��setXXX��k,��ڧ@�Φb���ֵ{���X���
	public Bank(String branch,String user,int balance) {
		super();
		this.branch = branch;
		this.user = user;
		this.balance = balance;
		
	}
	
	//�إ��ݩʪ��s(get)��(set)��k
	//�@���k:
	//�榡:��k���s���v�� ��k���^�ǭȪ���ƫ��A ��k�W��(�ѼƸ�ƫ��A �Ѽ��ܼƦW��){��k��@���e} 
	//    public      String        getBranch(){}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}   
	
	
	public void saving(int amount){
		System.out.println("�s�ګe�l�B"+balance);
		//�P�_amount�O�_������
		if(amount>=0) {
		//�쥻�����B+�s�ڪ��B
		balance += amount;
		}else {
			System.out.println("�s�ڪ��B���ର�t��");
			}
		System.out.println("�s�ګ�l�B"+balance);
	}
	
	public void withdraw(int amount){
		System.out.println("���ګe�l�B"+balance);
		if(amount>=0) {
			if(amount<=balance) {
				balance = balance-amount;
		        System.out.println("���ګ�l�B"+balance);
		    if(amount>balance){
		    	System.err.println("�l�B����");
		    }
		}
	}
		if(amount<0) {
			System.err.println("���ڪ��B���ର�t��");
			}
//		if(amount>balance) {
//		  System.err.println("���ڪ��B����W�L�b��{���s��");
//		  		}
	}

}
