package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class00626(class03556<class09037> dialog) implements class00647 {
   public static final MapCodec<class00626> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class09037.u.fieldOf("dialog").forGetter(class00626::y)).apply(var0, class00626::new)
   );

   public class00626(class03556<class09037> dialog) {
      super();
      this.dialog = dialog;
   }

   public class03556<class09037> y() {
      return this.dialog;
   }

   @Override
   public class00654 N() {
      return class00654.field_60821;
   }
}
