package minecraft;

import Nursultan.class10852;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class07899 extends class07643 {
   public static final class07890 N = new class07890(class07892.field_6881, class06563.field_7952, class06563.field_7952);
   private static final class02131<Integer> L = class03289.N(class07899.class, class02154.y);
   public static final List<class07890> y = List.of(
      new class07890(class07892.field_6887, class06563.field_7946, class06563.field_7944),
      new class07890(class07892.field_6893, class06563.field_7944, class06563.field_7944),
      new class07890(class07892.field_6893, class06563.field_7944, class06563.field_7966),
      new class07890(class07892.field_6889, class06563.field_7952, class06563.field_7944),
      new class07890(class07892.field_6880, class06563.field_7966, class06563.field_7944),
      new class07890(class07892.field_6881, class06563.field_7946, class06563.field_7952),
      new class07890(class07892.field_6892, class06563.field_7954, class06563.field_7951),
      new class07890(class07892.field_6884, class06563.field_7945, class06563.field_7947),
      new class07890(class07892.field_6889, class06563.field_7952, class06563.field_7964),
      new class07890(class07892.field_6892, class06563.field_7952, class06563.field_7947),
      new class07890(class07892.field_6883, class06563.field_7952, class06563.field_7944),
      new class07890(class07892.field_6889, class06563.field_7952, class06563.field_7946),
      new class07890(class07892.field_6890, class06563.field_7955, class06563.field_7954),
      new class07890(class07892.field_6891, class06563.field_7961, class06563.field_7951),
      new class07890(class07892.field_6888, class06563.field_7964, class06563.field_7952),
      new class07890(class07892.field_6882, class06563.field_7944, class06563.field_7964),
      new class07890(class07892.field_6884, class06563.field_7964, class06563.field_7952),
      new class07890(class07892.field_6893, class06563.field_7952, class06563.field_7947),
      new class07890(class07892.field_6881, class06563.field_7964, class06563.field_7952),
      new class07890(class07892.field_6880, class06563.field_7944, class06563.field_7952),
      new class07890(class07892.field_6890, class06563.field_7955, class06563.field_7947),
      new class07890(class07892.field_6893, class06563.field_7947, class06563.field_7947)
   );
   private boolean u = true;

   public static class06563 L(int var0) {
      return class06563.N(var0 >> 24 & 0xFF);
   }

   public class06563 Q() {
      return y(this.o());
   }

   @Override
   protected void method_66649(class02666 var1) {
      this.method_66650(var1, class02484.NK);
      this.method_66650(var1, class02484.NV);
      this.method_66650(var1, class02484.Ne);
      super.method_66649(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(L, N.N());
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("Variant", class07890.N, new class07890(this.o()));
   }

   @Nullable
   @Override
   public <T> T method_58694(class02477<? extends T> var1) {
      if (var1 == class02484.NK) {
         return method_66651(var1, this.I());
      } else if (var1 == class02484.NV) {
         return method_66651(var1, this.Q());
      } else {
         return var1 == class02484.Ne ? method_66651(var1, this.O()) : super.method_58694(var1);
      }
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      class07890 class07890 = var1.<class07890>N("Variant", class07890.N).orElse(N);
      this.i(class07890.N());
   }

   public class07899(class07078<? extends class07899> var1, class07299 var2) {
      super(var1, var2);
   }

   public class07892 I() {
      return u(this.o());
   }

   private void i(int var1) {
      this.field_6011.N(L, var1);
   }

   @Override
   protected class04891 s() {
      return class04909.Oi;
   }

   @Override
   protected class04891 m() {
      return class04909.OM;
   }

   private int o() {
      return this.field_6011.N(L);
   }

   public static class07892 u(int var0) {
      return class07892.N(var0 & 65535);
   }

   public static class06563 y(int var0) {
      return class06563.N(var0 >> 16 & 0xFF);
   }

   private void y(class06563 var1) {
      int i = this.o();
      class07892 class07892 = u(i);
      class06563 class06563 = y(i);
      this.i(N(class07892, class06563, var1));
   }

   private void N(class07892 var1) {
      int i = this.o();
      class06563 class06563x = y(i);
      class06563 class06563x = L(i);
      this.i(N(var1, class06563x, class06563x));
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      var4 = super.N(var1, var2, var3, var4);
      class06069 class06069 = var1.method_8409();
      class07890 class07890;
      if (var4 instanceof class10852) {
         class07890 = ((class10852)var4).y;
      } else if (class06069.z() < 0.9) {
         class07890 = class07536.N_77(y, class06069);
         var4 = new class10852(this, class07890);
      } else {
         this.u = false;
         class07892[] aclass07892 = class07892.values();
         class06563[] aclass06563 = class06563.values();
         class07892 class07892 = class07536.N((class07892[])aclass07892, class06069);
         class06563 class06563x = class07536.N((class06563[])aclass06563, class06069);
         class06563 class06563x = class07536.N((class06563[])aclass06563, class06069);
         class07890 = new class07890(class07892, class06563x, class06563x);
      }

      this.i(class07890.N());
      return var4;
   }

   public static boolean N(class07078<class07899> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      return var1.method_8316(var3.method_10074()).N(class01231.N)
         && var1.method_8320(var3.method_10084()).N(class00869.K)
         && (var1.i(var3).N(class03557.NU) || class07874.L(var0, var1, var2, var3, var4));
   }

   private void N(class06563 var1) {
      int i = this.o();
      class07892 class07892 = u(i);
      class06563 class06563 = L(i);
      this.i(N(class07892, var1, class06563));
   }

   static int N(class07892 var0, class06563 var1, class06563 var2) {
      return var0.y() & 65535 | (var1.N() & 0xFF) << 16 | (var2.N() & 0xFF) << 24;
   }

   public static String N(int var0) {
      return "entity.minecraft.tropical_fish.predefined." + var0;
   }

   @Override
   public boolean R(int var1) {
      return !this.u;
   }

   public class06563 O() {
      return L(this.o());
   }

   @Override
   public class06584 Y() {
      return new class06584(class06570.jn);
   }

   @Override
   protected <T> boolean method_66654(class02477<T> var1, T var2) {
      if (var1 == class02484.NK) {
         this.N(method_66651(class02484.NK, var2));
         return true;
      } else if (var1 == class02484.NV) {
         this.N(method_66651(class02484.NV, var2));
         return true;
      } else if (var1 == class02484.Ne) {
         this.y(method_66651(class02484.Ne, var2));
         return true;
      } else {
         return super.method_66654(var1, var2);
      }
   }

   @Override
   public void e_(class06584 var1) {
      super.e_(var1);
      var1.N(class02484.NK, this);
      var1.N(class02484.NV, this);
      var1.N(class02484.Ne, this);
   }

   @Override
   public class04891 method_6002() {
      return class04909.OR;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.OB;
   }
}
