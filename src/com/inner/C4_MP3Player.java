package com.inner;
//anonymous class 



interface Video{
	void play();
}




//: �߻�Ŭ������ ������ �ȵȴ�.
abstract class Song{	// top-level class
	abstract void sing();
}

//: ���� �Ʒ��� ���� �߻�Ŭ������ ��ӹ޾Ƽ� Song�� �̿ϼ� �޼ҵ带 ����(�ϼ�)���ش�.
class MySong extends Song{
	@Override
	void sing() {
		System.out.println("happy song....");
	}
}


//: ���� ���� MySong�� ����� ������.. ���� MySong�� �� �� ���� ���ε� top-level class�� �Ǿ���ȴ�.
//�Ź� �ڲ� �ٲ�� �Ŷ�� �� ��, MySong�� ���� �ʴ�. �̷��� ������ �ʰ� �ٷ� ����???
//anonymous class











public class C4_MP3Player {	//top-level class
	
	//play �޼ҵ��� Ÿ���� Song, Video�� �ٸ�����, �޼ҵ�� �Ȱ��� = �޼ҵ� �����ε�
	public void play(Song s) {
		s.sing();
	}
	
	public void play(Video v) {
		v.play();
	}

	public static void main(String[] args) {
		C4_MP3Player player = new C4_MP3Player();
//		player.play(new MySong());
		
		//����ó�� song�� ��ӹ޴� Top - level - class ���� ����Ŭ������ �ٷ� ����� ����غ���.
		//���� Ŭ����(Song�� ��ӹ޴�, ������ �̸��� ����). new�� ��ü�� �ٷ� �����, ���ǵ� �ٷ� ��������� ������� ���
		//�̸��� ���� :     MP3Player$1.class
		player.play(new Song() {
			
			@Override
			void sing() {
				System.out.println("happy song....");
			}
		});	 
		
		//�� �ٸ� sing ���� ��� ����
		//�̸��� ���� :     MP3Player$2.class
		player.play(new Song() {
			
			@Override
			void sing() {
				System.out.println("yesterday...");
			}
		});
		
		
		
		player.play(new Video() {//video�� �������̽��ϱ� ���� extends�� �޸� implements �ʿ�

			@Override
			public void play() {
				System.out.println("harry potter...");
			}
			
		}); 
	}

}
