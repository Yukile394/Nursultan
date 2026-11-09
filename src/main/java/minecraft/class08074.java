package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class08074(
   double centerX, double centerZ, double damagePerBlock, double safeZone, int warningBlocks, int warningTime, double size, long lerpTime, double lerpTarget
) {
   public static final class08074 N = new class08074(0.0, 0.0, 0.2, 5.0, 5, 300, 5.999997E7F, 0L, 0.0);
   public static final Codec<class08074> y = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.doubleRange(-2.9999984E7, 2.9999984E7).fieldOf("center_x").forGetter(class08074::N),
            Codec.doubleRange(-2.9999984E7, 2.9999984E7).fieldOf("center_z").forGetter(class08074::y),
            Codec.DOUBLE.fieldOf("damage_per_block").forGetter(class08074::L),
            Codec.DOUBLE.fieldOf("safe_zone").forGetter(class08074::u),
            Codec.INT.fieldOf("warning_blocks").forGetter(class08074::i),
            Codec.INT.fieldOf("warning_time").forGetter(class08074::R),
            Codec.DOUBLE.fieldOf("size").forGetter(class08074::M),
            Codec.LONG.fieldOf("lerp_time").forGetter(class08074::B),
            Codec.DOUBLE.fieldOf("lerp_target").forGetter(class08074::Z)
         )
         .apply(var0, class08074::new)
   );

   public double L() {
      return this.damagePerBlock;
   }

   public double M() {
      return this.size;
   }

   public class08074(
      double centerX, double centerZ, double damagePerBlock, double safeZone, int warningBlocks, int warningTime, double size, long lerpTime, double lerpTarget
   ) {
      this.centerX = centerX;
      this.centerZ = centerZ;
      this.damagePerBlock = damagePerBlock;
      this.safeZone = safeZone;
      this.warningBlocks = warningBlocks;
      this.warningTime = warningTime;
      this.size = size;
      this.lerpTime = lerpTime;
      this.lerpTarget = lerpTarget;
   }

   public class08074(class08057 var1) {
      this(var1.Z, var1.z, var1.i, var1.R, var1.B, var1.M, var1.E.N(), var1.E.L(), var1.E.u());
   }

   public long B() {
      return this.lerpTime;
   }

   public double Z() {
      return this.lerpTarget;
   }

   public int i() {
      return this.warningBlocks;
   }

   public double u() {
      return this.safeZone;
   }

   public double y() {
      return this.centerZ;
   }

   public double N() {
      return this.centerX;
   }

   public int R() {
      return this.warningTime;
   }
}
