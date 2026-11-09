package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;
import java.util.List;
import org.jspecify.annotations.Nullable;

public record class02845(List<Float> floats, List<Boolean> flags, List<String> strings, List<Integer> colors) {
   public static final class02845 N = new class02845(List.of(), List.of(), List.of(), List.of());
   public static final Codec<class02845> y = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.FLOAT.listOf().optionalFieldOf("floats", List.of()).forGetter(class02845::N),
            Codec.BOOL.listOf().optionalFieldOf("flags", List.of()).forGetter(class02845::y),
            Codec.STRING.listOf().optionalFieldOf("strings", List.of()).forGetter(class02845::L),
            class06338.E.listOf().optionalFieldOf("colors", List.of()).forGetter(class02845::u)
         )
         .apply(var0, class02845::new)
   );
   public static final class02362<ByteBuf, class02845> L = class02362.N(
      class02389.E.N_33(class02389.N()),
      class02845::N,
      class02389.y.N_33(class02389.N()),
      class02845::y,
      class02389.s.N_33(class02389.N()),
      class02845::L,
      class02389.M.N_33(class02389.N()),
      class02845::u,
      class02845::new
   );

   @Nullable
   public String L(int var1) {
      return N(this.strings, var1);
   }

   public List<String> L() {
      return this.strings;
   }

   public class02845(List<Float> floats, List<Boolean> flags, List<String> strings, List<Integer> colors) {
      this.floats = floats;
      this.flags = flags;
      this.strings = strings;
      this.colors = colors;
   }

   public List<Integer> u() {
      return this.colors;
   }

   @Nullable
   public Integer u(int var1) {
      return N(this.colors, var1);
   }

   public List<Boolean> y() {
      return this.flags;
   }

   @Nullable
   public Boolean y(int var1) {
      return N(this.flags, var1);
   }

   public List<Float> N() {
      return this.floats;
   }

   @Nullable
   public Float N(int var1) {
      return N(this.floats, var1);
   }

   @Nullable
   private static <T> T N(List<T> var0, int var1) {
      return (T)(var1 >= 0 && var1 < var0.size() ? var0.get(var1) : null);
   }
}
