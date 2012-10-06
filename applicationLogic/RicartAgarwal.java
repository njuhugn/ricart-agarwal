package applicationLogic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mina.Listner;

public class RicartAgarwal {
	
	final static Logger logger = LoggerFactory.getLogger(RicartAgarwal.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Roger Charlie,...Initiating system start sequence\n");
		Listner listnerInstance = new Listner();
		
		try {
		listnerInstance.setUpListner(5350);
		} catch (Exception e){
			//do nothing
		}
		
		logger.info("system has started");
		
	}

}
