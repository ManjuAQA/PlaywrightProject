package TEST;

public class ArrayMaster {

        public static void main(String[] args) {
            System.out.println("=== ARRAY MASTERY ===\n");

            // 1D: Fruits
            String[] fruits = {"Apple", "Banana", "Mango"};
            System.out.println("1D Array - Fruit #1: " + fruits[0]);

            // 1D: Numbers
            int[] codes = {200, 201, 404};
            System.out.println("Status Code #3: " + codes[2]);

            // 2D: Test Data
            String[][] testData = {
                    {"login", "user1", "pass123", "PASS"},
                    {"login", "user2", "wrong",  "FAIL"}
            };

            System.out.println("\n2D Test Data Table:");
            for (int i = 0; i < testData.length; i++) {
                System.out.println("test " + (i+1) + ": " +
                        testData[i][1] + " → " + testData[i][2].replaceAll(".", "*") + " → " + testData[i][3]);
            }

            // BONUS: Array of TestUsers
            TestUser[] users = new TestUser[2];
            users[0] = new TestUser("ninja1", "n1@auto.com", "pass");
            users[1] = new TestUser("ninja2", "n2@auto.com", "pass");

            System.out.println("\nTest Users:");
            for (TestUser user : users) {
                System.out.println(user.getEmail() + "    " + user.getPassword().replaceAll(".", "*"));
            }
        }
}

