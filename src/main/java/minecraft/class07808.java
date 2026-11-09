package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class07808(String name, int protocol) {
   public static final Codec<class07808> N = RecordCodecBuilder.create(
      var0 -> var0.group(Codec.STRING.fieldOf("name").forGetter(class07808::y), Codec.INT.fieldOf("protocol").forGetter(class07808::L))
         .apply(var0, class07808::new)
   );

   public int L() {
      return this.protocol;
   }

   public class07808(String name, int protocol) {
      this.name = name;
      this.protocol = protocol;
   }

   public String y() {
      return this.name;
   }

   public static class07808 N() {
      class04551 class04551 = class07529.y();
      return new class07808(class04551.comp_4025(), class04551.comp_4027());
   }
}
