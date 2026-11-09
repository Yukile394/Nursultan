package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.resource.pack.ModPackResourcesUtil;
import net.fabricmc.fabric.impl.resource.pack.ModResourcePackCreator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(EnvType.CLIENT)
public class class02301 {
   private final class01623 N = this.y();
   private final Map<class02298, String> y;
   private static final Logger L = LoggerFactory.getLogger("KnownPacksManagerMixin");

   public class02301() {
      super();
      this.N.N();
      Builder builder = ImmutableMap.builder();
      this.N.u().forEach(var1x -> {
         class02267 class02267 = var1x.N();
         class02267.u().ifPresent(var2x -> builder.put(var2x, class02267.N()));
      });
      this.y = builder.build();
   }

   List y(List var1) {
      if (var1.size() > ModResourcePackCreator.MAX_KNOWN_PACKS) {
         L.warn("Too many knownPacks: Found {}; max {}", var1.size(), ModResourcePackCreator.MAX_KNOWN_PACKS);
         return var1.subList(0, ModResourcePackCreator.MAX_KNOWN_PACKS);
      } else {
         return var1;
      }
   }

   public class01623 y() {
      return ModPackResourcesUtil.createClientManager();
   }

   public class03554 N() {
      List<class01622> list = this.N.B();
      return new class03545(class01603.field_14190, list);
   }

   public List<class02298> N(List<class02298> var1) {
      ArrayList arraylist = new ArrayList(var1.size());
      ArrayList arraylist1 = new ArrayList(var1.size());

      for (class02298 class02298 : var1) {
         String s = this.y.get(class02298);
         if (s != null) {
            arraylist1.add(s);
            arraylist.add(class02298);
         }
      }

      this.N.y(arraylist1);
      return this.y(arraylist);
   }
}
