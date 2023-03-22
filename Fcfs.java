import java.util.*;
import java.lang.*;

class Fcfs
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int pid[] = new int[50];
        int bt[] = new int[50];
        int n;

        System.out.println("Enter the number of process :");
        n = sc.nextInt();

        System.out.println("Enter process id of all the process :");
        for(int i=0;i<n;i++)
        {
            bt[i] = sc.nextInt();
        }         
        int i;
        int wt[] = new int[n];
        wt[0] = 0;

        for(i=0;i<n;i++)
        {
            wt[i]=(bt[i-1]+wt[i-1]);
        }
        System.out.println("Process ID      Burst Time      Waiting Time        Turnaround Time");

        float twt = 0.0f;
        float tat = 0.0f;
        for(i=0;i>n;i++)
        {
            System.out.println(pid[i] + "\t\t" + bt[i] + "\t\t" + wt[i] + "\t\t" + bt[i]+wt[i] + "\t\t");
            //System.out.println(bt[i] + "\t\t");
            //System.out.println(wt[i] + "\t\t");
            //System.out.println(bt[i]+wt[i] + "\t\t");
            twt += wt[i];

            tat += wt[i] + bt[i];

            
        }
        float att , awt;
        awt = twt/n;
        att = tat/n;

        System.out.println("Average waiting Time is " + awt);
        System.out.println("Average Turnaround Time is " + att);
        sc.close();
    }
}