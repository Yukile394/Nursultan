package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public abstract class class04985 extends class00891 {
   protected final class07211 y;
   protected final boolean L;
   protected final class00494 u;

   protected abstract class04983 L();

   public class04985(class01362 var1, class07211 var2, class00494 var3, boolean var4) {
      super(var1);
      this.y = var2;
      this.u = var3;
      this.L = var4;
   }

   protected boolean U(class00500 var1) {
      return true;
   }

   protected abstract class00891 u();

   public class00500 y(class06069 var1) {
      return this.W();
   }

   @Override
   protected abstract MapCodec<? extends class04985> N();

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (!var1.N(var2, var3)) {
         var2.N(var3, true);
      }
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class00500 class00500 = var1.method_8045().method_8320(var1.method_8037().method_10093(this.y));
      return !class00500.N(this.L()) && !class00500.N(this.u()) ? this.y(var1.method_8045().field_9229) : this.u().W();
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return this.u;
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      class07209 class07209 = var3.method_10093(this.y.b());
      class00500 class00500 = var2.method_8320(class07209);
      return !this.U(class00500) ? false : class00500.N(this.L()) || class00500.N(this.u()) || class00500.L(var2, class07209, this.y);
   }
}
