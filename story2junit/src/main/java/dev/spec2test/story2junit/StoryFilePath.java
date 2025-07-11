package dev.spec2test.story2junit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface StoryFilePath {

    /**
     * Path to the story file based on which the test was generated.
     */
    String value();
}
