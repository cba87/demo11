package com.example.demo11;

public class Bank {
	
    //賦予branch新的預設值,而不是程式本身的預設值 null;
	private String branch = "TTA分行";
	
	private String user;
	
	private int balance;
	
	
	//預設建構方法，格式:方法的存取權限 類別名稱(){}
	//              public    Bank () ,}
	//預設建構方法 -->就是沒有參數的建構方法
	//當類別中沒有帶有參數的建構方法時，沒有參數的建構方法就是預設建構方法，其省略不寫也可以使用
	//當類別中建立帶有參數的建構方法時，沒有參數的建構方法就不再是預設建構方法，沒寫就不能使用
	//如果有帶有參數的建構方法，就必須生成一個不帶有參數的建構方法
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	//帶有參數的建構方法,實作內容等同於setXXX方法,實際作用在於減少程式碼行數
	public Bank(String branch,String user,int balance) {
		super();
		this.branch = branch;
		this.user = user;
		this.balance = balance;
		
	}
	
	//建立屬性的存(get)取(set)方法
	//一般方法:
	//格式:方法的存取權限 方法的回傳值的資料型態 方法名稱(參數資料型態 參數變數名稱){方法實作內容} 
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
		System.out.println("存款前餘額"+balance);
		//判斷amount是否為正數
		if(amount>=0) {
		//原本的金額+存款金額
		balance += amount;
		}else {
			System.out.println("存款金額不能為負數");
			}
		System.out.println("存款後餘額"+balance);
	}
	
	public void withdraw(int amount){
		System.out.println("提款前餘額"+balance);
		if(amount>=0) {
			if(amount<=balance) {
				balance = balance-amount;
		        System.out.println("提款後餘額"+balance);
		    if(amount>balance){
		    	System.err.println("餘額不足");
		    }
		}
	}
		if(amount<0) {
			System.err.println("提款金額不能為負數");
			}
//		if(amount>balance) {
//		  System.err.println("提款金額不能超過帳戶現有存款");
//		  		}
	}

}
