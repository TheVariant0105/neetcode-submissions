class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        front=[0]*len(nums)
        front[0]=1
        back=[0]*len(nums)
        back[-1]=1
        list1=[]
        for i in range(1,len(front)):
            front[i]=front[i-1]*nums[i-1]
            back[len(back)-i-1]=back[len(back)-i]*nums[len(back)-i]
        for i in range(len(nums)):
            list1.append(front[i]*back[i])
        return list1
        
        