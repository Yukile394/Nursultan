package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public abstract class class06599 {
   protected static final String N = "BlockStates";
   protected static final String y = "Name";
   protected static final String L = "Properties";
   private final Type<Pair<String, Dynamic<?>>> B = DSL.named(class06962.d.typeName(), DSL.remainderType());
   protected final OpticFinder<List<Pair<String, Dynamic<?>>>> u = DSL.fieldFinder("Palette", DSL.list(this.B));
   protected final List<Dynamic<?>> i;
   protected final int R;
   @Nullable
   protected class05945 M;

   int L() {
      return this.R;
   }

   public class06599(Typed<?> var1, Schema var2) {
      super();
      if (!Objects.equals(var2.getType(class06962.d), this.B)) {
         throw new IllegalStateException("Block state type is not what was expected.");
      } else {
         Optional<List<Pair<String, Dynamic<?>>>> optional = var1.getOptional(this.u);
         this.i = optional.<List<Dynamic<?>>>map(var0 -> var0.stream().<Dynamic<?>>map(Pair::getSecond).collect(Collectors.toList()))
            .orElse(ImmutableList.of());
         Dynamic<?> dynamic = (Dynamic<?>)var1.get(DSL.remainderFinder());
         this.R = dynamic.get("Y").asInt(0);
         this.N(dynamic);
      }
   }

   public int u(int var1) {
      return this.M.N(var1);
   }

   public boolean y() {
      return this.M == null;
   }

   protected abstract boolean N();

   protected int N(String var1, boolean var2, int var3) {
      return class06616.N.get(var1) << 5 | (var2 ? 16 : 0) | var3;
   }

   public Typed<?> N(Typed<?> var1) {
      return this.y()
         ? var1
         : var1.update(DSL.remainderFinder(), var1x -> var1x.set("BlockStates", var1x.createLongList(Arrays.stream(this.M.N()))))
            .set(this.u, this.i.stream().map(var0 -> Pair.of(class06962.d.typeName(), var0)).collect(Collectors.toList()));
   }

   protected void N(Dynamic<?> var1) {
      if (this.N()) {
         this.M = null;
      } else {
         long[] along = var1.get("BlockStates").asLongStream().toArray();
         int ix = Math.max(4, DataFixUtils.ceillog2(this.i.size()));
         this.M = new class05945(ix, 4096, along);
      }
   }
}
