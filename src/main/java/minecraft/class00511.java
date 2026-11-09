package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class00511 extends class07796 {
   public static final MapCodec<class00511> N = y(class00511::new);
   public static final class08064<class07211> y = class00483.y;
   public static final class08064<class08083> L = class00483.L;

   public class00511(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, class07211.field_11043).y(L, class08083.field_12637));
   }

   @Override
   protected class00494 y_4(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      class00510 class00510 = this.N(var2, var3);
      return class00510 != null ? class00510.N(var2, var3) : class00389.N();
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(y)));
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(y, var2.N(var1.L(y)));
   }

   @Override
   public class06584 N(class05487 var1, class07209 var2, class00500 var3, boolean var4) {
      return class06584.E;
   }

   @Nullable
   private class00510 N(class07290 var1, class07209 var2) {
      class00394 class00394 = var1.method_8321(var2);
      return class00394 instanceof class00510 ? (class00510)class00394 : null;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L);
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   public MapCodec<class00511> N() {
      return N;
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (!var2.method_8608() && var2.method_8321(var3) == null) {
         var2.method_8650(var3, false);
         return class07082.L;
      } else {
         return class07082.i;
      }
   }

   @Override
   public void N_7(class07284 var1, class07209 var2, class00500 var3) {
      class07209 class07209 = var2.method_10093(var3.L(y).b());
      class00500 class00500 = var1.method_8320(class07209);
      if (class00500.i() instanceof class00513 && class00500.L(class00513.L)) {
         var1.method_8650(class07209, false);
      }
   }

   @Nullable
   @Override
   public <T extends class00394> class01118<T> N(class07299 var1, class00500 var2, class00404<T> var3) {
      return N(var3, class00404.field_11897, class00510::N);
   }

   public static class00394 N(class07209 var0, class00500 var1, class00500 var2, class07211 var3, boolean var4, boolean var5) {
      return new class00510(var0, var1, var2, var3, var4, var5);
   }

   @Nullable
   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return null;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return class00389.N();
   }

   @Override
   protected List<class06584> N(class00500 var1, class04160 var2) {
      class00510 class00510 = this.N(var2.N(), class07209.method_49638(var2.N(class06551.B)));
      return class00510 == null ? Collections.emptyList() : class00510.M().N(var2);
   }

   @Override
   protected class06898 d_(class00500 var1) {
      return class06898.field_11455;
   }
}
