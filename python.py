#1.	Write a Python  program for accepting one odd &
#one even length arrays of numbers. Display the median &
#length of each array.

# Function to calculate Sum
def EvenOddSum(a, n):
    even = 0
    odd = 0
    for i in range(n):

        # Loop to find evem, odd Sum
        if i % 2 == 0:
            even += a[i]
        else:
            odd += a[i]

    print "Even index positions sum ", even
    print "nOdd index positions sum ", odd

# Driver Function

arr = [1, 2, 3, 4, 5, 6]
n = len(arr)

EvenOddSum(arr, n)

# This code is contributed by Sachin Bisht
