package DSA.Chapter8LinkedList1.Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;
    
    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class FindANodeInLL {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static LinkedListNode<Integer> takeInput() throws IOException {
        LinkedListNode<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while(i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
            i += 1;
        }

        return head;
    }
    
    public static void print(LinkedListNode<Integer> head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {
            
            LinkedListNode<Integer> head = takeInput(); 
            int n = Integer.parseInt(br.readLine().trim());
            int ans = findNode(head, n);
            System.out.println(ans);
            t -= 1;
        }
    }

    public static int findNode(LinkedListNode<Integer> head, int n) {
        int index = 0 ;
        while (head != null) {
			
            if (head.data == n) {
                return index ;
            }
            head = head.next ;
			index++;
        }
		return -1;
	}

}
