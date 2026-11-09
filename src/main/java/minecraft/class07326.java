package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class07326(class07209 pos, int rotation, int entityId) {
   public static final Codec<class07326> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class07209.field_25064.fieldOf("pos").forGetter(class07326::y),
            Codec.INT.fieldOf("rotation").forGetter(class07326::L),
            Codec.INT.fieldOf("entity_id").forGetter(class07326::u)
         )
         .apply(var0, class07326::new)
   );

   public int L() {
      return this.rotation;
   }

   public class07326(class07209 pos, int rotation, int entityId) {
      this.pos = pos;
      this.rotation = rotation;
      this.entityId = entityId;
   }

   public int u() {
      return this.entityId;
   }

   public class07209 y() {
      return this.pos;
   }

   public String N() {
      return N(this.pos);
   }

   public static String N(class07209 var0) {
      return "frame-" + var0.method_10263() + "," + var0.method_10264() + "," + var0.method_10260();
   }
}
