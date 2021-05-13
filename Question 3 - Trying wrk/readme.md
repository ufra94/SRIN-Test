
### Objections:
1. Try using HTTP Benchmark tool 'wrk'
2. List down the parameter which can be changed from benchmark tools and the parameter from the result test.

### Implementation:
1. Download wrk and run it using Windows subsystem for Linux (Ubuntu)
2. Try running wrk load test on local environment on 'Greeting' GET API created for question 4.


![Image](https://github.com/ufra94/SRIN-Test/blob/main/Question%203%20-%20Trying%20wrk/Screenshot4.PNG)


### Parameter List
1. Parameters to run the application.
    -c : connection, which specifies the number of HTTP connection to be used on a load test.
    -d : duration, which specifies how long a test will run (i.e. 5s, 2m, 1h)
    -t : thread, which specifies the number of threads used in a test. The total number of connections is distributed evenly among the threads.
    -s:  script, to run a LuaJIT script
    -h : header, which specifies the HTTP header that may be added to a request
    --latency : to print a detailed latency report
    --timeout : if a response isn't recieved within a specified amount of time, record as timeout.
    
2. Parameters on report
