/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* sortList(ListNode* head) {
        if(!head || !head->next) return head;

        ListNode* slow = head;
        ListNode* fast = head->next;

        while(fast && fast->next){
            slow = slow->next;
            fast = fast->next->next;
        }
        ListNode* rightHead = slow->next;
        slow->next = nullptr;
        
        ListNode* left = sortList(head);
        ListNode* right = sortList(rightHead);
        return merge(left,right);

    }
    ListNode* merge(ListNode* left, ListNode* right){
       
        ListNode result(-1);
        ListNode* temp = &result;
               
        while(left && right){
            if(left->val < right->val){
                temp->next = left;
                left = left->next;
            }
            else{
                temp->next = right;
                right = right->next;
            }
            temp = temp->next;
        }

        while(left){
            temp->next = left;
            left = left->next;
            temp = temp->next;
        }
        while(right){
            temp->next = right;
            right = right->next;
            temp = temp->next;
        }
        return result.next;
    }
};
