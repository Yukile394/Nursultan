package minecraft;

import java.util.ArrayList;
import java.util.List;

public class class02095 {
   private final String N;
   private final String y;
   private final List<class02117<?>> L = new ArrayList<>();
   private boolean u;

   class02095(String var1, String var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public class02129 y() {
      class02129 class02129 = new class02129(this.N, this.y, List.copyOf(this.L), this.u);
      if (class02129.N.putIfAbsent(this.N, class02129) != null) {
         throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.N + "'");
      } else {
         return class02129;
      }
   }

   public class02095 N(List<class02117<?>> var1) {
      this.L.addAll(var1);
      return this;
   }

   public class02095 N() {
      this.u = true;
      return this;
   }

   public <T> class02095 N(class02117<T> var1) {
      this.L.add(var1);
      return this;
   }
}
