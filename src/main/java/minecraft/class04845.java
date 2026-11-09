package minecraft;

import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;

public class class04845<T extends class04882> extends class07473 {
   private static final int N = 20;
   private static final float y = 1.0F;
   private final T L;
   private int u;

   public class04845(T var1) {
      super();
      this.L = (T)var1;
      this.N_71(EnumSet.of(class07430.field_18405));
   }

   @Override
   public void i() {
      if (this.L.NQ()) {
         class04877 class04877 = this.L.K();
         if (this.L.field_6012 > this.u) {
            this.u = this.L.field_6012 + 20;
            this.N(class04877);
         }

         if (!this.L.Nw()) {
            class06889 class06889 = class05475.N(this.L, 15, 4, class06889.L(class04877.s()), (float) (Math.PI / 2));
            if (class06889 != null) {
               this.L.f().N(class06889.M, class06889.B, class06889.Z, 1.0);
            }
         }
      }
   }

   @Override
   public boolean y() {
      return this.L.NQ() && !this.L.K().N() && !N_18(this.L.method_73183()).method_19500(this.L.method_24515());
   }

   private void N(class04877 var1) {
      if (var1.T()) {
         class04782 class04782 = N_18(this.L.method_73183());
         HashSet hashset = Sets.newHashSet();
         List<class04882> list = class04782.N(class04882.class, this.L.method_5829().M(16.0), var0 -> !var0.NQ() && class04868.N(var0));
         hashset.addAll(list);

         for (class04882 class04882 : hashset) {
            var1.N(class04782, var1.z(), class04882, null, true);
         }
      }
   }

   @Override
   public boolean N() {
      return this.L.T() == null && !this.L.method_42148() && this.L.NQ() && !this.L.K().N() && !N_18(this.L.method_73183()).method_19500(this.L.method_24515());
   }
}
