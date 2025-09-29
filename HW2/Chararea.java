import java.util.Scanner;
public class Chararea {
    private char[][] grid;
    public Chararea(char[][] grid){ this.grid=grid; }
    public int charArea(char ch){
        int mindong=grid.length, maxdong=-1, mincot=grid[0].length, maxcot=-1, count=0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[i].length;j++)
                if(grid[i][j]==ch){
                    count++;
                    if(i<mindong)mindong=i;
                    if(i>maxdong)maxdong=i;
                    if(j<mincot)mincot=j;
                    if(j>maxcot)maxcot=j;
                }
        if(count==0)return 0;
        if(count==1)return 1;
        return (maxdong-mindong+1)*(maxcot-mincot+1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int dong=sc.nextInt(), cot=sc.nextInt(); sc.nextLine();
        char[][] grid=new char[dong][cot];
        for(int i=0;i<dong;i++)
            grid[i]=sc.nextLine().toCharArray();
        Chararea bang=new Chararea(grid);
        char ch=sc.nextLine().charAt(0);
        System.out.println(bang.charArea(ch));
        sc.close();
    }
}
