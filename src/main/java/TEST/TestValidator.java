package TEST;

public class TestValidator {

    public static void main(String[] args) {
        String testName = "User Login API";
        int expectedCode = 200;
        int actualCode = 200;
        double maxTime = 2.0;
        double actualTime = 1.8;

        // Status Code Check
        if (actualCode == expectedCode) {
            System.out.println(testName + " - Status Code: PASS ✅");
        } else {
            System.out.println(testName + " - Status Code: FAIL ❌ (Got " + actualCode + ")");
        }

        // 5 Test Attempts
        for (int i = 1; i <= 5; i++) {
            System.out.println("Attempt " + i + ": Running " + testName);
        }

        // CALL METHOD CORRECTLY
        printResult(isTimeFast(actualTime), "Response Time");

        System.out.println("The response time is fast: " + isTimeFast(actualTime));
    }

    // METHOD DEFINITION: ONLY 2 PARAMETERS!
    public static void printResult(boolean passed, String check) {
        if (passed) {
            System.out.println(check + ": PASS ✅");
        } else {
            System.out.println(check + ": FAIL ❌");
        }
    }

    // RETURN METHOD
    public static boolean isTimeFast(double actualTime) {
        return actualTime < 2.0;
    }
}