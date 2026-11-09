package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class07122 extends class07796 {
   public static final MapCodec<class07122> N = y(class07122::new);
   public static final class06667 y = class06665.T;

   public class07122(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, false));
   }

   @Override
   public int N_8(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      class00394 class00394 = var2.method_8321(var3);
      return class00394 instanceof class07249 && ((class07249)class00394).L().N() ? 15 : 0;
   }

   @Override
   protected boolean N(class00500 var1) {
      return true;
   }

   @Override
   public MapCodec<class07122> N() {
      return N;
   }

   @Override
   protected int N_24(class00500 var1, class07299 var2, class07209 var3, class07211 var4) {
      class00394 class00394 = var2.method_8321(var3);
      return class00394 instanceof class07249 ? ((class07249)class00394).B() : 0;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
   }

   @Nullable
   @Override
   public <T extends class00394> class01118<T> N(class07299 var1, class00500 var2, class00404<T> var3) {
      return var2.L(y) ? N(var3, class00404.field_11907, class07249::N) : null;
   }

   @Override
   public void N(class07299 var1, class07209 var2, class00500 var3, @Nullable class07438 var4, class06584 var5) {
      super.N(var1, var2, var3, var4, var5);
      class08983 class08983 = var5.method_58694(class02484.NB);
      if (class08983 != null && class08983.N("RecordItem")) {
         var1.method_8652(var2, var3.y(y, true), 2);
      }
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (var1.L(y)) {
         class00394 class00394 = var2.method_8321(var3);
         if (class00394 instanceof class07249) {
            ((class07249)class00394).M();
            return class07082.N;
         }
      }

      return class07082.i;
   }

   @Override
   protected class07082 N(class06584 var1, class00500 var2, class07299 var3, class07209 var4, class08036 var5, class07050 var6, class06183 var7) {
      if (var2.L(y)) {
         return class07082.R;
      } else {
         class06584 class06584 = var5.method_5998(var6);
         class07082 class07082 = class02232.N(var3, var4, class06584, var5);
         return (class07082)(!class07082.N() ? class07082.R : class07082);
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, boolean var4) {
      class06704.N(var1, var2, var3);
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class07249(var1, var2);
   }

   @Override
   public boolean i_(class00500 var1) {
      return true;
   }
}
