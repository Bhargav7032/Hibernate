package com.ciq.studentest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.hibernate.Session;
import org.junit.Test;

import com.ciq.util.SessionUtil;

public class SessionTest {

	@Test
	public void session() {
		
		  //get session test
		Session session=null;
		session=SessionUtil.getSession();
		assertNotNull(session);
		
		    //get close test
		SessionUtil.close(session);
		assertTrue(!session.isConnected());
	}
}
