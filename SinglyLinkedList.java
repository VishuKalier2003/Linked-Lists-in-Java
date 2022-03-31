import java.util.Scanner;
public class SinglyLinkedList
{
    public static void main(String args[])
    {
        LinkedList<Integer> Singly = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int t = 0;
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter data to be stored in Linked List : ");
            t = sc.nextInt();
            Singly.add(t);
            sc.close();
        }
    }
}