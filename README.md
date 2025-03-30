"# leetcode-team-challenge" 
Average Salary:
-My approach was to find the total sum of the values in the salary array as that value is integral to finding the average (salary sum/ salary length)
-I also needed to find a way to the smallest and largest salaries, initially setting min and max to 0 did not work as those values were not being update (1000 < 0 -doesn't work)
-So i used extreme values instead (max = -2147483648, 1000 > -2147483648 or min = 2147483647, 1000 < 2147483647 this works)
-As i loop through the array i update the min and max values whilst accruing the total into totalSum
-I then subtract the min and max salaries from totalSum and save that new value into trueSum
-with trueSum i divide by length of salary array (subract 2 as we removed two values min and max from the calculus)

#PSEUDOCODE{

Set total to 0;
Set min to +infinity
Set max to -infinity

For every value in array{
	add to total
	check if each value is less than +infinity{
		if it is its the new minimum
		compare that new minimum with each new iterated value 
		set to new min if its smaller
	}
	check if each value is greater than -infinity{
		if it is its the new maximum
		compare that new maximum with each new iterated value 
		set to new max if its larger
	}
}
remove min and max value from total
return new total/(salary length -2 (for min and max removed))
}

Squares of Sorted Array

-Approach brute force
-loop, square and sort

Create an empty result array of same length as input

For each number in input array:
    Square the number
    Add it to the result array

Sort the result array

return result array