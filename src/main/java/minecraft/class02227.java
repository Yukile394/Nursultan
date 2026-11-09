package minecraft;

import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;

public record class02227(List<class07282> types) {
   public static final class02227 N = N(class07282.values());
   public static final class02227 y = N(class07282.field_9215, class07282.field_9216);
   public static final Codec<class02227> L = class07282.field_41676.listOf().xmap(class02227::new, class02227::N);

   public class02227(List<class07282> types) {
      super();
      this.types = types;
   }

   public static class02227 N(class07282... var0) {
      return new class02227(Arrays.stream(var0).toList());
   }

   public List<class07282> N() {
      return this.types;
   }

   public boolean N(class07282 var1) {
      return this.types.contains(var1);
   }
}
