package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.function.IntFunction;
import org.jspecify.annotations.Nullable;

public enum class07282 implements class05033 {
   field_9215(0, "survival"),
   field_9220(1, "creative"),
   field_9216(2, "adventure"),
   field_9219(3, "spectator");

   public static final class07282 field_28045 = field_9215;
   public static final class05031<class07282> field_41676 = class05033.N(class07282::values);
   private static final IntFunction<class07282> field_41677 = class02121.N(class07282::N, values(), class02126.field_41664);
   public static final class02362<ByteBuf, class07282> field_60671 = class02389.N(field_41677, class07282::N);
   @Deprecated
   public static final Codec<class07282> field_56668 = Codec.INT.xmap(class07282::N, class07282::N);
   private static final int field_30964 = -1;
   private final int field_9217;
   private final String field_9221;
   private final class00392 field_28046;
   private final class00392 field_28047;

   public class00392 L() {
      return this.field_28047;
   }

   public static boolean L(int var0) {
      return Arrays.stream(values()).anyMatch(var1 -> var1.field_9217 == var0);
   }

   public boolean M() {
      return this == field_9215 || this == field_9216;
   }

   private class07282(int var3, String var4) {
      this.field_9217 = var3;
      this.field_9221 = var4;
      this.field_28046 = class00392.L("selectWorld.gameMode." + var4);
      this.field_28047 = class00392.L("gameMode." + var4);
   }

   public boolean i() {
      return this == field_9216 || this == field_9219;
   }

   public class00392 u() {
      return this.field_28046;
   }

   public String y() {
      return this.field_9221;
   }

   @Nullable
   public static class07282 y(int var0) {
      return var0 == -1 ? null : N(var0);
   }

   @Nullable
   public static class07282 N(String var0, @Nullable class07282 var1) {
      class07282 class07282 = field_41676.N(var0);
      return class07282 != null ? class07282 : var1;
   }

   public static int N(@Nullable class07282 var0) {
      return var0 != null ? var0.field_9217 : -1;
   }

   public static class07282 N(String var0) {
      return N(var0, field_9215);
   }

   public void N(class08033 var1) {
      if (this == field_9220) {
         var1.L = true;
         var1.u = true;
         var1.N = true;
      } else if (this == field_9219) {
         var1.L = true;
         var1.u = false;
         var1.N = true;
         var1.y = true;
      } else {
         var1.L = false;
         var1.u = false;
         var1.N = false;
         var1.y = false;
      }

      var1.i = !this.i();
   }

   public int N() {
      return this.field_9217;
   }

   public static class07282 N(int var0) {
      return field_41677.apply(var0);
   }

   public boolean R() {
      return this == field_9220;
   }

   @Override
   public String method_15434() {
      return this.field_9221;
   }
}
