package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class class08704 {
   private final Map<class08719, List<class08706>> N = new EnumMap<>(class08719.class);

   class08704() {
      super();
   }

   public class08704 y(class01894 var1, boolean var2) {
      return this.N(class08719.field_54125, class08706.N(var1, var2));
   }

   public class08732 N() {
      return new class08732(this.N.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, var0 -> List.copyOf((Collection)var0.getValue()))));
   }

   public class08704 N(class08719 var1, class08706... var2) {
      Collections.addAll(this.N.computeIfAbsent(var1, var0 -> new ArrayList<>()), var2);
      return this;
   }

   public class08704 N(class01894 var1, boolean var2) {
      this.N(class08719.field_54126, class08706.N(var1, var2));
      this.y(var1, var2);
      return this;
   }

   public class08704 N(class01894 var1) {
      return this.N(var1, false);
   }
}
