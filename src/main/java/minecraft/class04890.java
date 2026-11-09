package minecraft;

import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public abstract class class04890 {
   protected static final class00500 w = class00869.mr.W();
   protected class05163 k;
   @Nullable
   private class07211 N;
   private class07111 y;
   private class06993 L;
   protected int Y;
   private final class04878 u;
   private static final Set<class00891> i = ImmutableSet.builder()
      .add(class00869.Mu)
      .add(class00869.Le)
      .add(class00869.LH)
      .add(class00869.il)
      .add(class00869.UD)
      .add(class00869.EL)
      .add(class00869.Eu)
      .add(class00869.EN)
      .add(class00869.Uh)
      .add(class00869.Ur)
      .add(class00869.uW)
      .add(class00869.RQ)
      .build();

   protected class07218 L(int var1, int var2, int var3) {
      return new class07218(this.N(var1, var3), this.L(var2), this.y(var1, var3));
   }

   protected int L(int var1) {
      return this.i() == null ? var1 : var1 + this.k.Z();
   }

   public class05163 L() {
      return this.k;
   }

   protected void L(class05974 var1, class00500 var2, int var3, int var4, int var5, class05163 var6) {
      class07218 class07218 = this.L(var3, var4, var5);
      if (var6.y(class07218)) {
         if (this.N((class05487)var1, var3, var4, var5, var6)) {
            if (this.y != class07111.field_11302) {
               var2 = var2.N(this.y);
            }

            if (this.L != class06993.field_11467) {
               var2 = var2.N(this.L);
            }

            var1.method_8652(class07218, var2, 2);
            class04688 class04688 = var1.method_8316(class07218);
            if (!class04688.W()) {
               var1.N(class07218, class04688.N(), 0);
            }

            if (i.contains(var2.i())) {
               var1.method_8500(class07218).u(class07218);
            }
         }
      }
   }

   public class07111 M() {
      return this.y;
   }

   protected class04890(class04878 var1, int var2, class05163 var3) {
      super();
      this.u = var1;
      this.Y = var2;
      this.k = var3;
   }

   public class04890(class04878 var1, class07001 var2) {
      this(var1, var2.y("GD", 0), var2.<class05163>N_15("BB", class05163.N).orElseThrow());
      int ix = var2.y("O", 0);
      this.N(ix == -1 ? null : class07211.y(ix));
   }

   public class04878 B() {
      return this.u;
   }

   @Nullable
   public class07211 i() {
      return this.N;
   }

   public int u() {
      return this.Y;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected int y(int var1, int var2) {
      class07211 class07211 = this.i();
      if (class07211 == null) {
         return var2;
      } else {
         switch (class07211) {
            case field_11043:
               return this.k.W() - var2;
            case field_11035:
               return this.k.z() + var2;
            case field_11039:
            case field_11034:
               return this.k.z() + var1;
            default:
               return var2;
         }
      }
   }

   protected static class07211 y(class06069 var0) {
      return class07221.field_11062.N(var0);
   }

   protected boolean y(class05487 var1, int var2, int var3, int var4, class05163 var5) {
      class07218 class07218 = this.L(var2, var3 + 1, var4);
      return !var5.y(class07218)
         ? false
         : class07218.method_10264() < var1.method_8624(class07830.field_13195, class07218.method_10263(), class07218.method_10260());
   }

   protected void y(class05974 var1, class05163 var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      for (int ix = var4; ix <= var7; ix++) {
         for (int j = var3; j <= var6; j++) {
            for (int kx = var5; kx <= var8; kx++) {
               this.L(var1, class00869.N.W(), j, ix, kx, var2);
            }
         }
      }
   }

   public void y(int var1) {
      this.Y = var1;
   }

   protected boolean N(class05974 var1, class05163 var2, class06069 var3, int var4, int var5, int var6, class07211 var7, class05946<class05074> var8) {
      class07218 class07218 = this.L(var4, var5, var6);
      if (var2.y(class07218) && !var1.method_8320(class07218).N(class00869.yy)) {
         this.L(var1, class00869.yy.W().y(class06758.y, var7), var4, var5, var6, var2);
         class00394 class00394 = var1.method_8321(class07218);
         if (class00394 instanceof class07243) {
            ((class07243)class00394).N(var8, var3.B());
         }

         return true;
      } else {
         return false;
      }
   }

   protected void N(class05974 var1, class00500 var2, int var3, int var4, int var5, class05163 var6) {
      class07218 class07218 = this.L(var3, var4, var5);
      if (var6.y(class07218)) {
         while (this.N(var1.method_8320(class07218)) && class07218.method_10264() > var1.method_31607() + 1) {
            var1.method_8652(class07218, var2, 2);
            class07218.N(class07211.field_11033);
         }
      }
   }

   protected boolean N(class05974 var1, class05163 var2, class06069 var3, int var4, int var5, int var6, class05946<class05074> var7) {
      return this.N(var1, var2, var3, this.L(var4, var5, var6), var7, null);
   }

   protected boolean N(class00500 var1) {
      return var1.P() || var1.T() || var1.N(class00869.RX) || var1.N(class00869.yJ) || var1.N(class00869.yo);
   }

   public static class00500 N(class07290 var0, class07209 var1, class00500 var2) {
      class07211 class07211xx = null;

      for (class07211 class07211x : class07221.field_11062) {
         class07209 class07209x = var1.method_10093(class07211x);
         class00500 class00500 = var0.method_8320(class07209x);
         if (class00500.N(class00869.LA)) {
            return var2;
         }

         if (class00500.t()) {
            if (class07211xx != null) {
               class07211xx = null;
               break;
            }

            class07211xx = class07211x;
         }
      }

      if (class07211xx != null) {
         return var2.y(class07101.R, class07211xx.b());
      } else {
         class07211 class07211x = var2.L(class07101.R);
         class07209 class07209x = var1.method_10093(class07211x);
         if (var0.method_8320(class07209x).t()) {
            class07211x = class07211x.b();
            class07209x = var1.method_10093(class07211x);
         }

         if (var0.method_8320(class07209x).t()) {
            class07211x = class07211x.R();
            class07209x = var1.method_10093(class07211x);
         }

         if (var0.method_8320(class07209x).t()) {
            class07211x = class07211x.b();
            class07209x = var1.method_10093(class07211x);
         }

         return var2.y(class07101.R, class07211x);
      }
   }

   protected boolean N(class01001 var1, class05163 var2, class06069 var3, class07209 var4, class05946<class05074> var5, @Nullable class00500 var6) {
      if (var2.y(var4) && !var1.method_8320(var4).N(class00869.LA)) {
         if (var6 == null) {
            var6 = N(var1, var4, class00869.LA.W());
         }

         var1.method_8652(var4, var6, 2);
         class00394 class00394 = var1.method_8321(var4);
         if (class00394 instanceof class00379) {
            ((class00379)class00394).N(var5, var3.B());
         }

         return true;
      } else {
         return false;
      }
   }

   protected void N(
      class05974 var1, class05163 var2, int var3, int var4, int var5, int var6, int var7, int var8, class00500 var9, class00500 var10, boolean var11
   ) {
      for (int ix = var4; ix <= var7; ix++) {
         for (int j = var3; j <= var6; j++) {
            for (int kx = var5; kx <= var8; kx++) {
               if (!var11 || !this.N((class07290)var1, j, ix, kx, var2).P()) {
                  if (ix != var4 && ix != var7 && j != var3 && j != var6 && kx != var5 && kx != var8) {
                     this.L(var1, var10, j, ix, kx, var2);
                  } else {
                     this.L(var1, var9, j, ix, kx, var2);
                  }
               }
            }
         }
      }
   }

   protected static class05163 N(int var0, int var1, int var2, class07211 var3, int var4, int var5, int var6) {
      return var3.z() == class07185.field_11051
         ? new class05163(var0, var1, var2, var0 + var4 - 1, var1 + var5 - 1, var2 + var6 - 1)
         : new class05163(var0, var1, var2, var0 + var6 - 1, var1 + var5 - 1, var2 + var4 - 1);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void N(@Nullable class07211 var1) {
      this.N = var1;
      if (var1 == null) {
         this.L = class06993.field_11467;
         this.y = class07111.field_11302;
      } else {
         switch (var1) {
            case field_11035:
               this.y = class07111.field_11300;
               this.L = class06993.field_11467;
               break;
            case field_11039:
               this.y = class07111.field_11300;
               this.L = class06993.field_11463;
               break;
            case field_11034:
               this.y = class07111.field_11302;
               this.L = class06993.field_11463;
               break;
            default:
               this.y = class07111.field_11302;
               this.L = class06993.field_11467;
         }
      }
   }

   @Nullable
   public static class04890 N(List<class04890> var0, class05163 var1) {
      for (class04890 class04890 : var0) {
         if (class04890.L().N(var1)) {
            return class04890;
         }
      }

      return null;
   }

   public static class05163 N(Stream<class04890> var0) {
      return class05163.y(var0.map(class04890::L)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   public void N(int var1, int var2, int var3) {
      this.k.N(var1, var2, var3);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected int N(int var1, int var2) {
      class07211 class07211 = this.i();
      if (class07211 == null) {
         return var1;
      } else {
         switch (class07211) {
            case field_11043:
            case field_11035:
               return this.k.B() + var1;
            case field_11039:
               return this.k.U() - var2;
            case field_11034:
               return this.k.B() + var2;
            default:
               return var1;
         }
      }
   }

   protected abstract void N(class03298 var1, class07001 var2);

   public final class07001 N(class03298 var1) {
      class07001 class07001 = new class07001();
      class07001.N_67("id", class04206.p.y(this.B()).toString());
      class07001.N("BB", class05163.N, this.k);
      class07211 class07211 = this.i();
      class07001.N("O", class07211 == null ? -1 : class07211.u());
      class07001.N("GD", this.Y);
      this.N(var1, class07001);
      return class07001;
   }

   protected boolean N(class05487 var1, int var2, int var3, int var4, class05163 var5) {
      return true;
   }

   public void N(class04890 var1, class03860 var2, class06069 var3) {
   }

   public boolean N(class07321 var1, int var2) {
      int ix = var1.i();
      int j = var1.R();
      return this.k.N(ix - var2, j - var2, ix + 15 + var2, j + 15 + var2);
   }

   public abstract void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7);

   protected void N(class05974 var1, class05163 var2, class05163 var3, boolean var4, class06069 var5, class04892 var6) {
      this.N(var1, var2, var3.B(), var3.Z(), var3.z(), var3.U(), var3.E(), var3.W(), var4, var5, var6);
   }

   protected void N(class05974 var1, class05163 var2, int var3, int var4, int var5, int var6, int var7, int var8, class00500 var9, boolean var10) {
      float f = var6 - var3 + 1;
      float f1 = var7 - var4 + 1;
      float f2 = var8 - var5 + 1;
      float f3 = var3 + f / 2.0F;
      float f4 = var5 + f2 / 2.0F;

      for (int ix = var4; ix <= var7; ix++) {
         float f5 = (ix - var4) / f1;

         for (int j = var3; j <= var6; j++) {
            float f6 = (j - f3) / (f * 0.5F);

            for (int kx = var5; kx <= var8; kx++) {
               float f7 = (kx - f4) / (f2 * 0.5F);
               if ((!var10 || !this.N((class07290)var1, j, ix, kx, var2).P()) && f6 * f6 + f5 * f5 + f7 * f7 <= 1.05F) {
                  this.L(var1, var9, j, ix, kx, var2);
               }
            }
         }
      }
   }

   protected void N(
      class05974 var1,
      class05163 var2,
      class06069 var3,
      float var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      class00500 var11,
      class00500 var12,
      boolean var13,
      boolean var14
   ) {
      for (int ix = var6; ix <= var9; ix++) {
         for (int j = var5; j <= var8; j++) {
            for (int kx = var7; kx <= var10; kx++) {
               if (!(var3.z() > var4) && (!var13 || !this.N((class07290)var1, j, ix, kx, var2).P()) && (!var14 || this.y(var1, j, ix, kx, var2))) {
                  if (ix != var6 && ix != var9 && j != var5 && j != var8 && kx != var7 && kx != var10) {
                     this.L(var1, var12, j, ix, kx, var2);
                  } else {
                     this.L(var1, var11, j, ix, kx, var2);
                  }
               }
            }
         }
      }
   }

   protected void N(class05974 var1, class05163 var2, class06069 var3, float var4, int var5, int var6, int var7, class00500 var8) {
      if (var3.z() < var4) {
         this.L(var1, var8, var5, var6, var7, var2);
      }
   }

   protected void N(
      class05974 var1, class05163 var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, class06069 var10, class04892 var11
   ) {
      for (int ix = var4; ix <= var7; ix++) {
         for (int j = var3; j <= var6; j++) {
            for (int kx = var5; kx <= var8; kx++) {
               if (!var9 || !this.N((class07290)var1, j, ix, kx, var2).P()) {
                  var11.N(var10, j, ix, kx, ix == var4 || ix == var7 || j == var3 || j == var6 || kx == var5 || kx == var8);
                  this.L(var1, var11.N(), j, ix, kx, var2);
               }
            }
         }
      }
   }

   protected void N(class05974 var1, class05163 var2, class05163 var3, class00500 var4, class00500 var5, boolean var6) {
      this.N(var1, var2, var3.B(), var3.Z(), var3.z(), var3.U(), var3.E(), var3.W(), var4, var5, var6);
   }

   protected class00500 N(class07290 var1, int var2, int var3, int var4, class05163 var5) {
      class07218 class07218 = this.L(var2, var3, var4);
      return !var5.y(class07218) ? class00869.N.W() : var1.method_8320(class07218);
   }

   public class07209 av_() {
      return new class07209(this.k.M());
   }

   public class06993 R() {
      return this.L;
   }
}
