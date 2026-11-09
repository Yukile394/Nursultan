package minecraft;

import Nursultan.class10192;
import Nursultan.class10194;
import org.jspecify.annotations.Nullable;

public class class03383 extends class05724<class03404> implements class03385 {
   public static final int N = 16;
   @Nullable
   private class03389 L;

   public int L() {
      return this.method_55443() + 9;
   }

   public class03383(class03417 var1, class06202 var2, int var3) {
      super(var2, var1.field_22789, var1.field_22790 - var3 - 80, 40, 16);
      this.y = var1;
   }

   private boolean y(class03404 var1) {
      if (var1.y()) {
         boolean flag = this.method_25334() == var1;
         boolean flag1 = this.method_25334() == null;
         boolean flag2 = this.method_37019() == var1;
         return flag || flag1 && flag2 && var1.L();
      } else {
         return false;
      }
   }

   public int y() {
      return class04995.R(this.field_22759, 16);
   }

   @Nullable
   protected class03404 method_48197(class03249 var1) {
      return this.method_48198(var1, class03404::y);
   }

   public void method_25313(@Nullable class03404 var1) {
      super.method_25313(var1);
      if (this.method_48197(class03249.field_41826) == null) {
         this.y.N();
      }
   }

   @Override
   public void N(int var1, class03412 var2) {
      boolean flag = var2.N(this.y.y.R());
      class03054 class03054 = var2.B().N(var2.M());
      class03384 class03384 = new class03384(this, var1, var2.N(), var2.y(), class03054, flag, true);
      this.method_44399(class03384);
      this.N(var2, flag);
   }

   private void N(class03412 var1, boolean var2) {
      class10192 class10192 = new class10192(this, var1.R(), var1.L(), var2);
      this.method_44399(class10192);
      class03389 class03389 = new class03389(var1.u(), class10192);
      if (this.L != null && this.L.N(class03389)) {
         this.method_44650(this.L.y());
      }

      this.L = class03389;
   }

   @Override
   public void N(class00392 var1) {
      this.method_44399(new class10194());
      this.method_44399(new class03413(this, var1));
      this.method_44399(new class10194());
      this.L = null;
   }

   protected void method_44397(class01054 var1, int var2, int var3, float var4, class03404 var5) {
      if (this.y(var5)) {
         boolean flag = this.method_25334() == var5;
         int i = this.method_25370() && flag ? -1 : -8355712;
         this.method_44398(var1, var5, i);
      }

      var5.method_25343(var1, var2, var3, this.method_37019() == var5, var4);
   }

   @Override
   public boolean method_25404(class06601 var1) {
      class03404 class03404 = this.method_25334();
      return class03404 != null && class03404.method_25404(var1) ? true : super.method_25404(var1);
   }

   @Override
   public void method_44382(double var1) {
      double d0 = this.method_44387();
      super.method_44382(var1);
      if (this.method_44390() > 1.0E-5F && var1 <= 1.0E-5F && !class04995.y(var1, d0)) {
         this.y.N();
      }
   }

   @Override
   public int method_25322() {
      return Math.min(350, this.field_22758 - 50);
   }
}
