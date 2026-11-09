package minecraft;

import java.util.UUID;

public record class07367(UUID id, class07369 action) implements class00381<class01652> {
   public static final class02362<class00667, class07367> N = class00381.N(class07367::N, class07367::new);

   private class07367(class00667 var1) {
      this(var1.m(), var1.y(class07369.class));
   }

   public class07367(UUID id, class07369 action) {
      this.id = id;
      this.action = action;
   }

   public class07369 y() {
      return this.action;
   }

   private void N(class00667 var1) {
      var1.N(this.id);
      var1.N((Enum<?>)this.action);
   }

   public UUID N() {
      return this.id;
   }

   public void method_65081(class01652 var1) {
      var1.method_52395(this);
   }

   @Override
   public class02897<class07367> method_65080() {
      return class02885.b;
   }
}
