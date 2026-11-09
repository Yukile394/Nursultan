package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class class08115 extends class08158 {
   public class08115(Schema var1, boolean var2) {
      super("EntitySkeletonSplitFix", var1, var2);
   }

   @Override
   protected Pair<String, Dynamic<?>> N(String var1, Dynamic<?> var2) {
      if (Objects.equals(var1, "Skeleton")) {
         int i = var2.get("SkeletonType").asInt(0);
         if (i == 1) {
            var1 = "WitherSkeleton";
         } else if (i == 2) {
            var1 = "Stray";
         }
      }

      return Pair.of(var1, var2);
   }
}
