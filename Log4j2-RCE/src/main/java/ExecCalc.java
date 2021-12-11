public class ExecCalc {

    public ExecCalc() {
        System.out.println("ExecCalc Called!");
        try {
            String cmd = "/System/Applications/Calculator.app/Contents/MacOS/Calculator";
            java.lang.Runtime.getRuntime().exec(cmd).waitFor();
        } catch (Exception e) {
            System.out.println("Command Exec Failed!");
        }
    }
}
