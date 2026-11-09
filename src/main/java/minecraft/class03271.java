package minecraft;

import java.util.Objects;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class class03271 {
   private final Consumer<class06478> N;
   private final Consumer<class06478> y;
   private final Consumer<class03241> L;
   private final Consumer<class03241> u;
   @Nullable
   private class03241 i;
   @Nullable
   private class03255 R;

   public class03271(Consumer<class06478> var1, Consumer<class06478> var2) {
      this(var1, var2, var0 -> {}, var0 -> {});
   }

   public class03271(Consumer<class06478> var1, Consumer<class06478> var2, Consumer<class03241> var3, Consumer<class03241> var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   public void N(class03241 var1, boolean var2) {
      if (!Objects.equals(this.i, var1)) {
         if (this.i != null) {
            this.i.method_48612(this.y);
         }

         class03241 class03241 = this.i;
         this.i = var1;
         var1.method_48612(this.N);
         if (this.R != null) {
            var1.method_48611(this.R);
         }

         if (var2) {
            class06202.Nq().Nr().N(class00040.N(class04909.OK, 1.0F));
         }

         this.u.accept(class03241);
         this.L.accept(this.i);
      }
   }

   @Nullable
   public class03241 N() {
      return this.i;
   }

   public void N(class03255 var1) {
      this.R = var1;
      class03241 class03241 = this.N();
      if (class03241 != null) {
         class03241.method_48611(var1);
      }
   }
}
