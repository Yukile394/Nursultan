package minecraft;

import java.util.Optional;

public record class00520(
   class06889 center,
   float radius,
   int blockCount,
   Optional<class06889> playerKnockback,
   class07126 explosionParticle,
   class03556<class04891> explosionSound,
   class04540<class00931> blockParticles
) implements class00381<class07280> {
   public static final class02362<class04247, class00520> N = class02362.N(
      class06889.y,
      class00520::N,
      class02389.E,
      class00520::y,
      class02389.M,
      class00520::L,
      class06889.y.N_33(class02389::N),
      class00520::u,
      class07107.yW,
      class00520::M,
      class04891.u,
      class00520::B,
      class04540.N(class00931.y),
      class00520::Z,
      class00520::new
   );

   public int L() {
      return this.blockCount;
   }

   public class07126 M() {
      return this.explosionParticle;
   }

   public class00520(
      class06889 center,
      float radius,
      int blockCount,
      Optional<class06889> playerKnockback,
      class07126 explosionParticle,
      class03556<class04891> explosionSound,
      class04540<class00931> blockParticles
   ) {
      super();
      this.center = center;
      this.radius = radius;
      this.blockCount = blockCount;
      this.playerKnockback = playerKnockback;
      this.explosionParticle = explosionParticle;
      this.explosionSound = explosionSound;
      this.blockParticles = blockParticles;
   }

   public class03556<class04891> B() {
      return this.explosionSound;
   }

   public class04540<class00931> Z() {
      return this.blockParticles;
   }

   public Optional<class06889> u() {
      return this.playerKnockback;
   }

   public float y() {
      return this.radius;
   }

   public class06889 N() {
      return this.center;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class00520> method_65080() {
      return class04248.q;
   }
}
