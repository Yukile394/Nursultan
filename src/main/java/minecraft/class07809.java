package minecraft;

import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class class07809 extends class07811 {
   public class07809(Codec<class04389> var1) {
      super(var1);
      this.B = ImmutableSet.of(class04684.i, class04684.L);
   }

   @Override
   protected double y() {
      return 5.0;
   }

   protected boolean N(
      class06080 var1,
      class04389 var2,
      class08050 var3,
      Function<class07209, class03556<class00780>> var4,
      class03322 var5,
      class07218 var6,
      class07218 var7,
      class03460 var8,
      MutableBoolean var9
   ) {
      if (this.N(var2, var3.method_8320(var6))) {
         class00500 class00500;
         if (var6.method_10264() <= var1.i() + 31) {
            class00500 = M.B();
         } else {
            class00500 = i;
         }

         var3.N(var6, class00500);
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected int N() {
      return 10;
   }

   @Override
   protected float N(class06069 var1) {
      return (var1.z() * 2.0F + var1.z()) * 2.0F;
   }
}
