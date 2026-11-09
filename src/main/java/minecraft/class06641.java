package minecraft;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

class class06641 {
   final UUID N;
   @Nullable
   GameProfile y;
   boolean L;
   int u;
   class07282 i = class07282.field_28045;
   @Nullable
   class00392 R;
   boolean M;
   int B;
   @Nullable
   class02048 Z;

   class06641(UUID var1) {
      super();
      this.N = var1;
   }

   class06669 N() {
      return new class06669(this.N, this.y, this.L, this.u, this.i, this.R, this.M, this.B, this.Z);
   }
}
