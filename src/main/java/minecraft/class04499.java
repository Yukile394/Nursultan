package minecraft;

import java.util.Optional;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class class04499 extends class02260 {
   private static final class01284 M = new class02247(true, false, Optional.of(1.22F), class04206.i.N(class01210.Lp).map(Function.identity()));
   private static final float B = 1.2F;
   private static final float Z = class04995.z(3.5F);
   private int z = 5;

   @Override
   public void method_5773() {
      super.method_5773();
      if (this.z > 0) {
         this.z--;
      }
   }

   @Override
   public boolean method_5640(double var1) {
      return this.field_6012 < 2 && var1 < Z ? false : super.method_5640(var1);
   }

   public class04499(class07078<? extends class02260> var1, class07299 var2) {
      super(var1, var2);
   }

   public class04499(class07299 var1, double var2, double var4, double var6, class06889 var8) {
      super(class07078.ya, var2, var4, var6, var8, var1);
   }

   public class04499(class08036 var1, class07299 var2, double var3, double var5, double var7) {
      super(class07078.ya, var2, var1, var3, var5, var7);
   }

   @Override
   protected void N(class06889 var1) {
      this.method_73183()
         .method_8454(
            this, null, M, var1.N(), var1.y(), var1.L(), 1.2F, false, class07328.field_51779, class07107.Y, class07107.k, class04540.N(), class04909.IV
         );
   }

   @Override
   public boolean N(class04252 var1, @Nullable class07049 var2, @Nullable class08372<class07049> var3, boolean var4) {
      return this.z > 0 ? false : super.N(var1, var2, var3, var4);
   }
}
