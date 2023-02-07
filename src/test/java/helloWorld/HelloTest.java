package helloWorld;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloTest {

    @Test
    void HelloWorldPrintsCorrectly() {
        String expected = "Hello World!";
        Hello hello = new Hello();
        String actual = hello.hello();

        Assertions.assertEquals(expected,actual);

    }
}
