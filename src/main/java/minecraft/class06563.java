package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public enum class06563 implements class05033 {
   field_7952(0, "white", 16383998, class04689.Z, 15790320, 16777215),
   field_7946(1, "orange", 16351261, class04689.s, 15435844, 16738335),
   field_7958(2, "magenta", 13061821, class04689.T, 12801229, 16711935),
   field_7951(3, "light_blue", 3847130, class04689.b, 6719955, 10141901),
   field_7947(4, "yellow", 16701501, class04689.j, 14602026, 16776960),
   field_7961(5, "lime", 8439583, class04689.v, 4312372, 12582656),
   field_7954(6, "pink", 15961002, class04689.n, 14188952, 16738740),
   field_7944(7, "gray", 4673362, class04689.t, 4408131, 8421504),
   field_7967(8, "light_gray", 10329495, class04689.G, 11250603, 13882323),
   field_7955(9, "cyan", 1481884, class04689.l, 2651799, 65535),
   field_7945(10, "purple", 8991416, class04689.d, 8073150, 10494192),
   field_7966(11, "blue", 3949738, class04689.w, 2437522, 255),
   field_7957(12, "brown", 8606770, class04689.k, 5320730, 9127187),
   field_7942(13, "green", 6192150, class04689.Y, 3887386, 65280),
   field_7964(14, "red", 11546150, class04689.Q, 11743532, 16711680),
   field_7963(15, "black", 1908001, class04689.O, 1973019, 0);

   private static final IntFunction<class06563> field_7959 = class02121.N(class06563::N, values(), class02126.field_41664);
   private static final Int2ObjectOpenHashMap<class06563> field_7950 = new Int2ObjectOpenHashMap(
      Arrays.stream(values()).collect(Collectors.toMap(var0 -> var0.field_7960, var0 -> (class06563)var0))
   );
   public static final class05031<class06563> field_41600 = class05033.N(class06563::values);
   public static final class02362<ByteBuf, class06563> field_49259 = class02389.N(field_7959, class06563::N);
   @Deprecated
   public static final Codec<class06563> field_56666 = Codec.BYTE.xmap(class06563::N, var0 -> (byte)var0.field_7965);
   private final int field_7965;
   private final String field_7948;
   private final class04689 field_7956;
   private final int field_7943;
   private final int field_7960;
   private final int field_16537;

   public int L() {
      return this.field_7943;
   }

   private class06563(int var3, String var4, int var5, class04689 var6, int var7, int var8) {
      this.field_7965 = var3;
      this.field_7948 = var4;
      this.field_7956 = var6;
      this.field_16537 = class02566.M(var8);
      this.field_7943 = class02566.M(var5);
      this.field_7960 = var7;
   }

   @Override
   public String toString() {
      return this.field_7948;
   }

   public int i() {
      return this.field_7960;
   }

   public class04689 u() {
      return this.field_7956;
   }

   @Nullable
   public static class06563 y(int var0) {
      return (class06563)field_7950.get(var0);
   }

   public String y() {
      return this.field_7948;
   }

   private static class02903 N(class06563 var0, class06563 var1) {
      return class02903.N(2, 1, List.of(new class06584(class06559.N(var0)), new class06584(class06559.N(var1))));
   }

   public int N() {
      return this.field_7965;
   }

   public static class06563 N(int var0) {
      return field_7959.apply((int)var0);
   }

   public static class06563 N(class04782 var0, class06563 var1, class06563 var2) {
      class02903 class02903 = N(var1, var2);
      return var0.method_64577()
         .N(class05838.N, class02903, var0)
         .map(var2x -> var2x.y().method_8116(class02903, var0.method_30349()))
         .map(class06584::B)
         .filter(class06559.class::isInstance)
         .map(class06559.class::cast)
         .map(class06559::N)
         .orElseGet(() -> var0.field_9229.Z() ? var1 : var2);
   }

   @Nullable
   public static class06563 N(String var0, @Nullable class06563 var1) {
      class06563 class06563 = field_41600.N(var0);
      return class06563 != null ? class06563 : var1;
   }

   public int R() {
      return this.field_16537;
   }

   @Override
   public String method_15434() {
      return this.field_7948;
   }
}
