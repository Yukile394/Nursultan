package minecraft;

public abstract class class03922 extends class06478 {
   public static final int field_55258 = 6;
   private double field_39497;
   private static final class01894 field_45906 = class01894.y("widget/scroller");
   private static final class01894 field_55259 = class01894.y("widget/scroller_background");
   private boolean field_39498;

   public class03922(int var1, int var2, int var3, int var4, class00392 var5) {
      super(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean method_25403(class06613 var1, double var2, double var4) {
      if (this.field_39498) {
         if (var1.t() < this.method_46427()) {
            this.method_44382(0.0);
         } else if (var1.t() > this.method_55443()) {
            this.method_44382(this.method_44390());
         } else {
            double d0 = Math.max(1, this.method_44390());
            int i = this.method_44394();
            double d1 = Math.max(1.0, d0 / (this.field_22759 - i));
            this.method_44382(this.method_44387() + var4 * d1);
         }

         return true;
      } else {
         return super.method_25403(var1, var2, var4);
      }
   }

   @Override
   public boolean method_25401(double var1, double var3, double var5, double var7) {
      if (!this.field_22764) {
         return false;
      } else {
         this.method_44382(this.method_44387() - var7 * this.method_44393());
         return true;
      }
   }

   public double method_44387() {
      return this.field_39497;
   }

   public void method_44382(double var1) {
      this.field_39497 = class04995.N(var1, 0.0, (double)this.method_44390());
   }

   @Override
   public void method_25357(class06613 var1) {
      this.field_39498 = false;
   }

   protected void method_44396(class01054 var1, int var2, int var3) {
      if (this.method_44392()) {
         int i = this.method_65507();
         int j = this.method_44394();
         int k = this.method_65508();
         var1.N(class08394.Na, field_55259, i, this.method_46427(), 6, this.method_25364());
         var1.N(class08394.Na, field_45906, i, k, 6, j);
         if (this.method_74038(var2, var3)) {
            var1.N(this.field_39498 ? class06608.i : class06608.u);
         }
      }
   }

   protected boolean method_44392() {
      return this.method_44390() > 0;
   }

   protected boolean method_74038(double var1, double var3) {
      return var1 >= this.method_65507() && var1 <= this.method_65507() + 6 && var3 >= this.method_46427() && var3 < this.method_55443();
   }

   protected int method_65507() {
      return this.method_55442() - 6;
   }

   protected int method_44394() {
      return class04995.N((int)((float)(this.field_22759 * this.field_22759) / this.method_44395()), 32, this.field_22759 - 8);
   }

   public void method_65506() {
      this.method_44382(this.field_39497);
   }

   public int method_44390() {
      return Math.max(0, this.method_44395() - this.field_22759);
   }

   protected abstract int method_44395();

   protected abstract double method_44393();

   public boolean method_65505(class06613 var1) {
      this.field_39498 = this.method_44392() && this.method_25351(var1.G()) && this.method_74038(var1.n(), var1.t());
      return this.field_39498;
   }

   protected int method_65508() {
      return Math.max(this.method_46427(), (int)this.field_39497 * (this.field_22759 - this.method_44394()) / this.method_44390() + this.method_46427());
   }
}
