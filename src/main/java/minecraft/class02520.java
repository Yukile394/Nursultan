package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public record class02520(List<class03556<class04891>> soundEvents, class06052 volume, class06052 pitch) implements class02560 {
   public static final MapCodec<class02520> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class06338.L(class04891.y, class04891.y.sizeLimitedListOf(255)).fieldOf("sound").forGetter(class02520::y),
            class06052.N(1.0E-5F, 10.0F).fieldOf("volume").forGetter(class02520::L),
            class06052.N(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(class02520::u)
         )
         .apply(var0, class02520::new)
   );

   public class06052 L() {
      return this.volume;
   }

   public class02520(List<class03556<class04891>> soundEvents, class06052 volume, class06052 pitch) {
      this.soundEvents = soundEvents;
      this.volume = volume;
      this.pitch = pitch;
   }

   public class06052 u() {
      return this.pitch;
   }

   public List<class03556<class04891>> y() {
      return this.soundEvents;
   }

   @Override
   public void N(class04782 var1, int var2, class02525 var3, class07049 var4, class06889 var5) {
      if (!var4.method_5701()) {
         class06069 class06069 = var4.method_59922();
         int i = class04995.N(var2 - 1, 0, this.soundEvents.size() - 1);
         var1.method_60511(null, var5.N(), var5.y(), var5.L(), this.soundEvents.get(i), var4.method_5634(), this.volume.N(class06069), this.pitch.N(class06069));
      }
   }

   @Override
   public MapCodec<class02520> N() {
      return N;
   }
}
