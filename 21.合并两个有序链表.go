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
//  func mergeTwoLists(list1 *ListNode, list2 *ListNode) *ListNode {
// 	if list1 == nil {
// 		return list2
// 	}
// 	if list2 == nil {
// 		return list1
// 	}
// 	dummyNode1 := &ListNode{
// 		Val:  101,
// 		Next: list1,
// 	}
// 	dummyNode2 := &ListNode{
// 		Val:  101,
// 		Next: list2,
// 	}
// 	curNode1 := dummyNode1
// 	for curNode1.Next != nil {
// 		curNode2 := dummyNode2
// 		for curNode2.Next != nil && curNode1.Next != nil {
// 			if curNode2.Next.Val >= curNode1.Next.Val {
// 				addNode := curNode1.Next
// 				tempNode1 := curNode2.Next
// 				tempNode2 := addNode.Next
// 				curNode2.Next = addNode
// 				addNode.Next = tempNode1
// 				curNode1.Next = tempNode2
// 			}
// 			curNode2 = curNode2.Next
// 		}
// 		if curNode1.Next != nil {
// 			curNode1 = curNode1.Next
// 		}
// 	}
// 	curNode2 := dummyNode2
// 	for curNode2.Next != nil {
// 		curNode1 := dummyNode1
// 		for curNode1.Next != nil && curNode2.Next != nil {
// 			if curNode1.Next.Val >= curNode2.Next.Val {
// 				addNode := curNode2.Next
// 				tempNode2 := curNode1.Next
// 				tempNode1 := addNode.Next
// 				curNode1.Next = addNode
// 				addNode.Next = tempNode2
// 				curNode2.Next = tempNode1
// 			}
// 			curNode1 = curNode1.Next
// 		}
// 		if curNode2.Next != nil {
// 			curNode2 = curNode2.Next
// 		}
// 	}
// 	if dummyNode2.Next != nil {
// 		return dummyNode2.Next
// 	} else {
// 		return dummyNode1.Next
// 	}
// }
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

