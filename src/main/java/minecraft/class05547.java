package minecraft;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class05547 {
   private final class00891 R;
   final Map<class05565, class00891> N = Maps.newHashMap();
   boolean y = true;
   boolean L = true;
   @Nullable
   String u;
   @Nullable
   String i;

   public boolean L() {
      return this.y;
   }

   class05547(class00891 var1) {
      super();
      this.R = var1;
   }

   public Optional<String> i() {
      return class05018.B(this.u) ? Optional.empty() : Optional.of(this.u);
   }

   public boolean u() {
      return this.L;
   }

   public Map<class05565, class00891> y() {
      return this.N;
   }

   public class00891 N() {
      return this.R;
   }

   public class00891 N(class05565 var1) {
      return this.N.get(var1);
   }

   public Optional<String> R() {
      return class05018.B(this.i) ? Optional.empty() : Optional.of(this.i);
   }
}
