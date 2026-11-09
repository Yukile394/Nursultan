package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class class00664 extends class00891 {
   public static final MapCodec<class00664> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class04206.i.T().fieldOf("hook").forGetter(var0x -> var0x.f), t()).apply(var0, class00664::new)
   );
   public static final class06667 y = class06665.k;
   public static final class06667 L = class06665.N;
   public static final class06667 u = class06665.M;
   public static final class06667 i = class06901.y;
   public static final class06667 R = class06901.L;
   public static final class06667 M = class06901.u;
   public static final class06667 B = class06901.i;
   private static final Map<class07211, class06667> Z = class06788.M;
   private static final class00494 O = class00891.y(16.0, 1.0, 2.5);
   private static final class00494 F = class00891.y(16.0, 0.0, 8.0);
   private static final int A = 10;
   private final class00891 f;

   public class00664(class00891 var1, class01362 var2) {
      super(var2);
      this.P(this.Q.y().y(y, false).y(L, false).y(u, false).y(i, false).y(R, false).y(M, false).y(B, false));
      this.f = var1;
   }

   public boolean N(class00500 var1, class07211 var2) {
      return var1.N(this.f) ? var1.L(class00637.y) == var2.b() : var1.N(this);
   }

   private void N(class07299 var1, class07209 var2, List<? extends class07049> var3) {
      class00500 class00500 = var1.method_8320(var2);
      boolean flag = class00500.L(y);
      boolean flag1 = false;
      if (!var3.isEmpty()) {
         Iterator iterator = var3.iterator();

         while (iterator.hasNext()) {
            if (!((class07049)iterator.next()).method_5696()) {
               flag1 = true;
               break;
            }
         }
      }

      if (flag1 != flag) {
         class00500 = class00500.y(y, flag1);
         var1.method_8652(var2, class00500, 3);
         this.N(var1, var2, class00500);
      }

      if (flag1) {
         var1.N(new class07209(var2), this, 10);
      }
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      switch (var2) {
         case field_11464:
            return var1.y(i, var1.L(M)).y(R, var1.L(B)).y(M, var1.L(i)).y(B, var1.L(R));
         case field_11465:
            return var1.y(i, var1.L(R)).y(R, var1.L(M)).y(M, var1.L(B)).y(B, var1.L(i));
         case field_11463:
            return var1.y(i, var1.L(B)).y(R, var1.L(i)).y(M, var1.L(R)).y(B, var1.L(M));
         default:
            return var1;
      }
   }

   private void N(class07299 var1, class07209 var2) {
      class00500 class00500 = var1.method_8320(var2);
      List list = var1.N_70(null, class00500.R(var1, var2).method_1107().N(var2));
      this.N(var1, var2, list);
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var2.method_8320(var3).L(y)) {
         this.N(var2, var3);
      }
   }

   @Override
   public MapCodec<class00664> N() {
      return N;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L, u, i, R, B, M);
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      switch (var2) {
         case field_11300:
            return var1.y(i, var1.L(M)).y(M, var1.L(i));
         case field_11301:
            return var1.y(R, var1.L(B)).y(B, var1.L(R));
         default:
            return super.N(var1, var2);
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, boolean var4) {
      if (!var4) {
         this.N(var2, var3, var1.y(y, true));
      }
   }

   @Override
   protected void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      if (!var4.N(var1.i())) {
         this.N(var2, var3, var1);
      }
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      return var5.z().L() ? var1.y(Z.get(var5), this.N(var7, var5)) : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public class00500 N(class06942 var1) {
      class07299 class07299 = var1.method_8045();
      class07209 class07209 = var1.method_8037();
      return this.W()
         .y(i, this.N(class07299.method_8320(class07209.method_10095()), class07211.field_11043))
         .y(R, this.N(class07299.method_8320(class07209.method_10078()), class07211.field_11034))
         .y(M, this.N(class07299.method_8320(class07209.method_10072()), class07211.field_11035))
         .y(B, this.N(class07299.method_8320(class07209.method_10067()), class07211.field_11039));
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return var1.L(L) ? O : F;
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class07049 var4, class08400 var5, boolean var6) {
      if (!var2.method_8608()) {
         if (!var1.L(y)) {
            this.N(var2, var3, List.of(var4));
         }
      }
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class07049 var4) {
      return var1.R(var2, var3);
   }

   private void N(class07299 var1, class07209 var2, class00500 var3) {
      for (class07211 class07211 : new class07211[]{class07211.field_11035, class07211.field_11039}) {
         for (int ix = 1; ix < 42; ix++) {
            class07209 class07209 = var2.method_10079(class07211, ix);
            class00500 class00500 = var1.method_8320(class07209);
            if (class00500.N(this.f)) {
               if (class00500.L(class00637.y) == class07211.b()) {
                  class00637.N(var1, class07209, class00500, false, true, ix, var3);
               }
               break;
            }

            if (!class00500.N(this)) {
               break;
            }
         }
      }
   }

   @Override
   public class00500 N(class07299 var1, class07209 var2, class00500 var3, class08036 var4) {
      if (!var1.method_8608() && !var4.method_6047().R() && var4.method_6047().N(class06570.vr)) {
         var1.method_8652(var2, var3.y(u, true), 260);
         var1.N(var4, class01194.H, var2);
      }

      return super.N(var1, var2, var3, var4);
   }
}
