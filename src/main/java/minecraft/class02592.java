package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public final class class02592 {
   public static final Codec<class02592> N = Codec.xor(class01487.N.fieldOf("UUID").codec(), class07209.field_25064).xmap(class02592::new, var0 -> {
      class07049 class07049 = var0.L;
      if (class07049 instanceof class00700) {
         return Either.right(((class00700)class07049).s());
      } else {
         return var0.L != null ? Either.left(var0.L.method_5667()) : Objects.requireNonNull(var0.u, "Invalid LeashData had no attachment");
      }
   });
   int y;
   @Nullable
   public class07049 L;
   @Nullable
   public Either<UUID, class07209> u;
   public double i;

   class02592(int var1) {
      super();
      this.y = var1;
   }

   class02592(class07049 var1) {
      super();
      this.L = var1;
   }

   private class02592(Either<UUID, class07209> var1) {
      super();
      this.u = var1;
   }

   public void N(class07049 var1) {
      this.L = var1;
      this.u = null;
      this.y = 0;
   }
}
