package minecraft;

import Nursultan.class10286;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.jspecify.annotations.Nullable;

public class class04003 extends class07150 implements class03502 {
   private static final int W = 40;
   private static final int T = 200;
   private static final int b = 500;
   private static final float X = 0.3F;
   private static final float a = 1.0F;
   private static final float p = 1.5F;
   private static final int F = 30;
   private static final int A = 24;
   private static final class02131<Integer> f = class03289.N(class04003.class, class02154.y);
   private static final int C = 200;
   private static final int S = 260;
   private static final int x = 20;
   private static final int D = 120;
   private static final int h = 20;
   private static final int r = 35;
   private static final int NN = 10;
   private static final int Ny = 20;
   private static final int NL = 100;
   private static final int NE = 20;
   private static final int NW = 30;
   private static final float Nm = 4.5F;
   private static final float NP = 0.7F;
   private static final int Ns = 30;
   private int NT;
   private int Nb;
   private int Nj;
   private int Nv;
   public class04396 N = new class04396();
   public class04396 y = new class04396();
   public class04396 L = new class04396();
   public class04396 u = new class04396();
   public class04396 i = new class04396();
   public class04396 R = new class04396();
   private final class01178<class03485> Nn;
   private final class03481 Nt;
   private class03508 NG;
   class03987 M = new class03987(this::L, Collections.emptyList());

   public boolean L(@Nullable class07049 var1) {
      return var1 instanceof class07438 class07438
         && this.method_73183() == var1.method_73183()
         && class07042.i.test(var1)
         && !this.method_5722(var1)
         && class07438.method_5864() != class07078.B
         && class07438.method_5864() != class07078.yX
         && !class07438.method_5655()
         && !class07438.method_29504()
         && this.method_73183().method_8621().N(class07438.method_5829());
   }

   @Override
   public class03508 L() {
      return this.NG;
   }

   boolean M() {
      return this.method_41328(class01312.field_38100) || this.method_41328(class01312.field_38099);
   }

   @Nullable
   @Override
   public class07438 T() {
      return this.S();
   }

   @Override
   public boolean method_5659(class07307 var1) {
      return this.M();
   }

   @Override
   public void method_5674(class02131<?> var1) {
      if (field_18064.equals(var1)) {
         switch (this.method_18376()) {
            case field_38099:
               this.L.N(this.field_6012);
               break;
            case field_38100:
               this.u.N(this.field_6012);
               break;
            case field_38097:
               this.N.N(this.field_6012);
               break;
            case field_38098:
               this.y.N(this.field_6012);
         }
      }

      super.method_5674(var1);
   }

   @Override
   public void method_31471(class07276 var1) {
      super.method_31471(var1);
      if (var1.W() == 1) {
         this.method_18380(class01312.field_38099);
      }
   }

   @Override
   public class00381<class07280> method_18002(class01599 var1) {
      return new class07276(this, var1, this.method_41328(class01312.field_38099) ? 1 : 0);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(f, 0);
   }

   @Override
   public void method_5773() {
      class07299 class07299 = this.method_73183();
      if (class07299 instanceof class04782) {
         class03493.N((class04782)class07299, this.NG, this.Nt);
         if (this.Nm() || this.Nu()) {
            class03984.N((class07438)this);
         }
      }

      super.method_5773();
      if (this.method_73183().method_8608()) {
         if (this.field_6012 % this.t() == 0) {
            this.Nj = 10;
            if (!this.method_5701()) {
               this.method_73183()
                  .method_8486(
                     this.method_23317(), this.method_23318(), this.method_23321(), class04909.IM, this.method_5634(), 5.0F, this.method_6017(), false
                  );
            }
         }

         this.Nb = this.NT;
         if (this.NT > 0) {
            this.NT--;
         }

         this.Nv = this.Nj;
         if (this.Nj > 0) {
            this.Nj--;
         }

         switch (this.method_18376()) {
            case field_38099:
               this.N(this.L);
               break;
            case field_38100:
               this.N(this.u);
         }
      }
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      boolean flag = super.method_64397(var1, var2, var3);
      if (!this.Nt() && !this.M()) {
         class07049 class07049 = var2.u();
         this.N(class07049, class04009.field_38122.N() + 20, false);
         if (super.fields_12212a028292fd3c078969e3ee4c71d9e8_1.L(class05378.s).isEmpty()
            && class07049 instanceof class07438 class07438
            && (var2.y() || this.method_24516(class07438, 5.0))) {
            this.N(class07438);
         }
      }

      return flag;
   }

