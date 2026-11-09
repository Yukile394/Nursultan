package minecraft;

import java.util.function.Predicate;

public record class08166<T extends class08168>(class08164 test) implements Predicate<T> {
   public class08166(class08164 test) {
      this.test = test;
   }

   public class08164 N() {
      return this.test;
   }

   public boolean test(T var1) {
      return this.test.N(var1.N());
   }
}
