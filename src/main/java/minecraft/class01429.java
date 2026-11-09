package minecraft;

import Nursultan.class10412;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.slf4j.Logger;

public record class01429(class05946<class05957> name) implements class05957 {
   private static final Logger R = LogUtils.getLogger();
   public static final MapCodec<class01429> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class05946.N(class04227.yq).fieldOf("name").forGetter(class01429::L)).apply(var0, class01429::new)
   );

   public class05946<class05957> L() {
      return this.name;
   }

   public class01429(class05946<class05957> name) {
      super();
      this.name = name;
   }

   public boolean test(class05908 var1) {
      class05957 class05957 = var1.N().u(this.name).map(class03529::N).orElse(null);
      if (class05957 == null) {
         R.warn("Tried using unknown condition table called {}", this.name.N());
         return false;
      } else {
         class05925 class05925 = class05908.N(class05957);
         if (var1.y(class05925)) {
            boolean flag;
            try {
               flag = class05957.test(var1);
            } finally {
               var1.L(class05925);
            }

            return flag;
         } else {
            R.warn("Detected infinite loop in loot tables");
            return false;
         }
      }
   }

   @Override
   public void N(class05561 var1) {
      if (!var1.y()) {
         var1.N(new class05566(this.name));
      } else if (var1.N(this.name)) {
         var1.N(new class05537(this.name));
      } else {
         class05957.super.N(var1);
         var1.N().u(this.name).ifPresentOrElse(var2 -> var2.N().N(var1.N(new class10412(this.name), this.name)), () -> var1.N(new class05576(this.name)));
      }
   }

   public static class05952 N(class05946<class05957> var0) {
      return () -> new class01429(var0);
   }

   @Override
   public class05955 N() {
      return class07693.s;
   }
}
