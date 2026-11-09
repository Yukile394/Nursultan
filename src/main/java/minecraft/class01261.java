package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;

public record class01261(boolean open, boolean filtering) {
   public static final class01261 L = new class01261(false, false);
   public static final MapCodec<class01261> u = N("isGuiOpen", "isFilteringCraftable");
   public static final MapCodec<class01261> i = N("isFurnaceGuiOpen", "isFurnaceFilteringCraftable");
   public static final MapCodec<class01261> R = N("isBlastingFurnaceGuiOpen", "isBlastingFurnaceFilteringCraftable");
   public static final MapCodec<class01261> M = N("isSmokerGuiOpen", "isSmokerFilteringCraftable");
   public static final class02362<ByteBuf, class01261> B = class02362.N(class02389.y, class01261::N, class02389.y, class01261::y, class01261::new);

   public class01261(boolean open, boolean filtering) {
      this.open = open;
      this.filtering = filtering;
   }

   @Override
   public String toString() {
      return "[open=" + this.open + ", filtering=" + this.filtering + "]";
   }

   public boolean y() {
      return this.filtering;
   }

   public class01261 y(boolean var1) {
      return new class01261(this.open, var1);
   }

   public class01261 N(boolean var1) {
      return new class01261(var1, this.filtering);
   }

   private static MapCodec<class01261> N(String var0, String var1) {
      return RecordCodecBuilder.mapCodec(
         var2 -> var2.group(Codec.BOOL.optionalFieldOf(var0, false).forGetter(class01261::N), Codec.BOOL.optionalFieldOf(var1, false).forGetter(class01261::y))
            .apply(var2, class01261::new)
      );
   }

   public boolean N() {
      return this.open;
   }
}