   @Override
   protected float method_5867() {
      return this.field_5994 + 0.55F;
   }

   @Override
   public boolean method_33189() {
      return true;
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      this.method_5783(class04909.Ib, 10.0F, 1.0F);
   }

   @Override
   public boolean method_5810() {
      return !this.M() && super.method_5810();
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("anger", class03987.N(this::L), this.M);
      var1.N("listener", class03508.N, this.NG);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.M = var1.<class03987>N("anger", class03987.N(this::L)).orElseGet(() -> new class03987(this::L, Collections.emptyList()));
      this.n();
      this.NG = var1.<class03508>N("listener", class03508.N).orElseGet(class03508::new);
   }

   @Override
   protected boolean method_5860(class07049 var1) {
      return false;
   }

   @Override
   public void method_5711(byte var1) {
      if (var1 == 4) {
         this.N.N();
         this.i.N(this.field_6012);
      } else if (var1 == 61) {
         this.NT = 10;
      } else if (var1 == 62) {
         this.R.N(this.field_6012);
      } else {
         super.method_5711(var1);
      }
   }

   @Override
   public void method_42147(BiConsumer<class01178<?>, class04782> var1) {
      if (this.method_73183() instanceof class04782 class04782) {
         var1.accept(this.Nn, class04782);
      }
   }

   public class04003(class07078<? extends class07150> var1, class07299 var2) {
      super(var1, var2);
      this.Nt = new class03992(this);
      this.NG = new class03508();
      this.Nn = new class01178<>(new class03485(this));
      this.J = 5;
      this.f().N(true);
      this.N(class04425.field_25418, 0.0F);
      this.N(class04425.field_17, 8.0F);
      this.N(class04425.field_33534, 8.0F);
      this.N(class04425.field_14, 8.0F);
      this.N(class04425.field_3, 0.0F);
      this.N(class04425.field_9, 0.0F);
   }

   public static class05300 B() {
      return class07150.Y().N(class05298.n, 500.0).N(class05298.l, 0.3F).N(class05298.b, 1.0).N(class05298.i, 1.5).N(class05298.u, 30.0).N(class05298.P, 24.0);
   }

   public float i(float var1) {
      return class04995.B(var1, this.Nv, this.Nj) / 10.0F;
   }

   public void i(@Nullable class07049 var1) {
      this.N(var1, 35, true);
   }

   @Nullable
   @Override
   protected class04891 s() {
      return !this.method_41328(class01312.field_38097) && !this.M() ? this.W().y() : null;
   }

   private void n() {
      this.field_6011.N(f, this.l());
   }

   private int l() {
      return this.M.y(this.T());
   }

   public Optional<class07438> m() {
      return this.W().u() ? this.M.N() : Optional.empty();
   }

   private int t() {
      float fx = (float)this.E() / class04009.field_38122.N();
      return 40 - class04995.y(class04995.N(fx, 0.0F, 1.0F) * 30.0F);
   }

   public class03987 v() {
      return this.M;
   }

   public void u(class07049 var1) {
      this.M.N(var1);
   }

   @Override
   public class03481 u() {
      return this.Nt;
   }

   public float u(float var1) {
      return class04995.B(var1, this.Nb, this.NT) / 10.0F;
   }

   public int E() {
      return this.field_6011.N(f);
   }

   @Override
   public boolean N(double var1) {
      return false;
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      this.method_18868().N(class05378.Na, class06244.field_17274, 1200L);
      if (var3 == class06113.field_16461) {
         this.method_18380(class01312.field_38099);
         this.method_18868().N(class05378.Nc, class06244.field_17274, class03984.N);
         this.method_5783(class04909.gr, 5.0F, 1.0F);
      }

      return super.N(var1, var2, var3, var4);
   }

