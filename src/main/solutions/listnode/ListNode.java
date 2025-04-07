package solutions.listnode;

/**
 * 链表节点类
 * 
 * 用于构建单向链表的基本节点结构，每个节点包含一个整数值和指向下一个节点的引用。
 * 这个类被用作多个链表相关题目的基础数据结构。
 */
public class ListNode {
    /**
     * 节点存储的值
     */
    public int val;

    /**
     * 指向下一个节点的引用
     * 如果是最后一个节点，则为 null
     */
    public ListNode next;

    /**
     * 默认构造函数
     * 创建一个空节点
     */
    public ListNode() {
    }

    /**
     * 创建一个具有指定值的节点
     * 
     * @param val 节点的值
     */
    public ListNode(int val) {
        this.val = val;
    }

    /**
     * 创建一个具有指定值和下一个节点的节点
     * 
     * @param val 节点的值
     * @param next 下一个节点的引用
     */
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
