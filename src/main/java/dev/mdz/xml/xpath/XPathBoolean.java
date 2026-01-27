package dev.mdz.xml.xpath;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface XPathBoolean {

    String expression();

  /**
   * The default namespace is only allowed on type level, not on methods.
   *
   * @return the default namespace, e.g. <code>http://www.tei-c.org/ns/1.0"</code> (optional)
   */
  String defaultNamespace() default "";
}
