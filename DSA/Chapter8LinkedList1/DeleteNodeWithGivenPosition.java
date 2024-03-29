package DSA.Chapter8LinkedList1;

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

public class DeleteNodeWithGivenPosition {

    
    
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
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        
        System.out.println();
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {
            LinkedListNode<Integer> head = takeInput(); 

            int pos = Integer.parseInt(br.readLine().trim());
            head = deleteNode(head, pos);
            print(head);

            t -= 1;
        }
    }

    public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		if(head == null) return head;

		LinkedListNode<Integer> ref = head;

		if (pos == 0) return head.next;

		for (int i = 0 ; ref != null && i < pos - 1 ; i++) {
			ref = ref.next;
		}
		
        if (ref == null || ref.next == null) return head ;

        ref.next = ref.next.next ;

        return head ;
	}
}