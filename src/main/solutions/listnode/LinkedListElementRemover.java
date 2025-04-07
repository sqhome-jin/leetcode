package solutions.listnode;

/**
 * 203. 移除链表元素
 * 
 * 题目描述：
 * 删除链表中等于给定值 val 的所有节点。
 * 需要遍历链表并移除所有值等于 val 的节点，同时保持其他节点的相对顺序不变。
 * 
 * 示例：
 * 输入：head = [1,2,6,3,4,5,6], val = 6
 * 输出：[1,2,3,4,5]
 * 解释：删除值为 6 的两个节点后，链表变为 1->2->3->4->5
 * 
 * 输入：head = [], val = 1
 * 输出：[]
 * 解释：空链表，无需删除
 * 
 * 输入：head = [7,7,7,7], val = 7
 * 输出：[]
 * 解释：所有节点值都为 7，删除后变为空链表
 * 
 * 限制条件：
 * - 列表中的节点数目在范围 [0, 10^4] 内
 * - 1 <= Node.val <= 50
 * - 0 <= val <= 50
 */
public class LinkedListElementRemover {
    
    /**
     * 移除链表中所有值等于给定值的节点
     * 使用虚拟头节点简化边界情况的处理
     * 
     * @param head 链表的头节点
     * @param val 要移除的目标值
     * @return 移除指定元素后的链表头节点
     */
    public ListNode removeElements(ListNode head, int val) {
        // 创建虚拟头节点，简化对头节点的处理
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;  // 当前遍历到的节点
        
        // 遍历链表，检查每个节点的下一个节点值
        while (current.next != null) {
            if (current.next.val == val) {
                // 如果下一个节点的值等于目标值，跳过该节点
                current.next = current.next.next;
            } else {
                // 如果下一个节点的值不等于目标值，移动到下一个节点
                current = current.next;
            }
        }
        
        // 获取新的头节点并清理虚拟头节点
        head = dummy.next;
        dummy = null;
        return head;
    }
}