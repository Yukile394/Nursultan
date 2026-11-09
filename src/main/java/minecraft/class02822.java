package minecraft;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.math.Fraction;
import org.jspecify.annotations.Nullable;

public class class02822 {
   private final List<class06584> N;
   private Fraction y;
   private int L;

   private int L(class06584 var1) {
      return Math.max(Fraction.ONE.subtract(this.y).divideBy(class02830.N(var1)).intValue(), 0);
   }

   public Fraction L() {
      return this.y;
   }

   public class02822(class02830 var1) {
      super();
      this.N = new ArrayList<>(var1.i);
      this.y = var1.R;
      this.L = var1.M;
   }

   public class02830 u() {
      return new class02830(List.copyOf(this.N), this.y, this.L);
   }

   @Nullable
   public class06584 y() {
      if (this.N.isEmpty()) {
         return null;
      } else {
         int i = this.y(this.L) ? 0 : this.L;
         class06584 class06584 = this.N.remove(i).t();
         this.y = this.y.subtract(class02830.N(class06584).multiplyBy(Fraction.getFraction(class06584.c(), 1)));
         this.N(-1);
         return class06584;
      }
   }

   private int y(class06584 var1) {
      if (!var1.E()) {
         return -1;
      } else {
         for (int i = 0; i < this.N.size(); i++) {
            if (class06584.L(this.N.get(i), var1)) {
               return i;
            }
         }

         return -1;
      }
   }

   private boolean y(int var1) {
      return var1 < 0 || var1 >= this.N.size();
   }

   public class02822 N() {
      this.N.clear();
      this.y = Fraction.ZERO;
      this.L = -1;
      return this;
   }

   public int N(class06937 var1, class08036 var2) {
      class06584 class06584 = var1.i();
      int i = this.L(class06584);
      return class02830.y(class06584) ? this.N(var1.y(class06584.c(), i, var2)) : 0;
   }

   public int N(class06584 var1) {
      if (!class02830.y(var1)) {
         return 0;
      } else {
         int i = Math.min(var1.c(), this.L(var1));
         if (i == 0) {
            return 0;
         } else {
            this.y = this.y.add(class02830.N(var1).multiplyBy(Fraction.getFraction(i, 1)));
            int j = this.y(var1);
            if (j != -1) {
               class06584 class06584x = this.N.remove(j);
               class06584 class06584x = class06584x.L(class06584x.c() + i);
               var1.B(i);
               this.N.add(0, class06584x);
            } else {
               this.N.add(0, var1.N(i));
            }

            return i;
         }
      }
   }

   public void N(int var1) {
      this.L = this.L != var1 && !this.y(var1) ? var1 : -1;
   }
}
