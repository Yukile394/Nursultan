package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Iterator;
import java.util.List;

public record class02531(List<class02560> effects) implements class02560 {
   public static final MapCodec<class02531> N = class02556.N(class02560.y, class02531::new, class02531::y);

   public class02531(List<class02560> effects) {
      this.effects = effects;
   }

   public List<class02560> y() {
      return this.effects;
   }

   @Override
   public void N(class04782 var1, int var2, class02525 var3, class07049 var4, class06889 var5) {
      Iterator<class02560> iterator = this.effects.iterator();

      while (iterator.hasNext()) {
         iterator.next().N(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public MapCodec<class02531> N() {
      return N;
   }
}
