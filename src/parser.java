package notesyntax;

import java.util.*;
import java.io.*;

	public LinkedList<String> UrlList = new LinkedList<String>();
	public LinkedList<String> HashesList = new LinkedList<String>(); 
	public LinkedList<String> TopicsList = new LinkedList<String>();

    
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
		 
		 public Boolean FindHash(String note){
	   	String hashtag = note;
		int i=0;
		do {
		    if (note.contains('#@' || 'http://#' || '#http://'|| '@#')) {		    	
			     break;
			}
			if (note.contains('#') {
		        int indexOfHash = note.indexOf('#');
		        int endPoint = (note.indexOf(' ', indexOfHash) != -1) ?
			     	note.indexOf(' ', indexOfHash) : note.length();
			        hashtag = note.substring(indexOfHash, endPoint); 
			        HashesList.set(i, hashtag); 
			        return true;
			}
			i++;
	     } while (i<HashesList.size());
		return false;
		
		public Boolean FindUrl(String note){
		String url=note;
		int i=0;
		do {         
		    if (note.contains('htttp://@' || 'http://#' || '#http://'|| '@htttp://')) {		    	
		         break;
		    }
		    if (note.contains('http://')) {
		        int indexOfUrl = note.indexOf('http://');
		        int endPoint = (note.indexOf(' ', indexOfHttp) != -1) ?
	        	note.indexOf(' ', indexOfUrl) : note.length();
		        url = note.substring(indexOfUrl, endPoint);  
		        UrlList.set(i, url); 
		        return true;		
		        }
		     i++;
	      } while (i<UrlList.size());
	       return false;
	 }
		
}