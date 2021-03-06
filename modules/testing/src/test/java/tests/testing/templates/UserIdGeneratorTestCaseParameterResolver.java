package tests.testing.templates;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.support.TypeBasedParameterResolver;

public class UserIdGeneratorTestCaseParameterResolver extends TypeBasedParameterResolver<UserIdGeneratorTestCase> {
    private final UserIdGeneratorTestCase userIdGeneratorTestCase;

    public UserIdGeneratorTestCaseParameterResolver(UserIdGeneratorTestCase userIdGeneratorTestCase) {
        this.userIdGeneratorTestCase = userIdGeneratorTestCase;
    }

    @Override
    public UserIdGeneratorTestCase resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return userIdGeneratorTestCase;
    }
}
