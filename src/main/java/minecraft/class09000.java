package minecraft;

import org.jspecify.annotations.Nullable;

public class class09000 {
   private static final int N = 100;
   private final class06069 y = class06069.u();
   private final class06202 L;
   @Nullable
   private class00044 u;
   private class09021 i;
   private float R = 1.0F;
   private int M = 100;
   private boolean B = false;

   public boolean L(class05075 var1) {
      return this.u == null ? false : var1.N().N().N().equals(this.u.L());
   }

   public void L() {
      if (this.u != null) {
         this.L.Nr().y(this.u);
         this.u = null;
         this.L.m().u();
      }

      this.M += 100;
   }

   public class09000(class06202 var1) {
      super();
      this.L = var1;
      this.i = ((class05630)var1.i_7).Nc().method_41753();
   }

   @Nullable
   public String u() {
      if (this.u != null) {
         class00002 class00002 = this.u.u();
         if (class00002 != null) {
            return class00002.N().i();
         }
      }

      return null;
   }

   public void y(class05075 var1) {
      if (this.L(var1)) {
         this.L();
      }
   }

   public void y() {
      if (!this.B) {
         this.L.m().L();
         this.B = true;
      }
   }

   private static boolean N(class05075 var0, class00044 var1) {
      return var0.u() && !var0.N().N().N().equals(var1.L());
   }

   public void N() {
      float f = this.L.Np();
      if (this.u != null && this.R != f) {
         boolean flag = this.N(f);
         if (!flag) {
            return;
         }
      }

      class05075 class05075 = this.L.NX();
      if (class05075 == null) {
         this.M = Math.max(this.M, 100);
      } else {
         if (this.u != null) {
            if (N(class05075, this.u)) {
               this.L.Nr().y(this.u);
               this.M = class04995.N(this.y, 0, class05075.y() / 2);
            }

            if (!this.L.Nr().L(this.u)) {
               this.u = null;
               this.M = Math.min(this.M, this.i.N(class05075, this.y));
            }
         }

         this.M = Math.min(this.M, this.i.N(class05075, this.y));
         if (this.u == null && this.M-- <= 0) {
            this.N(class05075);
         }
      }
   }

   public void N(class09021 var1) {
      this.i = var1;
      this.M = this.i.N(this.L.NX(), this.y);
   }

   private boolean N(float var1) {
      if (this.u == null) {
         return false;
      } else if (this.R == var1) {
         return true;
      } else {
         if (this.R < var1) {
            this.R = this.R + class04995.N(this.R, 5.0E-4F, 0.005F);
            if (this.R > var1) {
               this.R = var1;
            }
         } else {
            this.R = 0.03F * var1 + 0.97F * this.R;
            if (Math.abs(this.R - var1) < 1.0E-4F || this.R < var1) {
               this.R = var1;
            }
         }

         this.R = class04995.N(this.R, 0.0F, 1.0F);
         if (this.R <= 1.0E-4F) {
            this.L();
            return false;
         } else {
            this.L.Nr().N(class04911.field_15253, this.R);
            return true;
         }
      }
   }

   public void N(class05075 var1) {
      class04891 class04891 = var1.N().N();
      this.u = class00040.N(class04891);
      switch (this.L.Nr().N(this.u)) {
         case field_60954:
            this.L.m().L();
            this.B = true;
            break;
         case field_60955:
            this.B = false;
      }

      this.M = Integer.MAX_VALUE;
   }
}
