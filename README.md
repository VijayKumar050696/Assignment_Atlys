# Assignment_Atlys

Prerequisites:-
Java 11
Maven
Git


Setup:-
git clone https://github.com/VijayKumar050696/Assignment_Atlys.git
cd Assignment_Atlys
mvn clean install

Running the test suits:-
# for run Web automation suite using below cmd:-
mvn clean test -DxmlFile=src/Suits/livelyroot_Web_Search_flow_test.xml
![Screenshot 2024-12-08 at 7.32.36 PM.png](..%2F..%2F..%2F..%2FDesktop%2FScreenshot%202024-12-08%20at%207.32.36%E2%80%AFPM.png)

# for run API automation suite using below cmd:-
mvn clean test -DxmlFile=src/Suits/getWidgets_Api_Test_Suite.xml
![Screenshot 2024-12-08 at 7.01.13 PM.png](..%2F..%2F..%2F..%2FDesktop%2FScreenshot%202024-12-08%20at%207.01.13%E2%80%AFPM.png)


Report:-
The test results are generated using testNG. verify test execution results in test-output folder and open index.html file in any browser like chrome, firefox etc.  
![Screenshot 2024-12-08 at 7.32.57 PM.png](..%2F..%2F..%2F..%2FDesktop%2FScreenshot%202024-12-08%20at%207.32.57%E2%80%AFPM.png)


