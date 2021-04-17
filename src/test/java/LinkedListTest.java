import com.datastructure.MyLinkedList;
import com.datastructure.MyNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {
    /*@Description:- Create a Simple linked list of 56,30 and 70 */
    @Test
    public void givenThreeNumberWhenLinkedShouldPassedLinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) &&
                mySecondNode.getNext().equals(myThirdNode);
        Assertions.assertTrue(result);

    }

    /*@Description:- Create linked list by adding 30 and 56 to 70
     * Node with data 70 is First Created
     * Next 30 is added to 70
     * Finally 56 is added to 30
     * LinkedList Sequence: 56->30->70 */
    @Test
    public void givenThreeNumberWhenAddedToLinkedListShouldBeAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList mylinkedList = new MyLinkedList();
        mylinkedList.add(myFirstNode);
        mylinkedList.add(mySecondNode);
        mylinkedList.add(myThirdNode);
        mylinkedList.printMyNodes();
        boolean result = mylinkedList.head.equals(myFirstNode) &&
                mylinkedList.head.getNext().equals(mySecondNode) &&
                mylinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);

    }

    /*@Description:- create LinkedList by appending 30 and 70 to 56
     * Node with data 56 is First Created
     * Next Append 30 to 56
     * Finally Append 70 to 30
     * LinkedList Sequence: 56->30->70 */
    @Test
    public void given3NumbersWhenAppendedShouldBeAddedToLast() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList mylinkedList = new MyLinkedList();
        mylinkedList.add(myFirstNode);
        mylinkedList.add(mySecondNode);
        mylinkedList.add(myThirdNode);
        mylinkedList.printMyNodes();
        boolean result = mylinkedList.head.equals(myFirstNode) &&
                mylinkedList.head.getNext().equals(mySecondNode) &&
                mylinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }

    /*@Description:- To Insert node 30, b/w 56 and 70
     * Final Sequence: 56->30->70 */
    @Test
    public void given3NumbersWhenInsertingSecondNodeInBetweenShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList mylinkedList = new MyLinkedList();
        mylinkedList.add(myFirstNode);
        mylinkedList.append(myThirdNode);
        mylinkedList.insert(myFirstNode, mySecondNode);
        mylinkedList.printMyNodes();
        boolean result = mylinkedList.head.equals(myFirstNode) &&
                mylinkedList.head.getNext().equals(mySecondNode) &&
                mylinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);

    }

    /*@Description:- Delete the first element in the given LinkedList
     * Sequence is : 56->30->70
     * write the pop method
     * Final Sequence is : 30->70 */
    @Test
    public void givenFirstElement_WhenDeletedShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList mylinkedList = new MyLinkedList();
        mylinkedList.add(myFirstNode);
        mylinkedList.append(mySecondNode);
        mylinkedList.append(myThirdNode);
        mylinkedList.pop();
        mylinkedList.printMyNodes();
        boolean result = mylinkedList.head.equals(mySecondNode) &&
                mylinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);

    }

    /*@Description:- delete the last element in the LinkedList of sequence 56->30->70
     * write the popLast method
     * final Sequence is 56->30 */
    @Test
    public void givenLastElement_WhenDeletedShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList mylinkedList = new MyLinkedList();
        mylinkedList.append(myFirstNode);
        mylinkedList.append(mySecondNode);
        mylinkedList.add(myThirdNode);
        mylinkedList.popLast();
        mylinkedList.printMyNodes();
        boolean result = mylinkedList.head.equals(myFirstNode) &&
                mylinkedList.tail.equals(mySecondNode);
        Assertions.assertTrue(result);

    }

    /*@Description:- search LinkedList to find Node with value 30 */
    @Test
    public void givenElement_WhenSearchShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList mylinkedList = new MyLinkedList();
        mylinkedList.add(myFirstNode);
        mylinkedList.append(mySecondNode);
        mylinkedList.append(myThirdNode);
        boolean result = mylinkedList.search(mySecondNode).getKey().equals(mySecondNode.getKey());
        Assertions.assertTrue(result);

    }

    /*@Description:- Insert 40 after 30 to the Linked List sequence of 56->30->70
     * Search LinkedList to get Node with key value 30
     * Final Sequence: 56->30->40->70 */
    @Test
    public void given4NumbersWhenInsertingSecondAfter30ShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(40);
        MyNode<Integer> myFourthNode = new MyNode<>(70);
        MyLinkedList mylinkedList = new MyLinkedList();
        mylinkedList.add(myFirstNode);
        mylinkedList.append(mySecondNode);
        mylinkedList.append(myFourthNode);
        mylinkedList.insert(mylinkedList.search(mySecondNode),myThirdNode);
        mylinkedList.printMyNodes();
        boolean result = mylinkedList.head.getKey().equals(myFirstNode.getKey()) &&
                mylinkedList.head.getNext().getKey().equals(mySecondNode.getKey()) &&
                mySecondNode.getNext().getKey().equals(myThirdNode.getKey()) &&
                mylinkedList.tail.getKey().equals(myFourthNode.getKey());
        Assertions.assertTrue(result);
    }
}
