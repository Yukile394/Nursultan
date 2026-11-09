package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import org.slf4j.Logger;

public record class02478(int offset) implements class02489 {
   private static final Logger u = LogUtils.getLogger();
   public static final MapCodec<class02478> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06338.T.optionalFieldOf("offset", 0).forGetter(class02478::y)).apply(var0, class02478::new)
   );

   public class02478(int offset) {
      super();
      this.offset = offset;
   }

   public int y() {
      return this.offset;
   }

   @Override
   public <T> List<T> N(List<T> var1, List<T> var2, int var3) {
      int i = var1.size();
      if (this.offset > i) {
         u.error("Cannot insert when offset is out of bounds");
         return var1;
      } else if (i + var2.size() > var3) {
         u.error("Contents overflow in section insertion");
         return var1;
      } else {
         Builder builder = ImmutableList.builder();
         builder.addAll(var1.subList(0, this.offset));
         builder.addAll(var2);
         builder.addAll(var1.subList(this.offset, i));
         return builder.build();
      }
   }

   @Override
   public class02491 N() {
      return class02491.field_49858;
   }
}
