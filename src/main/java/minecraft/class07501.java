package minecraft;

import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class07501 extends class07482 {
   private static final int N = 0;
   private static final int y = 1;
   private static final int L = 3;
   private static final int u = 1;
   private static final int i = 28;
   private static final int R = 28;
   private static final int j = 37;
   private static final int v = 0;
   private final class06695 n = new class07515(this, 1);
   private final class07505 t;
   private final class05880 G;
   private final class05845 l;

   public boolean P() {
      return !this.n.method_5438(0).R();
   }

   public class07501(int var1, class06695 var2) {
      this(var1, var2, new class05853(3), class05880.N);
   }

   public class07501(int var1, class06695 var2, class05845 var3, class05880 var4) {
      super(class05851.field_17330, var1);
      N(var3, 3);
      this.l = var3;
      this.G = var4;
      this.t = new class07505(this.n, 0, 136, 110);
      this.N(this.t);
      this.N(var3);
      this.L(var2, 36, 137);
   }

   @Nullable
   public class03556<class07084> m() {
      return N(this.l.N(2));
   }

   @Override
   public void y(class08036 var1) {
      super.y(var1);
      if (!var1.method_73183().method_8608()) {
         class06584 class06584 = this.t.N(this.t.y());
         if (!class06584.R()) {
            var1.method_7328(class06584, false);
         }
      }
   }

   @Override
   public void y(int var1, int var2) {
      super.y(var1, var2);
      this.u();
   }

   public int E() {
      return this.l.N(0);
   }

   public static int N(@Nullable class03556<class07084> var0) {
      return var0 == null ? 0 : class04206.u.v().N(var0) + 1;
   }

   public void N(Optional<class03556<class07084>> var1, Optional<class03556<class07084>> var2) {
      if (this.t.R()) {
         this.l.N(1, N((class03556<class07084>)var1.orElse(null)));
         this.l.N(2, N((class03556<class07084>)var2.orElse(null)));
         this.t.N(1);
         this.G.N_53(class07299::method_8524);
      }
   }

   @Override
   public boolean N(class08036 var1) {
      return N(this.G, var1, class00869.MO);
   }

   @Nullable
   public static class03556<class07084> N(int var0) {
      return var0 == 0 ? null : class04206.u.v().N(var0 - 1);
   }

   @Override
   public class06584 N(class08036 var1, int var2) {
      class06584 class06584x = class06584.E;
      class06937 class06937 = this.T.get(var2);
      if (class06937 != null && class06937.R()) {
         class06584 class06584x = class06937.i();
         class06584x = class06584x.t();
         if (var2 == 0) {
            if (!this.N(class06584x, 1, 37, true)) {
               return class06584.E;
            }

            class06937.y(class06584x, class06584x);
         } else if (!this.t.R() && this.t.N(class06584x) && class06584x.c() == 1) {
            if (!this.N(class06584x, 0, 1, false)) {
               return class06584.E;
            }
         } else if (var2 >= 1 && var2 < 28) {
            if (!this.N(class06584x, 28, 37, false)) {
               return class06584.E;
            }
         } else if (var2 >= 28 && var2 < 37) {
            if (!this.N(class06584x, 1, 28, false)) {
               return class06584.E;
            }
         } else if (!this.N(class06584x, 1, 37, false)) {
            return class06584.E;
         }

         if (class06584x.R()) {
            class06937.u(class06584.E);
         } else {
            class06937.M();
         }

         if (class06584x.c() == class06584x.c()) {
            return class06584.E;
         }

         class06937.N(var1, class06584x);
      }

      return class06584x;
   }

   @Nullable
   public class03556<class07084> W() {
      return N(this.l.N(1));
   }
}
