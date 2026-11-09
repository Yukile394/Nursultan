package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import org.jspecify.annotations.Nullable;

public class class04096 extends class07629 {
   private static final int R = 0;
   public static int N = Math.abs(-24000);
   public static final float y = 0.4F;
   public static final float L = 0.3F;
   private int B = 0;
   protected static final ImmutableList<class05340<? extends class05355<? super class04096>>> u = ImmutableList.of(
      class05340.L, class05340.u, class05340.R, class05340.j
   );
   protected static final ImmutableList<class05378<?>> i = ImmutableList.of(
      class05378.P, class05378.B, class05378.m, class05378.I, class05378.n, class05378.e, class05378.p, class05378.A, class05378.a, class05378.j, class05378.NN
   );

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("Age", this.B);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.y(var1.N("Age", 0));
   }

   public class04096(class07078<? extends class07629> var1, class07299 var2) {
      super(var1, var2);
      this.q = new class05581(this, 85, 10, 0.02F, 0.1F, true);
      this.o = new class07450(this, 10);
   }

   @Override
   public boolean B() {
      return true;
   }

   private boolean i(class06584 var1) {
      return var1.N(class01226.Nf);
   }

   @Nullable
   @Override
   protected class04891 s() {
      return null;
   }

   private int n() {
      return this.B;
   }

   @Override
   protected class04891 m() {
      return class04909.QH;
   }

   private void t() {
      if (this.method_73183() instanceof class04782 class04782) {
         this.N(class07078.NR, class08234.N(this, false, false), var2 -> {
            var2.N(class04782, class04782.method_8404(var2.method_24515()), class06113.field_16468, null);
            var2.NW();
            var2.method_60490(this.method_18377(this.method_18376()));
            this.method_5783(class04909.Qc, 0.15F, 1.0F);
         });
      }
   }

   public static class05300 v() {
      return class07633.Ne().N(class05298.l, 1.0).N(class05298.n, 6.0);
   }

   private void y(class08036 var1, class06584 var2) {
      var2.N(1, var1);
   }

   private void y(int var1) {
      this.B = var1;
      if (this.B >= N) {
         this.t();
      }
   }

   @Override
   public class04891 E() {
      return class04909.uk;
   }

   @Override
   public void N(boolean var1) {
   }

   private void N(class08036 var1, class06584 var2) {
      this.y(var1, var2);
      this.N(class07077.i(this.G()));
      this.method_73183().method_8406(class07107.F, this.method_23322(1.0), this.method_23319() + 0.5, this.method_23325(1.0), 0.0, 0.0, 0.0);
   }

   private void N(int var1) {
      this.y(this.B + var1 * 20);
   }

   @Override
   protected void N(class04782 var1) {
      class04643 class04643 = class08700.N();
      class04643.N("tadpoleBrain");
      this.method_18868().N(var1, this);
      class04643.L();
      class04643.N("tadpoleActivityUpdate");
      class04074.N(this);
      class04643.L();
      super.N(var1);
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      class06584 class06584 = var1.method_5998(var2);
      if (this.i(class06584)) {
         this.N(var1, class06584);
         return class07082.N;
      } else {
         return class05549.N(var1, var2, this).orElse(super.N(var1, var2));
      }
   }

   @Override
   protected class07623 N(class07299 var1) {
      return new class07639(this, var1);
   }

   @Override
   public void N(class07001 var1) {
      class05549.N(this, var1);
      var1.i("Age").ifPresent(this::y);
   }

   private int G() {
      return Math.max(0, N - this.B);
   }

   @Override
   public class06584 Y() {
      return new class06584(class06570.jG);
   }

   @Override
   public void e_(class06584 var1) {
      class05549.N(this, var1);
      class02837.N(class02484.NM, var1, var1x -> var1x.N("Age", this.n()));
   }

   @Override
   public class05781<class04096> method_28306() {
      return class01289.N(i, u);
   }

   @Nullable
   @Override
   public class04891 method_6002() {
      return class04909.Qe;
   }

   @Override
   public void method_6007() {
      super.method_6007();
      if (!this.method_73183().method_8608()) {
         this.y(this.B + 1);
      }
   }

   @Override
   public boolean method_6054() {
      return false;
   }

   @Override
   public class01289<class04096> method_18868() {
      return (class01289<class04096>)super.method_18868();
   }

   @Nullable
   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.QX;
   }

   @Override
   public class01289<?> method_18867(Dynamic<?> var1) {
      return class04074.N(this.method_28306().N(var1));
   }
}
