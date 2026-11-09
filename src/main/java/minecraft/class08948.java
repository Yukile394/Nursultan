package minecraft;

import org.jspecify.annotations.Nullable;

public record class08948(class07209 pos, class06695 container, class00394 blockEntity, class00500 state) {

   public class00394 L() {
      return this.blockEntity;
   }

   public class08948(class07209 pos, class06695 container, class00394 blockEntity, class00500 state) {
      super();
      this.pos = pos;
      this.container = container;
      this.blockEntity = blockEntity;
      this.state = state;
   }

   public class00500 u() {
      return this.state;
   }

   public class06695 y() {
      return this.container;
   }

   @Nullable
   private static class06695 N(class00394 var0, class00500 var1, class07299 var2, class07209 var3) {
      class00891 class00891 = var1.i();
      if (class00891 instanceof class00860) {
         return class00860.N((class00860)class00891, var1, var2, var3, false);
      } else {
         return var0 instanceof class06695 ? (class06695)var0 : null;
      }
   }

   @Nullable
   public static class08948 N(class00394 var0, class07299 var1) {
      class07209 class07209 = var0.d();
      class00500 class00500 = var0.w();
      class06695 class06695 = N(var0, class00500, var1, class07209);
      return class06695 != null ? new class08948(class07209, class06695, var0, class00500) : null;
   }

   @Nullable
   public static class08948 N(class07209 var0, class07299 var1) {
      class00394 class00394 = var1.method_8321(var0);
      return class00394 == null ? null : N(class00394, var1);
   }

   public class07209 N() {
      return this.pos;
   }
}
