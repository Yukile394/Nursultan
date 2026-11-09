package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class08697(
   Optional<Boolean> forward,
   Optional<Boolean> backward,
   Optional<Boolean> left,
   Optional<Boolean> right,
   Optional<Boolean> jump,
   Optional<Boolean> sneak,
   Optional<Boolean> sprint
) {
   public static final Codec<class08697> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.BOOL.optionalFieldOf("forward").forGetter(class08697::N),
            Codec.BOOL.optionalFieldOf("backward").forGetter(class08697::y),
            Codec.BOOL.optionalFieldOf("left").forGetter(class08697::L),
            Codec.BOOL.optionalFieldOf("right").forGetter(class08697::u),
            Codec.BOOL.optionalFieldOf("jump").forGetter(class08697::i),
            Codec.BOOL.optionalFieldOf("sneak").forGetter(class08697::R),
            Codec.BOOL.optionalFieldOf("sprint").forGetter(class08697::M)
         )
         .apply(var0, class08697::new)
   );

   public Optional<Boolean> L() {
      return this.left;
   }

   public Optional<Boolean> M() {
      return this.sprint;
   }

   public class08697(
      Optional<Boolean> forward,
      Optional<Boolean> backward,
      Optional<Boolean> left,
      Optional<Boolean> right,
      Optional<Boolean> jump,
      Optional<Boolean> sneak,
      Optional<Boolean> sprint
   ) {
      super();
      this.forward = forward;
      this.backward = backward;
      this.left = left;
      this.right = right;
      this.jump = jump;
      this.sneak = sneak;
      this.sprint = sprint;
   }

   public Optional<Boolean> i() {
      return this.jump;
   }

   public Optional<Boolean> u() {
      return this.right;
   }

   public Optional<Boolean> y() {
      return this.backward;
   }

   public boolean N(class08687 var1) {
      return this.N(this.forward, var1.N())
         && this.N(this.backward, var1.y())
         && this.N(this.left, var1.L())
         && this.N(this.right, var1.u())
         && this.N(this.jump, var1.i())
         && this.N(this.sneak, var1.R())
         && this.N(this.sprint, var1.M());
   }

   public Optional<Boolean> N() {
      return this.forward;
   }

   private boolean N(Optional<Boolean> var1, boolean var2) {
      return var1.<Boolean>map(var1x -> var1x == var2).orElse(true);
   }

   public Optional<Boolean> R() {
      return this.sneak;
   }
}
