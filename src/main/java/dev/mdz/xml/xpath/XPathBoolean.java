package dev.mdz.xml.xpath;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface XPathBoolean {

  /**
   * Maps a boolean field to the existence of an XML node.
   *
   * <p>If the XPath expression yields at least one matching node, the field is set to {@code true},
   * otherwise {@code false}.
   */
  String value();
}
