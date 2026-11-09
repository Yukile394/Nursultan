package minecraft;

import Nursultan.class09415;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class06609(class02689 player, boolean hat) implements class00926 {
   public static final MapCodec<class06609> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class02689.N.fieldOf("player").forGetter(class06609::u), Codec.BOOL.optionalFieldOf("hat", true).forGetter(class06609::i))
         .apply(var0, class06609::new)
   );

   @Override
   public String L() {
      return this.player.u().map(var0 -> "[" + var0 + " head]").orElse("[unknown player head]");
   }

   public class06609(class02689 player, boolean hat) {
      super();
      this.player = player;
      this.hat = hat;
   }

   public boolean i() {
      return this.hat;
   }

   public class02689 u() {
      return this.player;
   }

   @Override
   public class00949 y() {
      return new class09415(this.player, this.hat);
   }

   @Override
   public MapCodec<class06609> N() {
      return N;
   }
}
