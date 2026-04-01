
public class 제어문_반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		/*char sum='0';
        for(int i=1;i<=10;i++)
        {
        	if(i%2==0)
        		;
        	else
        		i=sum*1;
        	
        }
        System.out.println(sum);
        
        // 1~10 ==> 3의 배수는 제외하고 출력
      
       /* for(int i=1;i<=10;i++)
        {
        	if(i%3!=0)
        		System.out.print(i+" ");
        }*/
        int a=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0 && i%3==0)
			       System.out.println(i+" ");
			
		}
		
		
        
	
	}
}

