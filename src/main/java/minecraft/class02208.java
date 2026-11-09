package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Iterator;
import java.util.Optional;

public record class02208(Optional<class03543<class02206>> song) implements class02465<class02232> {
   public static final Codec<class02208> N = RecordCodecBuilder.create(
      var0 -> var0.group(class03541.N(class04227.yz).optionalFieldOf("song").forGetter(class02208::L)).apply(var0, class02208::new)
   );

   public Optional<class03543<class02206>> L() {
      return this.song;
   }

   public class02208(Optional<class03543<class02206>> song) {
      this.song = song;
   }

   @Override
   public class02477<class02232> y() {
      return class02484.NE;
   }

   public static class02208 N() {
      return new class02208(Optional.empty());
   }

   public boolean N(class02232 var1) {
      if (!this.song.isPresent()) {
         return true;
      } else {
         boolean flag = false;
         Iterator iterator = this.song.get().iterator();

         while (iterator.hasNext()) {
            Optional optional = ((class03556)iterator.next()).i();
            if (!optional.isEmpty() && optional.equals(var1.N().N())) {
               flag = true;
               break;
            }
         }

         return flag;
      }
   }
}