   @Override
   protected class07623 N(class07299 var1) {
      return new class10286(this, this, var1);
   }

   public void N(@Nullable class07049 var1, int var2, boolean var3) {
      if (!this.Nt() && this.L(var1)) {
         class03984.N((class07438)this);
         boolean flag = !(this.T() instanceof class08036);
         int ix = this.M.N(var1, var2);
         if (var1 instanceof class08036 && flag && class04009.N(ix).u()) {
            this.method_18868().y(class05378.s);
         }

         if (var3) {
            this.G();
         }
      }
   }

   public void N(class07438 var1) {
      this.method_18868().y(class05378.NK);
      this.method_18868().N(class05378.s, var1);
      this.method_18868().y(class05378.I);
      class03616.N(this, 200);
   }

   private void N(class04396 var1) {
      if ((float)var1.N((float)this.field_6012) < 4500.0F) {
         class06069 class06069 = this.method_59922();
         class00500 class00500 = this.method_25936();
         if (class00500.b() != class06898.field_11455) {
            for (int ix = 0; ix < 30; ix++) {
               double d0 = this.method_23317() + class04995.y(class06069, -0.7F, 0.7F);
               double d1 = this.method_23318();
               double d2 = this.method_23321() + class04995.y(class06069, -0.7F, 0.7F);
               this.method_73183().method_8406(this.N(new class07105(class07107.y, class00500)), d0, d1, d2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   protected void N(class04782 var1) {
      class04643 class04643 = class08700.N();
      class04643.N("wardenBrain");
      this.method_18868().N(var1, this);
      class04643.L();
      super.N(var1);
      if ((this.field_6012 + this.method_5628()) % 120 == 0) {
         N(var1, this.method_73189(), this, 20);
      }

      if (this.field_6012 % 20 == 0) {
         this.M.N(var1, this::L);
         this.n();
      }

      class03984.N(this);
   }

   @Override
   public boolean N(class05487 var1) {
      return super.N(var1) && var1.method_8587(this, this.method_5864().E().N(this.method_73189()));
   }

   public static void N(class04782 var0, class06889 var1, @Nullable class07049 var2, int var3) {
      class07055 class07055 = new class07055(class07047.J, 260, 0, false, false);
      class07063.N(var0, var2, var1, var3, class07055, 200);
   }

   @Override
   public float N(class07209 var1, class05487 var2) {
      return 0.0F;
   }

   private class07105 N(class07105 var1) {
      var1.fabric_setBlockPos(this.method_23312());
      return var1;
   }

   public class04009 W() {
      return class04009.N(this.l());
   }

   private void G() {
      if (!this.method_41328(class01312.field_38097)) {
         this.method_5783(this.W().L(), 10.0F, this.method_6017());
      }
   }

   @Override
   public void method_6087(class07049 var1) {
      if (!this.Nt() && !this.method_18868().N(class05378.NA)) {
         this.method_18868().N(class05378.NA, class06244.field_17274, 20L);
         this.i(var1);
         class03984.N(this, var1.method_24515());
      }

      super.method_6087(var1);
   }

   @Override
   public boolean method_5679(class04782 var1, class07072 var2) {
      return this.M() && !var2.N(class03696.u) ? true : super.method_5679(var1, var2);
   }

   @Override
   public class04891 method_6002() {
      return class04909.Iu;
   }

   @Override
   public float method_6107() {
      return 4.0F;
   }

   @Override
   public class01325 method_55694(class01312 var1) {
      class01325 class01325 = super.method_55694(var1);
      return this.M() ? class01325.L(class01325.N(), 1.0F) : class01325;
   }

   @Override
   public class01289<class04003> method_18868() {
      return (class01289<class04003>)super.method_18868();
   }

   @Override
   public boolean method_6121(class04782 var1, class07049 var2) {
      var1.method_8421(this, (byte)4);
      this.method_5783(class04909.IL, 10.0F, this.method_6017());
      class03616.N(this, 40);
      return super.method_6121(var1, var2);
   }

   @Override
   public float method_67125() {
      return 5.0F;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.IB;
   }

   @Override
   public class01289<?> method_18867(Dynamic<?> var1) {
      return class03984.N(this, var1);
   }
}
