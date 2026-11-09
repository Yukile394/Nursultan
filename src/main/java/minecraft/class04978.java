package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class class04978 extends class04985 implements class00873 {
   public class04978(class01362 var1, class07211 var2, class00494 var3, boolean var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   protected class00891 u() {
      return this;
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return true;
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      Optional<class07209> optional = this.N(var1, var3, var4.i());
      if (optional.isPresent()) {
         class00500 class00500 = var1.method_8320(optional.get());
         ((class04983)class00500.i()).N(var1, var2, optional.get(), class00500);
      }
   }

   private Optional<class07209> N(class07290 var1, class07209 var2, class00891 var3) {
      return class01008.N(var1, var2, var3, this.y, this.L());
   }

   @Override
   protected boolean N(class00500 var1, class06942 var2) {
      boolean flag = super.N(var1, var2);
      return flag && var2.method_8041().N(this.L().B()) ? false : flag;
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      Optional<class07209> optional = this.N(var1, var2, var3.i());
      return optional.isPresent() && this.L().E(var1.method_8320(optional.get().method_10093(this.y)));
   }

   protected class00500 N(class00500 var1, class00500 var2) {
      return var2;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var5 == this.y.b() && !var1.N(var2, var4)) {
         var3.N(var4, this, 1);
      }

      class04983 class04983 = this.L();
      if (var5 == this.y && !var7.N(this) && !var7.N(class04983)) {
         return this.N(var1, class04983.y(var8));
      } else {
         if (this.L) {
            var3.N(var4, class04684.L, class04684.L.N(var2));
         }

         return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
      }
   }

   @Override
   public class06584 N(class05487 var1, class07209 var2, class00500 var3, boolean var4) {
      return new class06584(this.L());
   }

   @Override
   protected abstract MapCodec<? extends class04978> N();
}
