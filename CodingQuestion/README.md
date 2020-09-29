# PaytmLabs SDE Challenge

## Coding Question

Write an interface for a data structure that can provide the moving average of the last N elements added, add elements to the structure and get access to the elements. Provide an efficient implementation of the interface for the data structure.


### Minimum Requirements

1. Provide a separate interface (IE `interface`/`trait`) with documentation for the data structure

```MovingAveLastN``` is the separate interface for the data structure

2. Provide an implementation for the interface

```MovingAverage``` is the main Java class that include test cases and main function. 

3. Provide any additional explanation about the interface and implementation in a README file.

Note:
The interface inculde four methods: 
- `getN()`
- `add()`
- `get()`
- `getAvg()`

This method run time is O(1). We can improve this method using window method which will do the first in last out, and pop out the first item in the queue and add the last one by calculating the notation for: Average=(Number_of_Queue * Last_Average-First_Item+L_Item)/Number_of_Queue



