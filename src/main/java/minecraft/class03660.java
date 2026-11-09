package minecraft;

import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public abstract class class03660 extends class06478 {
   @Nullable
   private Consumer<class00405> N = null;
   private final class01590 y;

   public class03660(int var1, int var2, int var3, int var4, class00392 var5, class01590 var6) {
      super(var1, var2, var3, var4, var5);
      this.y = var6;
   }

   protected final class01590 Z() {
      return this.y;
   }

   public class03660 N(@Nullable Consumer<class00405> var1) {
      this.N = var1;
      return this;
   }

   public abstract void N(class00580 var1);

   @Override
   public void method_25355(class00392 var1) {
      super.method_25355(var1);
      this.method_25358(this.Z().N(var1.method_30937()));
   }

   @Override
   public void method_25348(class06613 var1, boolean var2) {
      if (this.N != null) {
         class00604 class00604 = new class00604(this.Z(), (int)var1.n(), (int)var1.t());
         this.N(class00604);
         class00405 class00405 = class00604.y();
         if (class00405 != null) {
            this.N.accept(class00405);
            return;
         }
      }

      super.method_25348(var1, var2);
   }

   @Override
   protected void method_47399(class03428 var1) {
   }

   @Override
   public void method_48579(class01054 var1, int var2, int var3, float var4) {
      class01065 class01065;
      if (this.method_49606()) {
         if (this.N != null) {
            class01065 = class01065.field_63852;
         } else {
            class01065 = class01065.field_63851;
         }
      } else {
         class01065 = class01065.field_63850;
      }

      this.N(var1.N(this, class01065));
   }
}
