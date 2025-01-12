import java.util.*;
class Solution {

    public String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(heights[i]<heights[j])
                {
                    int temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;

                    String tempo = names[i];
                    names[i] = names[j];
                    names[j] = tempo;
                }
            }
        }
        return names;
    }
    public void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] heights = new int[n];
        for(int i=0;i<n;i++)
        {
            heights[i] = sc.nextInt();
        }
        sc.nextLine();
        String[] names = new String[n];
        for(int i=0;i<n;i++)
        {
            names[i] = sc.next();
        }
        String[] result = sortPeople(names, heights);
        for(String name : result)
        {
            System.out.print(name+" ");
        }

    }
}