package minecraft;

public abstract class class08813 extends class03922 {
   private static final class01883 field_55260 = new class01883(class01894.y("widget/text_field"), class01894.y("widget/text_field_highlighted"));
   private static final int field_55261 = 4;
   public static final int field_60867 = 8;
   private boolean field_60433 = true;
   private boolean field_60434 = true;

   public class08813(int var1, int var2, int var3, int var4, class00392 var5) {
      super(var1, var2, var3, var4, var5);
   }

   public class08813(int var1, int var2, int var3, int var4, class00392 var5, boolean var6, boolean var7) {
      this(var1, var2, var3, var4, var5);
      this.field_60433 = var6;
      this.field_60434 = var7;
   }

   @Override
   public boolean method_25404(class06601 var1) {
      boolean flag = var1.B();
      boolean flag1 = var1.Z();
      if (flag || flag1) {
         double d0 = this.method_44387();
         this.method_44382(this.method_44387() + (flag ? -1 : 1) * this.method_44393());
         if (d0 != this.method_44387()) {
            return true;
         }
      }

      return super.method_25404(var1);
   }

   @Override
   public boolean method_25405(double var1, double var3) {
      return this.field_22763
         && this.field_22764
         && var1 >= this.method_46426()
         && var3 >= this.method_46427()
         && var1 < this.method_55442() + 6
         && var3 < this.method_55443();
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      boolean flag = this.method_65505(var1);
      return super.method_25402(var1, var2) || flag;
   }

   protected abstract void method_44389(class01054 var1, int var2, int var3, float var4);

   protected void method_65511(class01054 var1, int var2, int var3, int var4, int var5) {
      class01894 class01894 = field_55260.N(this.method_37303(), this.method_25370());
      var1.N(class08394.Na, class01894, var2, var3, var4, var5);
   }

   protected void method_44386(class01054 var1) {
      this.method_65511(var1, this.method_46426(), this.method_46427(), this.method_25368(), this.method_25364());
   }

   protected int method_65513() {
      return this.method_46426() + this.method_65509();
   }

   protected boolean method_65510(int var1, int var2) {
      return var2 - this.method_44387() >= this.method_46427() && var1 - this.method_44387() <= this.method_46427() + this.field_22759;
   }

   protected int method_65512() {
      return this.method_65509() * 2;
   }

   protected int method_65509() {
      return 4;
   }

   protected abstract int method_44391();

   protected void method_44384(class01054 var1) {
   }

   protected int method_65514() {
      return this.method_46427() + this.method_65509();
   }

   @Override
   public void method_25354(class09033 var1) {
   }

   @Override
   public void method_48579(class01054 var1, int var2, int var3, float var4) {
      if (this.field_22764) {
         if (this.field_60433) {
            this.method_44386(var1);
         }

         var1.L(this.method_46426() + 1, this.method_46427() + 1, this.method_46426() + this.field_22758 - 1, this.method_46427() + this.field_22759 - 1);
         var1.i().pushMatrix();
         var1.i().translate(0.0F, (float)(-this.method_44387()));
         this.method_44389(var1, var2, var3, var4);
         var1.i().popMatrix();
         var1.R();
         this.method_44396(var1, var2, var3);
         if (this.field_60434) {
            this.method_44384(var1);
         }
      }
   }

   @Override
   protected int method_65507() {
      return this.method_55442();
   }

   @Override
   protected int method_44395() {
      return this.method_44391() + this.method_65512();
   }
}
