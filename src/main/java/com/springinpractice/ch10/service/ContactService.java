/* 
 * $Id: ContactService.java 30 2010-05-04 07:27:19Z  $
 * 
 * Copyright (c) 2010 Manning Publications Co.
 * 
 * Book web site   - http://www.manning.com/wheeler/
 * Book blog       - http://springinpractice.com/
 * Author web site - http://wheelersoftware.com/
 */
package com.springinpractice.ch10.service;

import java.util.List;

import com.springinpractice.ch10.model.Contact;

/**
 * <p>
 * Contact service interface.
 * </p>
 * 
 * @version $Id: ContactService.java 30 2010-05-04 07:27:19Z  $
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
public interface ContactService {

	/**
	 * <p>
	 * Creates the given contact in the persistent store.
	 * </p>
	 * 
	 * @param contact
	 *            contact to create
	 * @throws IllegalArgumentException
	 *             if <code>contact</code> is <code>null</code>
	 */
	void createContact(Contact contact);

	/**
	 * <p>
	 * Returns a list containing all contacts. Returns an empty list if there
	 * aren't any contacts.
	 * </p>
	 * 
	 * @return list of all contacts
	 */
	List<Contact> getContacts();

	/**
	 * <p>
	 * Returns the contact having the given ID, or <code>null</code> if no such
	 * contact exists.
	 * </p>
	 * 
	 * @param id
	 *            contact ID
	 * @return contact having the given ID
	 */
	Contact getContact(long id);
	
	void updateContact(Contact contact);

	/**
	 * <p>
	 * Deletes the contact having the given ID.
	 * </p>
	 * 
	 * @param id
	 *            contact ID
	 */
	void deleteContact(long id);
}
