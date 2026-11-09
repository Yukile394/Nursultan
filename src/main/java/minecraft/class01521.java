package minecraft;

import Nursultan.class09473;

public class class01521 extends class07482 {
   public final class00743<class06584> N = class00743.method_10211();
   private final class07482 y;

   @Override
   public class06584 M() {
      return this.y.M();
   }

   public class01521(class08036 var1) {
      super(null, 0);
      this.y = var1.fields_07fa3311b0e9d3e9b883d09222919bf5a_2;
      class08044 class08044 = var1.method_31548();

      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 9; j++) {
            this.N(new class09473(class01488.N, i * 9 + j, 9 + j * 18, 18 + i * 18));
         }
      }

      this.N(class08044, 9, 112);
      this.y(0.0F);
   }

   public void y(float var1) {
      int i = this.N(var1);

      for (int j = 0; j < 5; j++) {
         for (int k = 0; k < 9; k++) {
            int l = k + (j + i) * 9;
            if (l >= 0 && l < this.N.size()) {
               class01488.N.method_5447(k + j * 9, this.N.get(l));
            } else {
               class01488.N.method_5447(k + j * 9, class06584.E);
            }
         }
      }
   }

   @Override
   public boolean y(class06937 var1) {
      return var1.L != class01488.N;
   }

   protected int E() {
      return class04995.R(this.N.size(), 9) - 5;
   }

   @Override
   public class06584 N(class08036 var1, int var2) {
      if (var2 >= this.T.size() - 9 && var2 < this.T.size()) {
         class06937 class06937 = this.T.get(var2);
         if (class06937 != null && class06937.R()) {
            class06937.u(class06584.E);
         }
      }

      return class06584.E;
   }

   @Override
   public boolean N(class06584 var1, class06937 var2) {
      return var2.L != class01488.N;
   }

   @Override
   public void N(class06584 var1) {
      this.y.N(var1);
   }

   @Override
   public boolean N(class08036 var1) {
      return true;
   }

   protected float N(int var1) {
      return class04995.N((float)var1 / this.E(), 0.0F, 1.0F);
   }

   protected int N(float var1) {
      return Math.max((int)(var1 * this.E() + 0.5), 0);
   }

   protected float N(float var1, double var2) {
      return class04995.N(var1 - (float)(var2 / this.E()), 0.0F, 1.0F);
   }

   public boolean W() {
      return this.N.size() > 45;
   }
}
