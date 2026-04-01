// 0~9 난수 발생 ==> 100개 발생
// AI
// 빅데이터 ==> 예측(AI)
import java.util.Arrays;
public class 빈도수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[45];
        
        //초기화


//        for(int i=0;i<=100;i++)
//        {
//        	int rand=(int)(Math.random()*10);
//        	arr[rand]++;
//        }
//        System.out.println(Arrays.toString(arr));
//        for(int i=0;i<arr.length;i++)
//        {
//        	System.out.println(i+"==>"+arr[i]);
//        }
        
        for(int i=0;i<=1000;i++)
        {
        	int rand=(int)(Math.random()*45);
        	arr[rand]++;
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println((i+1)+"==>"+arr[i]);
        }
	}

}
