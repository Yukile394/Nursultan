package minecraft;

import java.time.Instant;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public abstract class class02065 {
   protected final UUID y;
   protected final Instant L;
   protected final UUID u;
   protected String i = "";
   @Nullable
   protected class03380 R;
   protected boolean M;

   public class02065(UUID var1, Instant var2, UUID var3) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
   }

   public abstract class02065 y();

   public boolean N(UUID var1) {
      return var1.equals(this.u);
   }

   public abstract class05096 N(class05096 var1, class03409 var2);
}
