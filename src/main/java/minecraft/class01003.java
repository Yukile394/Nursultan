package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;

public class class01003 {
   private final Map<class07428, class02136<class01016>> N = class07536.N_74(class07428.class, var0 -> class04540.y());
   private final Map<class07078<?>, class01043> y = Maps.newLinkedHashMap();
   private float L = 0.1F;

   public class01003() {
      super();
   }

   public class01002 N() {
      return new class01002(
         this.L,
         this.N.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, var0 -> ((class02136)var0.getValue()).N())),
         ImmutableMap.copyOf(this.y)
      );
   }

   public class01003 N(float var1) {
      this.L = var1;
      return this;
   }

   public class01003 N(class07078<?> var1, double var2, double var4) {
      this.y.put(var1, new class01043(var4, var2));
      return this;
   }

   public class01003 N(class07428 var1, int var2, class01016 var3) {
      this.N.get(var1).N(var3, var2);
      return this;
   }
}
