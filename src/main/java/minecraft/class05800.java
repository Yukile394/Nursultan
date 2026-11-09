package minecraft;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.jspecify.annotations.Nullable;

class class05800 {
   private final class00392 N;
   private final float y;
   private final List<class05798> L = new ArrayList<>();

   public boolean L(class06889 var1) {
      if (Float.isInfinite(this.y)) {
         return true;
      } else if (this.L.isEmpty()) {
         return false;
      } else {
         class05798 class05798 = this.N(var1);
         return class05798 == null ? false : var1.N((class00737)class05798.N(), (double)this.y);
      }
   }

   public class05800(class00392 var1, float var2, class06889 var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L.add(new class05798(var3, class07536.L()));
   }

   public boolean y() {
      return !this.L.isEmpty();
   }

   public void y(class06889 var1) {
      this.L.removeIf(var1x -> var1.equals(var1x.N()));
      this.L.add(new class05798(var1, class07536.L()));
   }

   public void N(double var1) {
      long i = class07536.L();
      this.L.removeIf(var4 -> i - var4.y() > var1);
   }

   public class00392 N() {
      return this.N;
   }

   @Nullable
   public class05798 N(class06889 var1) {
      if (this.L.isEmpty()) {
         return null;
      } else {
         return this.L.size() == 1 ? this.L.getFirst() : this.L.stream().min(Comparator.comparingDouble(var1x -> var1x.N().R(var1))).orElse(null);
      }
   }
}
