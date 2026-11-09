package minecraft;

import com.google.common.hash.HashCode;
import java.net.URL;
import java.nio.file.Path;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

class class03845 {
   final UUID N;
   final URL y;
   @Nullable
   final HashCode L;
   @Nullable
   Path u;
   @Nullable
   class03834 i;
   class03819 R = class03819.field_47643;
   class03843 M = class03843.field_47639;
   boolean B;

   class03845(UUID var1, URL var2, @Nullable HashCode var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   public void N(class03834 var1) {
      if (this.i == null) {
         this.i = var1;
      }
   }

   public boolean N() {
      return this.i != null;
   }
}
