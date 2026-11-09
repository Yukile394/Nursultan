package minecraft;

import java.util.UUID;
import java.util.function.BiConsumer;
import org.jspecify.annotations.Nullable;

class class06970 implements class00457 {
   @Override
   public <T> void L(class00455<T> var1, BiConsumer<class07049, T> var2) {
      this.y.N(var1, class06963.L(), (var2x, var3) -> {
         class07049 class07049 = var0.method_66347(var2x);
         if (class07049 != null) {
            var2.accept(class07049, var3);
         }
      });
   }

   class06970(class06963 var1, class07299 var2) {
      super();
      this.y = var1;
      this.N = var2;
   }

   @Override
   public <T> void y(class00455<T> var1, BiConsumer<class07209, T> var2) {
      this.y.N(var1, class06963.u(), var2);
   }

   @Override
   public <T> void N(class00455<T> var1, class00467<T> var2) {
      class06980 class06980 = this.y.N(var1);
      if (class06980 != null) {
         long i = this.N.N();

         for (class06986 class06986 : class06980.u) {
            int j = (int)(class06986.y() - i);
            int k = var1.L();
            var2.accept(class06986.N(), j, k);
         }
      }
   }

   @Nullable
   @Override
   public <T> T N(class00455<T> var1, class07049 var2) {
      return this.y.N(var1, var2.method_5667(), class06963.L());
   }

   @Nullable
   @Override
   public <T> T N(class00455<T> var1, class07209 var2) {
      return this.y.N(var1, var2, class06963.u());
   }

   @Nullable
   @Override
   public <T> T N(class00455<T> var1, class07321 var2) {
      return this.y.N(var1, var2, class06963.i());
   }

   @Override
   public <T> void N(class00455<T> var1, BiConsumer<class07321, T> var2) {
      this.y.N(var1, class06963.i(), var2);
   }
}
