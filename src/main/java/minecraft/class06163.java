package minecraft;

import org.apache.commons.lang3.tuple.Pair;
import org.jspecify.annotations.Nullable;

public class class06163 extends class06171 implements class08207 {
   private static final int N = 0;
   @Nullable
   private class07209 y;
   private int L = 0;

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("DespawnDelay", this.L);
      var1.y("wander_target", class07209.field_25064, this.y);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.L = var1.N("DespawnDelay", 0);
      this.y = var1.<class07209>N("wander_target", class07209.field_25064).orElse(null);
      this.u(Math.max(0, this.K()));
   }

   public class06163(class07078<? extends class06163> var1, class07299 var2) {
      super(var1, var2);
   }

   public int B() {
      return this.L;
   }

   @Override
   protected void i(class04782 var1) {
      class07316 class07316 = this.y();

      for (Pair<class05663[], Integer> pair : class05649.y) {
         class05663[] aclass05663 = (class05663[])pair.getLeft();
         this.N(var1, class07316, aclass05663, (Integer)pair.getRight());
      }
   }

   @Override
   public boolean i() {
      return false;
   }

   @Override
   protected class04891 s() {
      return this.o() ? class04909.gD : class04909.ga;
   }

   private void v() {
      if (this.L > 0 && !this.o() && --this.L == 0) {
         this.method_31472();
      }
   }

   @Override
   protected void y(class07324 var1) {
      if (var1.n()) {
         int i = 3 + this.field_5974.y(4);
         this.method_73183().method_8649(new class07057(this.method_73183(), this.method_23317(), this.method_23318() + 0.5, this.method_23321(), i));
      }
   }

   @Nullable
   @Override
   public class07077 y(class04782 var1, class07077 var2) {
      return null;
   }

   public void y(int var1) {
      this.L = var1;
   }

   @Nullable
   class07209 E() {
      return this.y;
   }

   public void N(@Nullable class07209 var1) {
      this.y = var1;
   }

   @Override
   protected class04891 N(boolean var1) {
      return var1 ? class04909.gh : class04909.gS;
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      if (!var1.method_5998(var2).N(class06570.tW) && this.method_5805() && !this.o() && !this.method_6109()) {
         if (var2 == class07050.field_5808) {
            var1.method_7281(class01235.C);
         }

         if (!this.method_73183().method_8608()) {
            if (this.y().isEmpty()) {
               return class07082.L;
            }

            this.N(var1);
            this.N(var1, this.method_5476(), 1);
         }

         return class07082.N;
      } else {
         return super.N(var1, var2);
      }
   }

   @Override
   public boolean N(double var1) {
      return false;
   }

   @Override
   public class04891 N(class06584 var1) {
      return var1.N(class06570.jT) ? class04909.gA : class04909.gf;
   }

   @Override
   public class04891 R() {
      return class04909.gh;
   }

   @Override
   protected void l_() {
      this.e.N(0, new class07427(this));
      this.e
         .N(
            0,
            new class06150<>(this, class06517.N(class06570.ns, class06506.M), class04909.gF, var1 -> this.method_73183().method_23886() && !var1.method_5767())
         );
      this.e.N(0, new class06150<>(this, new class06584(class06570.jT), class04909.gx, var1 -> this.method_73183().method_8530() && var1.method_5767()));
      this.e.N(1, new class07990(this));
      this.e.N(1, new class07464<>(this, class08004.class, 8.0F, 0.5, 0.5));
      this.e.N(1, new class07464<>(this, class07538.class, 12.0F, 0.5, 0.5));
      this.e.N(1, new class07464<>(this, class08011.class, 8.0F, 0.5, 0.5));
      this.e.N(1, new class07464<>(this, class08042.class, 8.0F, 0.5, 0.5));
      this.e.N(1, new class07464<>(this, class07178.class, 15.0F, 0.5, 0.5));
      this.e.N(1, new class07464<>(this, class07149.class, 12.0F, 0.5, 0.5));
      this.e.N(1, new class07464<>(this, class05292.class, 10.0F, 0.5, 0.5));
      this.e.N(1, new class07993(this, 0.5));
      this.e.N(1, new class07974(this));
      this.e.N(2, new class06182(this, this, 2.0, 0.35));
      this.e.N(4, new class07976(this, 0.35));
      this.e.N(8, new class07957(this, 0.35));
      this.e.N(9, new class07994(this, class08036.class, 3.0F, 1.0F));
      this.e.N(10, new class07962(this, class07079.class, 8.0F));
   }

   @Override
   public class04891 method_6002() {
      return class04909.gp;
   }

   @Override
   public void method_6007() {
      super.method_6007();
      if (!this.method_73183().method_8608()) {
         this.v();
      }
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.gC;
   }
}
