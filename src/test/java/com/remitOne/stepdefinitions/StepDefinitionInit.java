package com.remitOne.stepdefinitions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.remitOne.automation.framework.TestSession;
import com.remitOne.home.po.LoginPO;
import com.remitOne.utils.PropFileHandler;

public class StepDefinitionInit {

	Map<String, Object> options = new HashMap<String, Object>();
	protected static TestSession session;
	
    /**
     *  static PO_File_Name poClassObject ;
     */
	
	static LoginPO loginpo;

	
	public TestSession getTestSession() throws Exception {

		if (session == null) {
			session = new TestSession(options);
			// session.driver.navigate().refresh();
		} else {

			String url = PropFileHandler.readProperty("URL");
			System.out.println(url);
			session.driver.get(url);

		}

		/**
		 *   poClassObject =new PO_File_Name(session); 
		 */
		loginpo = new LoginPO(session);

        
        
//		for (Entry<String, Object> entry : session.config.entrySet()) {
//			//System.out.println("*********" + entry.getKey() + " " + entry.getValue());
//		}

		return session;
	}

}
