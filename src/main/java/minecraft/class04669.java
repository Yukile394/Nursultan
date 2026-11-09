package minecraft;

import org.jspecify.annotations.Nullable;

public final class class04669 implements AutoCloseable {
   private final class06202 N;
   private final class01594 y;

   public class04669(class06202 var1) {
      super();
      this.N = var1;
      this.y = new class01594(class06221::new);
   }

   @Override
   public void close() {
      this.y.N();
   }

   public class08844 N(class01018 var1, @Nullable String var2, String var3) {
      return new class08844(this.N, this.y, var1, var2, var3);
   }
}
