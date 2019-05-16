/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    
    public static int xyz(int wt[],int val[],int n,int twt){
        
        int a[][]= new int [n][twt+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<twt+1;j++){
                if(i>0 && j<wt[i])
                {
                    a[i][j]=a[i-1][j];
                }
                else if (i>0 && j>=wt[i]){
                    a[i][j]=Math.max(a[i-1][j],val[i]+a[i-1][j-wt[i]]);
                }
                else{
                    if(wt[i]<=j)
                    a[i][j]=val[i];
                    else
                    a[i][j]=0;
                }
                
            }
            
        }
return a[n-1][twt];
    }
    
    
    
	public static void main (String[] args) {
 int wt[]={1,3,4,5};
 int val[]={1,4,5,7};
 int twt=7;
 System.out.println(xyz(wt,val,wt.length,7));
}
}

