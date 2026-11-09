package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Iterator;
import java.util.List;

public record class02547(List<class02536> effects) implements class02536 {
   public static final MapCodec<class02547> N = class02556.N(class02536.y, class02547::new, class02547::y);

   public class02547(List<class02536> effects) {
      super();
      this.effects = effects;
   }

   public List<class02536> y() {
      return this.effects;
   }

   @Override
   public float N(int var1, class06069 var2, float var3) {
      Iterator<class02536> iterator = this.effects.iterator();

      while (iterator.hasNext()) {
         var3 = iterator.next().N(var1, var2, var3);
      }

      return var3;
   }

   @Override
   public MapCodec<class02547> N() {
      return N;
   }
}
