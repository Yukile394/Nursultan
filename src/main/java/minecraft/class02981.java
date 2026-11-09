package minecraft;

import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class class02981 {
   private static final Logger N = LogUtils.getLogger();
   private final class03766 y;
   private final Map<class01894, class02957> L;
   private final class03767 u;

   class02981(class03766 var1, class03767 var2, Map<class01894, class02957> var3) {
      super();
      this.y = var1;
      this.L = var3;
      this.u = var2;
   }

   public Set<class01894> y(class03767 var1) {
      HashSet hashset = new HashSet();
      this.L.forEach((var2x, var3) -> {
         if (var1.y(var3)) {
            hashset.add(var2x);
         }
      });
      return hashset;
   }

   public Codec<class03767> y() {
      return class01894.N.listOf().comapFlatMap(var1 -> {
         HashSet hashset = new HashSet();
         class03767 class03767 = this.N(var1, hashset::add);
         return !hashset.isEmpty() ? DataResult.error(() -> "Unknown feature ids: " + hashset, class03767) : DataResult.success(class03767);
      }, var1 -> List.copyOf(this.y(var1)));
   }

   public class03767 N(Iterable<class01894> var1) {
      return this.N(var1, var0 -> N.warn("Unknown feature flag: {}", var0));
   }

   public class03767 N(class02957... var1) {
      return class03767.N(this.y, Arrays.asList(var1));
   }

   public class03767 N(Iterable<class01894> var1, Consumer<class01894> var2) {
      Set set = Sets.newIdentityHashSet();

      for (class01894 class01894 : var1) {
         class02957 class02957 = this.L.get(class01894);
         if (class02957 == null) {
            var2.accept(class01894);
         } else {
            set.add(class02957);
         }
      }

      return class03767.N(this.y, set);
   }

   public class03767 N() {
      return this.u;
   }

   public boolean N(class03767 var1) {
      return var1.N(this.u);
   }
}
