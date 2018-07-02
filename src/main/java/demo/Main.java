package demo;

import java.util.logging.*;

public class Main {
  private static final Logger log = Logger.getLogger("main");
  public static void main(String...args){ log.info(getVersion());}

  public static String getVersion(){
    return Runtime.version().toString();
  }
}
