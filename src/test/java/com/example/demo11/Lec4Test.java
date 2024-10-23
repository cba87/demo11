package com.example.demo11;
import java.util.Random;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import ch.qos.logback.core.net.SyslogOutputStream;

public class Lec4Test {
	@Test
	public void arrTest() {
		int[]arr1=new int[7];
//		arr1=new int[5];重新宣告後 原本陣列內容會消失
		Integer[]arr1Class=new Integer[7];
		int[]arr2=new int[7];
		int[]arr3= {1,2,3,4,5,6,7};
		int[]arr4=new int[7];
		arr4={1,2,3,4,5,6,7};
		
//		System.out.println(arrl[0]);//剛宣告的陣列內容值都會是Null或預設值
//		System.out.println(arrlClass[0]);
		System.out.println(arr3[0]);//索引值是從0開始
		
		//放值
		arr1[0]=99;
		System.out.println(arr1[0]);
		
		
		
	}
	//practice
			double weather1=30.0;
			double weather2=26.5;
			double weather3=27.5;
			double weather4=23.3;
			double weather5=21.8;
			double weather6=28.5;
			double weather7=35.9;
			double[]weather= {30.0,26.5,27.5,23.3,21.8,28.5,35.9};
			
	public double avgWeather(double[]weatherData) {
		System.out.println(weatherData.toString());
		//只要不是基本資料型態變數裡面存的會是記憶體位置，故直接把變數名稱轉換為字串
//		System.out.println(Arrays.toString(weatherData));
		//需要使用Arrays提供的方法才能正確印出內容值

		for(int i=0;1<weatherData.length;i++) {
			System.out.println(weatherData[i]);
		}
	}
	@Test
	public void ScoreTest(){
		int[]score= {10,6,8,7,9};
		Arrays.sort(score);//從最小到最高開始排序
		System.out.println(Arrays.toString(score));
		System.out.println(score);//記憶體位置
		int max=10;
		int mini=10;
		for (int i=0;i<score.length;i++) {
		   if(score[i]>max) {
			   max=score[i];
		   }
		
		   if(score[i]<mini) {
			   mini=score[i];
		   }
		}
		int sum=0;
		for(int i=0;i<score.length;i++){
			sum+=score[i];
		}
		int avgscore=(sum-max-mini)/3;
		System.out.println();
		System.out.printf("平均分數:%d",avgscore);
		System.out.println();
		for (int i=0;i<score.length;i++) {
			if(score[i]>mini&&score[i]<max) {
				System.out.printf("有效分數:%d ",score[i]);
			}
		}
		
	}
	@Test
	public void listTest() {
		//宣告
	     List<String>list1=Arrays.asList("1","2");//無法增刪
	     List<Integer>list2=List.of(99,100);//無法修改
	     System.out.println(list1.get(0));
	}
	@Test
	public double avgWeatherByList(List<Double> weatherList) {
		double sum=0;
//		for(int i=0;i<weatherList.size();i++) {
//			sum+=weatherList.get(i);
//		}
//		return sum/weatherList.size();
	
	    //item 是可自定義的變數名稱，用來代稱冒號後面的list裡的每一筆資料，可增加程式的可讀性
		for(Double item:weatherList) { //item=weatherList.get(i)
			System.out.println(item);
		}
//			sum+=item;    //lambda 寫法的限制是不能有區域變數在裡面，所以無法用來計算所有資料的綜合
//			System.out.println(item);
		
//		return 0.0;
	}
    @Test
    /**猜數字遊戲
     * 
     */
	public void practice() {
    	List<Integer> randonList= new ArrayList<Integer>();
    	for(;;) {
    		double randonNumber1=Math.random();
    		int randonNumber2=(int) (randonNumber1*10);
//    		System.out.println(randonnumber2);
    		if(!randonList.contains(randonNumber2)) {
    			randonList.add(randonNumber2);
    		}
    		if (randonList.size()==4) {
    			break;
    		}
    		
    	}
    	for(int item:randonList) {
    		System.out.printf("%d",item);
    	}
    	System.out.println();
    	System.out.printf("請輸入4位數");
    	Scanner scanner=new Scanner(System.in);
    	int number;
//    	int sumA=0;
//    	int sumB=0;
    	for(;;) {
    	number=scanner.nextInt();
    	List<Integer>numberList=new ArrayList<Integer>();
        numberList.add((number/1000)%10);
        numberList.add((number/100)%10);
        numberList.add((number/10)%10);
        numberList.add(number%10);
    	int sumA=0;
     	int sumB=0;
    	for(int i=0;i<randonList.size();i++) {
    		if(numberList.get(i)==randonList.get(i)) {
    			sumA+=1;
    		}else if (randonList.contains(numberList.get(i))){
    			sumB+=1;
    		}
       	}
//    	System.out.println();
    	System.out.printf("%dA%dB",sumA,sumB);
    	if(sumA==4) {
    		break;
    	}
    	
  	}
    	System.out.println();
		System.out.println("終於...");
    
}
    


}