package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class05610(class01471 toPlace, boolean scheduleTick) implements class06386 {
   public static final Codec<class05610> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class01471.N.fieldOf("to_place").forGetter(var0x -> var0x.toPlace),
            Codec.BOOL.optionalFieldOf("schedule_tick", false).forGetter(var0x -> var0x.scheduleTick)
         )
         .apply(var0, class05610::new)
   );

   public class05610(class01471 var1) {
      this(var1, false);
   }

   public class05610(class01471 toPlace, boolean scheduleTick) {
      this.toPlace = toPlace;
      this.scheduleTick = scheduleTick;
   }

   public boolean y() {
      return this.scheduleTick;
   }

   public class01471 N() {
      return this.toPlace;
   }
}
