public class pattern7
{
    public static void main(String[] args) 
    {
      int n=4;
      for(int rows=1;rows<=n;rows++)
      {
        for(int col =1;col<=6;col++)
        {
            if(rows==1|| rows==n)
            {
                System.out.print("* ");

            }
            else
            {
                if(col==1)
                {
                    System.out.print("* ");
                }
                else{
                    if(col==6)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                   
                }
            }

        }
         System.out.println("");
      }  
     
       
    }
    

}