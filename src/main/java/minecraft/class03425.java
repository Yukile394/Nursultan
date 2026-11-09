package minecraft;

import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Consumer;

public class class03425 {
   int N;
   final Map<class03441, class03444> y = Maps.newTreeMap(Comparator.<class03441, class03457>comparing(var0 -> var0.N()).thenComparing(var0 -> var0.y()));

   public class03425() {
      super();
   }

   public void N(Consumer<class03428> var1) {
      this.N++;
      var1.accept(new class03456(this, 0));
   }

   public String N(boolean var1) {
      StringBuilder stringbuilder = new StringBuilder();
      class03446 class03446 = new class03446(this, stringbuilder);
      this.y.forEach((var3x, var4) -> {
         if (var4.y == this.N && (var1 || !var4.L)) {
            var4.N.N(class03446);
            var4.L = true;
         }
      });
      return stringbuilder.toString();
   }
}
