package com.arajit.cracking.code.interview.ch02.linkedlist;

class Node {

  int data;
  Node next, other;

  Node(int data) {
    this.data = data;
    this.next = this.other = null;
  }
}

/**
 * Clone a linked list to another linked list where next pointer points to next node and other
 * pointer points to a random node in the list.
 *
 * Example:
 * 1->2->3->4->5->null
 * ------^
 *    ------^
 *
 * Below is the Algorithm:
 *
 * Step 1: Create the copy of node 1 and insert it between node 1 & node 2 in original Linked List,
 * create the copy of 2 and insert it between 2 & 3.. Continue in this fashion, add the copy of N
 * after the Nth node
 *
 * Step 2: Now copy the random link in this fashion original->next->random= original->random->next;
 * // Traverse two nodes This works because original->next is nothing but copy of original and
 * original->random->next is nothing but copy of random.
 *
 * Step 3: Now restore the original and copy linked lists in this fashion in a single loop.
 * original->next=original->next->next; copy->next=copy->next->next;
 *
 * Ensure that original->next is NULL and return the cloned list
 */
public class LinkListCloneRandomPointer {

  void print(Node head) {
    Node ptr = head;
    StringBuilder buffer = new StringBuilder();
    while (ptr != null) {
      buffer.append("Data = ").append(ptr.data);
      if (null != ptr.other) {
        buffer.append(", Other = ").append(ptr.other.data);
      } else {
        buffer.append(", Other = ").append("null");
      }
      System.out.println(buffer.toString());
      buffer.setLength(0);
      ptr = ptr.next;
    }
  }

  //Complexity: Time O(n), Space O(1)
  Node clone(Node start) {
    if (null == start) {
      return null;
    }

    Node curr = start, temp = null;

    // Insert additional node after every node of original list
    while (curr != null) {
      temp = curr.next;

      // Inserting node
      curr.next = new Node(curr.data);
      curr.next.next = temp;
      curr = temp;
    }
    curr = start;

    // Adjust the random pointers of the newly added nodes
    while (curr != null) {
      if (curr.next != null) {
        curr.next.other = (curr.other != null)
            ? curr.other.next : curr.other;
      }

      // move to the next newly added node by skipping an original node
      curr = (curr.next != null) ? curr.next.next
          : curr.next;
    }

    Node original = start, copy = start.next;

    // save the start of copied linked list
    temp = copy;

    // now separate the original list and copied list
    while (original != null && copy != null) {
      original.next = (original.next != null) ?
          original.next.next : original.next;

      copy.next = (copy.next != null) ? copy.next.next
          : copy.next;
      original = original.next;
      copy = copy.next;
    }

    return temp;
  }



}
