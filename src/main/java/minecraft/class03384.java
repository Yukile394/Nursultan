package minecraft;

import java.util.List;
import org.jspecify.annotations.Nullable;

public class class03384 extends class03404 {
   private static final int y = 9;
   private static final int L = 8;
   private static final int u = 11;
   private static final int i = 4;
   private final int R;
   private final class05936 M;
   private final class00392 B;
   @Nullable
   private final List<class01028> Z;
   @Nullable
   private final class03050 z;
   @Nullable
   private final List<class01028> U;
   private final boolean E;
   private final boolean W;

   @Override
   public boolean L() {
      return this.E;
   }

   public class03384(class03383 var1, int var2, class00392 var3, @Nullable class00392 var4, class03054 var5, boolean var6, boolean var7) {
      super();
      this.N = var1;
      this.R = var2;
      this.z = class01962.N(var5, class03054::R);
      this.U = var5 != null && var5.M() != null ? class03417.y(var1.y).L(var5.M(), var1.method_25322()) : null;
      this.E = var6;
      this.W = var7;
      class05936 class05936 = class03417.u(var1.y).N(var3, this.u() - class03417.L(var1.y).N(class05220.G));
      if (var3 != class05936) {
         this.M = class05936.N(class05936, class05220.G);
         this.Z = class03417.i(var1.y).L(var3, var1.method_25322());
      } else {
         this.M = var3;
         this.Z = null;
      }

      this.B = var4;
   }

   private int i() {
      return this.W ? 11 : 0;
   }

   private int u() {
      int ix = this.z != null ? this.z.field_39766 + 4 : 0;
      return this.N.method_25322() - this.i() - 4 - ix;
   }

   @Override
   public boolean y() {
      return true;
   }

   private void N(class01054 var1, int var2, int var3, int var4) {
      int ix = var2 + (var4 - 8) / 2;
      var1.N(class08394.Na, class03417.N, var3, ix, 9, 8);
   }

   @Override
   public boolean N() {
      return this.N.y.y.y(this.R);
   }

   private void N(class01054 var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.z != null) {
         int ix = var3 + (var4 - this.z.field_39767) / 2;
         this.z.N(var1, var2, ix);
         if (this.U != null && var5 >= var2 && var5 <= var2 + this.z.field_39766 && var6 >= ix && var6 <= ix + this.z.field_39767) {
            var1.N(this.U, var5, var6);
         }
      }
   }

   @Override
   public boolean method_25404(class06601 var1) {
      return var1.L() ? this.R() : false;
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      this.N.method_25313(null);
      return this.R();
   }

   private boolean R() {
      if (this.E) {
         this.N.y.y.N(this.R);
         this.N.y.y();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      if (this.N() && this.E) {
         this.N(var1, this.method_73382(), this.method_73380(), this.method_73384());
      }

      int ix = this.method_73380() + this.i();
      int j = this.method_73382() + 1 + (this.method_73384() - 9) / 2;
      var1.y(class03417.M(this.N.y), class07018.y().N(this.M), ix, j, this.E ? -1 : -1593835521);
      if (this.Z != null && var4) {
         var1.N(this.Z, var2, var3);
      }

      int k = class03417.B(this.N.y).N(this.M);
      this.N(var1, ix + k + 4, this.method_73382(), this.method_73384(), var2, var3);
   }

   @Override
   public class00392 method_37006() {
      return (class00392)(this.N() ? class00392.N("narrator.select", this.B) : this.B);
   }
}
