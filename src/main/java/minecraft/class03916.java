package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class class03916 {
   private static final Logger y = LogUtils.getLogger();
   private static final int L = class08044.L();
   public static final Codec<class03916> N = Codec.PASSTHROUGH.listOf().validate(var0 -> class07536.N(var0, L)).xmap(class03916::new, var0 -> var0.R);
   private static final DynamicOps<class07709> u = class07713.N;
   private static final Dynamic<?> i = new Dynamic(u, (class07709)class06584.R.encodeStart(u, class06584.E).getOrThrow());
   private List<Dynamic<?>> R;

   private class03916(List<Dynamic<?>> var1) {
      super();
      this.R = var1;
   }

   public class03916() {
      this(Collections.nCopies(L, i));
   }

   public void N(class08044 var1, class01042 var2) {
      class03519<class07709> class03519 = var2.N(u);
      Builder builder = ImmutableList.builderWithExpectedSize(L);

      for (int ix = 0; ix < L; ix++) {
         class06584 class06584 = var1.method_5438(ix);
         Optional optional = class06584.R
            .encodeStart(class03519, class06584)
            .resultOrPartial(var0 -> y.warn("Could not encode hotbar item: {}", var0))
            .map(var0 -> new Dynamic(u, var0));
         builder.add(optional.orElse(i));
      }

      this.R = builder.build();
   }

   public boolean N() {
      Iterator<Dynamic<?>> iterator = this.R.iterator();

      while (iterator.hasNext()) {
         if (!N(iterator.next())) {
            return false;
         }
      }

      return true;
   }

   private static boolean N(Dynamic<?> var0) {
      return i.equals(var0);
   }

   public List<class06584> N(class01929 var1) {
      return this.R
         .stream()
         .map(
            var1x -> class06584.R
               .parse(class03519.N(var1x, var1))
               .resultOrPartial(var0x -> y.warn("Could not parse hotbar item: {}", var0x))
               .orElse(class06584.E)
         )
         .toList();
   }
}
