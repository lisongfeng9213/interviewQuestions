
import java.lang.System;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class e {

	  public static void main(String[] args) {
		    if(args.length < 2) {
		    	 System.out.print("Usage:\njava TestRegularExpression " +
		        "characterSequence regularExpression+");
		      System.exit(0);
		    }
		    System.out.print("Input: \"" + args[0] + "\"");
		    for(String arg : args) {
		    	 System.out.print("Regular expression: \"" + arg + "\"");
		      Pattern p = Pattern.compile(arg);
		      Matcher m = p.matcher(args[0]);
		      
		      while(m.find()) {
		        System.out.print("Match \"" + m.group() + "\" at positions " +
		          m.start() + "-" + (m.end() - 1));
		      }
		    }
		  }
}
