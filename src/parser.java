package notesyntax;

import java.util.*;
import java.io.*;

	public LinkedList<String> UrlList = new LinkedList<String>();
	public LinkedList<String> TopicsList = new LinkedList<String>();
	public LinkedList<String> HashesList = new LinkedList<String>(); 
    
public class parser {
	
    public Boolean FindTopic(String note){
			int i=0;
			String topic;
			do {
			if (note.contains('#@' || 'http://@' || '@http://'|| '@#')) {		    	
		         break;
		    }	
		    if (note.contains('@') 
		    {
		        int indexOfTopic = note.indexOf('@');
	            int endPoint = (note.indexOf(' ', indexOfTopic) != -1) ?
		       	note.indexOf(' ', indexOfTopic) : note.length();
		        topic = note.substring(indexOfTopic, endPoint);    
		        TopicsList.set(i, topic); 
		        return true;
		    }
		     i++;
	        } while (i<TopicsList.size());
		    return false;
		 }
		 
}