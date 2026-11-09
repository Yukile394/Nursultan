package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class08043(boolean invulnerable, boolean flying, boolean mayFly, boolean instabuild, boolean mayBuild, float flyingSpeed, float walkingSpeed) {
   public static final Codec<class08043> B = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.BOOL.fieldOf("invulnerable").orElse(false).forGetter(class08043::N),
            Codec.BOOL.fieldOf("flying").orElse(false).forGetter(class08043::y),
            Codec.BOOL.fieldOf("mayfly").orElse(false).forGetter(class08043::L),
            Codec.BOOL.fieldOf("instabuild").orElse(false).forGetter(class08043::u),
            Codec.BOOL.fieldOf("mayBuild").orElse(true).forGetter(class08043::i),
            Codec.FLOAT.fieldOf("flySpeed").orElse(0.05F).forGetter(class08043::R),
            Codec.FLOAT.fieldOf("walkSpeed").orElse(0.1F).forGetter(class08043::M)
         )
         .apply(var0, class08043::new)
   );

   public boolean L() {
      return this.mayFly;
   }

   public float M() {
      return this.walkingSpeed;
   }

   public class08043(boolean invulnerable, boolean flying, boolean mayFly, boolean instabuild, boolean mayBuild, float flyingSpeed, float walkingSpeed) {
      this.invulnerable = invulnerable;
      this.flying = flying;
      this.mayFly = mayFly;
      this.instabuild = instabuild;
      this.mayBuild = mayBuild;
      this.flyingSpeed = flyingSpeed;
      this.walkingSpeed = walkingSpeed;
   }

   public boolean i() {
      return this.mayBuild;
   }

   public boolean u() {
      return this.instabuild;
   }

   public boolean y() {
      return this.flying;
   }

   public boolean N() {
      return this.invulnerable;
   }

   public float R() {
      return this.flyingSpeed;
   }
}
