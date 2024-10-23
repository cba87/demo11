package com.example.demo11;

import org.junit.jupiter.api.Test;

public class ExtendTest {

	@Test
	public void animalTest() {
		Animal ani = new Animal();
		ani.setName("霸氣1扛3");
		ani.eat();
		ani.sleep();
	}

	@Test
	public void animalTest2() {
		Animal ani = new Animal("ani", 5);
		ani.setName("霸氣1扛3");
		ani.eat();
		ani.sleep();
	}

	@Test
	public void birdTest() {
		Bird bri = new Bird();
		bri.setName("霸氣1扛3");
		bri.eat();
		bri.sleep();
	}

	@Test
	public void birdTest2() {
		Bird bri = new Bird("BIRD", 5);
		bri.setName("霸氣1扛3");
		bri.eat();
		bri.sleep();
	}

	@Test
	public void test() {
		int a = 1;
		System.out.println(a++);
	}

	@Test
	public void test2() {
		Father father = new Father("兔");
		father.walking();
		Son son = new Son("大兔崽子");
		son.playball();
		Daughter daughter = new Daughter("小兔崽子");
		daughter.shoppint();
	}

	public void birdtest() {
		// 雖然接回來的資料型態是父類別，但因為new出來的實例是子類別，所以本質上就是子類別
		Animal bird = new Bird("Bird", 5);
		// eat跟sleep執行的會是子類別定義的實作內容
		bird.eat();
		bird.sleep();
		// 以下2個方法無法被呼叫，因為沒有被定義在父類別中
		// bird.flying
		// 綜合以上，當新建立出來的子類別接受的資料型態是父類別時
		// 1.只能呼叫定義在父類別中的方法
		// 2.當子類別有重新定義類別的方法時，執行的會是子類別的實作內容
	}

	@Test
	public void birdTest4() {
		Bird bird = new Bird("bird", 5);
		// 執行的是定義在Bird中的實作內容
		bird.flying();
		// 重新定義flying()的方法
		// 1.在建立新的實例時直接給予新的實作內容
		// 2.大括號要寫在分號之前且結尾一定要有分號
		// 3.重新定義的實作內容就僅此在這次執行
		// 4.@Override 可有可無，但建議加
		Bird bird2 = new Bird("bird", 5) {

			@Override
			public void flying() {
				System.out.println("笨鳥慢飛");
			}

		};

	}

}
