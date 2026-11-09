package minecraft;

import com.mojang.logging.LogUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class class02901 extends class07049 {
   private static final Logger N = LogUtils.getLogger();
   private int L;
   protected class07209 y;

   @Override
   public void method_18382() {
   }

   @Override
   public boolean method_5659(class07307 var1) {
      class07049 class07049 = var1.u();
      if (class07049 != null && class07049.method_5799()) {
         return true;
      } else {
         return var1.B() ? super.method_5659(var1) : true;
      }
   }

   @Override
   public void method_5814(double var1, double var3, double var5) {
      this.y = class07209.method_49637(var1, var3, var5);
      this.N();
      this.field_64356 = true;
   }

   @Override
   public void method_5773() {
      if (this.method_73183() instanceof class04782 class04782) {
         this.method_31473();
         if (this.L++ == 100) {
            this.L = 0;
            if (!this.method_31481() && !this.y()) {
               this.method_31472();
               this.N(class04782, null);
            }
         }
      }
   }

   @Override
   public void method_5784(class07451 var1, class06889 var2) {
      if (this.method_73183() instanceof class04782 class04782 && !this.method_31481() && var2.B() > 0.0) {
         this.method_5768(class04782);
         this.N(class04782, null);
      }
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      if (this.method_64421(var2)) {
         return false;
      } else if (!var1.method_64395().N(class07305.I) && var2.u() instanceof class07079) {
         return false;
      } else {
         if (!this.method_31481()) {
            this.method_5768(var1);
            this.method_5785();
            this.N(var1, var2.u());
         }

         return true;
      }
   }

   @Override
   public void method_5762(double var1, double var3, double var5) {
      if (this.method_73183() instanceof class04782 class04782 && !this.method_31481() && var1 * var1 + var3 * var3 + var5 * var5 > 0.0) {
         this.method_5768(class04782);
         this.N(class04782, null);
      }
   }

   @Override
   protected void method_5652(class08329 var1) {
      var1.N("block_pos", class07209.field_25064, this.s());
   }

   @Override
   public boolean method_5863() {
      return true;
   }

   @Override
   public boolean method_5643(class07072 var1) {
      return !this.method_64421(var1);
   }

   @Override
   protected boolean method_5638() {
      return false;
   }

   @Override
   protected void method_5749(class08299 var1) {
      class07209 class07209 = var1.<class07209>N("block_pos", class07209.field_25064).orElse(null);
      if (class07209 != null && class07209.method_19771(this.method_24515(), 16.0)) {
         this.y = class07209;
      } else {
         N.error("Block-attached entity at invalid position: {}", class07209);
      }
   }

   @Override
   public void method_5800(class04782 var1, class00672 var2) {
   }

   @Override
   public boolean method_5698(class07049 var1) {
      if (var1 instanceof class08036 class08036) {
         return !this.method_73183().method_8505(class08036, this.y) ? true : this.method_64420(this.method_48923().N(class08036), 0.0F);
      } else {
         return false;
      }
   }

   protected class02901(class07078<? extends class02901> var1, class07299 var2, class07209 var3) {
      this(var1, var2);
      this.y = var3;
   }

   protected class02901(class07078<? extends class02901> var1, class07299 var2) {
      super(var1, var2);
   }

   public class07209 s() {
      return this.y;
   }

   public abstract boolean y();

   protected abstract void N();

   public abstract void N(class04782 var1, @Nullable class07049 var2);
}
