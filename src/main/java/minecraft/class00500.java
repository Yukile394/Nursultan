package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import net.fabricmc.fabric.api.block.v1.FabricBlockState;

public class class00500 extends class01339 implements FabricBlockState {
   public static final Codec<class00500> N = N(class04206.i.T(), class00891::W).stable();

   public class00500(class00891 var1, Reference2ObjectArrayMap<class08092<?>, Comparable<?>> var2, MapCodec<class00500> var3) {
      super(var1, var2, var3);
   }

   @Override
   protected class00500 N() {
      return this;
   }
}
