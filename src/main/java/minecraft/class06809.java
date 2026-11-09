package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class06809(class01894 tagId) implements class07220<class02796> {
   public static final MapCodec<class06809> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class01894.N.fieldOf("Name").forGetter(class06809::y)).apply(var0, class06809::new)
   );

   public class06809(class01894 tagId) {
      super();
      this.tagId = tagId;
   }

   public class01894 y() {
      return this.tagId;
   }

   @Override
   public MapCodec<class06809> N() {
      return N;
   }

   public void N(class02796 var1, class00754<class02796> var2, long var3) {
      class03800 class03800 = var1.Nr();

      for (class07684<class07701> class07684 : class03800.y(this.tagId)) {
         class03800.N(class07684, class03800.L());
      }
   }
}
