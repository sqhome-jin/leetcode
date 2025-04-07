package listnode;
import org.junit.jupiter.api.Test;
import solutions.listnode.LinkedListElementRemover;
import solutions.listnode.ListNode;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListElementRemoverTest {
    private LinkedListElementRemover solution = new LinkedListElementRemover();

    @Test
    public void testExample() {
        // 测试示例1：移除值为6的节点
        ListNode head = createList(new int[]{1, 2, 6, 3, 4, 5, 6});
        ListNode expected = createList(new int[]{1, 2, 3, 4, 5});
        assertListEquals(expected, solution.removeElements(head, 6));
    }

    @Test
    public void testEmptyList() {
        // 测试空链表的情况
        assertNull(solution.removeElements(null, 1));
    }

    @Test
    public void testRemoveAll() {
        // 测试所有节点都需要被移除的情况
        ListNode head = createList(new int[]{7, 7, 7, 7});
        assertNull(solution.removeElements(head, 7));
    }

    @Test
    public void testNoRemoval() {
        // 测试没有节点需要被移除的情况
        ListNode head = createList(new int[]{1, 2, 3, 4, 5});
        assertListEquals(head, solution.removeElements(head, 6));
    }

    // 辅助方法：创建链表
    private ListNode createList(int[] values) {
        if (values == null || values.length == 0) return null;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    // 辅助方法：比较两个链表是否相等
    private void assertListEquals(ListNode expected, ListNode actual) {
        while (expected != null && actual != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        assertNull(expected);
        assertNull(actual);
    }
}