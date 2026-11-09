package minecraft;

import Nursultan.class10714;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import org.jspecify.annotations.Nullable;

public abstract class class06171 extends class07077 implements class04391, class07288, class08025 {
   private static final class02131<Integer> N = class03289.N(class06171.class, class02154.y);
   public static final int i = 300;
   private static final int y = 8;
   @Nullable
   private class08036 L;
   @Nullable
   protected class07316 R;
   private final class07075 u = new class07075(8);

   @Override
   public boolean L() {
      return this.method_73183().method_8608();
   }

   public void M(int var1) {
      this.field_6011.N(N, var1);
   }

   @Nullable
   @Override
   public class04803 method_32318(int var1) {
      int ix = var1 - 300;
      return ix >= 0 && ix < this.u.method_5439() ? this.u.method_32318(ix) : super.method_32318(var1);
   }

   @Override
   public class06889 method_30951(float var1) {
      float f = class04995.B(var1, super.fields_4212a028292fd3c078969e3ee4c71d9e8_1, super.fields_4212a028292fd3c078969e3ee4c71d9e8_0)
         * (float) (Math.PI / 180.0);
      class06889 class06889 = new class06889(0.0, this.method_5829().L() - 1.0, 0.2);
      return this.method_30950(var1).i(class06889.y(-f));
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(N, 0);
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      if (!this.method_73183().method_8608()) {
         class07316 class07316 = this.y();
         if (!class07316.isEmpty()) {
            var1.N("Offers", class07316.N, class07316);
         }
      }

      this.N(var1);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.R = var1.<class07316>N("Offers", class07316.N).orElse(null);
      this.b_(var1);
   }

   @Nullable
   @Override
   public class07049 method_5731(class01032 var1) {
      this.W();
      return super.method_5731(var1);
   }

   public class06171(class07078<? extends class06171> var1, class07299 var2) {
      super(var1, var2);
      this.N(class04425.field_9, 16.0F);
      this.N(class04425.field_3, -1.0F);
   }

   public int I() {
      return this.field_6011.N(N);
   }

   @Override
   public boolean i() {
      return true;
   }

   protected abstract void i(class04782 var1);

   @Override
   public class07075 n() {
      return this.u;
   }

   public boolean o() {
      return this.L != null;
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public int u() {
      return 0;
   }

   @Override
   public class07316 y() {
      if (this.method_73183() instanceof class04782 class04782) {
         if (this.R == null) {
            this.R = new class07316();
            this.i(class04782);
         }

         return this.R;
      } else {
         throw new IllegalStateException("Cannot load Villager offers on the client");
      }
   }

   protected abstract void y(class07324 var1);

   @Override
   public boolean y(class08036 var1) {
      return this.N() == var1 && this.method_5805() && var1.method_56094(this, 4.0);
   }

   protected void N(class07126 var1) {
      for (int ix = 0; ix < 5; ix++) {
         double d0 = this.field_5974.E() * 0.02;
         double d1 = this.field_5974.E() * 0.02;
         double d2 = this.field_5974.E() * 0.02;
         this.method_73183().method_8406(var1, this.method_23322(1.0), this.method_23319() + 1.0, this.method_23325(1.0), d0, d1, d2);
      }
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      if (var4 == null) {
         var4 = new class10714(false);
      }

      return super.N(var1, var2, var3, (class07446)var4);
   }

   protected void N(class04782 var1, class07316 var2, class05663[] var3, int var4) {
      ArrayList arraylist = Lists.newArrayList(var3);
      int ix = 0;

      while (ix < var4 && !arraylist.isEmpty()) {
         class07324 class07324 = ((class05663)arraylist.remove(this.field_5974.y(arraylist.size()))).N(var1, this, this.field_5974);
         if (class07324 != null) {
            var2.add(class07324);
            ix++;
         }
      }
   }

   @Override
   public void N(int var1) {
   }

   @Override
   public void N(@Nullable class07316 var1) {
   }

   @Override
   public void N(class07324 var1) {
      var1.E();
      this.I = -this.m_();
      this.y(var1);
      if (this.L instanceof class04770) {
         class06912.v.N((class04770)this.L, this, var1.R());
      }
   }

   @Nullable
   @Override
   public class08036 N() {
      return this.L;
   }

   protected class04891 N(boolean var1) {
      return var1 ? class04909.gT : class04909.gP;
   }

   @Override
   public void N(@Nullable class08036 var1) {
      this.L = var1;
   }

   @Override
   public void W() {
      this.N(null);
   }

   @Override
   public class04891 R() {
      return class04909.gT;
   }

   @Override
   public void d_(class06584 var1) {
      if (!this.method_73183().method_8608() && this.I > -this.m_() + 20) {
         this.I = -this.m_();
         this.method_56078(this.N(!var1.R()));
      }
   }

   public void NQ() {
      this.method_56078(class04909.gE);
   }

   @Override
   public void method_6078(class07072 var1) {
      super.method_6078(var1);
      this.W();
   }
}
