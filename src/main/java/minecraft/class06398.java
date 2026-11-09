package minecraft;

import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class06398 {
   private static final Logger N = LogUtils.getLogger();
   private static final Codec<Map<class01894, class06425>> y = Codec.unboundedMap(class01894.N, class06425.U);
   private final Map<class01894, class06392> L = Maps.newHashMap();

   public class06398() {
      super();
   }

   public void y(class04770 var1) {
      Iterator<class06392> iterator = this.L.values().iterator();

      while (iterator.hasNext()) {
         iterator.next().u(var1);
      }
   }

   public Collection<class06392> y() {
      return this.L.values();
   }

   public void N(class04770 var1) {
      Iterator<class06392> iterator = this.L.values().iterator();

      while (iterator.hasNext()) {
         iterator.next().L(var1);
      }
   }

   public class07001 N(class01929 var1) {
      Map map = class07536.N(this.L, class06392::m);
      return (class07001)y.encodeStart(var1.N(class07713.N), map).getOrThrow();
   }

   public class06392 N(class01894 var1, class00392 var2) {
      class06392 class06392 = new class06392(var1, var2);
      this.L.put(var1, class06392);
      return class06392;
   }

   public void N(class06392 var1) {
      this.L.remove(var1.Z());
   }

   public Collection<class01894> N() {
      return this.L.keySet();
   }

   @Nullable
   public class06392 N(class01894 var1) {
      return this.L.get(var1);
   }

   public void N(class07001 var1, class01929 var2) {
      y.parse(var2.N(class07713.N), var1)
         .resultOrPartial(var0 -> N.error("Failed to parse boss bar events: {}", var0))
         .orElse(Map.of())
         .forEach((var1x, var2x) -> this.L.put(var1x, class06392.N(var1x, var2x)));
   }
}
