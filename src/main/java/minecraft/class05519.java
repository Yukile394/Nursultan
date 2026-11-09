package minecraft;

import org.jspecify.annotations.Nullable;

public class class05519 extends class05511 {
   private final class07209 L;
   private final class07209 u;

   @Nullable
   public class07209 L() {
      return this.u;
   }

   public class05519(class00392 var1, class07209 var2, class07209 var3, int var4) {
      super(var1, var4);
      this.L = var2;
      this.u = var3;
   }

   @Nullable
   public class07209 u() {
      return this.L;
   }

   public class00392 y() {
      return this.N;
   }

   @Override
   public class00392 N() {
      return class00392.N(
         "test.error.position",
         this.N,
         this.L.method_10263(),
         this.L.method_10264(),
         this.L.method_10260(),
         this.u.method_10263(),
         this.u.method_10264(),
         this.u.method_10260(),
         this.y
      );
   }
}
