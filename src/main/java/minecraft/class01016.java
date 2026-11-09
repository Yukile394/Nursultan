package minecraft;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class01016(class07078<?> type, int minCount, int maxCount) {
   public static final MapCodec<class01016> N = RecordCodecBuilder.mapCodec(
         var0 -> var0.group(
               class04206.M.T().fieldOf("type").forGetter(var0x -> var0x.type),
               class06338.b.fieldOf("minCount").forGetter(var0x -> var0x.minCount),
               class06338.b.fieldOf("maxCount").forGetter(var0x -> var0x.maxCount)
            )
            .apply(var0, class01016::new)
      )
      .validate(var0 -> var0.minCount > var0.maxCount ? DataResult.error(() -> "minCount needs to be smaller or equal to maxCount") : DataResult.success(var0));

   public int L() {
      return this.maxCount;
   }

   public class01016(class07078<?> type, int minCount, int maxCount) {
      type = type.i() == class07428.field_17715 ? class07078.Nh : type;
      this.type = type;
      this.minCount = minCount;
      this.maxCount = maxCount;
   }

   @Override
   public String toString() {
      return class07078.N(this.type) + "*(" + this.minCount + "-" + this.maxCount + ")";
   }

   public int y() {
      return this.minCount;
   }

   public class07078<?> N() {
      return this.type;
   }
}
