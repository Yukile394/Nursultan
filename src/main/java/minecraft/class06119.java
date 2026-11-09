package minecraft;

import org.jspecify.annotations.Nullable;

public class class06119 extends class00394 implements class05266, class06237 {
   public static final int N = 0;
   public static final int y = 1;
   public static final int L = 0;
   public static final int u = 1;
   private final class06695 M = new class06108(this);
   private final class05845 B = new class06100(this);
   class06584 i = class06584.E;
   int R;
   private int Z;

   public boolean L() {
      return this.i.L(class02484.Ny) || this.i.L(class02484.NL);
   }

   private static int L(class06584 var0) {
      class02706 class02706 = var0.method_58694(class02484.NL);
      if (class02706 != null) {
         return class02706.N().size();
      } else {
         class02699 class02699 = var0.method_58694(class02484.Ny);
         return class02699 != null ? class02699.N().size() : 0;
      }
   }

   public int M() {
      return class04995.y((this.Z > 1 ? this.R() / (this.Z - 1.0F) : 1.0F) * 14.0F) + (this.L() ? 1 : 0);
   }

   @Override
   public class00392 method_5476() {
      return class00392.L("container.lectern");
   }

   public class06119(class07209 var1, class00500 var2) {
      super(class00404.field_16412, var1, var2);
   }

   void u() {
      this.R = 0;
      this.Z = 0;
      class06127.N(null, this.G(), this.d(), this.w(), false);
   }

   private class06584 y(class06584 var1, @Nullable class08036 var2) {
      if (this.z instanceof class04782 class04782) {
         class02706.N(var1, this.N(var2, class04782), var2);
      }

      return var1;
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      if (!this.N().R()) {
         var1.N("Book", class06584.y, this.N());
         var1.N("Page", this.R);
      }
   }

   @Override
   public void N(class07209 var1, class00500 var2) {
      if (var2.L(class06127.u) && this.z != null) {
         class07211 class07211 = var2.L(class06127.y);
         class06584 class06584 = this.N().t();
         float f = 0.25F * class07211.P();
         float f1 = 0.25F * class07211.T();
         class00717 class00717 = new class00717(this.z, var1.method_10263() + 0.5 + f, var1.method_10264() + 1, var1.method_10260() + 0.5 + f1, class06584);
         class00717.L();
         this.z.method_8649(class00717);
      }
   }

   public void N(class06584 var1) {
      this.N(var1, null);
   }

   void N(int var1) {
      int ix = class04995.N(var1, 0, this.Z - 1);
      if (ix != this.R) {
         this.R = ix;
         this.method_5431();
         class06127.N(this.G(), this.d(), this.w());
      }
   }

   public class06584 N() {
      return this.i;
   }

   public void N(class06584 var1, @Nullable class08036 var2) {
      this.i = this.y(var1, var2);
      this.R = 0;
      this.Z = L(this.i);
      this.method_5431();
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.i = var1.<class06584>N("Book", class06584.y).map(var1x -> this.y(var1x, null)).orElse(class06584.E);
      this.Z = L(this.i);
      this.R = class04995.N(var1.N("Page", 0), 0, this.Z - 1);
   }

   private class07701 N(@Nullable class08036 var1, class04782 var2) {
      String s;
      Object object;
      if (var1 == null) {
         s = "Lectern";
         object = class00392.y("Lectern");
      } else {
         s = var1.method_74861();
         object = var1.method_5476();
      }

      class06889 class06889 = class06889.y(this.U);
      return new class07701(class07703.j_, class06889, class07109.N, var2, class06984.L, s, (class00392)object, var2.method_8503(), var1);
   }

   @Override
   public void method_5448() {
      this.N(class06584.E);
   }

   public int R() {
      return this.R;
   }

   @Override
   public class07482 createMenu(int var1, class08044 var2, class08036 var3) {
      return new class05856(var1, this.M, this.B);
   }
}
