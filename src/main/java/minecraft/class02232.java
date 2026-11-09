package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.Consumer;

public record class02232(class02204<class02206> song) implements class02694 {
   public static final Codec<class02232> N = class02204.N(class04227.yz, class02206.L).xmap(class02232::new, class02232::N);
   public static final class02362<class04247, class02232> y = class02362.N(class02204.N(class04227.yz, class02206.u), class02232::N, class02232::new);

   public class02232(class02204<class02206> song) {
      super();
      this.song = song;
   }

   public static class07082 N(class07299 var0, class07209 var1, class06584 var2, class08036 var3) {
      if (var2.method_58694(class02484.NE) == null) {
         return class07082.R;
      } else {
         class00500 class00500 = var0.method_8320(var1);
         if (class00500.N(class00869.iG) && !class00500.L(class07122.y)) {
            if (!var0.method_8608()) {
               class06584 class06584 = var2.y(1, var3);
               class00394 class00394 = var0.method_8321(var1);
               if (class00394 instanceof class07249) {
                  ((class07249)class00394).N(class06584);
                  var0.N(class01194.L, var1, class01164.N(var3, class00500));
               }

               var3.method_7281(class01235.Nm);
            }

            return class07082.N;
         } else {
            return class07082.R;
         }
      }
   }

   public class02204<class02206> N() {
      return this.song;
   }

   @Override
   public void N(class06591 var1, Consumer<class00392> var2, class06497 var3, class02666 var4) {
      class01929 class01929 = var1.N();
      if (class01929 != null) {
         this.song.N(class01929).ifPresent(var1x -> {
            class00392 class00392 = class00390.N(var1x.N().L(), class00405.N.N(class06541.field_1080));
            var2.accept(class00392);
         });
      }
   }
}
