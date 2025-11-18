package TEST;

public class TestUser {
    // Fields: Like user data in your tests
        private String username;
        private String email;
        private String password;

        // Constructor: Builds the object (e.g., new user for API POST)
        public TestUser(String username, String email, String password) {
            this.username = username;
            this.email = email;
            this.password=password;
        }

        // Getter: Access private fields (encapsulation FTW!)
        public String getEmail() {
            return email;
        }

        public String getPassword(){
            return password;

        }

        // Method: Do something with the object
        public void sendWelcomeEmail() {
            System.out.println("Email sent to " + email + "! Welcome to automation awesomeness! 📧");
        }
}

