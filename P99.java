class GreedyActivity
{
    public static void main(String args[])
    {
        int start[] = {1, 3, 0, 5, 8, 5};
        int finish[] = {2, 4, 6, 7, 9, 9};

        int n = start.length;

        System.out.println("Selected Activities:");

        int i = 0;
        System.out.println(i);

        for (int j = 1; j < n; j++)
        {
            if (start[j] >= finish[i])
            {
                System.out.println(j);
                i = j;
            }
        }
    }
}
