package applicationLogic;

public enum MyNodes {
 n0 ("net11.utdallas.edu", "192.268.91.1", 5350, 5352),
 n1 ("net12.utdallas.edu", "192.268.91.2", 5350, 5352),
 n2 ("net13.utdallas.edu", "192.268.91.3", 5350, 5352),
 n3 ("net14.utdallas.edu", "192.268.91.4", 5350, 5352),
 n4 ("net15.utdallas.edu", "192.268.91.5", 5350, 5352),
 n5 ("net16.utdallas.edu", "192.268.91.6", 5350, 5352),
 n6 ("net17.utdallas.edu", "192.268.91.7", 5350, 5352),
 n7 ("net18.utdallas.edu", "192.268.91.8", 5350, 5352),
 n8 ("net19.utdallas.edu", "192.268.91.9", 5350, 5352),
 n9 ("net20.utdallas.edu", "192.268.91.10", 5350, 5352);
 
 private final String hostName;
 private final String hostIp;
 private final int sendingPort;
 private final int receivingPort;
 
 MyNodes(String hostName, String hostIp, int sendingPort, int receivingPort){
	 this.hostName = hostName;
	 this.hostIp = hostIp;
	 this.sendingPort = sendingPort;
	 this.receivingPort = receivingPort;
 }

public String getHostName() {
	return hostName;
}

public String getHostIp() {
	return hostIp;
}

public int getSendingPort() {
	return sendingPort;
}

public int getReceivingPort() {
	return receivingPort;
}

//Reverse Map maps an integer to corresponding enum
 public static MyNodes reverseMap(int nodeId){
	 return MyNodes.values()[nodeId];
	 
 }
}
