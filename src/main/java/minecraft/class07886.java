package minecraft;

import org.jspecify.annotations.Nullable;

public class class07886 extends class07955 {
   private final boolean N;
   private float W;
   private float m;

   @Override
   protected boolean L() {
      return true;
   }

   public class07886(boolean var1) {
      super();
      this.N = var1;
   }

   private boolean y(@Nullable class01763 var1, class01763 var2) {
      return this.N(var1, var2) && var1.E == class04425.field_18;
   }

   @Override
   public class01763 y() {
      return !this.u.method_5799()
         ? super.y()
         : this.N(new class07209(class04995.N(this.u.method_5829().N), class04995.N(this.u.method_5829().y + 0.5), class04995.N(this.u.method_5829().L)));
   }

   @Override
   public class04425 N(class02682 var1, int var2, int var3, int var4) {
      if (var1.N(var2, var3, var4) == class04425.field_18) {
         class07218 class07218 = new class07218();

         for (class07211 class07211 : class07211.values()) {
            class07218.N(var2, var3, var4).N(class07211);
            if (var1.N(class07218.method_10263(), class07218.method_10264(), class07218.method_10260()) == class04425.field_22) {
               return class04425.field_4;
            }
         }

         return class04425.field_18;
      } else {
         return super.N(var1, var2, var3, var4);
      }
   }

   @Override
   public int N(class01763[] var1, class01763 var2) {
      int i = super.N(var1, var2);
      class04425 class04425x = this.N(var2.N, var2.y + 1, var2.L);
      class04425 class04425x = this.N(var2.N, var2.y, var2.L);
      int j;
      if (this.u.N(class04425x) >= 0.0F && class04425x != class04425.field_21326) {
         j = class04995.y(Math.max(1.0F, this.u.method_49476()));
      } else {
         j = 0;
      }

      double d0 = this.L(new class07209(var2.N, var2.y, var2.L));
      class01763 class01763xx = this.N(var2.N, var2.y + 1, var2.L, Math.max(0, j - 1), d0, class07211.field_11036, class04425x);
      class01763 class01763x = this.N(var2.N, var2.y - 1, var2.L, j, d0, class07211.field_11033, class04425x);
      if (this.y(class01763xx, var2)) {
         var1[i++] = class01763xx;
      }

      if (this.y(class01763x, var2) && class04425x != class04425.field_19) {
         var1[i++] = class01763x;
      }

      for (int k = 0; k < i; k++) {
         class01763 class01763xx = var1[k];
         if (class01763xx.E == class04425.field_18 && this.N && class01763xx.y < this.u.method_73183().method_8615() - 10) {
            class01763xx.U++;
         }
      }

      return i;
   }

   @Override
   public class04604 N(double var1, double var3, double var5) {
      return this.y(var1, var3 + 0.5, var5);
   }

   @Override
   public void N() {
      this.u.N(class04425.field_12, this.W);
      this.u.N(class04425.field_4, this.m);
      super.N();
   }

   @Override
   public void N(class00783 var1, class07079 var2) {
      super.N(var1, var2);
      var2.N(class04425.field_18, 0.0F);
      this.W = var2.N(class04425.field_12);
      var2.N(class04425.field_12, 6.0F);
      this.m = var2.N(class04425.field_4);
      var2.N(class04425.field_4, 4.0F);
   }
}
