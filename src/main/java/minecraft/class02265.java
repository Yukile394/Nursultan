package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record class02265(int id) implements class02694 {
   public static final Codec<class02265> N = Codec.INT.xmap(class02265::new, class02265::y);
   public static final class02362<ByteBuf, class02265> y = class02389.B.N_10(class02265::new, class02265::y);
   private static final class00392 u = class00392.L("filled_map.locked").N(class06541.field_1080);

   public class02265(int id) {
      super();
      this.id = id;
   }

   public int y() {
      return this.id;
   }

   public String N() {
      return "map_" + this.id;
   }

   @Override
   public void N(class06591 var1, Consumer<class00392> var2, class06497 var3, class02666 var4) {
      class07769 class07769 = var1.N(this);
      if (class07769 == null) {
         var2.accept(class00392.L("filled_map.unknown").N(class06541.field_1080));
      } else {
         class02705 class02705 = var4.method_58694(class02484.S);
         if (var4.method_58694(class02484.B) == null && class02705 == null) {
            var2.accept(class00392.N("filled_map.id", this.id).N(class06541.field_1080));
         }

         if (class07769.Z || class02705 == class02705.field_49353) {
            var2.accept(u);
         }

         if (var3.N()) {
            int i = class02705 == class02705.field_49354 ? 1 : 0;
            int j = Math.min(class07769.M + i, 4);
            var2.accept(class00392.N("filled_map.scale", 1 << j).N(class06541.field_1080));
            var2.accept(class00392.N("filled_map.level", j, 4).N(class06541.field_1080));
         }
      }
   }
}
