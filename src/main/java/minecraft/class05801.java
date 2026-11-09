package minecraft;

public abstract class class05801 extends class06466 {
   private static final class01894 field_45340 = class01894.y("widget/slider");
   private static final class01894 field_45341 = class01894.y("widget/slider_highlighted");
   private static final class01894 field_45342 = class01894.y("widget/slider_handle");
   private static final class01894 field_45343 = class01894.y("widget/slider_handle_highlighted");
   protected static final int field_43054 = 2;
   public static final int field_60708 = 20;
   protected static final int field_41790 = 8;
   private static final int field_41789 = 4;
   protected double field_22753;
   protected boolean field_41796;
   private boolean field_62464;

   public class05801(int var1, int var2, int var3, int var4, class00392 var5, double var6) {
      super(var1, var2, var3, var4, var5);
      this.field_22753 = var6;
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (var1.L()) {
         this.field_41796 = !this.field_41796;
         return true;
      } else {
         if (this.field_41796) {
            boolean flag = var1.R();
            boolean flag1 = var1.M();
            if (flag || flag1) {
               float f = flag ? -1.0F : 1.0F;
               this.method_25347(this.field_22753 + f / (this.field_22758 - 8));
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public void method_25365(boolean var1) {
      super.method_25365(var1);
      if (!var1) {
         this.field_41796 = false;
      } else {
         class02111 class02111 = class06202.Nq().Nc();
         if (class02111 == class02111.field_41778 || class02111 == class02111.field_41780) {
            this.field_41796 = true;
         }
      }
   }

   protected abstract void method_25344();

   protected abstract void method_25346();

   @Override
   public void method_25348(class06613 var1, boolean var2) {
      this.field_62464 = this.field_22763;
      this.method_25345(var1);
   }

   public void method_25347(double var1) {
      double d0 = this.field_22753;
      this.field_22753 = class04995.N(var1, 0.0, 1.0);
      if (d0 != this.field_22753) {
         this.method_25344();
      }

      this.method_25346();
   }

   private class01894 method_52716() {
      return this.method_37303() && this.method_25370() && !this.field_41796 ? field_45341 : field_45340;
   }

   private void method_25345(class06613 var1) {
      this.method_25347((var1.n() - (this.method_46426() + 4)) / (this.field_22758 - 8));
   }

   @Override
   public void method_25357(class06613 var1) {
      this.field_62464 = false;
      super.method_25354(class06202.Nq().Nr());
   }

   @Override
   public void method_47399(class03428 var1) {
      var1.N(class03457.field_33788, this.method_25360());
      if (this.field_22763) {
         if (this.method_25370()) {
            if (this.field_41796) {
               var1.N(class03457.field_33791, class00392.L("narration.slider.usage.focused"));
            } else {
               var1.N(class03457.field_33791, class00392.L("narration.slider.usage.focused.keyboard_cannot_change_value"));
            }
         } else {
            var1.N(class03457.field_33791, class00392.L("narration.slider.usage.hovered"));
         }
      }
   }

   private class01894 method_52717() {
      return !this.method_37303() || !this.field_22762 && !this.field_41796 ? field_45342 : field_45343;
   }

   @Override
   public void method_25349(class06613 var1, double var2, double var4) {
      this.method_25345(var1);
      super.method_25349(var1, var2, var4);
   }

   @Override
   protected class05216 method_25360() {
      return class00392.N("gui.narrate.slider", this.method_25369());
   }

   @Override
   public void method_25354(class09033 var1) {
   }

   @Override
   public void method_48579(class01054 var1, int var2, int var3, float var4) {
      var1.N(
         class08394.Na, this.method_52716(), this.method_46426(), this.method_46427(), this.method_25368(), this.method_25364(), class02566.y(this.field_22765)
      );
      var1.N(
         class08394.Na,
         this.method_52717(),
         this.method_46426() + (int)(this.field_22753 * (this.field_22758 - 8)),
         this.method_46427(),
         8,
         this.method_25364(),
         class02566.y(this.field_22765)
      );
      this.method_75799(var1.N(this, class01065.field_63850), this.method_25369(), 2);
      if (this.method_49606()) {
         var1.N(this.field_62464 ? class06608.R : class06608.u);
      }
   }
}
