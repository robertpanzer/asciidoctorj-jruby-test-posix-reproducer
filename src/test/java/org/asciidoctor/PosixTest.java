package org.asciidoctor;

import org.jruby.Ruby;
import org.junit.Test;

import java.net.URL;

public class PosixTest {

    @Test
    public void test() {
        URL resource = PosixTest.class.getClassLoader().getResource("documentwithtoc.adoc");
        Ruby ruby = Ruby.newInstance();
        ruby.evalScriptlet("IO.read(\"" + resource.getFile() + "\")");
    }
}
