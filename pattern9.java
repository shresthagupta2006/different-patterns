public class pattern9
{
    public static void main(String[] args) 
    {
        int n=5;
        for(int rows=1;rows<=n;rows++)
        {
            for(int col=1;col<=n-rows;col++)
            {
                System.out.print("  ");
            }
            
        }
        
    }
}