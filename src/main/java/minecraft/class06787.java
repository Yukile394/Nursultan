package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public class class06787 extends class00891 {
   public static final MapCodec<class00891> N = class04206.i.T().fieldOf("dead");
   public static final MapCodec<class06787> y = RecordCodecBuilder.mapCodec(var0 -> var0.group(N.forGetter(var0x -> var0x.L), t()).apply(var0, class06787::new));
   private final class00891 L;

   public class06787(class00891 var1, class01362 var2) {
      super(var2);
      this.L = var1;
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      if (!this.N(var1.method_8045(), var1.method_8037())) {
         var1.method_8045().N(var1.method_8037(), this, 60 + var1.method_8045().method_8409().y(40));
      }

      return this.W();
   }

   protected boolean N(class07290 var1, class07209 var2) {
      for (class07211 class07211 : class07211.values()) {
         if (var1.method_8316(var2.method_10093(class07211)).N(class01231.N)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public MapCodec<class06787> N() {
      return y;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (!this.N(var2, var4)) {
         var3.N(var4, this, 60 + var8.y(40));
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (!this.N(var2, var3)) {
         var2.method_8652(var3, this.L.W(), 2);
      }
   }
}
