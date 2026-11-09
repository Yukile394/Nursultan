package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum class07830 implements class05033 {
   field_13194(0, "WORLD_SURFACE_WG", class07822.field_13207, class07841.N),
   field_13202(1, "WORLD_SURFACE", class07822.field_16424, class07841.N),
   field_13195(2, "OCEAN_FLOOR_WG", class07822.field_13207, class07841.y),
   field_13200(3, "OCEAN_FLOOR", class07822.field_13206, class07841.y),
   field_13197(4, "MOTION_BLOCKING", class07822.field_16424, var0 -> var0.M() || !var0.Y().W()),
   field_13203(5, "MOTION_BLOCKING_NO_LEAVES", class07822.field_16424, var0 -> (var0.M() || !var0.Y().W()) && !(var0.i() instanceof class07131));

   public static final Codec<class07830> field_24772 = class05033.N(class07830::values);
   private static final IntFunction<class07830> field_56680 = class02121.N(var0 -> var0.field_56681, values(), class02126.field_41664);
   public static final class02362<ByteBuf, class07830> field_56679 = class02389.N(field_56680, var0 -> var0.field_56681);
   private final int field_56681;
   private final String field_13204;
   private final class07822 field_13198;
   private final Predicate<class00500> field_16568;

   public boolean L() {
      return this.field_13198 != class07822.field_13207;
   }

   private class07830(int var3, String var4, class07822 var5, Predicate<class00500> var6) {
      this.field_56681 = var3;
      this.field_13204 = var4;
      this.field_13198 = var5;
      this.field_16568 = var6;
   }

   public Predicate<class00500> u() {
      return this.field_16568;
   }

   public boolean y() {
      return this.field_13198 == class07822.field_16424;
   }

   public String N() {
      return this.field_13204;
   }

   @Override
   public String method_15434() {
      return this.field_13204;
   }
}
