package minecraft;

import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class class05440 extends class05465 implements class06084 {
   public static final MapCodec<class05440> L = y(class05440::new);
   public static final int u = 1;
   public static final int i = 4;
   public static final class08071 R = class06665.NO;
   public static final class06667 M = class05465.y;
   public static final class06667 B = class06665.q;
   public static final ToIntFunction<class00500> Z = var0 -> var0.L(M) ? 3 * var0.L(R) : 0;
   private static final Int2ObjectMap<List<class06889>> O = class07536.N(
      new Int2ObjectOpenHashMap(4),
      var0 -> {
         float f = 0.0625F;
         var0.put(1, List.of(new class06889(8.0, 8.0, 8.0).L(0.0625)));
         var0.put(2, List.of(new class06889(6.0, 7.0, 8.0).L(0.0625), new class06889(10.0, 8.0, 7.0).L(0.0625)));
         var0.put(3, List.of(new class06889(8.0, 5.0, 10.0).L(0.0625), new class06889(6.0, 7.0, 8.0).L(0.0625), new class06889(9.0, 8.0, 7.0).L(0.0625)));
         var0.put(
            4,
            List.of(
               new class06889(7.0, 5.0, 9.0).L(0.0625),
               new class06889(10.0, 7.0, 9.0).L(0.0625),
               new class06889(6.0, 7.0, 6.0).L(0.0625),
               new class06889(9.0, 8.0, 6.0).L(0.0625)
            )
         );
      }
   );
   private static final class00494[] F = new class00494[]{
      class00891.y(2.0, 0.0, 6.0),
      class00891.N(5.0, 0.0, 6.0, 11.0, 6.0, 9.0),
      class00891.N(5.0, 0.0, 6.0, 10.0, 6.0, 11.0),
      class00891.N(5.0, 0.0, 5.0, 11.0, 6.0, 10.0)
   };

   public class05440(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(R, 1).y(M, false).y(B, false));
   }

   @Override
   protected boolean b(class00500 var1) {
      return !var1.L(B) && super.b(var1);
   }

   public static boolean v(class00500 var0) {
      return var0.N(class01210.C, var0x -> var0x.y(M) && var0x.y(B)) && !var0.L(M) && !var0.L(B);
   }

   @Override
   protected Iterable<class06889> U(class00500 var1) {
      return (Iterable<class06889>)O.get(var1.L(R));
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(B) ? class04684.L.N(false) : super.u(var1);
   }

   @Override
   public MapCodec<class05440> N() {
      return L;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(B)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public class00500 N(class06942 var1) {
      class00500 class00500 = var1.method_8045().method_8320(var1.method_8037());
      if (class00500.N(this)) {
         return class00500.N(R);
      } else {
         boolean flag = var1.method_8045().method_8316(var1.method_8037()).N() == class04684.L;
         return super.N(var1).y(B, flag);
      }
   }

   @Override
   protected boolean N(class00500 var1, class06942 var2) {
      return !var2.method_8046() && var2.method_8041().B() == this.B() && var1.L(R) < 4 ? true : super.N(var1, var2);
   }

   @Override
   protected class07082 N(class06584 var1, class00500 var2, class07299 var3, class07209 var4, class08036 var5, class07050 var6, class06183 var7) {
      if (var1.R() && var5.method_31549().i && var2.L(M)) {
         N(var5, var2, var3, var4);
         return class07082.N;
      } else {
         return super.N(var1, var2, var3, var4, var5, var6, var7);
      }
   }

   @Override
   public boolean N(class07284 var1, class07209 var2, class00500 var3, class04688 var4) {
      if (!var3.L(B) && var4.N() == class04684.L) {
         class00500 class00500 = var3.y(B, true);
         if (var3.L(M)) {
            N(null, class00500, var1, var2);
         } else {
            var1.method_8652(var2, class00500, 3);
         }

         var1.N(var2, var4.N(), var4.N().N(var1));
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return F[var1.L(R) - 1];
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(R, M, B);
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      return class00891.N_6(var2, var3.method_10074(), class07211.field_11036);
   }
}
