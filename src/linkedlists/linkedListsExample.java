package linkedlists;

public class linkedListsExample {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode (int val) {
            this.val = val;
        }
    }
    
    // Function to get the sum of all values from an integer linked list
    public static int getSum(ListNode head) {
        int ans = 0;
        while (head != null) {
            ans += head.val;
            head = head.next;
        }

        return ans;
    }
    
    // Function to get the sum of all values from an integer linked list recursively
    public static int getSumRecursive(ListNode head) {
        if (head == null) {
            return 0;
        }

        return head.val + getSumRecursive(head.next);
    }
    
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        one.next = two;
        two.next = three;
        three.next = four;
        ListNode head = one;
        
        System.out.println(head.val);
        System.out.println(head.next.val);
        System.out.println(head.next.next.val);
        System.out.println(head.next.next.next.val);
        
        // Call getSum function
        System.out.println(getSum(head));
        
        // Call getSumRecursive function
        System.out.println(getSumRecursive(head));
    }
}