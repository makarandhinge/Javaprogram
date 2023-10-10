import java.util.*;

class sjf
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	 int bt[] , p[] , wt[] , tat[] , i , j , n ,
		    total = 0 , totalt , pos ,temp;
	 float avg_wt , avg_tat;
		bt = new int [20];
		wt = new int [20];
		p = new int [20];
		tat = new int [20];
		System.out.println("Enter a number of process");
		n = sc.nextInt();

		System.out.println("Enter a Burst Time: ");
		for(i=0;i<n;i++)
		{
			System.out.println("P" + i+1 +  ":");
			bt[i] = sc.nextInt();
			p[i] = i + 1;
		}

		for(i=0;i<n;i++)
		{
			pos = i;
			for(j=i+1;j<n;j++)
			{
				if(bt[j] < bt[pos])
				{
					pos = j;
				}
			}


			temp = bt[i];
			bt[i] = bt[pos];
			bt[pos] = temp;

			temp = p[i];
			p[i] = p[pos];
			p[pos] = temp;
		}

		wt[0] = 0;

		for(i=1;i<n;i++)
		{
			wt[i] = 0;
			for(j=0;j<i;j++)
			{
				wt[i] = wt[i] + bt[j];
			}


				total = total + wt[i];

		}

		avg_wt = total / n;

		System.out.println("\n Process\t BurstTime\t WaitingTime\t TurnaroundTime");

		for(i=0;i<n;i++)
		{
			tat[i] = bt[i] + wt[i];

			totalt = totalt + tat[i];

			System.out.println("\nP" + p[i] +"\t\t" + bt[i] + "\t\t" + wt[i] +"\t\t" + tat[i]);
		}



		avg_tat = totalt / n;

		System.out.println("\n\n Average waiting time =" + avg_wt);
		System.out.println("\n\n Average turnaround time =" +avg_tat);
		sc.close();



	}
}
