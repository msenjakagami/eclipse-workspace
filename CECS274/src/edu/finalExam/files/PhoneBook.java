package edu.finalExam.files;

import java.util.NoSuchElementException;
import edu.homework_5.BinarySearchTree;
import edu.homework_5.BinaryTreeIterator;
/**
 * Final exam. Implemented Phonebook class using Contact class and a BinarySearchTree class.
 * @author(modified by) Gabriel Espejo 014487796
 * @since 2016-12-12
 * @version 1.0
 */
public class PhoneBook {
	private BinarySearchTree contacts;
	private String name;
	/**
	 * Default constructor. Creates an empty phonebook without a name
	 */
	public PhoneBook(){
		contacts = new BinarySearchTree();
		name = "";
	}
	/**
	 * Overloaded constructor. Creates an empty phonebook with a given name
	 * @param name the preset String the user wants to set as the name
	 */
	public PhoneBook(String name){
		this.name = name;
		contacts = new BinarySearchTree();
	}
	/**
	 * Mutator method. Adds a new contact object to the PhoneBook
	 * @param newContact the contact to be added to the phonebook
	 */
	public void add(Contact newContact){
		contacts.add(newContact);
	}

	/**
	 * Accessor method. Returns true if the contact exists in the phonebook, false otherwise
	 * @param name the naem that needs to be searched for
	 * @return true if the contact was found, false otherwise
	 */
	public boolean findContact(String name){
		boolean found = false;
		BinaryTreeIterator iter = contacts.inOrderIterator();
		while(iter.hasNext()){
			Contact temp = (Contact) iter.next();
			if(temp.getName().equals(name)){
				found = true;
				break;
			}
		}
		return found;
	}
	/**
	 * Accessor method. Returns the contact specified, or throws an exception if it doesn't exist
	 * @param name the contact that you're looking for
	 * @return the contact that you're looking for
	 */
	public Contact getContact(String name){
		Contact retrieved = new Contact();
		if(findContact(name)){
			BinaryTreeIterator iter = contacts.inOrderIterator();
			while(iter.hasNext()){
				Contact current = (Contact) iter.next();
				if(current.getName().compareTo(name) == 0){
					retrieved = current;
					break;
				}
			}
		}
		else{
			throw new NoSuchElementException();
		}
		return retrieved;
	}
	/**
	 * Accessor method. Returns the name of the phonebook object
	 * @return name the name of the phonebook object
	 */
	public String getPHName(){
		return name;
	}
	/**
	 * Accessor method. Displays all contacts alphabetically
	 */
	public void printAll(){
		contacts.printIter();
	}
	/**
	 * Mutator method. Searches phonebook for the specified contact and if found, changes the number to the number specified
	 * @param name the name of the contact you're looking for
	 * @param number the number you want to change the contact's to
	 */
	public void setNumber(String name, String number){
		if(findContact(name)){
			BinaryTreeIterator iter = contacts.inOrderIterator();
			while(iter.hasNext()){
				Contact current = (Contact) iter.next();
				if(current.getName().compareTo(name) == 0){
					current.setNumber(number);
					break;
				}
			}
		}
		else{
			throw new NoSuchElementException();
		}

	}
	/**
	 * Mutator method. Searches phonebook for specified contact name and removes it if found. Otherwise throws an exception
	 * @param name the name of hte contact you're looking to remove
	 * @return the contact that was just removed
	 */
	public Contact remove(String name){
		Contact removed = new Contact();
		if(findContact(name)){
			BinaryTreeIterator iter = contacts.inOrderIterator();
			while(iter.hasNext()){
				Contact current = (Contact) iter.next();
				if(current.getName().compareTo(name) == 0){
					removed = current;
					break;
				}
			}
		}
		else{
			throw new NoSuchElementException();
		}
		contacts.remove(removed);
		return removed;
	}



}
