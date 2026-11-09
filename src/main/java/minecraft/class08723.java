package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Iterator;
import java.util.List;

public record class08723(List<class08200> deathEffects) {
   public static final Codec<class08723> N = RecordCodecBuilder.create(
      var0 -> var0.group(class08200.u.listOf().optionalFieldOf("death_effects", List.of()).forGetter(class08723::N)).apply(var0, class08723::new)
   );
   public static final class02362<class04247, class08723> y = class02362.N(class08200.i.N_33(class02389.N()), class08723::N, class08723::new);
   public static final class08723 L = new class08723(
      List.of(
         new class08215(),
         new class08242(List.of(new class07055(class07047.z, 900, 1), new class07055(class07047.t, 100, 1), new class07055(class07047.E, 800, 0)))
      )
   );

   public class08723(List<class08200> deathEffects) {
      super();
      this.deathEffects = deathEffects;
   }

   public List<class08200> N() {
      return this.deathEffects;
   }

   public void N(class06584 var1, class07438 var2) {
      Iterator iterator = this.deathEffects.iterator();

      while (iterator.hasNext()) {
         ((class08200)iterator.next()).N(var2.method_73183(), var1, var2);
      }
   }
}
