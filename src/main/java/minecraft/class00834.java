package minecraft;

import com.mojang.serialization.Codec;
import java.util.Map;
import java.util.Map.Entry;

public record class00834(Map<class03556<class07084>, class00849> effectMap) {
   public static final Codec<class00834> N = Codec.unboundedMap(class07084.N, class00849.N).xmap(class00834::new, class00834::N);

   public class00834(Map<class03556<class07084>, class00849> effectMap) {
      super();
      this.effectMap = effectMap;
   }

   public boolean N(class07438 var1) {
      return this.N(var1.method_6088());
   }

   public Map<class03556<class07084>, class00849> N() {
      return this.effectMap;
   }

   public boolean N(Map<class03556<class07084>, class07055> var1) {
      for (Entry entry : this.effectMap.entrySet()) {
         class07055 class07055 = (class07055)var1.get(entry.getKey());
         if (!((class00849)entry.getValue()).N(class07055)) {
            return false;
         }
      }

      return true;
   }

   public boolean N(class07049 var1) {
      return var1 instanceof class07438 class07438 && this.N(class07438.method_6088());
   }
}
