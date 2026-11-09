package minecraft;

import com.google.common.collect.UnmodifiableIterator;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public abstract class class07633 extends class07077 {
   protected static final int a = 6000;
   private static final int N = 0;
   private int y = 0;
   @Nullable
   private class08372<class04770> L;

   public static boolean L(class07078<? extends class07633> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      boolean flag = class06113.y(var2) || N(var1, var3);
      return var1.method_8320(var3.method_10074()).N(class01210.LE) && flag;
   }

   public void M(int var1) {
      this.y = var1;
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
         UnmodifiableIterator<class01312> unmodifiableiterator = var1.method_24831().iterator();

         while (unmodifiableiterator.hasNext()) {
            class01312 class01312 = (class01312)unmodifiableiterator.next();
            class00734 class00734 = var1.method_24833(class01312);

            for (int[] aint1 : aint) {
               class07218.N(class07209.method_10263() + aint1[0], class07209.method_10264(), class07209.method_10260() + aint1[1]);
               double d0 = this.method_73183().L(class07218);
               if (class05188.N(d0)) {
                  class06889 class06889 = class06889.N(class07218, d0);
                  if (class05188.N(this.method_73183(), var1, class00734.L(class06889))) {
                     var1.method_18380(class01312);
                     return class06889;
                  }
               }
            }
         }

         return super.method_24829(var1);
      }
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("InLove", this.y);
      class08372.N(this.L, var1, "LoveCause");
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.y = var1.N("InLove", 0);
      this.L = class08372.N(var1, "LoveCause");
   }

   @Override
   public void method_5711(byte var1) {
      if (var1 == 18) {
         for (int i = 0; i < 7; i++) {
            double d0 = this.field_5974.E() * 0.02;
            double d1 = this.field_5974.E() * 0.02;
            double d2 = this.field_5974.E() * 0.02;
            this.method_73183().method_8406(class07107.f, this.method_23322(1.0), this.method_23319() + 0.5, this.method_23325(1.0), d0, d1, d2);
         }
      } else {
         super.method_5711(var1);
      }
   }

   public class07633(class07078<? extends class07633> var1, class07299 var2) {
      super(var1, var2);
      this.N(class04425.field_9, 16.0F);
      this.N(class04425.field_3, -1.0F);
   }

   private class07041 B() {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21) ? class07082.N : class07082.y;
   }

   public void i(@Nullable class08036 var1) {
      this.y = 600;
      if (var1 instanceof class04770 class04770) {
         this.L = class08372.N(class04770);
      }

      this.method_73183().method_8421(this, (byte)18);
   }

   private boolean y(class07299 var1) {
      return var1.method_8608() && ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_15);
   }

   @Override
   public void N(class04782 var1) {
      if (this.K() != 0) {
         this.y = 0;
      }

      super.N(var1);
   }

   @Override
   public float N(class07209 var1, class05487 var2) {
      return var2.method_8320(var1.method_10074()).N(class00869.Z) ? 10.0F : var2.B(var1);
   }

   protected static boolean N(class07295 var0, class07209 var1) {
      return var0.method_22335(var1, 0) > 8;
   }

   public boolean N(class07633 var1) {
      if (var1 == this) {
         return false;
      } else {
         return var1.getClass() != this.getClass() ? false : this.NX() && var1.NX();
      }
   }

   public void N(class04782 var1, class07633 var2) {
      class07077 class07077 = this.y(var1, var2);
      if (class07077 != null) {
         class07077.y(true);
         class07077.method_5808(this.method_23317(), this.method_23318(), this.method_23321(), 0.0F, 0.0F);
         this.N(var1, var2, class07077);
         var1.y(class07077);
      }
   }

   public void N(class04782 var1, class07633 var2, @Nullable class07077 var3) {
      Optional.ofNullable(this.Nc()).or(() -> Optional.ofNullable(var2.Nc())).ifPresent(var3x -> {
         var3x.method_7281(class01235.F);
         class06912.s.N(var3x, this, var2, var3);
      });
      this.u(6000);
      var2.u(6000);
      this.Na();
      var2.Na();
      var1.method_8421(this, (byte)18);
      if (var1.method_64395().N(class07305.O)) {
         var1.method_8649(new class07057(var1, this.method_23317(), this.method_23318(), this.method_23321(), this.method_59922().y(7) + 1));
      }
   }

   public abstract boolean N(class06584 var1);

   @Override
   public boolean N(double var1) {
      return false;
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      class06584 class06584 = var1.method_5998(var2);
      if (this.N(class06584)) {
         int i = this.K();
         if (var1 instanceof class04770 class04770 && i == 0 && this.T_()) {
            this.N(var1, var2, class06584);
            this.i(class04770);
            this.O();
            return this.B();
         }

         if (this.method_6109()) {
            this.N(var1, var2, class06584);
            this.N(i(-i), true);
            this.O();
            return class07082.N;
         }

         class07299 class07299 = this.method_73183();
         if (this.y(class07299)) {
            return class07082.L;
         }
      }

      return super.N(var1, var2);
   }

   protected void O() {
   }

   @Override
   public int m_() {
      return 120;
   }

   public int NH() {
      return this.y;
   }

   @Nullable
   public class04770 Nc() {
      return class08372.N(this.L, this.method_73183(), class04770.class);
   }

   public static class05300 Ne() {
      return class07079.H().N(class05298.J, 10.0);
   }

   public boolean NX() {
      return this.y > 0;
   }

   public void Na() {
      this.y = 0;
   }

   @Override
   public int method_6110(class04782 var1) {
      return 1 + this.field_5974.y(3);
   }

   @Override
   public void method_6007() {
      super.method_6007();
      if (this.K() != 0) {
         this.y = 0;
      }

      if (this.y > 0) {
         this.y--;
         if (this.y % 10 == 0) {
            double d0 = this.field_5974.E() * 0.02;
            double d1 = this.field_5974.E() * 0.02;
            double d2 = this.field_5974.E() * 0.02;
            this.method_73183().method_8406(class07107.f, this.method_23322(1.0), this.method_23319() + 0.5, this.method_23325(1.0), d0, d1, d2);
         }
      }
   }

   @Override
   public void method_6074(class04782 var1, class07072 var2, float var3) {
      this.Na();
      super.method_6074(var1, var2, var3);
   }

   public boolean T_() {
      return this.y <= 0;
   }
}
