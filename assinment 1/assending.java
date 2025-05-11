import java.util.*;

class assending 
{
public static void main(String[] args)
 {
    int a[]=new int[10];
    int i,j;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array:");
    for(i=0;i<10;i++)
    {
      a[i]=sc.nextInt();
    }
    System.out.println("array is:");
    System.out.print("[");
    for(i=0;i<10;i++)
    {
      System.out.print(a[i] +",");
    }
    System.out.print("]"); 

    System.out.println("ASSENDING ARRAY is:");
    System.out.print("[");
    for(i=0;i<a.length;i++)
    {
      for(j=i+1;j<a.length;j++)
      {
        int temp=0;
        if(a[j]<a[i])
        {
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
       }
   
 
      }
    }
    for(i=0;i<10;i++){
    if(i<10){
       System.out.print(a[i]+"\t");
      }
    }
    System.out.print("]");
 }    
}




// import java.util.*;

// class assending {
//     public static void main(String[] args) {
//         int a[] = new int[5];
//         int i, j;
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter array elements:");
//         for (i = 0; i < 5; i++) {
//             a[i] = sc.nextInt();
//         }

//         System.out.println("Original array:");
//         System.out.print("[");
//         for (i = 0; i < 5; i++) {
//             System.out.print(a[i]);
//             if (i < 4) {
//                 System.out.print(", ");
//             }
//         }
//         System.out.println("]");

//         // Sorting the array in ascending order using Bubble Sort
//         for (i = 0; i < a.length; i++) {
//             for (j = i + 1; j < a.length; j++) {
//                 if (a[j] < a[i]) {
//                     int temp = a[i];
//                     a[i] = a[j];
//                     a[j] = temp;
//                 }
//             }
//         }

//         System.out.println("Ascending array:");
       
//         for (i = 0; i <5; i++) {
//             System.out.print(a[i]);
//             if (i <4) {
//                 System.out.print(", ");
//             }
//         }
        
        
//         sc.close(); // Correct placement of scanner close
//     }
// }
