package minecraft;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public final class class02586 {
   public final List<class00394> N = new ArrayList<>();
   public final Map<class08743, class02609> y = new EnumMap<>(class08743.class);
   public class03476 L = new class03476();
   @Nullable
   public class02578 u;

   public class02586() {
      super();
   }

   public void N() {
      this.y.values().forEach(class02609::close);
   }
}
