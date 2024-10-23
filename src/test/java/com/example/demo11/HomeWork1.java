package com.example.demo11;
import org.junit.jupiter.api.Test;


public class HomeWork1 {
	@Test
	public void LecTest() {
		System.out.printf("雞的數量為:");
		System.out.println(this.Endlessloop1(35,129));
		System.out.printf("\n");
		System.out.printf("兔的數量為:");
		System.out.println(this.Endlessloop2(35,129));
	}
	public int Endlessloop1(int a,int b) {
		int chicken=0;
		int rabbit;
		int sum;
		for ( ;;) {
			chicken++;
			rabbit=a-chicken;
			sum=2*chicken+4*rabbit;
			if(sum==b) {
				break;
			}
			if(chicken>a) {
				chicken=0;
				break;
			}
		}
		return chicken;

	}
	public int Endlessloop2(int a,int b) {
		int chicken=0;
		int rabbit;
		int sum;
		for ( ;;) {
			chicken++;
			rabbit=a-chicken;
			sum=2*chicken+4*rabbit;
			if(sum==b) {
				break;
			}
			if(chicken>a) {
				rabbit=0;
				break;
			}
		}
		return rabbit;

	}
	public void chickenRabbitTogetherByInfiniteLoop(int head int foot) {
		//判斷是否為偶數;能否被2整除
		if(foot%2==1) {
			System.out.println("此題無解");
			return;
		}
		//假設兔子數目是0隻
		int chicken=head-rabbit;
		//利用兔子的數目，反推雞的數目
		if(rabbit*4+chicken*2==foot) {
			System.out.println("雞:兔\n%d:%d\n",chicken,rabbit);
			//因為只有唯一解，離開迴圈
			break;
		}
	}
	//case2:下一輪
	rabbit++;
	//如果兔>頭，無解，跳出迴圈
	if(rabbit>head) {
		System.out.println("此題無解");
		
	}
	
	
	

}
