# NewYearChaos
Hackerrank Problem

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
