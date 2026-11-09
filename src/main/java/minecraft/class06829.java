package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Set;

public class class06829 implements class06834 {
   public static final MapCodec<class06829> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06841.N.fieldOf("source").forGetter(var0x -> var0x.y), class02488.N.fieldOf("slots").forGetter(var0x -> var0x.L))
         .apply(var0, class06829::new)
   );
   private final class06841<Object> y;
   private final class02466 L;

   private class06829(class06841<Object> var1, class02466 var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   @Override
   public Set<class07491<?>> y() {
      return Set.of(this.y.N());
   }

   @Override
   public MapCodec<class06829> N() {
      return N;
   }

   @Override
   public final class06838 N(class05908 var1) {
      Object object = this.y.N(var1);
      return object instanceof class06843 ? ((class06843)object).N_66(this.L.N()) : class06838.N;
   }
}
