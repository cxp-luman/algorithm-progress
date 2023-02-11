/*
 * @lc app=leetcode.cn id=21 lang=golang
 *
 * [21] 合并两个有序链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
 func mergeTwoLists(list1 *ListNode, list2 *ListNode) *ListNode {
	if list1 == nil {
		return list2
	}
	if list2 == nil {
		return list1
	}
	dummyNode1 := &ListNode{
		Val:  101,
		Next: list1,
	}
	dummyNode2 := &ListNode{
		Val:  101,
		Next: list2,
	}
	res := &ListNode{
		Val:  101,
		Next: nil,
	}
	insertNode := res
	curNode1 := dummyNode1.Next
	curNode2 := dummyNode2.Next
	for curNode1 != nil && curNode2 != nil {
		if curNode1.Val <= curNode2.Val {
			insertNode.Next = curNode1
			curNode1 = curNode1.Next
		} else {
			insertNode.Next = curNode2
			curNode2 = curNode2.Next
		}
		insertNode = insertNode.Next
		insertNode.Next = nil
	}
	if curNode1 != nil {
		insertNode.Next = curNode1
	}
	if curNode2 != nil {
		insertNode.Next = curNode2
	}
	return res.Next
}
// @lc code=end

