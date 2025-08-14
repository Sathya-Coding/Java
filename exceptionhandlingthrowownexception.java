public class exceptionhandlingthrowownexception {
            public static void checkPassword(String password) throws Exception {
                if (password.length() < 6) {
                    throw new Exception("Password must be at least 6 characters long.");
                }
                System.out.println("Password accepted.");
            }
            public static void main(String[] args) {
                try {
                    String myPassword = "abc";
                    checkPassword(myPassword);
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }

            }
        }

