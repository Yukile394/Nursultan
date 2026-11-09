package minecraft;

import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class class01029 {
   private static final Logger M = LogUtils.getLogger();
   public static final class01029 N = new class01029(class03543.N(), List.of());
   public static final MapCodec<class01029> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class07829.L.promotePartial(class07536.N("Carver: ", M::error)).fieldOf("carvers").forGetter(var0x -> var0x.L),
            class04336.u.promotePartial(class07536.N("Features: ", M::error)).fieldOf("features").forGetter(var0x -> var0x.u)
         )
         .apply(var0, class01029::new)
   );
   public class03543<class07829<?>> L;
   public List<class03543<class04336>> u;
   public Supplier<List<class03238<?, ?>>> i;
   public Supplier<Set<class04336>> R;

   public List<class03543<class04336>> L() {
      return this.u;
   }

   class01029(class03543<class07829<?>> var1, List<class03543<class04336>> var2) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = Suppliers.memoize(
         () -> var2.stream()
            .flatMap(class03543::N)
            .map(class03556::N)
            .flatMap(class04336::N)
            .filter(var0x -> var0x.y() == class06391.u)
            .collect(ImmutableList.toImmutableList())
      );
      this.R = Suppliers.memoize(() -> var2.stream().flatMap(class03543::N).map(class03556::N).collect(Collectors.toSet()));
   }

   public List<class03238<?, ?>> y() {
      return this.i.get();
   }

   public boolean N(class04336 var1) {
      return this.R.get().contains(var1);
   }

   public Iterable<class03556<class07829<?>>> N() {
      return this.L;
   }
}
