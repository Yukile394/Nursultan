package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class05292 extends class07150 implements class05293 {
   private static final class02131<Boolean> L = class03289.N(class05292.class, class02154.U);
   private static final int R = 40;
   private static final int M = 1;
   private static final float B = 0.6F;
   private static final int Z = 6;
   private static final float W = 0.5F;
   private static final int T = 40;
   private static final int b = 15;
   private static final int X = 200;
   private static final float a = 0.3F;
   private static final float p = 0.4F;
   private static final boolean F = false;
   private int A;
   protected static final ImmutableList<? extends class05340<? extends class05355<? super class05292>>> N = ImmutableList.of(class05340.L, class05340.u);
   protected static final ImmutableList<? extends class05378<?>> y = ImmutableList.of(
      class05378.M, class05378.B, class05378.U, class05378.E, class05378.P, class05378.m, class05378.I, class05378.n, class05378.s, class05378.T
   );

   private Optional<? extends class07438> L(class04782 var1) {
      return this.method_18868().L(class05378.B).orElse(class04051.N()).N(var2 -> this.N(var1, var2));
   }

   private static void L(class01289<class05292> var0) {
      var0.N(
         class05359.U,
         10,
         ImmutableList.of(
            class01531.N(1.0F), class04137.N_44(class05292::B, class01528.N(40)), class04137.N_44(class05292::method_6109, class01528.N(15)), class01523.N()
         ),
         class05378.s
      );
   }

   public static class05300 M() {
      return class07150.Y().N(class05298.n, 40.0).N(class05298.l, 0.3F).N(class05298.b, 0.6F).N(class05298.i, 1.0).N(class05298.u, 6.0);
   }

   @Nullable
   @Override
   public class07438 T() {
      return this.S();
   }

   @Override
   public void method_5674(class02131<?> var1) {
      super.method_5674(var1);
      if (L.equals(var1)) {
         this.method_18382();
      }
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(L, false);
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      boolean flag = super.method_64397(var1, var2, var3);
      if (flag && var2.u() instanceof class07438 class07438) {
         if (this.method_18395(class07438) && !class06293.N(this, class07438, 4.0)) {
            this.N(class07438);
         }

         return true;
      } else {
         return flag;
      }
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      this.method_5783(class04909.JJ, 0.15F, 1.0F);
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("IsBaby", this.method_6109());
   }

   @Override
   public boolean method_6109() {
      return this.method_5841().N(L);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.y(var1.N("IsBaby", false));
   }

   @Override
   public void method_5711(byte var1) {
      if (var1 == 4) {
         this.A = 10;
         this.method_56078(class04909.JO);
      } else {
         super.method_5711(var1);
      }
   }

   public class05292(class07078<? extends class05292> var1, class07299 var2) {
      super(var1, var2);
      this.J = 5;
   }

   public boolean B() {
      return !this.method_6109();
   }

   @Override
   protected class04891 s() {
      if (this.method_73183().method_8608()) {
         return null;
      } else {
         return super.fields_12212a028292fd3c078969e3ee4c71d9e8_1.N(class05378.s) ? class04909.JQ : class04909.JY;
      }
   }

   protected void m() {
      this.method_56078(class04909.JQ);
   }

   @Override
   public boolean g() {
      return true;
   }

   private static void y(class01289<class05292> var0) {
      var0.N(
         class05359.y,
         10,
         ImmutableList.of(
            class01507.N((var0x, var1) -> var1.L(var0x)),
            class04126.N(8.0F, class02135.y(30, 60)),
            new class05747(ImmutableList.of(Pair.of(class01520.N(0.4F), 2), Pair.of(class05771.N(0.4F, 3), 2), Pair.of(new class05782(30, 60), 1)))
         )
      );
   }

   @Override
   public void y(boolean var1) {
      this.method_5841().N(L, var1);
      if (!this.method_73183().method_8608() && var1) {
         this.method_5996(class05298.u).N(0.5);
      }
   }

   protected void E() {
      class05359 class05359 = super.fields_12212a028292fd3c078969e3ee4c71d9e8_1.R().orElse(null);
      super.fields_12212a028292fd3c078969e3ee4c71d9e8_1.N(ImmutableList.of(class05359.U, class05359.y));
      if (super.fields_12212a028292fd3c078969e3ee4c71d9e8_1.R().orElse(null) == class05359.U && class05359 != class05359.U) {
         this.m();
      }

      this.R(super.fields_12212a028292fd3c078969e3ee4c71d9e8_1.N(class05378.s));
   }

   private void N(class07438 var1) {
      super.fields_12212a028292fd3c078969e3ee4c71d9e8_1.y(class05378.I);
      super.fields_12212a028292fd3c078969e3ee4c71d9e8_1.N(class05378.s, var1, 200L);
   }

   private boolean N(class04782 var1, class07438 var2) {
      class07078<?> class07078 = var2.method_5864();
      return class07078 != class07078.yS && class07078 != class07078.q && class05355.y(var1, this, var2);
   }

   private static void N(class01289<class05292> var0) {
      var0.N(class05359.N, 0, ImmutableList.of(new class05770(45, 90), new class05738()));
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      if (var1.method_8409().z() < 0.2F) {
         this.y(true);
      }

      return super.N(var1, var2, var3, var4);
   }

   @Override
   protected void N(class04782 var1) {
      class04643 class04643 = class08700.N();
      class04643.N("zoglinBrain");
      this.method_18868().N(var1, this);
      class04643.L();
      this.E();
   }

   @Override
   public int W() {
      return this.A;
   }

   @Override
   public class05781<class05292> method_28306() {
      return class01289.N(y, N);
   }

   @Override
   public class04891 method_6002() {
      return class04909.Jg;
   }

   @Override
   public void method_6007() {
      if (this.A > 0) {
         this.A--;
      }

      super.method_6007();
   }

   @Override
   public class01289<class05292> method_18868() {
      return (class01289<class05292>)super.method_18868();
   }

   @Override
   public boolean method_6121(class04782 var1, class07049 var2) {
      if (var2 instanceof class07438 class07438) {
         this.A = 10;
         var1.method_8421(this, (byte)4);
         this.method_56078(class04909.JO);
         return class05293.N(var1, this, class07438);
      } else {
         return false;
      }
   }

   @Override
   public void method_6060(class07438 var1) {
      if (!this.method_6109()) {
         class05293.N(this, var1);
      }
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.JI;
   }

   @Override
   public class01289<?> method_18867(Dynamic<?> var1) {
      class01289<class05292> class01289 = this.method_28306().N(var1);
      N(class01289);
      y(class01289);
      L(class01289);
      class01289.N(ImmutableSet.of(class05359.N));
      class01289.y(class05359.y);
      class01289.i();
      return class01289;
   }
}
