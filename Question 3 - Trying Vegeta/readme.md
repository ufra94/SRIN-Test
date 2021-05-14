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
      * **-cpu** : number of CPUs used in a test
      * **profile** : enable [cpu,heap] profiling. Profiling is used to analyze the complexity and costs. <br /> 
     
    Command:
      * **attack** : Run a load test
      * **encode** : Encodes attack results from one encoding to another. The supported encodings are Gob (binary), CSV and JSON.
      * **report** : Generate and print the report of attack results 
      * **plot** : Outputs an HTML time series plot of request latencies over time.  

    Comman Flags (parameters unique for each command):
      *  Attack flags : duration (length of an attack), output (output result), rate (Number of requests per time unit), timeout (duration for a request timeout), etc.
      *  Report flags : bucket (specifies the histogram buckets), every (specifies the report interval), output (output report), type (choose which type among text, json, hist[buckets], hdrplot of report to generate).
      *  encode : output (output result), to (choose which encoding to output among json, csv, gob)
      *  plot : output (output result), threshold (threshold of data points above which series are downsampled), title (title and header of the resulting HTML page)
    
   
 
