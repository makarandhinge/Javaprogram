class DynamicArray{
    private int arr[];
    private int size;
    private int count;

    public DynamicArray()
    {
        this.size = 1;
        this.arr = new int [size];
        this.count = 0;

    }
    public void insert(int value)
    {
        CheckAndGrow();
        arr[count]=value;
        count++;
    
    }
    public void display()
    {
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    private void CheckAndGrow()
    {
        if(this.size == this.count)
        {
            int temparr[] = new int[size*2];
            for(int i=0;i<count;i++)
            {
                temparr[i]=arr[i];

            }
            arr = temparr;
            size = size*2;
        }
    }
}

public class DArray {
    public static void main(String[] args) {
        DynamicArray d = new DynamicArray();
        d.insert(5);
        d.insert(6);
    }    
}
