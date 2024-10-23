package com.example.demo11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

public class CollectionTest {

	@Test
	public void listTest() {
		Bank bank = new Bank();
		// List是介面(Interface),只用來定義方法而已，並無任何實作內容，所以無法使用new建立實例
		// ArrayList是用來實現定義在List中方的實座類別;
		List<Bank> list = new ArrayList<Bank>();
		// List中的資料型態不能放8種基本資料型態，一 =斯是製6w9x41u,6
		List<String> strList = new ArrayList<>();
		strList.add("A");
		strList.add("B");
		strList.add("C");
		strList.add("D");
		for (int i = 0; i < strList.size(); i++) {
			if (strList.get(i).equals("B")) {
				strList.remove(i);
			}
			System.out.println(strList.get(i));
		}
	}

	@Test
	public void listTest2(){
		LinkedList list = new LinkedList();
		list.add("A");
		list.add("B");O
		list.add("C");
		list.add("D");
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		List<String> strList = new ArrayList<String>();
		strList.add("A");
		strList.add("B");
	    strList.add("C");
		strList.add("D");
		System.out.println(strList.get(0));
		System.out.println(strList.size()-1);
	}

	@Test
	public void hashSetTest() {
		// HashSet
		// 1.相同的元素只會保留一個(不允許重複的元素)
		// 2.沒有順序(不會依照新增的順序來排列)
		Set<String> strSet = new HashSet<>();
		strSet.add("A");
		strSet.add("C");
		strSet.add("A");
		strSet.add("B");
		strSet.add("F");
		strSet.add("D");
		strSet.add("E");
		strSet.add("B");

		for (String item : strSet) {
			System.out.println(item);
		}

		Set<Integer> strSet2 = new HashSet<>();
		strSet2.add(2);
		strSet2.add(2);
		strSet2.add(1);
		strSet2.add(7);
		strSet2.add(8);
		strSet2.add(0);
		strSet2.add(4);
		strSet2.add(5);
		for (Integer item : strSet2) {
			System.out.println(item);
		}
	}

	@Test
	// linkedHashSet
	// 1.相同的元素只會保留一個(不允許重複的元素)
	// 2.有順(會依照新增的順序來排列)
	public void linkedHashSetTest() {
		Set<String> strSet = new LinkedHashSet<>();
		strSet.add("A");
		strSet.add("C");
		strSet.add("A");
		strSet.add("B");
		strSet.add("F");
		strSet.add("D");
		strSet.add("E");
		strSet.add("B");

		for (String item : strSet) {
			System.out.println(item);
		}
	}

	@Test
	// TreehSet
	// 1.相同的元素只會保留一個(不允許重複的元素)
	// 2.由小到大排序
	public void treeSetTest() {
		Set<String> strSet = new TreeSet<>();
		strSet.add("A");
		strSet.add("C");
		strSet.add("A");
		strSet.add("B");
		strSet.add("F");
		strSet.add("D");
		strSet.add("E");
		strSet.add("B");

		for (String item : strSet) {
			System.out.println(item);
		}
	}

	@Test
	public void SetTest() {
		Set<Integer> strSet = new TreeSet<>();
		while (strSet.size() < 5) {
			int number = (int) (Math.random() * 10);
//		System.out.println(number);
			strSet.add(number);
		}

		for (Integer item : strSet) {
			System.out.printf("%2d",item);

		}
		Object[] intArray = strSet.toArray();
		System.out.println();
		System.out.printf("最小:%d", intArray[0]);
		System.out.println();
		System.out.printf("最大:%d", intArray[4]);
		System.out.println();

		for (int i = intArray.length-1; i >= 0; i--) {
			System.out.printf("%2d",intArray[i]);
		}
	}
	@Test
	public void Settest() {
		Set<Integer> set = new TreeSet<>();
		Random ran = new Random();
		for(;set.size()<=5;) {
			
		}
		
		while(set.size()<=5){}
//		int number = ran.nextInt(1,11);
		//上述2行中，因為number被宣告後只使用一次，可用匿名方式合併
		set.add(ran.nextInt(1,11));
		//轉型:將值的資料型態轉換成另一種資料型態
		//1.被轉型的資料型態寫在變數前面，一定要有小括號(TreeSet<Integer>)set
		//2.使用小括號將轉換的資料型態和值框在一起，這樣才能使用轉換資料型態後的方法
		//3.慎用
		System.out.println("min:"+((TreeSet<Integer>)set).first());
		System.out.println("max:"+((TreeSet<Integer>)set).last());
		//將Set轉成List
		List<Integer>list = new ArrayList<>(set);
		System.out.println("min:"+list.get(0));
		System.out.println("max:"+list.get(list.size()-1));
		//由小到大
		System.out.println(set);
		//由大到小
		Collections.reverse(list);//reverse:反轉排序
		System.out.println(list);
	}
	@Test
	public void maplist(){
		//May<key 的資料型態>,value的資料型態
		Map<Integer,String> map = new Hashmap<>();
		map.put(1,"A");
		map.put(2,"B");
		map.put(3,"C");
		//使用get(Key值)透過key將對應的value取出
		String str=  map.get(2);
		//遍歷:使用foreach 將map中的key-value 取出
		//將map轉成entrySet,item就是包含了key跟value，可以使用getkey和getvalue取值
		for(Entry<Integer, String> item : map.entrySet()) {
			System.out.println(item.getKey());
			System.out.println(item.getValue());

		}
		for( Integer item : map.keySet()) {
			System.out.println("key:"+item);
			System.out.println("value:"+map.get(item));

		}
		//原本map中，已存在key = 1以及對應的value = A;
		//現在在相同1的位置放入D,key=1其對應的value會變成D(相同key,對應的value後蓋前)
		map.put(1,"D");
		//不同的key，可以有相同或不同的對應value
		map.put(4,"D");
		for(Entry<Integer, String> item : map.entrySet()) {
			System.out.println(item.getKey());
			System.out.println(item.getValue());
			}
	}
	@Test
	public void mapTest2() {
		//Key-value 是1對1
		Map<Integer,String>map = new HashMap<>();
		//Key-value 是1對多
		Map<Integer,String[]>map2 = new HashMap<>();
		Map<Integer,List<String>>map3 = new HashMap<>();
		Map<Integer,Set<String>>map4 = new HashMap<>();
		Map<Integer,Map<String,String>>map5 = new HashMap<>();		
	}
	@Test
	public void test123() {
		//isEmpty():詢問集合或是Map 其 Size是否為0(空的)
		List<String>list = new ArrayList<>();
		System.out.println(list.isEmpty());
		
		Set<String>set = new HashSet<>();
		System.out.println(set.isEmpty());
		
		Map<Integer,String> map = new HashMap<>();
		System.out.println(map.isEmpty());
		//=========
		List<String>list2 = null;
		//因為list2是null,所以無法使用null透過.方法來執行程式，會報錯
		System.out.println(list2.isEmpty());
	}
}
