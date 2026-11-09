package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class00625(String command) implements class00647 {
   public static final MapCodec<class00625> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06338.p.fieldOf("command").forGetter(class00625::y)).apply(var0, class00625::new)
   );

   public class00625(String command) {
      this.command = command;
   }

   public String y() {
      return this.command;
   }

   @Override
   public class00654 N() {
      return class00654.field_11750;
   }
}
