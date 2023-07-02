// Implementation of MergeSort 
import java.util.*;
public class QuickSort
{
    public static int partition(int y[],int l,int h)
    {
     int pivot=y[h];
     int i=l-1;  // Assume no single element is less than pivot
        for(int j=l;j<h;j++)
        {
            if(y[j]<pivot)
            {
                i++;
            int temp=y[i];
            y[i]=y[j];
            y[j]=temp;
            }
        }
            i++;
            int temp=y[i];
            y[i]=pivot;
            y[h]=temp;
       return i;
    }
    public static void quickSort(int x[],int low,int high)
    {
        if(low<high)
        {
            int pivotidx=partition(x,low,high);        
             quickSort(x,low,pivotidx-1);
             quickSort(x,pivotidx+1,high);
        }
    }

    public static void main(String[] args) {
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements  of an array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        quickSort(arr,0,size-1);
         System.out.println("After apply quick sort to the list");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}