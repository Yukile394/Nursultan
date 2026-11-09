package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;

public record class08085(class03556<class07468> attribute, double base, Collection<class07471> modifiers) {
   public static final class02362<ByteBuf, class07471> N = class02362.N(
      class01894.y, class07471::N, class02389.W, class07471::y, class07463.field_48326, class07471::L, class07471::new
   );
   public static final class02362<class04247, class08085> y = class02362.N(
      class07468.y, class08085::N, class02389.W, class08085::y, N.N_33(class02389.N(ArrayList::new)), class08085::L, class08085::new
   );

   public Collection<class07471> L() {
      return this.modifiers;
   }

   public class08085(class03556<class07468> attribute, double base, Collection<class07471> modifiers) {
      this.attribute = attribute;
      this.base = base;
      this.modifiers = modifiers;
   }

   public double y() {
      return this.base;
   }

   public class03556<class07468> N() {
      return this.attribute;
   }
}
