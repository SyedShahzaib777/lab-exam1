
public class javathreads {
	public static void main(String args[]) {
		final int limit = 20;
		
		Thread eventhread =new Thread(()->{
		try {
            for (int i = 0; i <= limit ; i += 2) {
                System.out.println("even :" +i);        
                Thread.sleep(500); 
            }
        } catch (InterruptedException e) {
            System.out.println("Even thread interrupted");
	}
		});
		
		Thread oddthread = new Thread(()->{
			try{
				for(int i=1;i<=limit;i+=2) {
					System.out.println("odd :"+i);
					Thread.sleep(500);
				}
				}catch(InterruptedException e){
					System.out.println("odd thread interrupted");
			}
		});
		oddthread.start();
		eventhread.start();
		
	}
}
