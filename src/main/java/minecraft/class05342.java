package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class05342(class07209 pos, class03556<class05369> poiType, int freeTickets) {
   public static final Codec<class05342> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class07209.field_25064.fieldOf("pos").forGetter(class05342::N),
            class03539.N(class04227.NZ).fieldOf("type").forGetter(class05342::y),
            Codec.INT.fieldOf("free_tickets").orElse(0).forGetter(class05342::L)
         )
         .apply(var0, class05342::new)
   );

   public int L() {
      return this.freeTickets;
   }

   public class05342(class07209 pos, class03556<class05369> poiType, int freeTickets) {
      this.pos = pos;
      this.poiType = poiType;
      this.freeTickets = freeTickets;
   }

   public class03556<class05369> y() {
      return this.poiType;
   }

   public class05377 N(Runnable var1) {
      return new class05377(this.pos, this.poiType, this.freeTickets, var1);
   }

   public class07209 N() {
      return this.pos;
   }
}
