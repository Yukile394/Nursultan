package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.mixin.renderer.client.block.model.MultiPartModelSharedBakedStateAccessor;

@Environment(EnvType.CLIENT)
public final class class08875 implements MultiPartModelSharedBakedStateAccessor {
   private final List<class08866<class08887>> y;
   final class08388 N;
   private final Map<BitSet, List<class08887>> L = new ConcurrentHashMap<>();

   public class08875(List<class08866<class08887>> var1) {
      super();
      this.y = var1;
      class08887 class08887 = N(var1);
      this.N = class08887.method_68511();
   }

   public List<class08887> N(class00500 var1) {
      BitSet bitset = new BitSet();

      for (int i = 0; i < this.y.size(); i++) {
         if (this.y.get(i).N().test(var1)) {
            bitset.set(i);
         }
      }

      return this.L.computeIfAbsent(bitset, var1x -> {
         Builder builder = ImmutableList.builder();

         for (int ix = 0; ix < this.y.size(); ix++) {
            if (var1x.get(ix)) {
               builder.add(this.y.get(ix).y());
            }
         }

         return builder.build();
      });
   }

   private static class08887 N(List<class08866<class08887>> var0) {
      if (var0.isEmpty()) {
         throw new IllegalArgumentException("Model must have at least one selector");
      } else {
         return (class08887)((class08866)var0.getFirst()).y();
      }
   }
}
