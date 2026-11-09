package minecraft;

import com.terraformersmc.modmenu.mixin.AccessorClickableWidget;
import java.time.Duration;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public abstract class class06478 implements class01294, class02102, class03434, class04654, AccessorClickableWidget {
   protected int field_22758;
   protected int field_22759;
   private int field_22760;
   private int field_22761;
   protected class00392 field_22754;
   protected boolean field_22762;
   public boolean field_22763 = true;
   public boolean field_22764 = true;
   protected float field_22765 = 1.0F;
   private int field_42116;
   private boolean field_22756;
   private final class04282 field_41095 = new class04282();

   public class06478(int var1, int var2, int var3, int var4, class00392 var5) {
      super();
      this.field_22760 = var1;
      this.field_22761 = var2;
      this.field_22758 = var3;
      this.field_22759 = var4;
      this.field_22754 = var5;
   }

   public float method_75798() {
      return this.field_22765;
   }

   public void method_25350(float var1) {
      this.field_22765 = var1;
   }

   @Nullable
   @Override
   public class02106 method_48205(class02089 var1) {
      if (!this.method_37303()) {
         return null;
      } else {
         return !this.method_25370() ? class02106.N(this) : null;
      }
   }

   @Override
   public final void method_25394(class01054 var1, int var2, int var3, float var4) {
      if (this.field_22764) {
         this.field_22762 = var1.N(var2, var3) && this.method_72102(var2, var3);
         this.method_48579(var1, var2, var3, var4);
         this.field_41095.N(var1, var2, var3, this.method_49606(), this.method_25370(), this.method_48202());
      }
   }

   @Override
   public final void method_37020(class03428 var1) {
      this.method_47399(var1);
      this.field_41095.N(var1);
   }

   @Override
   public class03255 method_48202() {
      return class02102.super.method_48202();
   }

   @Override
   public class03432 method_37018() {
      if (this.method_25370()) {
         return class03432.field_33786;
      } else {
         return this.field_22762 ? class03432.field_33785 : class03432.field_33784;
      }
   }

   @Override
   public boolean method_25405(double var1, double var3) {
      return this.method_37303() && this.method_72102(var1, var3);
   }

   @Override
   public boolean method_37303() {
      return this.field_22764 && this.field_22763;
   }

   @Override
   public int method_48590() {
      return this.field_42116;
   }

   @Override
   public boolean method_25403(class06613 var1, double var2, double var4) {
      if (this.method_25351(var1.G())) {
         this.method_25349(var1, var2, var4);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method_25365(boolean var1) {
      this.field_22756 = var1;
   }

   public void method_48591(int var1) {
      this.field_42116 = var1;
   }

   @Override
   public boolean method_25370() {
      return this.field_22756;
   }

   @Override
   public boolean method_25406(class06613 var1) {
      if (this.method_25351(var1.G())) {
         this.method_25357(var1);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method_48206(Consumer<class06478> var1) {
      var1.accept(this);
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      if (!this.method_37303()) {
         return false;
      } else if (this.method_25351(var1.G()) && this.method_25405(var1.n(), var1.t())) {
         this.method_25354(class06202.Nq().Nr());
         this.method_25348(var1, var2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public int method_46427() {
      return this.field_22761;
   }

   @Override
   public void method_46419(int var1) {
      this.field_22761 = var1;
   }

   @Override
   public int method_46426() {
      return this.field_22760;
   }

   public void method_47400(@Nullable class04141 var1) {
      this.field_41095.N(var1);
   }

   @Override
   public void method_46421(int var1) {
      this.field_22760 = var1;
   }

   public void method_25358(int var1) {
      this.field_22758 = var1;
   }

   public class00392 method_25369() {
      return this.field_22754;
   }

   @Override
   public int method_25364() {
      return this.field_22759;
   }

   @Override
   public int method_25368() {
      return this.field_22758;
   }

   public void method_25355(class00392 var1) {
      this.field_22754 = var1;
   }

   public void method_47402(Duration var1) {
      this.field_41095.N(var1);
   }

   public void method_25348(class06613 var1, boolean var2) {
   }

   public void method_55445(int var1, int var2) {
      this.field_22758 = var1;
      this.field_22759 = var2;
   }

   protected void method_76256(class01054 var1) {
      if (this.method_49606()) {
         var1.N(this.method_37303() ? class06608.u : class06608.B);
      }
   }

   public int method_55442() {
      return this.method_46426() + this.method_25368();
   }

   protected void method_75799(class00580 var1, class00392 var2, int var3) {
      int i = this.method_46426() + var3;
      int j = this.method_46426() + this.method_25368() - var3;
      int k = this.method_46427();
      int l = this.method_46427() + this.method_25364();
      var1.N(var2, i, j, k, l);
   }

   public boolean method_25351(class06595 var1) {
      return var1.v() == 0;
   }

   public boolean method_25367() {
      return this.method_49606() || this.method_25370();
   }

   protected void method_37021(class03428 var1) {
      var1.N(class03457.field_33788, this.method_25360());
      if (this.field_22763) {
         if (this.method_25370()) {
            var1.N(class03457.field_33791, class00392.L("narration.button.usage.focused"));
         } else {
            var1.N(class03457.field_33791, class00392.L("narration.button.usage.hovered"));
         }
      }
   }

   public void method_55444(int var1, int var2, int var3, int var4) {
      this.method_55445(var1, var2);
      this.y(var3, var4);
   }

   public void method_25357(class06613 var1) {
   }

   public static void method_62888(class09033 var0) {
      var0.N(class00040.N(class04909.OK, 1.0F));
   }

   protected abstract void method_47399(class03428 var1);

   public boolean method_49606() {
      return this.field_22762;
   }

   protected void method_25349(class06613 var1, double var2, double var4) {
   }

   protected class05216 method_25360() {
      return method_32602(this.method_25369());
   }

   public void method_25354(class09033 var1) {
      method_62888(var1);
   }

   public int method_55443() {
      return this.method_46427() + this.method_25364();
   }

   protected abstract void method_48579(class01054 var1, int var2, int var3, float var4);

   private boolean method_72102(double var1, double var3) {
      return var1 >= this.method_46426() && var3 >= this.method_46427() && var1 < this.method_55442() && var3 < this.method_55443();
   }

   public static class05216 method_32602(class00392 var0) {
      return class00392.N("gui.narrate.button", var0);
   }

   public void method_53533(int var1) {
      this.field_22759 = var1;
   }
}
