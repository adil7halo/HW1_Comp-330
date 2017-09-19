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
  // Method to parse Note file
  private void parse() {
    Pattern mentionPattern = Pattern.compile("@\\w+");
    Pattern keywordPattern = Pattern.compile("#\\w+");
    Pattern topicPattern = Pattern.compile("!\\w+");
    Pattern linkPattern = Pattern.compile("^\\w+");
    try {
      List<String> lines = Files.readAllLines(Paths.get(path));
      for (String line: lines) {
        Matcher matcher = mentionPattern.matcher(line);
        while (matcher.find())
        {
          mentions.add(matcher.group().substring(1));
        }
        matcher = keywordPattern.matcher(line);
        while (matcher.find())
        {
          keywords.add(matcher.group().substring(1));
        }
        if (identifier == null) {
          matcher = topicPattern.matcher(line);
          while (matcher.find())
          {
            identifier = matcher.group().substring(1);
            break;
          }
        }
        matcher = linkPattern.matcher(line);
        while (matcher.find())
        {
          links.add(matcher.group().substring(1));
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  