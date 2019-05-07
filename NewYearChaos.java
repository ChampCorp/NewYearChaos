import java.util.Scanner;


public class NewYearChaos {
	
	static void minimumBribes(int[] q) {

        int n = q.length;
        int count = 0;

        for(int i = n-1;i>=0;i--)
        {
            if(q[i] != (i+1))
            {
                if(((i-1)>=0) && q[i-1]==(i+1))
                {
                    count++;
                    int temp;
                    temp=q[i];
                    q[i]=q[i-1];
                    q[i-1]=temp;
                }
                else if(((i-2)>=0) && q[i-2]==(i+1))
                {
                    count+=2;
                    q[i-2]=q[i-1];
                    q[i-1]=q[i];
                    q[i]=i+1;
                }
                else
                {
                    System.out.println("Too chaotic");
                    return;
                }
                
                
             }
        }

        System.out.println(count); 
        return;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();

}}
