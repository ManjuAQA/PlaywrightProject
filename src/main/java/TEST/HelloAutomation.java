package TEST;

public class HelloAutomation {

        public static void main(String[] args) {
            // Variables: Store your test data like API endpoints or expected results
            String toolName = "Rest Assured & Playwright";  // String for text
            int excitementLevel = 100;  // int for numbers (whole)
            double passRate = 99.9;     // double for decimals (e.g., response times)

            // Method: Reusable code block – think "run this test step"
            greetLearner("playwright", 90);

            // Output: Console print for debugging (we'll use logs later!)
            System.out.println("Expected pass rate: " + passRate + "% – You're on fire! 🔥");

            TestUser learner = new TestUser("CodeNinja", "you@automation.com", "password");
            learner.sendWelcomeEmail();
            System.out.println("Learner's email: " + learner.getEmail());
            System.out.println("Learner's password: " + learner.getPassword());

        }

        // A simple method – inputs (params) and outputs (return)
        public static void greetLearner(String tool, int level) {
            System.out.println("Yay! Diving into " + tool + " with " + level + " units of joy! 🎊");
        }
    }

