package com.arajit.cracking.code.interview.ch02.linkedlist;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LinkListCloneRandomPointerTest {

  LinkListCloneRandomPointer linkListCloneRandomPointer = new LinkListCloneRandomPointer();

  @Test
  public void deep_clone() {
    //1->2->3->4->5->null
    //------^
    //   ------^
    Node start = new Node(1);
    start.next = new Node(2);
    start.next.next = new Node(3);
    start.next.next.next = new Node(4);
    start.next.next.next.next = new Node(5);

    // 1's random points to 3
    start.other = start.next.next;

    // 2's other points to 4
    start.next.other = start.next.next.next;

    System.out.println("Original list : ");
    linkListCloneRandomPointer.print(start);

    System.out.println("Cloned list : ");
    Node clonedList = linkListCloneRandomPointer.clone(start);
    linkListCloneRandomPointer.print(clonedList);

    //Check if cloning is successful
    assertTrue(isEqual(start, clonedList));

    //Modify cloned list to perform negative test. Set 2's other to null
    clonedList.next.other = null;
    assertFalse(isEqual(start, clonedList));
    //Set 2's other to point 5
    clonedList.next.other = clonedList.next.next.next.next;
    assertFalse(isEqual(start, clonedList));
  }

  boolean isEqual(Node source, Node target) {

    if (source == null || target == null) {
      return false;
    }

    while (source != null && target != null) {

      //Return false if source and target data is not same same.
      if (source.data != target.data) {
        return false;
      }

      // Return false if source other is not null and (target other is null or source other data and target other data is not same)
      if (source.other != null && (target.other == null
          || source.other.data != target.other.data)) {
        return false;
      }

      source = source.next;
      target = target.next;
    }

    return true;
  }

}
