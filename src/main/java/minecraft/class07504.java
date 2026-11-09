package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public abstract class class07504 extends class01720 {
   private static final class06889 y = new class06889(0.0, 0.0, 0.0);
   private static final class02131<Optional<class00500>> u = class03289.N(class07504.class, class02154.z);
   private static final class02131<Integer> B = class03289.N(class07504.class, class02154.y);
   private static final ImmutableMap<class01312, ImmutableList<Integer>> Z = ImmutableMap.of(
      class01312.field_18076, ImmutableList.of(0, 1, -1), class01312.field_18081, ImmutableList.of(0, 1, -1), class01312.field_18079, ImmutableList.of(0, 1)
   );
   protected static final float N = 0.95F;
   private static final boolean z = false;
   private boolean U;
   private boolean E = false;
   private final class02736 W;
   private static final Map<class08080, Pair<class00753, class00753>> m = Maps.newEnumMap(
      (Map)class07536.N(
         () -> {
            class00753 class00753 = class07211.field_11039.E();
            class00753 class00753x = class07211.field_11034.E();
            class00753 class00753xx = class07211.field_11043.E();
            class00753 class00753xxx = class07211.field_11035.E();
            class00753 class00753xxxx = class00753.method_23228();
            class00753 class00753xxxxx = class00753x.method_23228();
            class00753 class00753xxxxxx = class00753xx.method_23228();
            class00753 class00753xxxxxxx = class00753xxx.method_23228();
            return ImmutableMap.of(
               class08080.field_12665,
               Pair.of(class00753xx, class00753xxx),
               class08080.field_12674,
               Pair.of(class00753, class00753x),
               class08080.field_12667,
               Pair.of(class00753xxxx, class00753x),
               class08080.field_12666,
               Pair.of(class00753, class00753xxxxx),
               class08080.field_12670,
               Pair.of(class00753xx, class00753xxxxxxx),
               class08080.field_12668,
               Pair.of(class00753xxxxxx, class00753xxx),
               class08080.field_12664,
               Pair.of(class00753xxx, class00753x),
               class08080.field_12671,
               Pair.of(class00753xxx, class00753),
               class08080.field_12672,
               Pair.of(class00753xx, class00753),
               class08080.field_12663,
               Pair.of(class00753xx, class00753x)
            );
         }
      )
   );

   public class07209 L() {
      int i = class04995.N(this.method_23317());
      int j = class04995.N(this.method_23318());
      int k = class04995.N(this.method_23321());
      if (N(this.method_73183())) {
         double d0 = this.method_23318() - 0.1 - 1.0E-5F;
         if (this.method_73183().method_8320(class07209.method_49637(i, d0, k)).N(class01210.e)) {
            j = class04995.N(d0);
         }
      } else if (this.method_73183().method_8320(new class07209(i, j - 1, k)).N(class01210.e)) {
         j--;
      }

      return new class07209(i, j, k);
   }

   protected void L(class04782 var1) {
      double d0 = this.N_73(var1);
      class06889 class06889 = this.method_18798();
      this.method_18800(class04995.N(class06889.M, -d0, d0), class06889.B, class04995.N(class06889.Z, -d0, d0));
      if (this.method_24828()) {
         this.method_18799(this.method_18798().L(0.5));
      }

      this.method_5784(class07451.field_6308, this.method_18798());
      if (!this.method_24828()) {
         this.method_18799(this.method_18798().L(0.95));
      }
   }

   public int M() {
      return this.method_5841().N(B);
   }

   public boolean P() {
      return false;
   }

   @Override
   public class06889 method_30633(class07185 var1, class01009 var2) {
      return class07438.method_31079(super.method_30633(var1, var2));
   }

   @Override
   public class06889 method_24829(class07438 var1) {
      class07211 class07211 = this.method_5755();
      if (class07211.z() == class07185.field_11052) {
         return super.method_24829(var1);
      } else {
         int[][] aint = class05188.N(class07211);
         class07209 class07209 = this.method_24515();
         class07218 class07218 = new class07218();
         ImmutableList<class01312> immutablelist = var1.method_24831();
         UnmodifiableIterator<class01312> unmodifiableiterator = immutablelist.iterator();

         while (unmodifiableiterator.hasNext()) {
            class01312 class01312x = (class01312)unmodifiableiterator.next();
            class01325 var9 = var1.method_18377(class01312x);
            float f = Math.min(var9.N(), 1.0F) / 2.0F;
            UnmodifiableIterator<Integer> unmodifiableiterator1 = ((ImmutableList)Z.get(class01312x)).iterator();

            while (unmodifiableiterator1.hasNext()) {
               int i = (Integer)unmodifiableiterator1.next();

               for (int[] aint1 : aint) {
                  class07218.N(class07209.method_10263() + aint1[0], class07209.method_10264() + i, class07209.method_10260() + aint1[1]);
                  double d0 = this.method_73183()
                     .N(class05188.N(this.method_73183(), class07218), () -> class05188.N(this.method_73183(), class07218.method_10074()));
                  if (class05188.N(d0)) {
                     class00734 class00734 = new class00734(-f, 0.0, -f, f, var9.y(), f);
                     class06889 class06889 = class06889.N(class07218, d0);
                     if (class05188.N(this.method_73183(), var1, class00734.L(class06889))) {
                        var1.method_18380(class01312x);
                        return class06889;
                     }
                  }
               }
            }
         }

         double d1 = this.method_5829().i;
         class07218.N((double)class07209.method_10263(), d1, (double)class07209.method_10260());
         UnmodifiableIterator<class01312> unmodifiableiterator2 = immutablelist.iterator();

         while (unmodifiableiterator2.hasNext()) {
            class01312 class01312 = (class01312)unmodifiableiterator2.next();
            double d2 = var1.method_18377(class01312).y();
            int j = class04995.L(d1 - class07218.method_10264() + d2);
            double d3 = class05188.N(class07218, j, var1x -> this.method_73183().method_8320(var1x).M(this.method_73183(), var1x));
            if (d1 + d2 <= d3) {
               var1.method_18380(class01312);
               break;
            }
         }

         return super.method_24829(var1);
      }
   }

   @Override
   public class07211 method_5755() {
      return this.W.E();
   }

   @Override
   public void method_31471(class07276 var1) {
      super.method_31471(var1);
      this.W.N(this.method_18798());
   }

   @Override
   public abstract class06584 method_31480();

   @Override
   public void method_52532(int var1, double var2, double var4, double var6, double var8, double var10) {
      super.method_52532(var1, var2, var4, var6, var8, var10);
   }

   @Override
   public class06889 method_60478() {
      return this.W.u(super.method_60478());
   }

   @Override
   protected void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(u, Optional.empty());
      var1.N(B, this.B());
   }

   @Override
   public void method_23311() {
      super.method_23311();
   }

   @Override
   public void method_5773() {
      if (this.G() > 0) {
         this.y(this.G() - 1);
      }

      if (this.t() > 0.0F) {
         this.y(this.t() - 1.0F);
      }

      this.method_31473();
      this.method_76440();
      this.method_60698();
      this.W.y();
      this.method_5876();
      if (this.method_5771()) {
         this.method_67633();
         this.method_5730();
         this.field_6017 *= 0.5;
      }

      this.field_5953 = false;
   }

   @Override
   public boolean method_5876() {
      return super.method_5876();
   }

   @Override
   public void method_5784(class07451 var1, class06889 var2) {
      if (N(this.method_73183())) {
         class06889 class06889 = this.method_73189().i(var2);
         super.method_5784(var1, var2);
         if (this.W.u()) {
            super.method_5784(var1, class06889.u(this.method_73189()));
         }

         if (var1.equals(class07451.field_6310)) {
            this.U = false;
         }
      } else {
         super.method_5784(var1, var2);
         this.method_61409();
      }
   }

   @Override
   protected float method_23326() {
      return this.method_73183().method_8320(this.method_24515()).N(class01210.e) ? 1.0F : super.method_23326();
   }

   @Override
   public boolean method_52172() {
      return this.U;
   }

   @Override
   public void method_61409() {
      if (N(this.method_73183())) {
         super.method_61409();
      } else {
         this.method_64166(this.method_73189(), this.method_73189());
         this.method_71965();
      }
   }

   @Override
   protected class07065 method_33570() {
      return class07065.field_28632;
   }

   @Override
   public void method_56990() {
      super.method_56990();
   }

   @Override
   protected double method_7490() {
      return this.method_5799() ? 0.005 : 0.04;
   }

   @Override
   public void method_5697(class07049 var1) {
      if (!this.method_73183().method_8608()) {
         if (!var1.field_5960 && !this.field_5960) {
            if (!this.method_5626(var1)) {
               double d0 = var1.method_23317() - this.method_23317();
               double d1 = var1.method_23321() - this.method_23321();
               double d2 = d0 * d0 + d1 * d1;
               if (d2 >= 1.0E-4F) {
                  d2 = Math.sqrt(d2);
                  d0 /= d2;
                  d1 /= d2;
                  double d3 = 1.0 / d2;
                  if (d3 > 1.0) {
                     d3 = 1.0;
                  }

                  d0 *= d3;
                  d1 *= d3;
                  d0 *= 0.1F;
                  d1 *= 0.1F;
                  d0 *= 0.5;
                  d1 *= 0.5;
                  if (var1 instanceof class07504 class07504) {
                     this.N(class07504, d0, d1);
                  } else {
                     this.method_5762(-d0, 0.0, -d1);
                     var1.method_5762(d0 / 4.0, 0.0, d1 / 4.0);
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean method_5810() {
      return true;
   }

   @Override
   protected void method_5652(class08329 var1) {
      this.s().ifPresent(var1x -> var1.N("DisplayState", class00500.N, var1x));
      int i = this.M();
      if (i != this.B()) {
         var1.N("DisplayOffset", i);
      }

      var1.N("FlippedRotation", this.E);
      var1.N("HasTicked", this.field_5953);
   }

   @Override
   public boolean method_5863() {
      return !this.method_31481();
   }

   @Override
   protected void method_5749(class08299 var1) {
      this.N_19(var1.N("DisplayState", class00500.N));
      this.N(var1.N("DisplayOffset", this.B()));
      this.E = var1.N("FlippedRotation", false);
      this.field_5953 = var1.N("HasTicked", false);
   }

   @Override
   public boolean method_30949(class07049 var1) {
      return class00250.N(this, var1);
   }

   @Override
   protected class06889 method_52533(class07049 var1, class01325 var2, float var3) {
      return var1 instanceof class08041 || var1 instanceof class06163 ? y : super.method_52533(var1, var2, var3);
   }

   @Override
   public class08382 method_66233() {
      return this.W.N();
   }

   @Override
   public void method_5750(class06889 var1) {
      this.W.N(var1);
   }

   @Override
   public void method_5879(float var1) {
      this.L(-this.l());
      this.y(10);
      this.y(this.t() + this.t() * 10.0F);
   }

   protected class07504(class07078<?> var1, class07299 var2, double var3, double var5, double var7) {
      this(var1, var2);
      this.N(var3, var5, var7);
   }

   protected class07504(class07078<?> var1, class07299 var2) {
      super(var1, var2);
      this.field_23807 = true;
      if (N(var2)) {
         this.W = new class02726(this);
      } else {
         this.W = new class02757(this);
      }
   }

   public int B() {
      return 6;
   }

   public boolean Z() {
      return false;
   }

   public class00500 i() {
      return this.s().orElseGet(this::R);
   }

   private Optional<class00500> s() {
      return this.method_5841().N(u);
   }

   public boolean u() {
      return this.E;
   }

   protected void y(class04782 var1) {
      this.W.N(var1);
   }

   public boolean y() {
      return this.field_5953;
   }

   public boolean y(class07209 var1) {
      return this.method_73183().method_8320(var1).u(this.method_73183(), var1);
   }

   public void y(boolean var1) {
      this.E = var1;
   }

   public static Pair<class00753, class00753> N(class08080 var0) {
      return m.get(var0);
   }

   public void N(int var1) {
      this.method_5841().N(B, var1);
   }

   public static boolean N(class07299 var0) {
      return var0.method_45162().y(class03794.u);
   }

   public void N(double var1, double var3, double var5) {
      this.method_5814(var1, var3, var5);
      this.field_6014 = var1;
      this.field_6036 = var3;
      this.field_5969 = var5;
   }

   @Nullable
   public static <T extends class07504> T N(
      class07299 var0, double var1, double var3, double var5, class07078<T> var7, class06113 var8, class06584 var9, @Nullable class08036 var10
   ) {
      class07504 class07504 = (class07504)var7.N(var0, var8);
      if (class07504 != null) {
         class07504.N(var1, var3, var5);
         class07078.<class07504>N(var0, var9, var10).accept(class07504);
         if (class07504.N() instanceof class02726 class02726) {
            class07209 class07209 = class07504.L();
            class00500 class00500 = var0.method_8320(class07209);
            class02726.N(class07209, class00500, true);
         }
      }

      return (T)class07504;
   }

   public class02736 N() {
      return this.W;
   }

   public void N(class04782 var1, int var2, int var3, int var4, boolean var5) {
   }

   protected class06889 N(class06889 var1) {
      double d0 = this.W.W();
      class06889 class06889 = var1.u(d0, 0.0, d0);
      if (this.method_5799()) {
         class06889 = class06889.L(0.95F);
      }

      return class06889;
   }

   public class06889 N(class07209 var1) {
      class00500 class00500 = this.method_73183().method_8320(var1);
      if (class00500.N(class00869.yG) && class00500.L(class06900.u)) {
         class08080 class08080 = class00500.L(((class07760)class00500.i()).L());
         if (class08080 == class08080.field_12674) {
            if (this.y(var1.method_10067())) {
               return new class06889(1.0, 0.0, 0.0);
            }

            if (this.y(var1.method_10078())) {
               return new class06889(-1.0, 0.0, 0.0);
            }
         } else if (class08080 == class08080.field_12665) {
            if (this.y(var1.method_10095())) {
               return new class06889(0.0, 0.0, 1.0);
            }

            if (this.y(var1.method_10072())) {
               return new class06889(0.0, 0.0, -1.0);
            }
         }

         return class06889.L;
      } else {
         return class06889.L;
      }
   }

   public void N(boolean var1) {
      this.U = var1;
   }

   public void N_19(Optional<class00500> var1) {
      this.method_5841().N(u, var1);
   }

   protected double N(class07209 var1, class08080 var2, double var3) {
      return this.W.N(var1, var2, var3);
   }

   private void N(class07504 var1, double var2, double var4) {
      double d0;
      double d1;
      if (N(this.method_73183())) {
         d0 = this.method_18798().M;
         d1 = this.method_18798().Z;
      } else {
         d0 = var1.method_23317() - this.method_23317();
         d1 = var1.method_23321() - this.method_23321();
      }

      class06889 class06889xxx = new class06889(d0, 0.0, d1).u();
      class06889 class06889x = new class06889(
            class04995.P(this.method_36454() * (float) (Math.PI / 180.0)), 0.0, class04995.m(this.method_36454() * (float) (Math.PI / 180.0))
         )
         .u();
      if (!(Math.abs(class06889xxx.y(class06889x)) < 0.8F) || N(this.method_73183())) {
         class06889 class06889xx = this.method_18798();
         class06889 class06889xxx = var1.method_18798();
         if (var1.P() && !this.P()) {
            this.method_18799(class06889xx.u(0.2, 1.0, 0.2));
            this.method_5762(class06889xxx.M - var2, 0.0, class06889xxx.Z - var4);
            var1.method_18799(class06889xxx.u(0.95, 1.0, 0.95));
         } else if (!var1.P() && this.P()) {
            var1.method_18799(class06889xxx.u(0.2, 1.0, 0.2));
            var1.method_5762(class06889xx.M + var2, 0.0, class06889xx.Z + var4);
            this.method_18799(class06889xx.u(0.95, 1.0, 0.95));
         } else {
            double d2 = (class06889xxx.M + class06889xx.M) / 2.0;
            double d3 = (class06889xxx.Z + class06889xx.Z) / 2.0;
            this.method_18799(class06889xx.u(0.2, 1.0, 0.2));
            this.method_5762(d2 - var2, 0.0, d3 - var4);
            var1.method_18799(class06889xxx.u(0.2, 1.0, 0.2));
            var1.method_5762(d2 + var2, 0.0, d3 + var4);
         }
      }
   }

   protected double N_73(class04782 var1) {
      return this.W.y(var1);
   }

   public class00500 R() {
      return class00869.N.W();
   }
}
