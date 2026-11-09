package minecraft;

import Nursultan.class10308;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import org.jspecify.annotations.Nullable;

public class class04067 extends class07633 {
   protected static final ImmutableList<class05340<? extends class05355<? super class04067>>> N = ImmutableList.of(
      class05340.L, class05340.R, class05340.n, class05340.j, class05340.t
   );
   protected static final ImmutableList<class05378<?>> y = ImmutableList.of(
      class05378.P,
      class05378.M,
      class05378.B,
      class05378.m,
      class05378.I,
      class05378.n,
      class05378.j,
      class05378.f,
      class05378.C,
      class05378.s,
      class05378.a,
      class05378.p,
      new class05378[]{class05378.A, class05378.d, class05378.w, class05378.Q, class05378.h, class05378.r, class05378.NN, class05378.Ny}
   );
   private static final class02131<class03556<class04068>> M = class03289.N(class04067.class, class02154.Y);
   private static final class02131<OptionalInt> B = class03289.N(class04067.class, class02154.n);
   private static final int Z = 5;
   private static final class05946<class04068> X = class08553.N;
   public final class04396 L = new class04396();
   public final class04396 u = new class04396();
   public final class04396 i = new class04396();
   public final class04396 R = new class04396();

   public void L(class07049 var1) {
      this.field_6011.N(B, OptionalInt.of(var1.method_5628()));
   }

   @Nullable
   @Override
   public class07438 T() {
      return this.S();
   }

   @Override
   public boolean method_5675() {
      return false;
   }

   @Override
   public void method_5674(class02131<?> var1) {
      if (field_18064.equals(var1)) {
         class01312 class01312 = this.method_18376();
         if (class01312 == class01312.field_30095) {
            this.L.N(this.field_6012);
         } else {
            this.L.N();
         }

         if (class01312 == class01312.field_37422) {
            this.u.N(this.field_6012);
         } else {
            this.u.N();
         }

         if (class01312 == class01312.field_37423) {
            this.i.N(this.field_6012);
         } else {
            this.i.N();
         }
      }

      super.method_5674(var1);
   }

   @Override
   protected void method_66649(class02666 var1) {
      this.method_66650(var1, class02484.NA);
      super.method_66649(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      class00751 class00751 = this.method_56673().L(class04227.yB);
      var1.N(M, class08577.N(this.method_56673(), X));
      var1.N(B, OptionalInt.empty());
   }

   @Override
   public void method_5773() {
      if (this.method_73183().method_8608()) {
         this.R.N(this.method_5799() && !super.fields_3212a028292fd3c078969e3ee4c71d9e8_3.u(), this.field_6012);
      }

      super.method_5773();
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      this.method_5783(class04909.EI, 0.15F, 1.0F);
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      class08577.N(var1, this.m());
   }

   @Nullable
   @Override
   public <T> T method_58694(class02477<? extends T> var1) {
      return var1 == class02484.NA ? method_66651(var1, this.m()) : super.method_58694(var1);
   }

   @Override
   public boolean method_6109() {
      return false;
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      class08577.N(var1, class04227.yB).ifPresent(this::N);
   }

   public class04067(class07078<? extends class07633> var1, class07299 var2) {
      super(var1, var2);
      this.o = new class10308(this, this);
      this.N(class04425.field_18, 4.0F);
      this.N(class04425.field_19, -1.0F);
      this.q = new class05581(this, 85, 10, 0.02F, 0.1F, true);
   }

   public void B() {
      this.field_6011.N(B, OptionalInt.empty());
   }

   @Nullable
   @Override
   protected class04891 s() {
      return class04909.Ew;
   }

   public class03556<class04068> m() {
      return this.field_6011.N(M);
   }

   public static class05300 v() {
      return class07633.Ne().N(class05298.l, 1.0).N(class05298.n, 10.0).N(class05298.u, 10.0).N(class05298.O, 1.0);
   }

   @Override
   public void y(boolean var1) {
   }

   @Nullable
   @Override
   public class07077 y(class04782 var1, class07077 var2) {
      class04067 class04067 = class07078.NR.N(var1, class06113.field_16466);
      if (class04067 != null) {
         class04058.N(class04067, var1.method_8409());
      }

      return class04067;
   }

   @Override
   protected class07623 N(class07299 var1) {
      return new class04073(this, var1);
   }

   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      class08577.N(class08579.N(var1, this.method_24515()), class04227.yB).ifPresent(this::N);
      class04058.N(this, var1.method_8409());
      return super.N(var1, var2, var3, var4);
   }

   public static boolean N(class07438 var0) {
      return var0 instanceof class07162 && ((class07162)var0).t() != 1 ? false : var0.method_5864().N(class01217.P);
   }

   public static boolean N(class07078<? extends class07633> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      return var1.method_8320(var3.method_10074()).N(class01210.Lt) && N(var1, var3);
   }

   private void N(class03556<class04068> var1) {
      this.field_6011.N(M, var1);
   }

   @Override
   public boolean N(class06584 var1) {
      return var1.N(class01226.Nf);
   }

   @Override
   public void N(class04782 var1, class07633 var2) {
      this.N(var1, var2, null);
      this.method_18868().N(class05378.r, class06244.field_17274);
   }

   @Override
   protected void N(class04782 var1) {
      class04643 class04643 = class08700.N();
      class04643.N("frogBrain");
      this.method_18868().N(var1, this);
      class04643.L();
      class04643.N("frogActivityUpdate");
      class04058.N(this);
      class04643.L();
      super.N(var1);
   }

   public Optional<class07049> W() {
      return this.field_6011.N(B).stream().mapToObj(this.method_73183()::method_8469).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void O() {
      this.method_73183().method_43129(null, this, class04909.EY, class04911.field_15254, 2.0F, 1.0F);
   }

   @Override
   public int NR() {
      return 5;
   }

   @Override
   public int NB() {
      return 35;
   }

   @Override
   protected <T> boolean method_66654(class02477<T> var1, T var2) {
      if (var1 == class02484.NA) {
         this.N(method_66651(class02484.NA, var2));
         return true;
      } else {
         return super.method_66654(var1, var2);
      }
   }

   @Override
   public class05781<class04067> method_28306() {
      return class01289.N(y, N);
   }

   @Override
   public int method_23329(double var1, float var3) {
      return super.method_23329(var1, var3) - 5;
   }

   @Nullable
   @Override
   public class04891 method_6002() {
      return class04909.Ek;
   }

   @Override
   public void method_48565(float var1) {
      float f;
      if (this.L.y()) {
         f = 0.0F;
      } else {
         f = Math.min(var1 * 25.0F, 1.0F);
      }

      super.fields_3212a028292fd3c078969e3ee4c71d9e8_3.N(f, 0.4F, this.method_6109() ? 3.0F : 1.0F);
   }

   @Override
   public class01289<class04067> method_18868() {
      return (class01289<class04067>)super.method_18868();
   }

   @Nullable
   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.EQ;
   }

   @Override
   public class01289<?> method_18867(Dynamic<?> var1) {
      return class04058.N(this.method_28306().N(var1));
   }

   @Override
   public void method_76087(class06889 var1, double var2, boolean var4, double var5) {
      this.method_5724(this.method_6029(), var1);
      this.method_5784(class07451.field_6308, this.method_18798());
      this.method_18799(this.method_18798().L(0.9));
   }
}
