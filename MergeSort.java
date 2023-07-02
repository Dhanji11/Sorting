// Implemenation of merge sort
import java.util.*;

public class MergeSort
{
public static void merge(int y[],int beg,int mid,int end)
{
    int i=0;
    int ei=mid+1,bi=beg;
   int temp[]=new int[end-beg+1];
   while(bi<=mid && ei<=end)
    {
        if(y[bi]<=y[ei])
        temp[i++]=y[bi++];
    else
        temp[i++]=y[ei++];
    }
    while(bi<=mid)
    temp[i++]=y[bi++];
    while(ei<=end)
    temp[i++]=y[ei++];
     for(int p=0,q=beg;p<temp.length;p++,q++)
     {
        y[q]=temp[p];
     }
}
public static void mergeSort(int x[],int beg,int end)
{

    if(beg<end)
    {
    int mid=beg+(end-beg)/2;
    mergeSort(x,beg,mid);
    mergeSort(x,mid+1,end);
    merge(x,beg,mid,end);
    }
    return;
}

    public static void main(String[] args) 
    {
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the size of an array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
         mergeSort(arr,0,size-1);
         System.out.println("After apply merge sort to the list");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
} 
