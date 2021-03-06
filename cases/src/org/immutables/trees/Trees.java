package org.immutables.trees;

import com.google.common.annotations.Beta;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Beta
@Target({})
public @interface Trees {
  @Target(ElementType.TYPE)
  public @interface Ast {}

  @Documented
  @Target(ElementType.TYPE)
  public @interface Transform {
    Class<?>[] include() default {};
  }
}
