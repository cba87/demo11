package com.example.demo11;
import org.junit.jupiter.api.Test;


public class HomeWork1 {
	@Test
	public void LecTest() {
		System.out.printf("�����ƶq��:");
		System.out.println(this.Endlessloop1(35,129));
		System.out.printf("\n");
		System.out.printf("�ߪ��ƶq��:");
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
		//�P�_�O�_������;��_�Q2�㰣
		if(foot%2==1) {
			System.out.println("���D�L��");
			return;
		}
		//���]�ߤl�ƥجO0��
		int chicken=head-rabbit;
		//�Q�Ψߤl���ƥءA�ϱ������ƥ�
		if(rabbit*4+chicken*2==foot) {
			System.out.println("��:��\n%d:%d\n",chicken,rabbit);
			//�]���u���ߤ@�ѡA���}�j��
			break;
		}
	}
	//case2:�U�@��
	rabbit++;
	//�p�G��>�Y�A�L�ѡA���X�j��
	if(rabbit>head) {
		System.out.println("���D�L��");
		
	}
	
	
	

}
