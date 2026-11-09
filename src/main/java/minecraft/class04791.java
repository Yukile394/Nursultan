package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public class class04791 implements class04794 {
   private static final Codec<class06841<class07709>> L = class06841.N(var0 -> var0.y(class04820::new).N(class04793::new));
   public static final MapCodec<class04791> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(L.fieldOf("target").forGetter(var0x -> var0x.u)).apply(var0, class04791::new)
   );
   public static final Codec<class04791> y = L.xmap(class04791::new, var0 -> var0.u);
   private final class06841<class07709> u;

   private class04791(class06841<class07709> var1) {
      super();
      this.u = var1;
   }

   @Override
   public Set<class07491<?>> y() {
      return Set.of(this.u.N());
   }

   @Override
   public class04837 N() {
      return class04821.L;
   }

   public static class04794 N(class05919 var0) {
      return new class04791(new class04793(var0.N()));
   }

   @Nullable
   @Override
   public class07709 N(class05908 var1) {
      return this.u.N(var1);
   }
}
