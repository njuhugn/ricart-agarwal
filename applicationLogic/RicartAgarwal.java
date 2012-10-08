package applicationLogic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import applicationLogic.MyNodes;

import mina.Listner;
import mina.Sender;

public class RicartAgarwal {
	
	final static Logger logger = LoggerFactory.getLogger(RicartAgarwal.class);
	final static int NUMNODES = 10;

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		
		//The first Argument is the node number of self. By default it is 0
		// Code fragment from :
		// http://docs.oracle.com/javase/tutorial/essential/environment/cmdLineArgs.html
		
		int selfId = 0;
		if (args.length > 0) {
		    try {
		        selfId = Integer.parseInt(args[0]);
		    } catch (NumberFormatException e) {
		        System.err.println("Argument" + " must be an integer");
		        System.exit(1);
		    }
		}
		try {
		initialiseSystem(selfId);
		} catch (Exception e){
			//TODO add error handling
		}
		
	}
	
	public static void initialiseSystem(int selfId) throws Exception {
		System.out.println("Initiating system start sequence...\n");
		MyNodes self = MyNodes.reverseMap(selfId);
		
		/*
		 * setting up the listener
		 */
		Listner listnerInstance = new Listner();
		
		try {
		listnerInstance.setUpListner(self.getReceivingPort());
		} catch (Exception e){
			//do nothing TODO
		}
		
		/*
		 * setting up the sending connection to all neighbors
		 */
		for ( int i = 0; i < NUMNODES; i++){
			
			if ( i != selfId) {
			Sender sender = new Sender();
			String HOSTNAME = MyNodes.reverseMap(i).getHostName();
			int PORT = MyNodes.reverseMap(i).getReceivingPort();
			sender.connectToServer(HOSTNAME, PORT);
			logger.info("connecting to server:" + HOSTNAME);
			}
			
		}
		
		
		
		logger.info("system has started");
	}

}
