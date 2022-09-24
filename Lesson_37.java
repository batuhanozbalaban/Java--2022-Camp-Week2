package Week2;

public class Lesson_37 {

	public static void main(String[] args) {
		
		//inheritance Demo - ileri seviye inheritance kullanım
		
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
		krediUI.KrediHesapla(new AskerKrediManager());
		
		}
		

}
