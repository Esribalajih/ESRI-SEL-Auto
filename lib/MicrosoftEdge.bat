java -Dwebdriver.edge.driver="MicrosoftWebDriver.exe" -jar selenium-server-standalone-2.53.1.jar -port 5558 -role node -hub http://localhost:4444/grid/register -browser "browserName=MicrosoftEdge,platform=WINDOWS,maxInstances=3"