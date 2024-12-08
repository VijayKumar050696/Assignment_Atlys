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
# for run API automation suite using below cmd:-
mvn clean test -DxmlFile=src/Suits/getWidgets_Api_Test_Suite.xml

Report:-
The test results are generated using testNG. verify test execution results in test-output folder and open index.html file in any browser like chrome, firefox etc.  

