package minecraft;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public record class05646(Map<class05946<class05660>, class05663> trades) implements class05663 {
   public class05646(Map<class05946<class05660>, class05663> trades) {
      this.trades = trades;
   }

   public Map<class05946<class05660>, class05663> N() {
      return this.trades;
   }

   @SafeVarargs
   public static class05646 N(class05663 var0, class05946<class05660>... var1) {
      return new class05646(Arrays.stream(var1).collect(Collectors.toMap(var0x -> (class05946<class05660>)var0x, var1x -> var0)));
   }

   @Nullable
   @Override
   public class07324 N(class04782 var1, class07049 var2, class06069 var3) {
      if (var2 instanceof class05645) {
         class05946<class05660> class05946 = ((class05645)var2).t().N().i().orElse(null);
         if (class05946 == null) {
            return null;
         } else {
            class05663 class05663 = this.trades.get(class05946);
            return class05663 == null ? null : class05663.N(var1, var2, var3);
         }
      } else {
         return null;
      }
   }
}
