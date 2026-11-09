package minecraft;

import com.mojang.serialization.Codec;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class class02472<T> {
   @Nullable
   private Codec<T> N;
   @Nullable
   private class02362<? super class04247, T> y;
   private boolean L;
   private boolean u;

   public class02472<T> L() {
      this.u = true;
      return this;
   }

   public class02472() {
      super();
   }

   public class02477<T> y() {
      class02362 class02362 = Objects.requireNonNullElseGet(this.y, () -> class02389.u(Objects.requireNonNull(this.N, "Missing Codec for component")));
      Codec codec = this.L && this.N != null ? class02484.N.N(this.N) : this.N;
      return new class02461<>(codec, class02362, this.u);
   }

   public class02472<T> N() {
      this.L = true;
      return this;
   }

   public class02472<T> N(Codec<T> var1) {
      this.N = var1;
      return this;
   }

   public class02472<T> N(class02362<? super class04247, T> var1) {
      this.y = var1;
      return this;
   }
}
