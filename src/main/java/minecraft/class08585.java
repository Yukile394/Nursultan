package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;

public record class08585(List<class08556<class08579, class08568>> selectors) {
   public static final class08585 N = new class08585(List.of());
   public static final Codec<class08585> y = class08556.N(class08568.y).listOf().xmap(class08585::new, class08585::N);

   public class08585(List<class08556<class08579, class08568>> selectors) {
      this.selectors = selectors;
   }

   public static class08585 N(class08568 var0, int var1) {
      return new class08585(class08578.N(var0, var1));
   }

   public List<class08556<class08579, class08568>> N() {
      return this.selectors;
   }

   public static class08585 N(int var0) {
      return new class08585(class08578.N(var0));
   }
}
