package minecraft;

import com.google.gson.JsonObject;
import java.util.UUID;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class class03580 extends class03576 {
   private static final String M = "title";
   private static final String B = "message";
   private static final String Z = "image";
   private static final String z = "urlButton";
   private final class03596 U;
   private final class03596 E;
   private final class01894 W;
   @Nullable
   private final class03588 m;

   private class03580(class03576 var1, class03596 var2, class03596 var3, class01894 var4, @Nullable class03588 var5) {
      super(var1.L, var1.u, var1.i, var1.R);
      this.U = var2;
      this.E = var3;
      this.W = var4;
      this.m = var5;
   }

   @Nullable
   public class03723 N(class05096 var1, Consumer<UUID> var2) {
      class00392 class00392 = this.U.N();
      if (class00392 == null) {
         class03576.N.warn("Realms info popup had title with no available translation: {}", this.U);
         return null;
      } else {
         class03754 class03754 = new class03754(var1, class00392).N(this.W).N(this.E.N(class05220.N));
         if (this.m != null) {
            class03754.N(this.m.y().N(class03576.y), var3x -> {
               class06202 class06202 = class06202.Nq();
               class06202.N(new class01321(var4x -> {
                  if (var4x) {
                     class07536.m().N(this.m.N());
                     class06202.N(var1);
                  } else {
                     class06202.N(var3x);
                  }
               }, this.m.N(), true));
               var2.accept(this.L());
            });
         }

         class03754.N(class05220.B, var2x -> {
            var2x.method_25419();
            var2.accept(this.L());
         });
         class03754.N(() -> var2.accept(this.L()));
         return class03754.N();
      }
   }

   public static class03580 N(class03576 var0, JsonObject var1) {
      class03596 class03596x = class04719.N("title", var1, class03596::N);
      class03596 class03596x = class04719.N("message", var1, class03596::N);
      class01894 class01894 = class01894.N(class04719.N("image", var1));
      class03588 class03588 = class04719.y("urlButton", var1, class03588::N);
      return new class03580(var0, class03596x, class03596x, class01894, class03588);
   }
}
