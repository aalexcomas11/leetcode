def powerSet(nums):

  ans = [[]]
  n = len(nums)

  for num in nums:
    
    count = len(ans)

    for j in range(0,count):
      temp = [ans[j][k] for k in range(0, len(ans[j]))]
      temp.append(num)
      ans.append(temp)

  return ans

powerSet([1,2,3])

# PRINTED RECURSIVE VERSION

# def powerSet(n,s,i):
#   if n < i:
#     print(s)
#     return
  
#   powerSet(n,s + str(i),i+1)
#   powerSet(n,s,i+1)

# PRINTED DP VERSION

# def powerSet(n):
#   if(n == 0):
#     print("")
#     return
#   if(n > 0):
#     print("")
#     print('1')
  
#   mem = [["","1"]]
#   i = 2

#   while( i <= n):
#     temp = []

#     for arr in mem:
#       for val in arr:
#         per = val+ " " + str(i)
#         print(per)
#         temp.append(per)
#     mem.append(temp)
#     i += 1