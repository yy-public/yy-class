public class Demo02Practice{
	public static void main(String[] args){
		int i;
		int num =5;
		for (i = 2; i < num; i++){
			if (num % i == 0){
				System.out.println("�ⲻ������");
				break;
			}
		}
		if (num == i){
			System.out.println("��������");
		}
	}
}