package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class05282 extends class01219 {
   public static final MapCodec<class05282> N = class00500.N
      .xmap(class01339::i, class00891::W)
      .listOf()
      .fieldOf("blocks")
      .xmap(class05282::new, var0 -> var0.i);
   public static final class05282 y = new class05282(ImmutableList.of(class00869.sh));
   public static final class05282 L = new class05282(ImmutableList.of(class00869.N));
   public static final class05282 u = new class05282(ImmutableList.of(class00869.N, class00869.sh));
   private final ImmutableList<class00891> i;

   public class05282(List<class00891> var1) {
      super();
      this.i = ImmutableList.copyOf(var1);
   }

   @Nullable
   @Override
   public class01228 N(class05487 var1, class07209 var2, class07209 var3, class01228 var4, class01228 var5, class01233 var6) {
      return this.i.contains(var5.y().i()) ? null : var5;
   }

   @Override
   protected class05235<?> N() {
      return class05235.i;
   }
}
