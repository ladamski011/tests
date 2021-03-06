package tests.testing.templates;

public class UserIdGeneratorTestCase {
    private String description;
    private boolean isFeatureEnabled;
    private String firstName;
    private String lastName;
    private String expectedUserId;

    public UserIdGeneratorTestCase(String description, boolean isFeatureEnabled, String firstName, String lastName, String expectedUserId) {
        this.description = description;
        this.isFeatureEnabled = isFeatureEnabled;
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedUserId = expectedUserId;
    }

    public boolean isFeatureEnabled() {
        return isFeatureEnabled;
    }

    public void setFeatureEnabled(boolean featureEnabled) {
        isFeatureEnabled = featureEnabled;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExpectedUserId() {
        return expectedUserId;
    }

    public void setExpectedUserId(String expectedUserId) {
        this.expectedUserId = expectedUserId;
    }

    public String getDisplayName() {
        return description;
    }
}
