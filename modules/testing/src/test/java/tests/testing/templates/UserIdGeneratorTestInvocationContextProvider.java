package tests.testing.templates;

import org.junit.jupiter.api.extension.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class UserIdGeneratorTestInvocationContextProvider implements TestTemplateInvocationContextProvider {
    @Override
    public boolean supportsTestTemplate(ExtensionContext extensionContext) {
        return true;
    }

    @Override
    public Stream<TestTemplateInvocationContext> provideTestTemplateInvocationContexts(ExtensionContext extensionContext) {
        boolean featureDisabled = false;
        boolean featureEnabled = true;

        return Stream.of(
                featureDisabledContext(
                        new UserIdGeneratorTestCase(
                                "Given feature switch disabled When user name is John Smith Then generated userid is JSmith",
                                featureDisabled,
                                "John",
                                "Smith",
                                "JSmith")),
                featureEnabledContext(
                        new UserIdGeneratorTestCase(
                                "Given feature switch enabled When user name is John Smith Then generated userid is baelJSmith",
                                featureEnabled,
                                "John",
                                "Smith",
                                "baelJSmith"))
        );
    }

    private TestTemplateInvocationContext featureDisabledContext(
            UserIdGeneratorTestCase userIdGeneratorTestCase) {
        return new TestTemplateInvocationContext() {
            @Override
            public String getDisplayName(int invocationIndex) {
                return userIdGeneratorTestCase.getDisplayName();
            }

            @Override
            public List<Extension> getAdditionalExtensions() {
                return Arrays.asList(
                        new UserIdGeneratorTestCaseParameterResolver(userIdGeneratorTestCase),
                        (BeforeTestExecutionCallback) extensionContext -> System.out.println("BeforeTestExecutionCallback:Disabled context"),
                        (AfterTestExecutionCallback) extensionContext -> System.out.println("AfterTestExecutionCallback:Disabled context")
                );
            }
        };
    }

    private TestTemplateInvocationContext featureEnabledContext(
            UserIdGeneratorTestCase userIdGeneratorTestCase) {
        return new TestTemplateInvocationContext() {
            @Override
            public String getDisplayName(int invocationIndex) {
                return userIdGeneratorTestCase.getDisplayName();
            }

            @Override
            public List<Extension> getAdditionalExtensions() {
                return Arrays.asList(
                        new UserIdGeneratorTestCaseParameterResolver(userIdGeneratorTestCase),
//                        new DisabledOnQAEnvironmentExtension(),
                        (BeforeEachCallback) extensionContext -> System.out.println("BeforeEachCallback:Enabled context"),
                        (AfterEachCallback) extensionContext -> System.out.println("AfterEachCallback:Enabled context")
                );
            }
        };
    }
}
