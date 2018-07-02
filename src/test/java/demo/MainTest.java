package demo;

import org.junit.*;

public class MainTest {

  @Test
  public void versionTest(){
    assert Main.getVersion() != null;
  }

}
