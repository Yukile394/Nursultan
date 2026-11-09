package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02219(
   class00816 x, class00816 y, class00816 z, class00816 speed, class00816 horizontalSpeed, class00816 verticalSpeed, class00816 fallDistance
) {
   public static final Codec<class02219> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00816.u.optionalFieldOf("x", class00816.L).forGetter(class02219::N),
            class00816.u.optionalFieldOf("y", class00816.L).forGetter(class02219::y),
            class00816.u.optionalFieldOf("z", class00816.L).forGetter(class02219::L),
            class00816.u.optionalFieldOf("speed", class00816.L).forGetter(class02219::u),
            class00816.u.optionalFieldOf("horizontal_speed", class00816.L).forGetter(class02219::i),
            class00816.u.optionalFieldOf("vertical_speed", class00816.L).forGetter(class02219::R),
            class00816.u.optionalFieldOf("fall_distance", class00816.L).forGetter(class02219::M)
         )
         .apply(var0, class02219::new)
   );

   public class00816 L() {
      return this.z;
   }

   public static class02219 L(class00816 var0) {
      return new class02219(class00816.L, class00816.L, class00816.L, class00816.L, class00816.L, var0, class00816.L);
   }

   public class00816 M() {
      return this.fallDistance;
   }

   public class02219(class00816 x, class00816 y, class00816 z, class00816 speed, class00816 horizontalSpeed, class00816 verticalSpeed, class00816 fallDistance) {
      super();
      this.x = x;
      this.y = y;
      this.z = z;
      this.speed = speed;
      this.horizontalSpeed = horizontalSpeed;
      this.verticalSpeed = verticalSpeed;
      this.fallDistance = fallDistance;
   }

   public class00816 i() {
      return this.horizontalSpeed;
   }

   public static class02219 u(class00816 var0) {
      return new class02219(class00816.L, class00816.L, class00816.L, class00816.L, class00816.L, class00816.L, var0);
   }

   public class00816 u() {
      return this.speed;
   }

   public static class02219 y(class00816 var0) {
      return new class02219(class00816.L, class00816.L, class00816.L, class00816.L, var0, class00816.L, class00816.L);
   }

   public static class02219 N(class00816 var0) {
      return new class02219(class00816.L, class00816.L, class00816.L, var0, class00816.L, class00816.L, class00816.L);
   }

   public class00816 N() {
      return this.x;
   }

   public boolean N(double var1, double var3, double var5, double var7) {
      if (this.x.u(var1) && this.y.u(var3) && this.z.u(var5)) {
         double d0 = class04995.R(var1, var3, var5);
         if (!this.speed.i(d0)) {
            return false;
         } else {
            double d1 = class04995.i(var1, var5);
            if (!this.horizontalSpeed.i(d1)) {
               return false;
            } else {
               double d2 = Math.abs(var3);
               return !this.verticalSpeed.u(d2) ? false : this.fallDistance.u(var7);
            }
         }
      } else {
         return false;
      }
   }

   public class00816 R() {
      return this.verticalSpeed;
   }
}
