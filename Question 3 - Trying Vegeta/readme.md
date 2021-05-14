### Objections:
1. Try using HTTP Benchmark tool 'Vegeta'
2. List down the parameter which can be changed from benchmark tools and the parameter from the result test.

### Implementation:
1. Download windows build of Vegeta ver 12.8.3 and run it using windows command prompt.
2. Try vegeta attack on 'Greeting' GET API (created for question 4) in local environment and print out the report

![Image](https://github.com/ufra94/SRIN-Test/blob/main/Question%203%20-%20Trying%20Vegeta/Screenshot3.PNG)

### Parameters
1. Parameters used for running the application:

    Global flags:
      * **cpu** : number of CPUs used in a test
      * **profile** : enable [cpu,heap] profiling. Profiling is used to analyze the complexity and costs. <br /> 
     
    Command:
      * **attack** : Run a load test
      * **encode** : Encodes attack results from one encoding to another. The supported encodings are Gob (binary), CSV and JSON.
      * **report** : Generate and print the report of attack results 
      * **plot** : Outputs an HTML time series plot of request latencies over time.  

    Command Flags (parameters unique for each command):
      *  Attack flags : duration (length of an attack), output (output result), rate (Number of requests per time unit), timeout (specifies duration for a request timeout), etc.
      *  Report flags : bucket (specifies the histogram buckets), every (specifies the report interval), output (output report), type (choose which type among text, json, hist[buckets], hdrplot of report to generate).
      *  encode : output (output result), to (choose which encoding to output among json, csv, gob)
      *  plot : output (output result), threshold (threshold of data points above which series are downsampled), title (title and header of the resulting HTML page)
    
2. Parameters shown in the report:
    * **requests** [total, rate, throughput] : shows the total number of requests issued, the real request rate sustained during the attack period, and the throughput of successful requests over the total period.
    * **duration** [total, attack, wait] : shows the attack time taken issuing all requests, the wait time waiting for the response to the last issued request, and the total time taken in an attack
    * **latency** [min, mean, 50, 90, 95, 99, max] : shows the general statistics of all requests latencies (the amount of time taken for a response to a request to be read) which includes the minimum latency, maximum latency, average latency, and the 50%, 90%, 95%, and 99% percentiles.
    * **Bytes In and Bytes Out** [total, mean]: shows the total and average of bytes sent (out) or received (in) with the request.
    * **success** [ratio] : shows the percentage of requests which didn't return error response
    * **Status codes** [code:count] :Shows a histogram of status codes. 0 status codes mean a request failed to be sent.
    * **Error set** : shows a unique set of errors returned by all issued requests.
 
