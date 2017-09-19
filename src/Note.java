import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

/*
 *  Note class
 */
public class Note {
	
    private String name;
  private String path;
  private File file;
  private ArrayList<String> mentions;
  private ArrayList<String> keywords;
  private String identifier;
  private ArrayList<String> links;
  
  // Constructor
  public Note(File file) {
    mentions = new ArrayList<String>();
    keywords = new ArrayList<String>();
    identifier = null;
    links = new ArrayList<String>();
    this.name = file.getName();
    this.path = file.getPath();
    this.file = file;
    parse();
  }
  
}
