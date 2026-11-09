package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record class02463(int offset, Optional<Integer> size) implements class02489 {
   private static final Logger i = LogUtils.getLogger();
   public static final MapCodec<class02463> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06338.T.optionalFieldOf("offset", 0).forGetter(class02463::y), class06338.T.optionalFieldOf("size").forGetter(class02463::L))
         .apply(var0, class02463::new)
   );

   public Optional<Integer> L() {
      return this.size;
   }

   public class02463(int var1) {
      this(var1, Optional.empty());
   }

   public class02463(int offset, Optional<Integer> size) {
      this.offset = offset;
      this.size = size;
   }

   public int y() {
      return this.offset;
   }

   @Override
   public <T> List<T> N(List<T> var1, List<T> var2, int var3) {
      int ix = var1.size();
      if (this.offset > ix) {
         i.error("Cannot replace when offset is out of bounds");
         return var1;
      } else {
         Builder builder = ImmutableList.builder();
         builder.addAll(var1.subList(0, this.offset));
         builder.addAll(var2);
         int j = this.offset + this.size.orElse(var2.size());
         if (j < ix) {
            builder.addAll(var1.subList(j, ix));
         }

         ImmutableList immutablelist = builder.build();
         if (immutablelist.size() > var3) {
            i.error("Contents overflow in section replacement");
            return var1;
         } else {
            return immutablelist;
         }
      }
   }

   @Override
   public class02491 N() {
      return class02491.field_49857;
   }
}
