package codingProject;

public class SpacedLogger implements Logger{

  @Override
  public void log(String log) {
    StringBuilder sb = new StringBuilder();
    // Iterate through each character of the input string
    for (int i = 0; i < log.length(); i++) {
     // Append the character, and a space to the StringBuilder
     sb.append(log.charAt(i)).append(" ");
 }
    // Convert StringBuilder to String
    String result = sb.toString();
    System.out.println(result);
 }

  @Override
  public void error(String error) {
    StringBuilder sb = new StringBuilder();
    // Iterate through each character of the input string
    for (int i = 0; i < error.length(); i++) {
     // Append the character, and a space to the StringBuilder
     sb.append(error.charAt(i)).append(" ");
 }
    // Convert StringBuilder to String
    String result = sb.toString();
    System.err.println("ERROR: " + result);
 }
}
