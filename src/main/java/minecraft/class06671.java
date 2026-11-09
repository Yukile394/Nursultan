package minecraft;

import org.jspecify.annotations.Nullable;

public class class06671 implements class00381<class07280> {
   public static final class02362<class00667, class06671> N = class00381.N(class06671::N, class06671::new);
   private final double y;
   private final double L;
   private final double u;
   private final int i;
   private final class07664 R;
   private final class07664 M;
   private final boolean B;

   private class06671(class00667 var1) {
      super();
      this.R = var1.y(class07664.class);
      this.y = var1.readDouble();
      this.L = var1.readDouble();
      this.u = var1.readDouble();
      this.B = var1.readBoolean();
      if (this.B) {
         this.i = var1.E();
         this.M = var1.y(class07664.class);
      } else {
         this.i = 0;
         this.M = null;
      }
   }

   public class06671(class07664 var1, class07049 var2, class07664 var3) {
      super();
      this.R = var1;
      this.i = var2.method_5628();
      this.M = var3;
      class06889 class06889 = var3.N(var2);
      this.y = class06889.M;
      this.L = class06889.B;
      this.u = class06889.Z;
      this.B = true;
   }

   public class06671(class07664 var1, double var2, double var4, double var6) {
      super();
      this.R = var1;
      this.y = var2;
      this.L = var4;
      this.u = var6;
      this.i = 0;
      this.B = false;
      this.M = null;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public class07664 N() {
      return this.R;
   }

   private void N(class00667 var1) {
      var1.N((Enum<?>)this.R);
      var1.writeDouble(this.y);
      var1.writeDouble(this.L);
      var1.writeDouble(this.u);
      var1.writeBoolean(this.B);
      if (this.B) {
         var1.L(this.i);
         var1.N((Enum<?>)this.M);
      }
   }

   @Nullable
   public class06889 N(class07299 var1) {
      if (this.B) {
         class07049 class07049 = var1.method_8469(this.i);
         return class07049 == null ? new class06889(this.y, this.L, this.u) : this.M.N(class07049);
      } else {
         return new class06889(this.y, this.L, this.u);
      }
   }

   @Override
   public class02897<class06671> method_65080() {
      return class04248.NW;
   }
}
