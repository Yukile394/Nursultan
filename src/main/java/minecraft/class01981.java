package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.UUID;

record class01981(UUID player, long timestamp) {
   public static final Codec<class01981> N = RecordCodecBuilder.create(
      var0 -> var0.group(class01487.N.fieldOf("player").forGetter(class01981::N), Codec.LONG.fieldOf("timestamp").forGetter(class01981::y))
         .apply(var0, class01981::new)
   );

   class01981(UUID player, long timestamp) {
      this.player = player;
      this.timestamp = timestamp;
   }

   public long y() {
      return this.timestamp;
   }

   public UUID N() {
      return this.player;
   }
}
