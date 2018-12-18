
int[] a={5,1,2,4,3};15243 12543 12453 12435
int large=0;
int b=a.length;
while(b!==0)
     {for(int i=0;i<a.length-1;i++)
        {if(a[i]>a[i+1])
           {large=a[i];
            a[i]=a[i+1];
            a[i+1]=top;}
        }
     b--;} 
