package codingProject;

public class App {

  public static void main(String[] args) {
    Logger aLogger = new AsteriskLogger();
    aLogger.log("Hello");
    aLogger.error("Hello");
    
    Logger sLogger = new SpacedLogger();
    sLogger.log("Hello");
    sLogger.error("Hello");
  }
}
