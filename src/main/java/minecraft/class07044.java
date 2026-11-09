package minecraft;

import com.mojang.serialization.Codec;

public record class07044(class00845 predicate) {
   public static final class07044 N = new class07044(class00837.N().y());
   public static final Codec<class07044> y = class00845.N.xmap(class07044::new, class07044::N);
   public static final String L = "lock";

   public class07044(class00845 predicate) {
      this.predicate = predicate;
   }

   public void N(class08329 var1) {
      if (this != N) {
         var1.N("lock", y, this);
      }
   }

   public class00845 N() {
      return this.predicate;
   }

   public boolean N(class08036 var1) {
      return var1.method_7325() || this.N(var1.method_6047());
   }

   public static class07044 N(class08299 var0) {
      return var0.<class07044>N("lock", y).orElse(N);
   }

   public boolean N(class06584 var1) {
      return this.predicate.test(var1);
   }
}
