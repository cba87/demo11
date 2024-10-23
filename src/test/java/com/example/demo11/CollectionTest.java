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
		// List�O����(Interface),�u�Ψөw�q��k�Ӥw�A�õL�����@���e�A�ҥH�L�k�ϥ�new�إ߹��
		// ArrayList�O�Ψӹ�{�w�q�bList���誺��y���O;
		List<Bank> list = new ArrayList<Bank>();
		// List������ƫ��A�����8�ذ򥻸�ƫ��A�A�@ =���O�s6w9x41u,6
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
		// 1.�ۦP�������u�|�O�d�@��(�����\���ƪ�����)
		// 2.�S������(���|�̷ӷs�W�����ǨӱƦC)
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
	// 1.�ۦP�������u�|�O�d�@��(�����\���ƪ�����)
	// 2.����(�|�̷ӷs�W�����ǨӱƦC)
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
	// 1.�ۦP�������u�|�O�d�@��(�����\���ƪ�����)
	// 2.�Ѥp��j�Ƨ�
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
		System.out.printf("�̤p:%d", intArray[0]);
		System.out.println();
		System.out.printf("�̤j:%d", intArray[4]);
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
		//�W�z2�椤�A�]��number�Q�ŧi��u�ϥΤ@���A�i�ΰΦW�覡�X��
		set.add(ran.nextInt(1,11));
		//�૬:�N�Ȫ���ƫ��A�ഫ���t�@�ظ�ƫ��A
		//1.�Q�૬����ƫ��A�g�b�ܼƫe���A�@�w�n���p�A��(TreeSet<Integer>)set
		//2.�ϥΤp�A���N�ഫ����ƫ��A�M�Ȯئb�@�_�A�o�ˤ~��ϥ��ഫ��ƫ��A�᪺��k
		//3.�V��
		System.out.println("min:"+((TreeSet<Integer>)set).first());
		System.out.println("max:"+((TreeSet<Integer>)set).last());
		//�NSet�নList
		List<Integer>list = new ArrayList<>(set);
		System.out.println("min:"+list.get(0));
		System.out.println("max:"+list.get(list.size()-1));
		//�Ѥp��j
		System.out.println(set);
		//�Ѥj��p
		Collections.reverse(list);//reverse:����Ƨ�
		System.out.println(list);
	}
	@Test
	public void maplist(){
		//May<key ����ƫ��A>,value����ƫ��A
		Map<Integer,String> map = new Hashmap<>();
		map.put(1,"A");
		map.put(2,"B");
		map.put(3,"C");
		//�ϥ�get(Key��)�z�Lkey�N������value���X
		String str=  map.get(2);
		//�M��:�ϥ�foreach �Nmap����key-value ���X
		//�Nmap�নentrySet,item�N�O�]�t�Fkey��value�A�i�H�ϥ�getkey�Mgetvalue����
		for(Entry<Integer, String> item : map.entrySet()) {
			System.out.println(item.getKey());
			System.out.println(item.getValue());

		}
		for( Integer item : map.keySet()) {
			System.out.println("key:"+item);
			System.out.println("value:"+map.get(item));

		}
		//�쥻map���A�w�s�bkey = 1�H�ι�����value = A;
		//�{�b�b�ۦP1����m��JD,key=1�������value�|�ܦ�D(�ۦPkey,������value��\�e)
		map.put(1,"D");
		//���P��key�A�i�H���ۦP�Τ��P������value
		map.put(4,"D");
		for(Entry<Integer, String> item : map.entrySet()) {
			System.out.println(item.getKey());
			System.out.println(item.getValue());
			}
	}
	@Test
	public void mapTest2() {
		//Key-value �O1��1
		Map<Integer,String>map = new HashMap<>();
		//Key-value �O1��h
		Map<Integer,String[]>map2 = new HashMap<>();
		Map<Integer,List<String>>map3 = new HashMap<>();
		Map<Integer,Set<String>>map4 = new HashMap<>();
		Map<Integer,Map<String,String>>map5 = new HashMap<>();		
	}
	@Test
	public void test123() {
		//isEmpty():�߰ݶ��X�άOMap �� Size�O�_��0(�Ū�)
		List<String>list = new ArrayList<>();
		System.out.println(list.isEmpty());
		
		Set<String>set = new HashSet<>();
		System.out.println(set.isEmpty());
		
		Map<Integer,String> map = new HashMap<>();
		System.out.println(map.isEmpty());
		//=========
		List<String>list2 = null;
		//�]��list2�Onull,�ҥH�L�k�ϥ�null�z�L.��k�Ӱ���{���A�|����
		System.out.println(list2.isEmpty());
	}
}
